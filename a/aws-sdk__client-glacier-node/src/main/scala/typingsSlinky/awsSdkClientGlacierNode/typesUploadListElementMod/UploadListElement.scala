package typingsSlinky.awsSdkClientGlacierNode.typesUploadListElementMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadListElement extends js.Object {
  /**
    * <p>The description of the archive that was specified in the Initiate Multipart Upload request.</p>
    */
  var ArchiveDescription: js.UndefOr[String] = js.native
  /**
    * <p>The UTC time at which the multipart upload was initiated.</p>
    */
  var CreationDate: js.UndefOr[String] = js.native
  /**
    * <p>The ID of a multipart upload.</p>
    */
  var MultipartUploadId: js.UndefOr[String] = js.native
  /**
    * <p>The part size, in bytes, specified in the Initiate Multipart Upload request. This is the size of all the parts in the upload except the last part, which may be smaller than this size.</p>
    */
  var PartSizeInBytes: js.UndefOr[Double] = js.native
  /**
    * <p>The Amazon Resource Name (ARN) of the vault that contains the archive.</p>
    */
  var VaultARN: js.UndefOr[String] = js.native
}

object UploadListElement {
  @scala.inline
  def apply(): UploadListElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadListElement]
  }
  @scala.inline
  implicit class UploadListElementOps[Self <: UploadListElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArchiveDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ArchiveDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArchiveDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ArchiveDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withCreationDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationDate")(js.undefined)
        ret
    }
    @scala.inline
    def withMultipartUploadId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MultipartUploadId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultipartUploadId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MultipartUploadId")(js.undefined)
        ret
    }
    @scala.inline
    def withPartSizeInBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PartSizeInBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartSizeInBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PartSizeInBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withVaultARN(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VaultARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVaultARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VaultARN")(js.undefined)
        ret
    }
  }
  
}

