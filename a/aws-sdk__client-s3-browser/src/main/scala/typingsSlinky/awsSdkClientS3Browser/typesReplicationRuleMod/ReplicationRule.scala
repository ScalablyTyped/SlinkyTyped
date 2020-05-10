package typingsSlinky.awsSdkClientS3Browser.typesReplicationRuleMod

import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.Disabled
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.Enabled
import typingsSlinky.awsSdkClientS3Browser.typesDeleteMarkerReplicationMod.DeleteMarkerReplication
import typingsSlinky.awsSdkClientS3Browser.typesDestinationMod.Destination
import typingsSlinky.awsSdkClientS3Browser.typesReplicationRuleFilterMod.ReplicationRuleFilter
import typingsSlinky.awsSdkClientS3Browser.typesSourceSelectionCriteriaMod.SourceSelectionCriteria
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicationRule extends js.Object {
  /**
    * <p>Specifies whether Amazon S3 should replicate delete makers.</p>
    */
  var DeleteMarkerReplication: js.UndefOr[
    typingsSlinky.awsSdkClientS3Browser.typesDeleteMarkerReplicationMod.DeleteMarkerReplication
  ] = js.native
  /**
    * <p>Container for replication destination information.</p>
    */
  var Destination: typingsSlinky.awsSdkClientS3Browser.typesDestinationMod.Destination = js.native
  /**
    * <p>Filter that identifies subset of objects to which the replication rule applies. A <code>Filter</code> must specify exactly one <code>Prefix</code>, <code>Tag</code>, or an <code>And</code> child element.</p>
    */
  var Filter: js.UndefOr[ReplicationRuleFilter] = js.native
  /**
    * <p>Unique identifier for the rule. The value cannot be longer than 255 characters.</p>
    */
  var ID: js.UndefOr[String] = js.native
  /**
    * <p>Object keyname prefix identifying one or more objects to which the rule applies. Maximum prefix length can be up to 1,024 characters. </p>
    */
  var Prefix: js.UndefOr[String] = js.native
  /**
    * <p>The priority associated with the rule. If you specify multiple rules in a replication configuration, then Amazon S3 applies rule priority in the event there are conflicts (two or more rules identify the same object based on filter specified). The rule with higher priority takes precedence. For example,</p> <ul> <li> <p>Same object quality prefix based filter criteria If prefixes you specified in multiple rules overlap. </p> </li> <li> <p>Same object qualify tag based filter criteria specified in multiple rules</p> </li> </ul> <p>For more information, see <a href=" https://docs.aws.amazon.com/AmazonS3/latest/dev/crr.html">Cross-Region Replication (CRR)</a> in the Amazon S3 Developer Guide.</p>
    */
  var Priority: js.UndefOr[Double] = js.native
  /**
    * <p> Container that describes additional filters in identifying source objects that you want to replicate. Currently, Amazon S3 supports only the filter that you can specify for objects created with server-side encryption using an AWS KMS-managed key. You can choose to enable or disable replication of these objects. </p> <p> if you want Amazon S3 to replicate objects created with server-side encryption using AWS KMS-managed keys. </p>
    */
  var SourceSelectionCriteria: js.UndefOr[
    typingsSlinky.awsSdkClientS3Browser.typesSourceSelectionCriteriaMod.SourceSelectionCriteria
  ] = js.native
  /**
    * <p>The rule is ignored if status is not Enabled.</p>
    */
  var Status: Enabled | Disabled | String = js.native
}

object ReplicationRule {
  @scala.inline
  def apply(Destination: Destination, Status: Enabled | Disabled | String): ReplicationRule = {
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
    def withStatus(value: Enabled | Disabled | String): Self = {
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
    def withID(value: String): Self = {
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
    def withPrefix(value: String): Self = {
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
    def withPriority(value: Double): Self = {
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

