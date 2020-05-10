package typingsSlinky.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicationRun extends js.Object {
  /**
    * The identifier of the Amazon Machine Image (AMI) from the replication run.
    */
  var amiId: js.UndefOr[AmiId] = js.native
  /**
    * The completion time of the last replication run.
    */
  var completedTime: js.UndefOr[js.Date] = js.native
  /**
    * The description of the replication run.
    */
  var description: js.UndefOr[Description] = js.native
  /**
    * Whether the replication run should produce encrypted AMI or not. See also KmsKeyId below.
    */
  var encrypted: js.UndefOr[Encrypted] = js.native
  /**
    * KMS key ID for replication jobs that produce encrypted AMIs. Can be any of the following:    KMS key ID   KMS key alias   ARN referring to KMS key ID   ARN referring to KMS key alias    If encrypted is true but a KMS key id is not specified, the customer's default KMS key for EBS is used. 
    */
  var kmsKeyId: js.UndefOr[KmsKeyId] = js.native
  /**
    * The identifier of the replication run.
    */
  var replicationRunId: js.UndefOr[ReplicationRunId] = js.native
  /**
    * The start time of the next replication run.
    */
  var scheduledStartTime: js.UndefOr[js.Date] = js.native
  /**
    * Details of the current stage of the replication run.
    */
  var stageDetails: js.UndefOr[ReplicationRunStageDetails] = js.native
  /**
    * The state of the replication run.
    */
  var state: js.UndefOr[ReplicationRunState] = js.native
  /**
    * The description of the current status of the replication job.
    */
  var statusMessage: js.UndefOr[ReplicationRunStatusMessage] = js.native
  /**
    * The type of replication run.
    */
  var `type`: js.UndefOr[ReplicationRunType] = js.native
}

object ReplicationRun {
  @scala.inline
  def apply(): ReplicationRun = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicationRun]
  }
  @scala.inline
  implicit class ReplicationRunOps[Self <: ReplicationRun] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAmiId(value: AmiId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amiId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmiId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amiId")(js.undefined)
        ret
    }
    @scala.inline
    def withCompletedTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompletedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completedTime")(js.undefined)
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
    def withReplicationRunId(value: ReplicationRunId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicationRunId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicationRunId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicationRunId")(js.undefined)
        ret
    }
    @scala.inline
    def withScheduledStartTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduledStartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScheduledStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduledStartTime")(js.undefined)
        ret
    }
    @scala.inline
    def withStageDetails(value: ReplicationRunStageDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stageDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStageDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stageDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: ReplicationRunState): Self = {
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
    def withStatusMessage(value: ReplicationRunStatusMessage): Self = {
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
    def withType(value: ReplicationRunType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

