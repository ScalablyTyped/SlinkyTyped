package typingsSlinky.pulumiAws.outputMod.s3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketReplicationConfigurationRule extends js.Object {
  /**
    * Specifies the destination for the rule (documented below).
    */
  var destination: BucketReplicationConfigurationRuleDestination = js.native
  /**
    * Filter that identifies subset of objects to which the replication rule applies (documented below).
    */
  var filter: js.UndefOr[BucketReplicationConfigurationRuleFilter] = js.native
  /**
    * Canonical user id to grant for. Used only when `type` is `CanonicalUser`.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Object keyname prefix that identifies subset of objects to which the rule applies.
    */
  var prefix: js.UndefOr[String] = js.native
  /**
    * The priority associated with the rule.
    */
  var priority: js.UndefOr[Double] = js.native
  /**
    * Specifies special object selection criteria (documented below).
    */
  var sourceSelectionCriteria: js.UndefOr[BucketReplicationConfigurationRuleSourceSelectionCriteria] = js.native
  /**
    * The status of the rule. Either `Enabled` or `Disabled`. The rule is ignored if status is not Enabled.
    */
  var status: String = js.native
}

object BucketReplicationConfigurationRule {
  @scala.inline
  def apply(destination: BucketReplicationConfigurationRuleDestination, status: String): BucketReplicationConfigurationRule = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketReplicationConfigurationRule]
  }
  @scala.inline
  implicit class BucketReplicationConfigurationRuleOps[Self <: BucketReplicationConfigurationRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestination(value: BucketReplicationConfigurationRuleDestination): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilter(value: BucketReplicationConfigurationRuleFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(js.undefined)
        ret
    }
    @scala.inline
    def withPriority(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPriority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceSelectionCriteria(value: BucketReplicationConfigurationRuleSourceSelectionCriteria): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceSelectionCriteria")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceSelectionCriteria: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceSelectionCriteria")(js.undefined)
        ret
    }
  }
  
}

