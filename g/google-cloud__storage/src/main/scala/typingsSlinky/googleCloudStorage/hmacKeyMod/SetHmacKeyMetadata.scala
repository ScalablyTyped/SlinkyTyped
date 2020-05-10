package typingsSlinky.googleCloudStorage.hmacKeyMod

import typingsSlinky.googleCloudStorage.googleCloudStorageStrings.ACTIVE
import typingsSlinky.googleCloudStorage.googleCloudStorageStrings.INACTIVE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetHmacKeyMetadata extends js.Object {
  var etag: js.UndefOr[String] = js.native
  var state: js.UndefOr[ACTIVE | INACTIVE] = js.native
}

object SetHmacKeyMetadata {
  @scala.inline
  def apply(): SetHmacKeyMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetHmacKeyMetadata]
  }
  @scala.inline
  implicit class SetHmacKeyMetadataOps[Self <: SetHmacKeyMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEtag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEtag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: ACTIVE | INACTIVE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
  }
  
}

