package typingsSlinky.dropboxjs.Dropbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthDriver_ extends js.Object {
  def authType(): String = js.native
  def doAuthorize(authUrl: String, stateParam: String, client: Client, callback: QueryParamsCallback): Unit = js.native
  def getStateParam(client: Client, callback: js.Function1[/* state */ String, Unit]): Unit = js.native
  def onAuthStepChange(client: Client, callback: js.Function0[Unit]): Unit = js.native
  def resumeAuthorize(stateParam: String, client: Client, callback: QueryParamsCallback): Unit = js.native
  def url(): String = js.native
}

object AuthDriver_ {
  @scala.inline
  def apply(
    authType: () => String,
    doAuthorize: (String, String, Client, QueryParamsCallback) => Unit,
    getStateParam: (Client, js.Function1[/* state */ String, Unit]) => Unit,
    onAuthStepChange: (Client, js.Function0[Unit]) => Unit,
    resumeAuthorize: (String, Client, QueryParamsCallback) => Unit,
    url: () => String
  ): AuthDriver_ = {
    val __obj = js.Dynamic.literal(authType = js.Any.fromFunction0(authType), doAuthorize = js.Any.fromFunction4(doAuthorize), getStateParam = js.Any.fromFunction2(getStateParam), onAuthStepChange = js.Any.fromFunction2(onAuthStepChange), resumeAuthorize = js.Any.fromFunction3(resumeAuthorize), url = js.Any.fromFunction0(url))
    __obj.asInstanceOf[AuthDriver_]
  }
  @scala.inline
  implicit class AuthDriver_Ops[Self <: AuthDriver_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthType(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDoAuthorize(value: (String, String, Client, QueryParamsCallback) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doAuthorize")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withGetStateParam(value: (Client, js.Function1[/* state */ String, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStateParam")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOnAuthStepChange(value: (Client, js.Function0[Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAuthStepChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withResumeAuthorize(value: (String, Client, QueryParamsCallback) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resumeAuthorize")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withUrl(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

