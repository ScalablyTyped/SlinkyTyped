package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicationRule extends js.Object {
  var DeleteMarkerReplication: js.UndefOr[typingsSlinky.awsSdk.s3Mod.DeleteMarkerReplication] = js.native
  /**
    * A container for information about the replication destination and its configurations including enabling the S3 Replication Time Control (S3 RTC).
    */
  var Destination: typingsSlinky.awsSdk.s3Mod.Destination = js.native
  /**
    * 
    */
  var ExistingObjectReplication: js.UndefOr[typingsSlinky.awsSdk.s3Mod.ExistingObjectReplication] = js.native
  var Filter: js.UndefOr[ReplicationRuleFilter] = js.native
  /**
    * A unique identifier for the rule. The maximum value is 255 characters.
    */
  var ID: js.UndefOr[typingsSlinky.awsSdk.s3Mod.ID] = js.native
  /**
    * An object key name prefix that identifies the object or objects to which the rule applies. The maximum prefix length is 1,024 characters. To include all objects in a bucket, specify an empty string. 
    */
  var Prefix: js.UndefOr[typingsSlinky.awsSdk.s3Mod.Prefix] = js.native
  /**
    * The priority associated with the rule. If you specify multiple rules in a replication configuration, Amazon S3 prioritizes the rules to prevent conflicts when filtering. If two or more rules identify the same object based on a specified filter, the rule with higher priority takes precedence. For example:   Same object quality prefix-based filter criteria if prefixes you specified in multiple rules overlap    Same object qualify tag-based filter criteria specified in multiple rules   For more information, see Replication in the Amazon Simple Storage Service Developer Guide.
    */
  var Priority: js.UndefOr[typingsSlinky.awsSdk.s3Mod.Priority] = js.native
  /**
    * A container that describes additional filters for identifying the source objects that you want to replicate. You can choose to enable or disable the replication of these objects. Currently, Amazon S3 supports only the filter that you can specify for objects created with server-side encryption using a customer master key (CMK) stored in AWS Key Management Service (SSE-KMS).
    */
  var SourceSelectionCriteria: js.UndefOr[typingsSlinky.awsSdk.s3Mod.SourceSelectionCriteria] = js.native
  /**
    * Specifies whether the rule is enabled.
    */
  var Status: ReplicationRuleStatus = js.native
}

object ReplicationRule {
  @scala.inline
  def apply(Destination: Destination, Status: ReplicationRuleStatus): ReplicationRule = {
    val __obj = js.Dynamic.literal(Destination = Destination.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicationRule]
  }
  @scala.inline
  implicit class ReplicationRuleOps[Self <: ReplicationRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestination(value: Destination): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Destination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: ReplicationRuleStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteMarkerReplication(value: DeleteMarkerReplication): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeleteMarkerReplication")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteMarkerReplication: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeleteMarkerReplication")(js.undefined)
        ret
    }
    @scala.inline
    def withExistingObjectReplication(value: ExistingObjectReplication): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExistingObjectReplication")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExistingObjectReplication: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExistingObjectReplication")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(value: ReplicationRuleFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filter")(js.undefined)
        ret
    }
    @scala.inline
    def withID(value: ID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ID")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefix(value: Prefix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Prefix")(js.undefined)
        ret
    }
    @scala.inline
    def withPriority(value: Priority): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPriority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Priority")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceSelectionCriteria(value: SourceSelectionCriteria): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceSelectionCriteria")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceSelectionCriteria: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceSelectionCriteria")(js.undefined)
        ret
    }
  }
  
}

