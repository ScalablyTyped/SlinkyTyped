package typingsSlinky.pulumiAws.inputMod.alb

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListenerRuleAction extends js.Object {
  /**
    * Information for creating an authenticate action using Cognito. Required if `type` is `authenticate-cognito`.
    */
  var authenticateCognito: js.UndefOr[Input[ListenerRuleActionAuthenticateCognito]] = js.native
  /**
    * Information for creating an authenticate action using OIDC. Required if `type` is `authenticate-oidc`.
    */
  var authenticateOidc: js.UndefOr[Input[ListenerRuleActionAuthenticateOidc]] = js.native
  /**
    * Information for creating an action that returns a custom HTTP response. Required if `type` is `fixed-response`.
    */
  var fixedResponse: js.UndefOr[Input[ListenerRuleActionFixedResponse]] = js.native
  var order: js.UndefOr[Input[Double]] = js.native
  /**
    * Information for creating a redirect action. Required if `type` is `redirect`.
    */
  var redirect: js.UndefOr[Input[ListenerRuleActionRedirect]] = js.native
  /**
    * The ARN of the Target Group to which to route traffic. Required if `type` is `forward`.
    */
  var targetGroupArn: js.UndefOr[Input[String]] = js.native
  /**
    * The type of routing action. Valid values are `forward`, `redirect`, `fixed-response`, `authenticate-cognito` and `authenticate-oidc`.
    */
  var `type`: Input[String] = js.native
}

object ListenerRuleAction {
  @scala.inline
  def apply(`type`: Input[String]): ListenerRuleAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerRuleAction]
  }
  @scala.inline
  implicit class ListenerRuleActionOps[Self <: ListenerRuleAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthenticateCognito(value: Input[ListenerRuleActionAuthenticateCognito]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authenticateCognito")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthenticateCognito: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authenticateCognito")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthenticateOidc(value: Input[ListenerRuleActionAuthenticateOidc]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authenticateOidc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthenticateOidc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authenticateOidc")(js.undefined)
        ret
    }
    @scala.inline
    def withFixedResponse(value: Input[ListenerRuleActionFixedResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixedResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedResponse")(js.undefined)
        ret
    }
    @scala.inline
    def withOrder(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(js.undefined)
        ret
    }
    @scala.inline
    def withRedirect(value: Input[ListenerRuleActionRedirect]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedirect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirect")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetGroupArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetGroupArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetGroupArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetGroupArn")(js.undefined)
        ret
    }
  }
  
}

