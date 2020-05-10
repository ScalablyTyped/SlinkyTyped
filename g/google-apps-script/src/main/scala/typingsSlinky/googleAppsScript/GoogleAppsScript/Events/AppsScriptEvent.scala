package typingsSlinky.googleAppsScript.GoogleAppsScript.Events

import typingsSlinky.googleAppsScript.GoogleAppsScript.Base.User
import typingsSlinky.googleAppsScript.GoogleAppsScript.Script.AuthMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Internal interfaces
@js.native
trait AppsScriptEvent extends js.Object {
  var authMode: AuthMode = js.native
  var triggerUid: String = js.native
  var user: User = js.native
}

object AppsScriptEvent {
  @scala.inline
  def apply(authMode: AuthMode, triggerUid: String, user: User): AppsScriptEvent = {
    val __obj = js.Dynamic.literal(authMode = authMode.asInstanceOf[js.Any], triggerUid = triggerUid.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsScriptEvent]
  }
  @scala.inline
  implicit class AppsScriptEventOps[Self <: AppsScriptEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthMode(value: AuthMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTriggerUid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerUid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser(value: User): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

