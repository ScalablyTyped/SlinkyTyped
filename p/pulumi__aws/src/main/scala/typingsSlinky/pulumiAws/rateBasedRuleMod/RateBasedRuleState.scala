package typingsSlinky.pulumiAws.rateBasedRuleMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.wafregional.RateBasedRulePredicate
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RateBasedRuleState extends js.Object {
  /**
    * The ARN of the WAF Regional Rate Based Rule.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The name or description for the Amazon CloudWatch metric of this rule.
    */
  val metricName: js.UndefOr[Input[String]] = js.native
  /**
    * The name or description of the rule.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The objects to include in a rule (documented below).
    */
  val predicates: js.UndefOr[Input[js.Array[Input[RateBasedRulePredicate]]]] = js.native
  /**
    * Valid value is IP.
    */
  val rateKey: js.UndefOr[Input[String]] = js.native
  /**
    * The maximum number of requests, which have an identical value in the field specified by the RateKey, allowed in a five-minute period. Minimum value is 100.
    */
  val rateLimit: js.UndefOr[Input[Double]] = js.native
  /**
    * Key-value mapping of resource tags
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object RateBasedRuleState {
  @scala.inline
  def apply(): RateBasedRuleState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RateBasedRuleState]
  }
  @scala.inline
  implicit class RateBasedRuleStateOps[Self <: RateBasedRuleState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(js.undefined)
        ret
    }
    @scala.inline
    def withMetricName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetricName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricName")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPredicates(value: Input[js.Array[Input[RateBasedRulePredicate]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("predicates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPredicates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("predicates")(js.undefined)
        ret
    }
    @scala.inline
    def withRateKey(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rateKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRateKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rateKey")(js.undefined)
        ret
    }
    @scala.inline
    def withRateLimit(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rateLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRateLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rateLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Input[StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

