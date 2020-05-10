package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteAuthorizerRequest extends js.Object {
  /**
    * The name of the authorizer to delete.
    */
  var authorizerName: AuthorizerName = js.native
}

object DeleteAuthorizerRequest {
  @scala.inline
  def apply(authorizerName: AuthorizerName): DeleteAuthorizerRequest = {
    val __obj = js.Dynamic.literal(authorizerName = authorizerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAuthorizerRequest]
  }
  @scala.inline
  implicit class DeleteAuthorizerRequestOps[Self <: DeleteAuthorizerRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthorizerName(value: AuthorizerName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizerName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

