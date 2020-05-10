package typingsSlinky.awsSdkClientS3Browser.typesReplicationRuleMod

import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.Disabled
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.Enabled
import typingsSlinky.awsSdkClientS3Browser.typesDeleteMarkerReplicationMod.UnmarshalledDeleteMarkerReplication
import typingsSlinky.awsSdkClientS3Browser.typesDestinationMod.UnmarshalledDestination
import typingsSlinky.awsSdkClientS3Browser.typesReplicationRuleFilterMod.UnmarshalledReplicationRuleFilter
import typingsSlinky.awsSdkClientS3Browser.typesSourceSelectionCriteriaMod.UnmarshalledSourceSelectionCriteria
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledReplicationRule extends ReplicationRule {
  /**
    * <p>Specifies whether Amazon S3 should replicate delete makers.</p>
    */
  @JSName("DeleteMarkerReplication")
  var DeleteMarkerReplication_UnmarshalledReplicationRule: js.UndefOr[UnmarshalledDeleteMarkerReplication] = js.native
  /**
    * <p>Container for replication destination information.</p>
    */
  @JSName("Destination")
  var Destination_UnmarshalledReplicationRule: UnmarshalledDestination = js.native
  /**
    * <p>Filter that identifies subset of objects to which the replication rule applies. A <code>Filter</code> must specify exactly one <code>Prefix</code>, <code>Tag</code>, or an <code>And</code> child element.</p>
    */
  @JSName("Filter")
  var Filter_UnmarshalledReplicationRule: js.UndefOr[UnmarshalledReplicationRuleFilter] = js.native
  /**
    * <p> Container that describes additional filters in identifying source objects that you want to replicate. Currently, Amazon S3 supports only the filter that you can specify for objects created with server-side encryption using an AWS KMS-managed key. You can choose to enable or disable replication of these objects. </p> <p> if you want Amazon S3 to replicate objects created with server-side encryption using AWS KMS-managed keys. </p>
    */
  @JSName("SourceSelectionCriteria")
  var SourceSelectionCriteria_UnmarshalledReplicationRule: js.UndefOr[UnmarshalledSourceSelectionCriteria] = js.native
}

object UnmarshalledReplicationRule {
  @scala.inline
  def apply(Destination: UnmarshalledDestination, Status: Enabled | Disabled | String): UnmarshalledReplicationRule = {
    val __obj = js.Dynamic.literal(Destination = Destination.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledReplicationRule]
  }
  @scala.inline
  implicit class UnmarshalledReplicationRuleOps[Self <: UnmarshalledReplicationRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestination(value: UnmarshalledDestination): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Destination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteMarkerReplication(value: UnmarshalledDeleteMarkerReplication): Self = {
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
    def withFilter(value: UnmarshalledReplicationRuleFilter): Self = {
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
    def withSourceSelectionCriteria(value: UnmarshalledSourceSelectionCriteria): Self = {
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

