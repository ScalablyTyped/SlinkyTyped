package typingsSlinky.androiduix.android.widget

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Checkable extends js.Object {
  def isChecked(): Boolean = js.native
  def setChecked(checked: Boolean): Unit = js.native
  def toggle(): Unit = js.native
}

object Checkable {
  @scala.inline
  def apply(isChecked: () => Boolean, setChecked: Boolean => Unit, toggle: () => Unit): Checkable = {
    val __obj = js.Dynamic.literal(isChecked = js.Any.fromFunction0(isChecked), setChecked = js.Any.fromFunction1(setChecked), toggle = js.Any.fromFunction0(toggle))
    __obj.asInstanceOf[Checkable]
  }
  @scala.inline
  implicit class CheckableOps[Self <: Checkable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsChecked(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isChecked")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetChecked(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setChecked")(js.Any.fromFunction1(value))
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

