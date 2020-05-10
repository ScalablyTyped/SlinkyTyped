package typingsSlinky.rmcPicker.nativePickerAndroidMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPickerProp extends js.Object {
  def doScrollingComplete(arg: js.Any*): Unit = js.native
  def select(arg: js.Any*): Unit = js.native
}

object IPickerProp {
  @scala.inline
  def apply(doScrollingComplete: /* repeated */ js.Any => Unit, select: /* repeated */ js.Any => Unit): IPickerProp = {
    val __obj = js.Dynamic.literal(doScrollingComplete = js.Any.fromFunction1(doScrollingComplete), select = js.Any.fromFunction1(select))
    __obj.asInstanceOf[IPickerProp]
  }
  @scala.inline
  implicit class IPickerPropOps[Self <: IPickerProp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDoScrollingComplete(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doScrollingComplete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSelect(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

