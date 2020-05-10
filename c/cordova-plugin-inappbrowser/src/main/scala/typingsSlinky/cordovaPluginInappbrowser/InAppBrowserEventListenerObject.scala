package typingsSlinky.cordovaPluginInappbrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InAppBrowserEventListenerObject extends js.Object {
  def handleEvent(evt: InAppBrowserEvent): Unit = js.native
}

object InAppBrowserEventListenerObject {
  @scala.inline
  def apply(handleEvent: InAppBrowserEvent => Unit): InAppBrowserEventListenerObject = {
    val __obj = js.Dynamic.literal(handleEvent = js.Any.fromFunction1(handleEvent))
    __obj.asInstanceOf[InAppBrowserEventListenerObject]
  }
  @scala.inline
  implicit class InAppBrowserEventListenerObjectOps[Self <: InAppBrowserEventListenerObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHandleEvent(value: InAppBrowserEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleEvent")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

