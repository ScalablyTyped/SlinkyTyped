package typingsSlinky.materialUi.MaterialUI.Utils

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import typingsSlinky.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Events extends js.Object {
  def isKeyboard(e: Event): Boolean = js.native
  def off(el: Element, `type`: String, callback: EventListener): Unit = js.native
  def on(el: Element, `type`: String, callback: EventListener): Unit = js.native
  def once(el: Element, `type`: String, callback: EventListener): Unit = js.native
}

object Events {
  @scala.inline
  def apply(
    isKeyboard: Event => Boolean,
    off: (Element, String, EventListener) => Unit,
    on: (Element, String, EventListener) => Unit,
    once: (Element, String, EventListener) => Unit
  ): Events = {
    val __obj = js.Dynamic.literal(isKeyboard = js.Any.fromFunction1(isKeyboard), off = js.Any.fromFunction3(off), on = js.Any.fromFunction3(on), once = js.Any.fromFunction3(once))
    __obj.asInstanceOf[Events]
  }
  @scala.inline
  implicit class EventsOps[Self <: Events] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsKeyboard(value: Event => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isKeyboard")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOff(value: (Element, String, EventListener) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("off")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withOn(value: (Element, String, EventListener) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withOnce(value: (Element, String, EventListener) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("once")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

