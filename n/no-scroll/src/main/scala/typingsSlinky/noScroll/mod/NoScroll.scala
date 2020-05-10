package typingsSlinky.noScroll.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NoScroll extends js.Object {
  def off(): Unit = js.native
  def on(): Unit = js.native
  def toggle(): Unit = js.native
}

object NoScroll {
  @scala.inline
  def apply(off: () => Unit, on: () => Unit, toggle: () => Unit): NoScroll = {
    val __obj = js.Dynamic.literal(off = js.Any.fromFunction0(off), on = js.Any.fromFunction0(on), toggle = js.Any.fromFunction0(toggle))
    __obj.asInstanceOf[NoScroll]
  }
  @scala.inline
  implicit class NoScrollOps[Self <: NoScroll] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOff(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("off")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOn(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToggle(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggle")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

