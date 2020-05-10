package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuditActivityInitiator extends js.Object {
  /**
    * If the resource initiating the activity is an app, this property indicates all the app related information like appId,
    * Name, servicePrincipalId, Name.
    */
  var app: js.UndefOr[AppIdentity] = js.native
  /**
    * If the resource initiating the activity is a user, this property Indicates all the user related information like
    * userId, Name, UserPrinicpalName.
    */
  var user: js.UndefOr[UserIdentity] = js.native
}

object AuditActivityInitiator {
  @scala.inline
  def apply(): AuditActivityInitiator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuditActivityInitiator]
  }
  @scala.inline
  implicit class AuditActivityInitiatorOps[Self <: AuditActivityInitiator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApp(value: AppIdentity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app")(js.undefined)
        ret
    }
    @scala.inline
    def withUser(value: UserIdentity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(js.undefined)
        ret
    }
  }
  
}

