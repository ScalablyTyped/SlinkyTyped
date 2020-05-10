package typingsSlinky.antdMobileRn.pickerStyleIndexNativeMod

import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPickerStyle extends js.Object {
  var actionText: TextStyle = js.native
  var header: ViewStyle = js.native
  var headerItem: ViewStyle = js.native
  var modal: ViewStyle = js.native
  var title: TextStyle = js.native
}

object IPickerStyle {
  @scala.inline
  def apply(
    actionText: TextStyle,
    header: ViewStyle,
    headerItem: ViewStyle,
    modal: ViewStyle,
    title: TextStyle
  ): IPickerStyle = {
    val __obj = js.Dynamic.literal(actionText = actionText.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], headerItem = headerItem.asInstanceOf[js.Any], modal = modal.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPickerStyle]
  }
  @scala.inline
  implicit class IPickerStyleOps[Self <: IPickerStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionText(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeader(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderItem(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModal(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

