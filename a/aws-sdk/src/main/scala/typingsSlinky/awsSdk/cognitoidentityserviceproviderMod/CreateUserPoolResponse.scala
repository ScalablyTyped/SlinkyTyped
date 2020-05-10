package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateUserPoolResponse extends js.Object {
  /**
    * A container for the user pool details.
    */
  var UserPool: js.UndefOr[UserPoolType] = js.native
}

object CreateUserPoolResponse {
  @scala.inline
  def apply(): CreateUserPoolResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateUserPoolResponse]
  }
  @scala.inline
  implicit class CreateUserPoolResponseOps[Self <: CreateUserPoolResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUserPool(value: UserPoolType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserPool")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserPool: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserPool")(js.undefined)
        ret
    }
  }
  
}

