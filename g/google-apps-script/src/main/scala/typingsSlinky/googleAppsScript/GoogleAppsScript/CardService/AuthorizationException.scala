package typingsSlinky.googleAppsScript.GoogleAppsScript.CardService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An error that can be returned to trigger an authorization card to be shown to the user.
  *
  *     CardService.newAuthorizationException()
  *       .setAuthorizationUrl("http://auth.com/")
  *       .setResourceDisplayName("Example Resource")
  *       .throwException();
  */
@js.native
trait AuthorizationException extends js.Object {
  def printJson(): String = js.native
  def setAuthorizationUrl(authUrl: String): AuthorizationException = js.native
  def setCustomUiCallback(callback: String): AuthorizationException = js.native
  def setResourceDisplayName(name: String): AuthorizationException = js.native
  def throwException(): Unit = js.native
}

object AuthorizationException {
  @scala.inline
  def apply(
    printJson: () => String,
    setAuthorizationUrl: String => AuthorizationException,
    setCustomUiCallback: String => AuthorizationException,
    setResourceDisplayName: String => AuthorizationException,
    throwException: () => Unit
  ): AuthorizationException = {
    val __obj = js.Dynamic.literal(printJson = js.Any.fromFunction0(printJson), setAuthorizationUrl = js.Any.fromFunction1(setAuthorizationUrl), setCustomUiCallback = js.Any.fromFunction1(setCustomUiCallback), setResourceDisplayName = js.Any.fromFunction1(setResourceDisplayName), throwException = js.Any.fromFunction0(throwException))
    __obj.asInstanceOf[AuthorizationException]
  }
  @scala.inline
  implicit class AuthorizationExceptionOps[Self <: AuthorizationException] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPrintJson(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printJson")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetAuthorizationUrl(value: String => AuthorizationException): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAuthorizationUrl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetCustomUiCallback(value: String => AuthorizationException): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCustomUiCallback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetResourceDisplayName(value: String => AuthorizationException): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setResourceDisplayName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withThrowException(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throwException")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

