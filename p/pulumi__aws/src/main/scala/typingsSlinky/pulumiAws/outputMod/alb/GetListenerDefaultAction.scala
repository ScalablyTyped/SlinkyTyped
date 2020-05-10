package typingsSlinky.pulumiAws.outputMod.alb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetListenerDefaultAction extends js.Object {
  var authenticateCognitos: js.Array[GetListenerDefaultActionAuthenticateCognito] = js.native
  var authenticateOidcs: js.Array[GetListenerDefaultActionAuthenticateOidc] = js.native
  var fixedResponses: js.Array[GetListenerDefaultActionFixedResponse] = js.native
  var order: Double = js.native
  var redirects: js.Array[GetListenerDefaultActionRedirect] = js.native
  var targetGroupArn: String = js.native
  var `type`: String = js.native
}

object GetListenerDefaultAction {
  @scala.inline
  def apply(
    authenticateCognitos: js.Array[GetListenerDefaultActionAuthenticateCognito],
    authenticateOidcs: js.Array[GetListenerDefaultActionAuthenticateOidc],
    fixedResponses: js.Array[GetListenerDefaultActionFixedResponse],
    order: Double,
    redirects: js.Array[GetListenerDefaultActionRedirect],
    targetGroupArn: String,
    `type`: String
  ): GetListenerDefaultAction = {
    val __obj = js.Dynamic.literal(authenticateCognitos = authenticateCognitos.asInstanceOf[js.Any], authenticateOidcs = authenticateOidcs.asInstanceOf[js.Any], fixedResponses = fixedResponses.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], redirects = redirects.asInstanceOf[js.Any], targetGroupArn = targetGroupArn.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetListenerDefaultAction]
  }
  @scala.inline
  implicit class GetListenerDefaultActionOps[Self <: GetListenerDefaultAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthenticateCognitos(value: js.Array[GetListenerDefaultActionAuthenticateCognito]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authenticateCognitos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthenticateOidcs(value: js.Array[GetListenerDefaultActionAuthenticateOidc]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authenticateOidcs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFixedResponses(value: js.Array[GetListenerDefaultActionFixedResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedResponses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrder(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRedirects(value: js.Array[GetListenerDefaultActionRedirect]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetGroupArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetGroupArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

