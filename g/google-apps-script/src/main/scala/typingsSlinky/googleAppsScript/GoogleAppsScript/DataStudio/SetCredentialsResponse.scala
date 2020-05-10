package typingsSlinky.googleAppsScript.GoogleAppsScript.DataStudio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Builder to create a setCredentials() response for your script project.
  *
  *     function setCredentials(request) {
  *       var isValid = checkForValidCreds(request);
  *
  *       if (isValid) {
  *         // store the creds somewhere.
  *       }
  *
  *       return cc.newSetCredentialsResponse()
  *         .setIsValid(isValid)
  *         .build();
  *     }
  */
@js.native
trait SetCredentialsResponse extends js.Object {
  def build(): js.Any = js.native
  def printJson(): String = js.native
  def setIsValid(isValid: Boolean): SetCredentialsResponse = js.native
}

object SetCredentialsResponse {
  @scala.inline
  def apply(build: () => js.Any, printJson: () => String, setIsValid: Boolean => SetCredentialsResponse): SetCredentialsResponse = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), printJson = js.Any.fromFunction0(printJson), setIsValid = js.Any.fromFunction1(setIsValid))
    __obj.asInstanceOf[SetCredentialsResponse]
  }
  @scala.inline
  implicit class SetCredentialsResponseOps[Self <: SetCredentialsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuild(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("build")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPrintJson(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printJson")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetIsValid(value: Boolean => SetCredentialsResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIsValid")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

