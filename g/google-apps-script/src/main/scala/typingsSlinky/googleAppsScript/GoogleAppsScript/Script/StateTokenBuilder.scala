package typingsSlinky.googleAppsScript.GoogleAppsScript.Script

import typingsSlinky.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Allows scripts to create state tokens that can be used in callback APIs (like OAuth flows).
  *
  *     // Reusable function to generate a callback URL, assuming the script has been published as a
  *     // web app (necessary to obtain the URL programmatically). If the script has not been published
  *     // as a web app, set `var url` in the first line to the URL of your script project (which
  *     // cannot be obtained programmatically).
  *     function getCallbackURL(callbackFunction){
  *       var url = ScriptApp.getService().getUrl();      // Ends in /exec (for a web app)
  *       url = url.slice(0, -4) + 'usercallback?state='; // Change /exec to /usercallback
  *       var stateToken = ScriptApp.newStateToken()
  *           .withMethod(callbackFunction)
  *           .withTimeout(120)
  *           .createToken();
  *       return url + stateToken;
  *     }
  */
@js.native
trait StateTokenBuilder extends js.Object {
  def createToken(): String = js.native
  def withArgument(name: String, value: String): StateTokenBuilder = js.native
  def withMethod(method: String): StateTokenBuilder = js.native
  def withTimeout(seconds: Integer): StateTokenBuilder = js.native
}

object StateTokenBuilder {
  @scala.inline
  def apply(
    createToken: () => String,
    withArgument: (String, String) => StateTokenBuilder,
    withMethod: String => StateTokenBuilder,
    withTimeout: Integer => StateTokenBuilder
  ): StateTokenBuilder = {
    val __obj = js.Dynamic.literal(createToken = js.Any.fromFunction0(createToken), withArgument = js.Any.fromFunction2(withArgument), withMethod = js.Any.fromFunction1(withMethod), withTimeout = js.Any.fromFunction1(withTimeout))
    __obj.asInstanceOf[StateTokenBuilder]
  }
  @scala.inline
  implicit class StateTokenBuilderOps[Self <: StateTokenBuilder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateToken(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createToken")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withWithArgument(value: (String, String) => StateTokenBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withArgument")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withWithMethod(value: String => StateTokenBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withMethod")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWithTimeout(value: Integer => StateTokenBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withTimeout")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

