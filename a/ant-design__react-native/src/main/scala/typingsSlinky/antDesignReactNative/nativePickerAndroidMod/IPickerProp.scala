package typingsSlinky.antDesignReactNative.nativePickerAndroidMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPickerProp extends js.Object {
  var doScrollingComplete: js.Function = js.native
  var select: js.Function = js.native
}

object IPickerProp {
  @scala.inline
  def apply(doScrollingComplete: js.Function, select: js.Function): IPickerProp = {
    val __obj = js.Dynamic.literal(doScrollingComplete = doScrollingComplete.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPickerProp]
  }
  @scala.inline
  implicit class IPickerPropOps[Self <: IPickerProp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDoScrollingComplete(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doScrollingComplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelect(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

