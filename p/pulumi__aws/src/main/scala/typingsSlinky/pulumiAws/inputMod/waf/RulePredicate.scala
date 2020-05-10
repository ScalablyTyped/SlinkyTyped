package typingsSlinky.pulumiAws.inputMod.waf

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RulePredicate extends js.Object {
  /**
    * A unique identifier for a predicate in the rule, such as Byte Match Set ID or IPSet ID.
    */
  var dataId: Input[String] = js.native
  /**
    * Set this to `false` if you want to allow, block, or count requests
    * based on the settings in the specified [wafByteMatchSet](https://www.terraform.io/docs/providers/aws/r/waf_byte_match_set.html), [wafIpset](https://www.terraform.io/docs/providers/aws/r/waf_ipset.html), [aws.waf.SizeConstraintSet](https://www.terraform.io/docs/providers/aws/r/waf_size_constraint_set.html), [aws.waf.SqlInjectionMatchSet](https://www.terraform.io/docs/providers/aws/r/waf_sql_injection_match_set.html) or [aws.waf.XssMatchSet](https://www.terraform.io/docs/providers/aws/r/waf_xss_match_set.html).
    * For example, if an IPSet includes the IP address `192.0.2.44`, AWS WAF will allow or block requests based on that IP address.
    * If set to `true`, AWS WAF will allow, block, or count requests based on all IP addresses _except_ `192.0.2.44`.
    */
  var negated: Input[Boolean] = js.native
  /**
    * The type of predicate in a rule. Valid values: `ByteMatch`, `GeoMatch`, `IPMatch`, `RegexMatch`, `SizeConstraint`, `SqlInjectionMatch`, or `XssMatch`.
    */
  var `type`: Input[String] = js.native
}

object RulePredicate {
  @scala.inline
  def apply(dataId: Input[String], negated: Input[Boolean], `type`: Input[String]): RulePredicate = {
    val __obj = js.Dynamic.literal(dataId = dataId.asInstanceOf[js.Any], negated = negated.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RulePredicate]
  }
  @scala.inline
  implicit class RulePredicateOps[Self <: RulePredicate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNegated(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

