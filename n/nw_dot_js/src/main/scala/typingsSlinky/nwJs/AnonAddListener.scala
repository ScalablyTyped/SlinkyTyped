package typingsSlinky.nwJs

import typingsSlinky.nwJs.mod._Global_.NWJSHelpers.CookiesOnChangedCallbackChangeInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAddListener extends js.Object {
  /**
    * Add a new listener for onChanged event.
    *
    * @param callback {function(changeInfo?)} The callback when cookie has been changed.
    * - (Optional) changeInfo {Objet} Contains details about the cookie that's been changed.
    */
  def addListener(callback: js.Function1[/* changeInfo */ CookiesOnChangedCallbackChangeInfo, Unit]): Unit = js.native
}

object AnonAddListener {
  @scala.inline
  def apply(addListener: js.Function1[/* changeInfo */ CookiesOnChangedCallbackChangeInfo, Unit] => Unit): AnonAddListener = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction1(addListener))
    __obj.asInstanceOf[AnonAddListener]
  }
  @scala.inline
  implicit class AnonAddListenerOps[Self <: AnonAddListener] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddListener(value: js.Function1[/* changeInfo */ CookiesOnChangedCallbackChangeInfo, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addListener")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

