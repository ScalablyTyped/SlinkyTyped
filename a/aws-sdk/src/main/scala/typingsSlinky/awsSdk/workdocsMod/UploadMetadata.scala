package typingsSlinky.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadMetadata extends js.Object {
  /**
    * The signed headers.
    */
  var SignedHeaders: js.UndefOr[SignedHeaderMap] = js.native
  /**
    * The URL of the upload.
    */
  var UploadUrl: js.UndefOr[UrlType] = js.native
}

object UploadMetadata {
  @scala.inline
  def apply(): UploadMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadMetadata]
  }
  @scala.inline
  implicit class UploadMetadataOps[Self <: UploadMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSignedHeaders(value: SignedHeaderMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SignedHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignedHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SignedHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withUploadUrl(value: UrlType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UploadUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUploadUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UploadUrl")(js.undefined)
        ret
    }
  }
  
}

