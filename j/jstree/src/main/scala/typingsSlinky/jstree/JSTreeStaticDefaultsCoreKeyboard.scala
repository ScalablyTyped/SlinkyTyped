package typingsSlinky.jstree

import org.scalajs.dom.raw.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSTreeStaticDefaultsCoreKeyboard extends js.Object {
  @JSName("*")
  def Asterisk(e: Event): Unit = js.native
  def `ctrl-space`(e: Event): Unit = js.native
  def down(e: Event): Unit = js.native
  def end(e: Event): Unit = js.native
  def enter(e: Event): Unit = js.native
  def f2(e: Event): Unit = js.native
  def home(e: Event): Unit = js.native
  def left(e: Event): Unit = js.native
  def right(e: Event): Unit = js.native
  def up(e: Event): Unit = js.native
}

object JSTreeStaticDefaultsCoreKeyboard {
  @scala.inline
  def apply(
    Asterisk: Event => Unit,
    `ctrl-space`: Event => Unit,
    down: Event => Unit,
    end: Event => Unit,
    enter: Event => Unit,
    f2: Event => Unit,
    home: Event => Unit,
    left: Event => Unit,
    right: Event => Unit,
    up: Event => Unit
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
    def withAsterisk(value: Event => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("*")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withCtrl-space`(value: Event => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ctrl-space")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDown(value: Event => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("down")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEnd(value: Event => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEnter(value: Event => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withF2(value: Event => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("f2")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHome(value: Event => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("home")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLeft(value: Event => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRight(value: Event => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUp(value: Event => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("up")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

