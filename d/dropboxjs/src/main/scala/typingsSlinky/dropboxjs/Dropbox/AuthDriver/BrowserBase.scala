package typingsSlinky.dropboxjs.Dropbox.AuthDriver

import typingsSlinky.dropboxjs.Dropbox.Client
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrowserBase extends js.Object {
  def authType(): String = js.native
  def locationStateParam(url: String): String = js.native
  def onAuthStepChange(client: Client, callback: js.Function0[Unit]): Unit = js.native
}

object BrowserBase {
  @scala.inline
  def apply(
    authType: () => String,
    locationStateParam: String => String,
    onAuthStepChange: (Client, js.Function0[Unit]) => Unit
  ): BrowserBase = {
    val __obj = js.Dynamic.literal(authType = js.Any.fromFunction0(authType), locationStateParam = js.Any.fromFunction1(locationStateParam), onAuthStepChange = js.Any.fromFunction2(onAuthStepChange))
    __obj.asInstanceOf[BrowserBase]
  }
  @scala.inline
  implicit class BrowserBaseOps[Self <: BrowserBase] (val x: Self) extends AnyVal {
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
    def withLocationStateParam(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationStateParam")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnAuthStepChange(value: (Client, js.Function0[Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAuthStepChange")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

