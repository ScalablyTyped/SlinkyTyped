package typingsSlinky.jstree

import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSTreeStaticDefaultsCoreKeyboard extends js.Object {
  @JSName("*")
  def Asterisk(e: Event_): Unit = js.native
  def `ctrl-space`(e: Event_): Unit = js.native
  def down(e: Event_): Unit = js.native
  def end(e: Event_): Unit = js.native
  def enter(e: Event_): Unit = js.native
  def f2(e: Event_): Unit = js.native
  def home(e: Event_): Unit = js.native
  def left(e: Event_): Unit = js.native
  def right(e: Event_): Unit = js.native
  def up(e: Event_): Unit = js.native
}

object JSTreeStaticDefaultsCoreKeyboard {
  @scala.inline
  def apply(
    Asterisk: Event_ => Unit,
    `ctrl-space`: Event_ => Unit,
    down: Event_ => Unit,
    end: Event_ => Unit,
    enter: Event_ => Unit,
    f2: Event_ => Unit,
    home: Event_ => Unit,
    left: Event_ => Unit,
    right: Event_ => Unit,
    up: Event_ => Unit
  ): JSTreeStaticDefaultsCoreKeyboard = {
    val __obj = js.Dynamic.literal(down = js.Any.fromFunction1(down), end = js.Any.fromFunction1(end), enter = js.Any.fromFunction1(enter), f2 = js.Any.fromFunction1(f2), home = js.Any.fromFunction1(home), left = js.Any.fromFunction1(left), right = js.Any.fromFunction1(right), up = js.Any.fromFunction1(up))
    __obj.updateDynamic("*")(js.Any.fromFunction1(Asterisk))
    __obj.updateDynamic("ctrl-space")(js.Any.fromFunction1(`ctrl-space`))
    __obj.asInstanceOf[JSTreeStaticDefaultsCoreKeyboard]
  }
  @scala.inline
  implicit class JSTreeStaticDefaultsCoreKeyboardOps[Self <: JSTreeStaticDefaultsCoreKeyboard] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsterisk(value: Event_ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("*")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withCtrl-space`(value: Event_ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ctrl-space")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDown(value: Event_ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("down")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEnd(value: Event_ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEnter(value: Event_ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withF2(value: Event_ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("f2")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHome(value: Event_ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("home")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLeft(value: Event_ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRight(value: Event_ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUp(value: Event_ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("up")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

