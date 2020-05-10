package typingsSlinky.googleAppsScript.GoogleAppsScript.DataStudio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An error that is shown to users of the connector.
  *
  *     var cc = DataStudioApp.createCommunityConnector();
  *
  *     cc.newUserError()
  *       .setText("This is the debug error text.")
  *       .setDebugText("This text is only shown to admins.")
  *       .throwException();
  */
@js.native
trait UserError extends js.Object {
  def printJson(): String = js.native
  def setDebugText(text: String): UserError = js.native
  def setText(text: String): UserError = js.native
  def throwException(): scala.Nothing = js.native
}

object UserError {
  @scala.inline
  def apply(
    printJson: () => String,
    setDebugText: String => UserError,
    setText: String => UserError,
    throwException: () => scala.Nothing
  ): UserError = {
    val __obj = js.Dynamic.literal(printJson = js.Any.fromFunction0(printJson), setDebugText = js.Any.fromFunction1(setDebugText), setText = js.Any.fromFunction1(setText), throwException = js.Any.fromFunction0(throwException))
    __obj.asInstanceOf[UserError]
  }
  @scala.inline
  implicit class UserErrorOps[Self <: UserError] (val x: Self) extends AnyVal {
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
    def withSetDebugText(value: String => UserError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDebugText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetText(value: String => UserError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withThrowException(value: () => scala.Nothing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throwException")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

