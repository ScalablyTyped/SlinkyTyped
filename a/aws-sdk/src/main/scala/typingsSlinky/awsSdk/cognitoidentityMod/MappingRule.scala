package typingsSlinky.awsSdk.cognitoidentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MappingRule extends js.Object {
  /**
    * The claim name that must be present in the token, for example, "isAdmin" or "paid".
    */
  var Claim: ClaimName = js.native
  /**
    * The match condition that specifies how closely the claim value in the IdP token must match Value.
    */
  var MatchType: MappingRuleMatchType = js.native
  /**
    * The role ARN.
    */
  var RoleARN: ARNString = js.native
  /**
    * A brief string that the claim must match, for example, "paid" or "yes".
    */
  var Value: ClaimValue = js.native
}

object MappingRule {
  @scala.inline
  def apply(Claim: ClaimName, MatchType: MappingRuleMatchType, RoleARN: ARNString, Value: ClaimValue): MappingRule = {
    val __obj = js.Dynamic.literal(Claim = Claim.asInstanceOf[js.Any], MatchType = MatchType.asInstanceOf[js.Any], RoleARN = RoleARN.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MappingRule]
  }
  @scala.inline
  implicit class MappingRuleOps[Self <: MappingRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClaim(value: ClaimName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Claim")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatchType(value: MappingRuleMatchType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MatchType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoleARN(value: ARNString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: ClaimValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

