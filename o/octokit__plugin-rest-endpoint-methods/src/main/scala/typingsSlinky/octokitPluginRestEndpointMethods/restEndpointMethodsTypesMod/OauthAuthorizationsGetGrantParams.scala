package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OauthAuthorizationsGetGrantParams extends js.Object {
  var grant_id: Double = js.native
}

object OauthAuthorizationsGetGrantParams {
  @scala.inline
  def apply(grant_id: Double): OauthAuthorizationsGetGrantParams = {
    val __obj = js.Dynamic.literal(grant_id = grant_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[OauthAuthorizationsGetGrantParams]
  }
  @scala.inline
  implicit class OauthAuthorizationsGetGrantParamsOps[Self <: OauthAuthorizationsGetGrantParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGrant_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grant_id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

