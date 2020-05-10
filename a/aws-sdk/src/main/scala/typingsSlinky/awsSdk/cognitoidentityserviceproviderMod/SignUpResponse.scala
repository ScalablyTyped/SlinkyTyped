package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignUpResponse extends js.Object {
  /**
    * The code delivery details returned by the server response to the user registration request.
    */
  var CodeDeliveryDetails: js.UndefOr[CodeDeliveryDetailsType] = js.native
  /**
    * A response from the server indicating that a user registration has been confirmed.
    */
  var UserConfirmed: BooleanType = js.native
  /**
    * The UUID of the authenticated user. This is not the same as username.
    */
  var UserSub: StringType = js.native
}

object SignUpResponse {
  @scala.inline
  def apply(UserConfirmed: BooleanType, UserSub: StringType): SignUpResponse = {
    val __obj = js.Dynamic.literal(UserConfirmed = UserConfirmed.asInstanceOf[js.Any], UserSub = UserSub.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignUpResponse]
  }
  @scala.inline
  implicit class SignUpResponseOps[Self <: SignUpResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUserConfirmed(value: BooleanType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserConfirmed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserSub(value: StringType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserSub")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCodeDeliveryDetails(value: CodeDeliveryDetailsType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CodeDeliveryDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodeDeliveryDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CodeDeliveryDetails")(js.undefined)
        ret
    }
  }
  
}

