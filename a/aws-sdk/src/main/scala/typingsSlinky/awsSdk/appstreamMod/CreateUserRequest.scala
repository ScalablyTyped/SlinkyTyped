package typingsSlinky.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateUserRequest extends js.Object {
  /**
    * The authentication type for the user. You must specify USERPOOL. 
    */
  var AuthenticationType: typingsSlinky.awsSdk.appstreamMod.AuthenticationType = js.native
  /**
    * The first name, or given name, of the user.
    */
  var FirstName: js.UndefOr[UserAttributeValue] = js.native
  /**
    * The last name, or surname, of the user.
    */
  var LastName: js.UndefOr[UserAttributeValue] = js.native
  /**
    * The action to take for the welcome email that is sent to a user after the user is created in the user pool. If you specify SUPPRESS, no email is sent. If you specify RESEND, do not specify the first name or last name of the user. If the value is null, the email is sent.   The temporary password in the welcome email is valid for only 7 days. If users don’t set their passwords within 7 days, you must send them a new welcome email. 
    */
  var MessageAction: js.UndefOr[typingsSlinky.awsSdk.appstreamMod.MessageAction] = js.native
  /**
    * The email address of the user.  Users' email addresses are case-sensitive. During login, if they specify an email address that doesn't use the same capitalization as the email address specified when their user pool account was created, a "user does not exist" error message displays. 
    */
  var UserName: Username = js.native
}

object CreateUserRequest {
  @scala.inline
  def apply(AuthenticationType: AuthenticationType, UserName: Username): CreateUserRequest = {
    val __obj = js.Dynamic.literal(AuthenticationType = AuthenticationType.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUserRequest]
  }
  @scala.inline
  implicit class CreateUserRequestOps[Self <: CreateUserRequest] (val x: Self) extends AnyVal {
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
    def withUserName(value: Username): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstName(value: UserAttributeValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FirstName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FirstName")(js.undefined)
        ret
    }
    @scala.inline
    def withLastName(value: UserAttributeValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastName")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageAction(value: MessageAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MessageAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MessageAction")(js.undefined)
        ret
    }
  }
  
}

