package typingsSlinky.awsSdk.workmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAccessControlEffectResponse extends js.Object {
  /**
    * The rule effect.
    */
  var Effect: js.UndefOr[AccessControlRuleEffect] = js.native
  /**
    * The rules that match the given parameters, resulting in an effect.
    */
  var MatchedRules: js.UndefOr[AccessControlRuleNameList] = js.native
}

object GetAccessControlEffectResponse {
  @scala.inline
  def apply(): GetAccessControlEffectResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAccessControlEffectResponse]
  }
  @scala.inline
  implicit class GetAccessControlEffectResponseOps[Self <: GetAccessControlEffectResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEffect(value: AccessControlRuleEffect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Effect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEffect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Effect")(js.undefined)
        ret
    }
    @scala.inline
    def withMatchedRules(value: AccessControlRuleNameList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MatchedRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchedRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MatchedRules")(js.undefined)
        ret
    }
  }
  
}

