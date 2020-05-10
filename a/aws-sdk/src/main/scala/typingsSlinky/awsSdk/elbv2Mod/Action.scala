package typingsSlinky.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Action extends js.Object {
  /**
    * [HTTPS listeners] Information for using Amazon Cognito to authenticate users. Specify only when Type is authenticate-cognito.
    */
  var AuthenticateCognitoConfig: js.UndefOr[AuthenticateCognitoActionConfig] = js.native
  /**
    * [HTTPS listeners] Information about an identity provider that is compliant with OpenID Connect (OIDC). Specify only when Type is authenticate-oidc.
    */
  var AuthenticateOidcConfig: js.UndefOr[AuthenticateOidcActionConfig] = js.native
  /**
    * [Application Load Balancer] Information for creating an action that returns a custom HTTP response. Specify only when Type is fixed-response.
    */
  var FixedResponseConfig: js.UndefOr[FixedResponseActionConfig] = js.native
  /**
    * Information for creating an action that distributes requests among one or more target groups. For Network Load Balancers, you can specify a single target group. Specify only when Type is forward. If you specify both ForwardConfig and TargetGroupArn, you can specify only one target group using ForwardConfig and it must be the same target group specified in TargetGroupArn.
    */
  var ForwardConfig: js.UndefOr[ForwardActionConfig] = js.native
  /**
    * The order for the action. This value is required for rules with multiple actions. The action with the lowest value for order is performed first. The last action to be performed must be one of the following types of actions: a forward, fixed-response, or redirect.
    */
  var Order: js.UndefOr[ActionOrder] = js.native
  /**
    * [Application Load Balancer] Information for creating a redirect action. Specify only when Type is redirect.
    */
  var RedirectConfig: js.UndefOr[RedirectActionConfig] = js.native
  /**
    * The Amazon Resource Name (ARN) of the target group. Specify only when Type is forward and you want to route to a single target group. To route to one or more target groups, use ForwardConfig instead.
    */
  var TargetGroupArn: js.UndefOr[typingsSlinky.awsSdk.elbv2Mod.TargetGroupArn] = js.native
  /**
    * The type of action.
    */
  var Type: ActionTypeEnum = js.native
}

object Action {
  @scala.inline
  def apply(Type: ActionTypeEnum): Action = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  @scala.inline
  implicit class ActionOps[Self <: Action] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: ActionTypeEnum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthenticateCognitoConfig(value: AuthenticateCognitoActionConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthenticateCognitoConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthenticateCognitoConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthenticateCognitoConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthenticateOidcConfig(value: AuthenticateOidcActionConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthenticateOidcConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthenticateOidcConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthenticateOidcConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withFixedResponseConfig(value: FixedResponseActionConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FixedResponseConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixedResponseConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FixedResponseConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withForwardConfig(value: ForwardActionConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForwardConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForwardConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForwardConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withOrder(value: ActionOrder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Order")(js.undefined)
        ret
    }
    @scala.inline
    def withRedirectConfig(value: RedirectActionConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RedirectConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedirectConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RedirectConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetGroupArn(value: TargetGroupArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetGroupArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetGroupArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetGroupArn")(js.undefined)
        ret
    }
  }
  
}

