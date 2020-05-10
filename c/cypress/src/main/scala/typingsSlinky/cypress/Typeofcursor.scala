package typingsSlinky.cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofcursor extends js.Object {
  /**
    * Clears the line and moves to the beginning of the line.
    */
  def CR(): Unit = js.native
  /**
    * Moves to the beginning of the line
    */
  def beginningOfLine(): Unit = js.native
  /**
    * Deletes the current line
    */
  def deleteLine(): Unit = js.native
  /**
    * Hides the cursor
    */
  def hide(): Unit = js.native
  /**
    * Shows the cursor
    */
  def show(): Unit = js.native
}

object Typeofcursor {
  @scala.inline
  def apply(
    CR: () => Unit,
    beginningOfLine: () => Unit,
    deleteLine: () => Unit,
    hide: () => Unit,
    show: () => Unit
  ): Typeofcursor = {
    val __obj = js.Dynamic.literal(CR = js.Any.fromFunction0(CR), beginningOfLine = js.Any.fromFunction0(beginningOfLine), deleteLine = js.Any.fromFunction0(deleteLine), hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[Typeofcursor]
  }
  @scala.inline
  implicit class TypeofcursorOps[Self <: Typeofcursor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCR(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CR")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withBeginningOfLine(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginningOfLine")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDeleteLine(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteLine")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHide(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withShow(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

