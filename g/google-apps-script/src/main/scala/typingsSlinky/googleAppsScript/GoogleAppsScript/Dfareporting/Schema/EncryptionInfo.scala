package typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EncryptionInfo extends js.Object {
  var encryptionEntityId: js.UndefOr[String] = js.native
  var encryptionEntityType: js.UndefOr[String] = js.native
  var encryptionSource: js.UndefOr[String] = js.native
  var kind: js.UndefOr[String] = js.native
}

object EncryptionInfo {
  @scala.inline
  def apply(): EncryptionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncryptionInfo]
  }
  @scala.inline
  implicit class EncryptionInfoOps[Self <: EncryptionInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEncryptionEntityId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionEntityId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryptionEntityId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionEntityId")(js.undefined)
        ret
    }
    @scala.inline
    def withEncryptionEntityType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionEntityType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryptionEntityType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionEntityType")(js.undefined)
        ret
    }
    @scala.inline
    def withEncryptionSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryptionSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionSource")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
  }
  
}

