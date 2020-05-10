package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportImageResult extends js.Object {
  /**
    * The architecture of the virtual machine.
    */
  var Architecture: js.UndefOr[String] = js.native
  /**
    * A description of the import task.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * Indicates whether the AMI is encypted.
    */
  var Encrypted: js.UndefOr[Boolean] = js.native
  /**
    * The target hypervisor of the import task.
    */
  var Hypervisor: js.UndefOr[String] = js.native
  /**
    * The ID of the Amazon Machine Image (AMI) created by the import task.
    */
  var ImageId: js.UndefOr[String] = js.native
  /**
    * The task ID of the import image task.
    */
  var ImportTaskId: js.UndefOr[String] = js.native
  /**
    * The identifier for the symmetric AWS Key Management Service (AWS KMS) customer master key (CMK) that was used to create the encrypted AMI.
    */
  var KmsKeyId: js.UndefOr[String] = js.native
  /**
    * The ARNs of the license configurations.
    */
  var LicenseSpecifications: js.UndefOr[ImportImageLicenseSpecificationListResponse] = js.native
  /**
    * The license type of the virtual machine.
    */
  var LicenseType: js.UndefOr[String] = js.native
  /**
    * The operating system of the virtual machine.
    */
  var Platform: js.UndefOr[String] = js.native
  /**
    * The progress of the task.
    */
  var Progress: js.UndefOr[String] = js.native
  /**
    * Information about the snapshots.
    */
  var SnapshotDetails: js.UndefOr[SnapshotDetailList] = js.native
  /**
    * A brief status of the task.
    */
  var Status: js.UndefOr[String] = js.native
  /**
    * A detailed status message of the import task.
    */
  var StatusMessage: js.UndefOr[String] = js.native
}

object ImportImageResult {
  @scala.inline
  def apply(): ImportImageResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportImageResult]
  }
  @scala.inline
  implicit class ImportImageResultOps[Self <: ImportImageResult] (val x: Self) extends AnyVal {
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
  }
  
}

