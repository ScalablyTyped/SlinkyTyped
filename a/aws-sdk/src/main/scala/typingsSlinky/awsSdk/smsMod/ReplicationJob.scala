package typingsSlinky.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicationJob extends js.Object {
  /**
    * The description of the replication job.
    */
  var description: js.UndefOr[Description] = js.native
  /**
    * Whether the replication job should produce encrypted AMIs or not. See also KmsKeyId below.
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
    * The ID of the latest Amazon Machine Image (AMI).
    */
  var latestAmiId: js.UndefOr[AmiId] = js.native
  /**
    * The license type to be used for the AMI created by a successful replication run.
    */
  var licenseType: js.UndefOr[LicenseType] = js.native
  /**
    * The start time of the next replication run.
    */
  var nextReplicationRunStartTime: js.UndefOr[js.Date] = js.native
  /**
    * Number of recent AMIs to keep in the customer's account for a replication job. By default the value is set to zero, meaning that all AMIs are kept.
    */
  var numberOfRecentAmisToKeep: js.UndefOr[NumberOfRecentAmisToKeep] = js.native
  /**
    * The identifier of the replication job.
    */
  var replicationJobId: js.UndefOr[ReplicationJobId] = js.native
  /**
    * Information about the replication runs.
    */
  var replicationRunList: js.UndefOr[ReplicationRunList] = js.native
  /**
    * The name of the IAM role to be used by the Server Migration Service.
    */
  var roleName: js.UndefOr[RoleName] = js.native
  /**
    * 
    */
  var runOnce: js.UndefOr[RunOnce] = js.native
  /**
    * The seed replication time.
    */
  var seedReplicationTime: js.UndefOr[js.Date] = js.native
  /**
    * The identifier of the server.
    */
  var serverId: js.UndefOr[ServerId] = js.native
  /**
    * The type of server.
    */
  var serverType: js.UndefOr[ServerType] = js.native
  /**
    * The state of the replication job.
    */
  var state: js.UndefOr[ReplicationJobState] = js.native
  /**
    * The description of the current status of the replication job.
    */
  var statusMessage: js.UndefOr[ReplicationJobStatusMessage] = js.native
  /**
    * Information about the VM server.
    */
  var vmServer: js.UndefOr[VmServer] = js.native
}

object ReplicationJob {
  @scala.inline
  def apply(): ReplicationJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicationJob]
  }
  @scala.inline
  implicit class ReplicationJobOps[Self <: ReplicationJob] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withLatestAmiId(value: AmiId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latestAmiId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatestAmiId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latestAmiId")(js.undefined)
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
    def withNextReplicationRunStartTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextReplicationRunStartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextReplicationRunStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextReplicationRunStartTime")(js.undefined)
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
    def withReplicationJobId(value: ReplicationJobId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicationJobId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicationJobId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicationJobId")(js.undefined)
        ret
    }
    @scala.inline
    def withReplicationRunList(value: ReplicationRunList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicationRunList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicationRunList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicationRunList")(js.undefined)
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
    @scala.inline
    def withSeedReplicationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seedReplicationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeedReplicationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seedReplicationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withServerId(value: ServerId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverId")(js.undefined)
        ret
    }
    @scala.inline
    def withServerType(value: ServerType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverType")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: ReplicationJobState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusMessage(value: ReplicationJobStatusMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withVmServer(value: VmServer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vmServer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVmServer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vmServer")(js.undefined)
        ret
    }
  }
  
}

