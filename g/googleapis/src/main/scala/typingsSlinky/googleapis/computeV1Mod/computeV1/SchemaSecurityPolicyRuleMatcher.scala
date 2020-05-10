package typingsSlinky.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a match condition that incoming traffic is evaluated against.
  * Exactly one field must be specified.
  */
@js.native
trait SchemaSecurityPolicyRuleMatcher extends js.Object {
  /**
    * The configuration options available when specifying versioned_expr. This
    * field must be specified if versioned_expr is specified and cannot be
    * specified if versioned_expr is not specified.
    */
  var config: js.UndefOr[SchemaSecurityPolicyRuleMatcherConfig] = js.native
  /**
    * Preconfigured versioned expression. If this field is specified, config
    * must also be specified. Available preconfigured expressions along with
    * their requirements are: SRC_IPS_V1 - must specify the corresponding
    * src_ip_range field in config.
    */
  var versionedExpr: js.UndefOr[String] = js.native
}

object SchemaSecurityPolicyRuleMatcher {
  @scala.inline
  def apply(): SchemaSecurityPolicyRuleMatcher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSecurityPolicyRuleMatcher]
  }
  @scala.inline
  implicit class SchemaSecurityPolicyRuleMatcherOps[Self <: SchemaSecurityPolicyRuleMatcher] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfig(value: SchemaSecurityPolicyRuleMatcherConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(js.undefined)
        ret
    }
    @scala.inline
    def withVersionedExpr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionedExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersionedExpr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionedExpr")(js.undefined)
        ret
    }
  }
  
}

