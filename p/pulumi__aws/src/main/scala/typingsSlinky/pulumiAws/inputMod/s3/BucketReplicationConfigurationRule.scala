package typingsSlinky.pulumiAws.inputMod.s3

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketReplicationConfigurationRule extends js.Object {
  /**
    * Specifies the destination for the rule (documented below).
    */
  var destination: Input[BucketReplicationConfigurationRuleDestination] = js.native
  /**
    * Filter that identifies subset of objects to which the replication rule applies (documented below).
    */
  var filter: js.UndefOr[Input[BucketReplicationConfigurationRuleFilter]] = js.native
  /**
    * Canonical user id to grant for. Used only when `type` is `CanonicalUser`.
    */
  var id: js.UndefOr[Input[String]] = js.native
  /**
    * Object keyname prefix that identifies subset of objects to which the rule applies.
    */
  var prefix: js.UndefOr[Input[String]] = js.native
  /**
    * The priority associated with the rule.
    */
  var priority: js.UndefOr[Input[Double]] = js.native
  /**
    * Specifies special object selection criteria (documented below).
    */
  var sourceSelectionCriteria: js.UndefOr[Input[BucketReplicationConfigurationRuleSourceSelectionCriteria]] = js.native
  /**
    * The status of the rule. Either `Enabled` or `Disabled`. The rule is ignored if status is not Enabled.
    */
  var status: Input[String] = js.native
}

object BucketReplicationConfigurationRule {
  @scala.inline
  def apply(destination: Input[BucketReplicationConfigurationRuleDestination], status: Input[String]): BucketReplicationConfigurationRule = {
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
    def withDestination(value: Input[BucketReplicationConfigurationRuleDestination]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilter(value: Input[BucketReplicationConfigurationRuleFilter]): Self = {
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
    def withId(value: Input[String]): Self = {
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
    def withPrefix(value: Input[String]): Self = {
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
    def withPriority(value: Input[Double]): Self = {
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
    def withSourceSelectionCriteria(value: Input[BucketReplicationConfigurationRuleSourceSelectionCriteria]): Self = {
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

