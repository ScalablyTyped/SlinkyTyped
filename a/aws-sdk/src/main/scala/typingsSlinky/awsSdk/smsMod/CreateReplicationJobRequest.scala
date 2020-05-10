package typingsSlinky.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateReplicationJobRequest extends js.Object {
  /**
    * The description of the replication job.
    */
  var description: js.UndefOr[Description] = js.native
  /**
    * When true, the replication job produces encrypted AMIs. See also KmsKeyId below.
    */
  var encrypted: js.UndefOr[Encrypted] = js.native
  /**
    * The time between consecutive replication runs, in hours.
    */
  var frequency: js.UndefOr[Frequency] = js.native
  /**
    * KMS key ID for replication jobs that produce encrypted AMIs. Can be any of the following:    KMS key ID   KMS key alias   ARN referring to KMS key ID   ARN referring to KMS key alias    If encrypted is true but a KMS key id is not specified, the customer's default KMS key for EBS is used. 
    */
  var kmsKeyId: js.UndefOr[KmsKeyId] = js.native
  /**
    * The license type to be used for the AMI created by a successful replication run.
    */
  var licenseType: js.UndefOr[LicenseType] = js.native
  /**
    * The maximum number of SMS-created AMIs to retain. The oldest will be deleted once the maximum number is reached and a new AMI is created.
    */
  var numberOfRecentAmisToKeep: js.UndefOr[NumberOfRecentAmisToKeep] = js.native
  /**
    * The name of the IAM role to be used by the AWS SMS.
    */
  var roleName: js.UndefOr[RoleName] = js.native
  /**
    * 
    */
  var runOnce: js.UndefOr[RunOnce] = js.native
  /**
    * The seed replication time.
    */
  var seedReplicationTime: js.Date = js.native
  /**
    * The identifier of the server.
    */
  var serverId: ServerId = js.native
}

object CreateReplicationJobRequest {
  @scala.inline
  def apply(seedReplicationTime: js.Date, serverId: ServerId): CreateReplicationJobRequest = {
    val __obj = js.Dynamic.literal(seedReplicationTime = seedReplicationTime.asInstanceOf[js.Any], serverId = serverId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateReplicationJobRequest]
  }
  @scala.inline
  implicit class CreateReplicationJobRequestOps[Self <: CreateReplicationJobRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSeedReplicationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seedReplicationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerId(value: ServerId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: Description): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withEncrypted(value: Encrypted): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encrypted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncrypted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encrypted")(js.undefined)
        ret
    }
    @scala.inline
    def withFrequency(value: Frequency): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frequency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrequency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frequency")(js.undefined)
        ret
    }
    @scala.inline
    def withKmsKeyId(value: KmsKeyId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kmsKeyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKmsKeyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kmsKeyId")(js.undefined)
        ret
    }
    @scala.inline
    def withLicenseType(value: LicenseType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("licenseType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLicenseType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("licenseType")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberOfRecentAmisToKeep(value: NumberOfRecentAmisToKeep): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfRecentAmisToKeep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfRecentAmisToKeep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfRecentAmisToKeep")(js.undefined)
        ret
    }
    @scala.inline
    def withRoleName(value: RoleName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoleName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleName")(js.undefined)
        ret
    }
    @scala.inline
    def withRunOnce(value: RunOnce): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runOnce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRunOnce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runOnce")(js.undefined)
        ret
    }
  }
  
}

