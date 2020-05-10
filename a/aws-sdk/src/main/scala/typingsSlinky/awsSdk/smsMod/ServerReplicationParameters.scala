package typingsSlinky.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerReplicationParameters extends js.Object {
  /**
    * When true, the replication job produces encrypted AMIs. See also KmsKeyId below.
    */
  var encrypted: js.UndefOr[Encrypted] = js.native
  /**
    * Frequency of creating replication jobs for the server.
    */
  var frequency: js.UndefOr[Frequency] = js.native
  /**
    *  KMS key ID for replication jobs that produce encrypted AMIs. Can be any of the following:    KMS key ID   KMS key alias   ARN referring to KMS key ID   ARN referring to KMS key alias    If encrypted is true but a KMS key id is not specified, the customer's default KMS key for EBS is used. 
    */
  var kmsKeyId: js.UndefOr[KmsKeyId] = js.native
  /**
    * License type for creating a replication job for the server.
    */
  var licenseType: js.UndefOr[LicenseType] = js.native
  /**
    * Number of recent AMIs to keep when creating a replication job for this server.
    */
  var numberOfRecentAmisToKeep: js.UndefOr[NumberOfRecentAmisToKeep] = js.native
  /**
    * 
    */
  var runOnce: js.UndefOr[RunOnce] = js.native
  /**
    * Seed time for creating a replication job for the server.
    */
  var seedTime: js.UndefOr[js.Date] = js.native
}

object ServerReplicationParameters {
  @scala.inline
  def apply(): ServerReplicationParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerReplicationParameters]
  }
  @scala.inline
  implicit class ServerReplicationParametersOps[Self <: ServerReplicationParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withSeedTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seedTime")(js.undefined)
        ret
    }
  }
  
}

