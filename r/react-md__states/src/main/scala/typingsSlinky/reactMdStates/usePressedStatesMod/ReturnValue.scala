package typingsSlinky.reactMdStates.usePressedStatesMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.reactMdStates.typesMod.MergableRippleHandlers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReturnValue[E /* <: HTMLElement */] extends js.Object {
  var handlers: MergableRippleHandlers[E] = js.native
  var pressed: Boolean = js.native
}

object ReturnValue {
  @scala.inline
  def apply[/* <: typingsSlinky.std.HTMLElement */ E](handlers: MergableRippleHandlers[E], pressed: Boolean): ReturnValue[E] = {
    val __obj = js.Dynamic.literal(handlers = handlers.asInstanceOf[js.Any], pressed = pressed.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnValue[E]]
  }
  @scala.inline
  implicit class ReturnValueOps[Self <: ReturnValue[_], /* <: typingsSlinky.std.HTMLElement */ E] (val x: Self with ReturnValue[E]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHandlers(value: MergableRippleHandlers[E]): Self = this.set("handlers", value.asInstanceOf[js.Any])
    @scala.inline
    def setPressed(value: Boolean): Self = this.set("pressed", value.asInstanceOf[js.Any])
  }
  
}

