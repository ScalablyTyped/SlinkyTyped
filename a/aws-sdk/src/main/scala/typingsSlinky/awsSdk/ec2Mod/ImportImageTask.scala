package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportImageTask extends js.Object {
  /**
    * The architecture of the virtual machine. Valid values: i386 | x86_64 | arm64 
    */
  var Architecture: js.UndefOr[String] = js.native
  /**
    * A description of the import task.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * Indicates whether the image is encrypted.
    */
  var Encrypted: js.UndefOr[Boolean] = js.native
  /**
    * The target hypervisor for the import task. Valid values: xen 
    */
  var Hypervisor: js.UndefOr[String] = js.native
  /**
    * The ID of the Amazon Machine Image (AMI) of the imported virtual machine.
    */
  var ImageId: js.UndefOr[String] = js.native
  /**
    * The ID of the import image task.
    */
  var ImportTaskId: js.UndefOr[String] = js.native
  /**
    * The identifier for the AWS Key Management Service (AWS KMS) customer master key (CMK) that was used to create the encrypted image.
    */
  var KmsKeyId: js.UndefOr[String] = js.native
  /**
    * The ARNs of the license configurations that are associated with the import image task.
    */
  var LicenseSpecifications: js.UndefOr[ImportImageLicenseSpecificationListResponse] = js.native
  /**
    * The license type of the virtual machine.
    */
  var LicenseType: js.UndefOr[String] = js.native
  /**
    * The description string for the import image task.
    */
  var Platform: js.UndefOr[String] = js.native
  /**
    * The percentage of progress of the import image task.
    */
  var Progress: js.UndefOr[String] = js.native
  /**
    * Information about the snapshots.
    */
  var SnapshotDetails: js.UndefOr[SnapshotDetailList] = js.native
  /**
    * A brief status for the import image task.
    */
  var Status: js.UndefOr[String] = js.native
  /**
    * A descriptive status message for the import image task.
    */
  var StatusMessage: js.UndefOr[String] = js.native
  /**
    * The tags for the import image task.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object ImportImageTask {
  @scala.inline
  def apply(): ImportImageTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportImageTask]
  }
  @scala.inline
  implicit class ImportImageTaskOps[Self <: ImportImageTask] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArchitecture(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Architecture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArchitecture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Architecture")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withEncrypted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Encrypted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncrypted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Encrypted")(js.undefined)
        ret
    }
    @scala.inline
    def withHypervisor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Hypervisor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHypervisor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Hypervisor")(js.undefined)
        ret
    }
    @scala.inline
    def withImageId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImageId")(js.undefined)
        ret
    }
    @scala.inline
    def withImportTaskId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportTaskId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImportTaskId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportTaskId")(js.undefined)
        ret
    }
    @scala.inline
    def withKmsKeyId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KmsKeyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKmsKeyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KmsKeyId")(js.undefined)
        ret
    }
    @scala.inline
    def withLicenseSpecifications(value: ImportImageLicenseSpecificationListResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LicenseSpecifications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLicenseSpecifications: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LicenseSpecifications")(js.undefined)
        ret
    }
    @scala.inline
    def withLicenseType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LicenseType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLicenseType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LicenseType")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatform(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Platform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Platform")(js.undefined)
        ret
    }
    @scala.inline
    def withProgress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Progress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Progress")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapshotDetails(value: SnapshotDetailList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnapshotDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapshotDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnapshotDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
  }
  
}

