package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Authorizationid extends js.Object {
  var authorization_id: Required = js.native
}

object Authorizationid {
  @scala.inline
  def apply(authorization_id: Required): Authorizationid = {
    val __obj = js.Dynamic.literal(authorization_id = authorization_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Authorizationid]
  }
  @scala.inline
  implicit class AuthorizationidOps[Self <: Authorizationid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthorization_id(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorization_id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

