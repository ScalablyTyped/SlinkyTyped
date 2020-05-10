package typingsSlinky.googleAppsScript.GoogleAppsScript.Script

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object used to determine whether the user needs to authorize this script to use one or more
  * services, and to provide the URL for an authorization dialog. If the script is published as an add-on that uses installable triggers, this information can be used
  * to control access to sections of code for which the user lacks the necessary authorization.
  * Alternately, the add-on can ask the user to open the URL for the authorization dialog to resolve
  * the problem.
  *
  * This object is returned by ScriptApp.getAuthorizationInfo(authMode). In almost
  * all cases, scripts should call ScriptApp.getAuthorizationInfo(ScriptApp.AuthMode.FULL),
  * since no other authorization mode requires that users grant authorization.
  */
@js.native
trait AuthorizationInfo extends js.Object {
  def getAuthorizationStatus(): AuthorizationStatus = js.native
  def getAuthorizationUrl(): String = js.native
}

object AuthorizationInfo {
  @scala.inline
  def apply(getAuthorizationStatus: () => AuthorizationStatus, getAuthorizationUrl: () => String): AuthorizationInfo = {
    val __obj = js.Dynamic.literal(getAuthorizationStatus = js.Any.fromFunction0(getAuthorizationStatus), getAuthorizationUrl = js.Any.fromFunction0(getAuthorizationUrl))
    __obj.asInstanceOf[AuthorizationInfo]
  }
  @scala.inline
  implicit class AuthorizationInfoOps[Self <: AuthorizationInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetAuthorizationStatus(value: () => AuthorizationStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAuthorizationStatus")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetAuthorizationUrl(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAuthorizationUrl")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

