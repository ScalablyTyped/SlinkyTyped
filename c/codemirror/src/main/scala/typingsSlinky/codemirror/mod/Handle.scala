package typingsSlinky.codemirror.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The Handle used to interact with the autocomplete dialog box.*/
@js.native
trait Handle extends js.Object {
  var data: js.Any = js.native
  var length: Double = js.native
  def close(): Unit = js.native
  def menuSize(): Double = js.native
  def moveFocus(n: Double, avoidWrap: Boolean): Unit = js.native
  def pick(): Unit = js.native
  def setFocus(n: Double): Unit = js.native
}

object Handle {
  @scala.inline
  def apply(
    close: () => Unit,
    data: js.Any,
    length: Double,
    menuSize: () => Double,
    moveFocus: (Double, Boolean) => Unit,
    pick: () => Unit,
    setFocus: Double => Unit
  ): Handle = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), data = data.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], menuSize = js.Any.fromFunction0(menuSize), moveFocus = js.Any.fromFunction2(moveFocus), pick = js.Any.fromFunction0(pick), setFocus = js.Any.fromFunction1(setFocus))
    __obj.asInstanceOf[Handle]
  }
  @scala.inline
  implicit class HandleOps[Self <: Handle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMenuSize(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuSize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMoveFocus(value: (Double, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveFocus")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPick(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pick")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetFocus(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFocus")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

