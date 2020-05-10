package typingsSlinky.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserIdentityInfo extends js.Object {
  /**
    * The email address. If you are using SAML for identity management and include this parameter, an error is returned.
    */
  var Email: js.UndefOr[typingsSlinky.awsSdk.connectMod.Email] = js.native
  /**
    * The first name. This is required if you are using Amazon Connect or SAML for identity management.
    */
  var FirstName: js.UndefOr[AgentFirstName] = js.native
  /**
    * The last name. This is required if you are using Amazon Connect or SAML for identity management.
    */
  var LastName: js.UndefOr[AgentLastName] = js.native
}

object UserIdentityInfo {
  @scala.inline
  def apply(): UserIdentityInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserIdentityInfo]
  }
  @scala.inline
  implicit class UserIdentityInfoOps[Self <: UserIdentityInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmail(value: Email): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Email")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstName(value: AgentFirstName): Self = {
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
    def withLastName(value: AgentLastName): Self = {
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
  }
  
}

