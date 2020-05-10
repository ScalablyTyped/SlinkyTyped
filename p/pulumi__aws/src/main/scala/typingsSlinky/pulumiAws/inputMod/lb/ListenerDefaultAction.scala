package typingsSlinky.pulumiAws.inputMod.lb

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListenerDefaultAction extends js.Object {
  var authenticateCognito: js.UndefOr[Input[ListenerDefaultActionAuthenticateCognito]] = js.native
  var authenticateOidc: js.UndefOr[Input[ListenerDefaultActionAuthenticateOidc]] = js.native
  /**
    * Information for creating an action that returns a custom HTTP response. Required if `type` is `fixed-response`.
    */
  var fixedResponse: js.UndefOr[Input[ListenerDefaultActionFixedResponse]] = js.native
  var order: js.UndefOr[Input[Double]] = js.native
  /**
    * Information for creating a redirect action. Required if `type` is `redirect`.
    */
  var redirect: js.UndefOr[Input[ListenerDefaultActionRedirect]] = js.native
  /**
    * The ARN of the Target Group to which to route traffic. Required if `type` is `forward`.
    */
  var targetGroupArn: js.UndefOr[Input[String]] = js.native
  /**
    * The type of routing action. Valid values are `forward`, `redirect`, `fixed-response`, `authenticate-cognito` and `authenticate-oidc`.
    */
  var `type`: Input[String] = js.native
}

object ListenerDefaultAction {
  @scala.inline
  def apply(`type`: Input[String]): ListenerDefaultAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerDefaultAction]
  }
  @scala.inline
  implicit class ListenerDefaultActionOps[Self <: ListenerDefaultAction] (val x: Self) extends AnyVal {
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
    def withAuthenticateCognito(value: Input[ListenerDefaultActionAuthenticateCognito]): Self = {
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
    def withAuthenticateOidc(value: Input[ListenerDefaultActionAuthenticateOidc]): Self = {
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
    def withFixedResponse(value: Input[ListenerDefaultActionFixedResponse]): Self = {
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
    def withRedirect(value: Input[ListenerDefaultActionRedirect]): Self = {
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

