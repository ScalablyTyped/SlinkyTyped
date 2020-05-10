package typingsSlinky.navermaps.naver.maps

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DOMEventListener extends js.Object {
  var eventName: String = js.native
  var target: HTMLElement = js.native
  def listener(): js.Any = js.native
}

object DOMEventListener {
  @scala.inline
  def apply(eventName: String, listener: () => js.Any, target: HTMLElement): DOMEventListener = {
    val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any], listener = js.Any.fromFunction0(listener), target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMEventListener]
  }
  @scala.inline
  implicit class DOMEventListenerOps[Self <: DOMEventListener] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEventName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListener(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listener")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTarget(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

