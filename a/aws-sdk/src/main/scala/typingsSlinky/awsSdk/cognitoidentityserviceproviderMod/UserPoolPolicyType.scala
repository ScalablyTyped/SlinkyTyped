package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserPoolPolicyType extends js.Object {
  /**
    * The password policy.
    */
  var PasswordPolicy: js.UndefOr[PasswordPolicyType] = js.native
}

object UserPoolPolicyType {
  @scala.inline
  def apply(): UserPoolPolicyType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserPoolPolicyType]
  }
  @scala.inline
  implicit class UserPoolPolicyTypeOps[Self <: UserPoolPolicyType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPasswordPolicy(value: PasswordPolicyType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PasswordPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasswordPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PasswordPolicy")(js.undefined)
        ret
    }
  }
  
}

