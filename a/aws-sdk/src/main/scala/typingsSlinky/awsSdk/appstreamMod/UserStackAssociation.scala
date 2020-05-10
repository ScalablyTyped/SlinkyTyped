package typingsSlinky.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserStackAssociation extends js.Object {
  /**
    * The authentication type for the user.
    */
  var AuthenticationType: typingsSlinky.awsSdk.appstreamMod.AuthenticationType = js.native
  /**
    * Specifies whether a welcome email is sent to a user after the user is created in the user pool.
    */
  var SendEmailNotification: js.UndefOr[Boolean] = js.native
  /**
    * The name of the stack that is associated with the user.
    */
  var StackName: String = js.native
  /**
    * The email address of the user who is associated with the stack.  Users' email addresses are case-sensitive. 
    */
  var UserName: Username = js.native
}

object UserStackAssociation {
  @scala.inline
  def apply(AuthenticationType: AuthenticationType, StackName: String, UserName: Username): UserStackAssociation = {
    val __obj = js.Dynamic.literal(AuthenticationType = AuthenticationType.asInstanceOf[js.Any], StackName = StackName.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserStackAssociation]
  }
  @scala.inline
  implicit class UserStackAssociationOps[Self <: UserStackAssociation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthenticationType(value: AuthenticationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthenticationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStackName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserName(value: Username): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSendEmailNotification(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SendEmailNotification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSendEmailNotification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SendEmailNotification")(js.undefined)
        ret
    }
  }
  
}

