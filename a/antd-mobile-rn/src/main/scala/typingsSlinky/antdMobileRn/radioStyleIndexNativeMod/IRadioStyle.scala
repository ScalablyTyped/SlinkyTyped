package typingsSlinky.antdMobileRn.radioStyleIndexNativeMod

import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRadioStyle extends js.Object {
  var icon: ViewStyle = js.native
  var radioItem: ViewStyle = js.native
  var radioItemContent: TextStyle = js.native
  var radioItemContentDisable: TextStyle = js.native
  var radioItemRadio: ViewStyle = js.native
  var wrapper: ViewStyle = js.native
}

object IRadioStyle {
  @scala.inline
  def apply(
    icon: ViewStyle,
    radioItem: ViewStyle,
    radioItemContent: TextStyle,
    radioItemContentDisable: TextStyle,
    radioItemRadio: ViewStyle,
    wrapper: ViewStyle
  ): IRadioStyle = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], radioItem = radioItem.asInstanceOf[js.Any], radioItemContent = radioItemContent.asInstanceOf[js.Any], radioItemContentDisable = radioItemContentDisable.asInstanceOf[js.Any], radioItemRadio = radioItemRadio.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRadioStyle]
  }
  @scala.inline
  implicit class IRadioStyleOps[Self <: IRadioStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIcon(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRadioItem(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radioItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRadioItemContent(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radioItemContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRadioItemContentDisable(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radioItemContentDisable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRadioItemRadio(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radioItemRadio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWrapper(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapper")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

