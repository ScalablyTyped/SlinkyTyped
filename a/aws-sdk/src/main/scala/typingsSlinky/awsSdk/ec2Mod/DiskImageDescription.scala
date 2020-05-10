package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiskImageDescription extends js.Object {
  /**
    * The checksum computed for the disk image.
    */
  var Checksum: js.UndefOr[String] = js.native
  /**
    * The disk image format.
    */
  var Format: js.UndefOr[DiskImageFormat] = js.native
  /**
    * A presigned URL for the import manifest stored in Amazon S3. For information about creating a presigned URL for an Amazon S3 object, read the "Query String Request Authentication Alternative" section of the Authenticating REST Requests topic in the Amazon Simple Storage Service Developer Guide. For information about the import manifest referenced by this API action, see VM Import Manifest.
    */
  var ImportManifestUrl: js.UndefOr[String] = js.native
  /**
    * The size of the disk image, in GiB.
    */
  var Size: js.UndefOr[Long] = js.native
}

object DiskImageDescription {
  @scala.inline
  def apply(): DiskImageDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiskImageDescription]
  }
  @scala.inline
  implicit class DiskImageDescriptionOps[Self <: DiskImageDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChecksum(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Checksum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChecksum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Checksum")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: DiskImageFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Format")(js.undefined)
        ret
    }
    @scala.inline
    def withImportManifestUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportManifestUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImportManifestUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportManifestUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Size")(js.undefined)
        ret
    }
  }
  
}

