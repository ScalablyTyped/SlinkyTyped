package typingsSlinky.firebase.mod.storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Object metadata that can be set at upload.
  */
@js.native
trait UploadMetadata extends SettableMetadata {
  /**
    * A Base64-encoded MD5 hash of the object being uploaded.
    */
  var md5Hash: js.UndefOr[String | Null] = js.native
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
    def withMd5Hash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("md5Hash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMd5Hash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("md5Hash")(js.undefined)
        ret
    }
    @scala.inline
    def withMd5HashNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("md5Hash")(null)
        ret
    }
  }
  
}

