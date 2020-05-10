package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateAuthorizerResponse extends js.Object {
  /**
    * The authorizer ARN.
    */
  var authorizerArn: js.UndefOr[AuthorizerArn] = js.native
  /**
    * The authorizer name.
    */
  var authorizerName: js.UndefOr[AuthorizerName] = js.native
}

object UpdateAuthorizerResponse {
  @scala.inline
  def apply(): UpdateAuthorizerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateAuthorizerResponse]
  }
  @scala.inline
  implicit class UpdateAuthorizerResponseOps[Self <: UpdateAuthorizerResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthorizerArn(value: AuthorizerArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizerArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthorizerArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizerArn")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthorizerName(value: AuthorizerName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthorizerName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizerName")(js.undefined)
        ret
    }
  }
  
}

