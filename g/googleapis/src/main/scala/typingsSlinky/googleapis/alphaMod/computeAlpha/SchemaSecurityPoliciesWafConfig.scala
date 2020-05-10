package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaSecurityPoliciesWafConfig extends js.Object {
  var wafRules: js.UndefOr[SchemaPreconfiguredWafSet] = js.native
}

object SchemaSecurityPoliciesWafConfig {
  @scala.inline
  def apply(): SchemaSecurityPoliciesWafConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSecurityPoliciesWafConfig]
  }
  @scala.inline
  implicit class SchemaSecurityPoliciesWafConfigOps[Self <: SchemaSecurityPoliciesWafConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWafRules(value: SchemaPreconfiguredWafSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wafRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWafRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wafRules")(js.undefined)
        ret
    }
  }
  
}

