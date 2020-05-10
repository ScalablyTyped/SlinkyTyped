package typingsSlinky.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaSecurityPolicyRuleMatcherConfig extends js.Object {
  /**
    * CIDR IP address range.
    */
  var srcIpRanges: js.UndefOr[js.Array[String]] = js.native
}

object SchemaSecurityPolicyRuleMatcherConfig {
  @scala.inline
  def apply(): SchemaSecurityPolicyRuleMatcherConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSecurityPolicyRuleMatcherConfig]
  }
  @scala.inline
  implicit class SchemaSecurityPolicyRuleMatcherConfigOps[Self <: SchemaSecurityPolicyRuleMatcherConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSrcIpRanges(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srcIpRanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSrcIpRanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srcIpRanges")(js.undefined)
        ret
    }
  }
  
}

