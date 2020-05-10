package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OauthAuthorizationsDeleteAuthorizationParams extends js.Object {
  var authorization_id: Double = js.native
}

object OauthAuthorizationsDeleteAuthorizationParams {
  @scala.inline
  def apply(authorization_id: Double): OauthAuthorizationsDeleteAuthorizationParams = {
    val __obj = js.Dynamic.literal(authorization_id = authorization_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[OauthAuthorizationsDeleteAuthorizationParams]
  }
  @scala.inline
  implicit class OauthAuthorizationsDeleteAuthorizationParamsOps[Self <: OauthAuthorizationsDeleteAuthorizationParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthorization_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorization_id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

