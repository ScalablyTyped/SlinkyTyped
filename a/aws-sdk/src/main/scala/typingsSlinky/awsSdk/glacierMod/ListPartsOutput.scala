package typingsSlinky.awsSdk.glacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPartsOutput extends js.Object {
  /**
    * The description of the archive that was specified in the Initiate Multipart Upload request.
    */
  var ArchiveDescription: js.UndefOr[String] = js.native
  /**
    * The UTC time at which the multipart upload was initiated.
    */
  var CreationDate: js.UndefOr[String] = js.native
  /**
    * An opaque string that represents where to continue pagination of the results. You use the marker in a new List Parts request to obtain more jobs in the list. If there are no more parts, this value is null.
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * The ID of the upload to which the parts are associated.
    */
  var MultipartUploadId: js.UndefOr[String] = js.native
  /**
    * The part size in bytes. This is the same value that you specified in the Initiate Multipart Upload request.
    */
  var PartSizeInBytes: js.UndefOr[long] = js.native
  /**
    * A list of the part sizes of the multipart upload. Each object in the array contains a RangeBytes and sha256-tree-hash name/value pair.
    */
  var Parts: js.UndefOr[PartList] = js.native
  /**
    * The Amazon Resource Name (ARN) of the vault to which the multipart upload was initiated.
    */
  var VaultARN: js.UndefOr[String] = js.native
}

object ListPartsOutput {
  @scala.inline
  def apply(): ListPartsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPartsOutput]
  }
  @scala.inline
  implicit class ListPartsOutputOps[Self <: ListPartsOutput] (val x: Self) extends AnyVal {
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
    def withMarker(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Marker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Marker")(js.undefined)
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
    def withPartSizeInBytes(value: long): Self = {
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
    def withParts(value: PartList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parts")(js.undefined)
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

