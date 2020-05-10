package typingsSlinky.antdMobileRn.modalStyleIndexNativeMod

import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IModalStyle extends js.Object {
  var body: ViewStyle = js.native
  var buttonGroupH: ViewStyle = js.native
  var buttonGroupV: ViewStyle = js.native
  var buttonText: TextStyle = js.native
  var buttonTextOperation: TextStyle = js.native
  var buttonWrapH: ViewStyle = js.native
  var buttonWrapV: ViewStyle = js.native
  var close: TextStyle = js.native
  var closeWrap: ViewStyle = js.native
  var container: ViewStyle = js.native
  var footer: ViewStyle = js.native
  var header: TextStyle = js.native
  var innerContainer: ViewStyle = js.native
  var maskClosable: ViewStyle = js.native
  var operationBody: ViewStyle = js.native
  var operationContainer: ViewStyle = js.native
  var popupContainer: ViewStyle = js.native
  var wrap: ViewStyle = js.native
}

object IModalStyle {
  @scala.inline
  def apply(
    body: ViewStyle,
    buttonGroupH: ViewStyle,
    buttonGroupV: ViewStyle,
    buttonText: TextStyle,
    buttonTextOperation: TextStyle,
    buttonWrapH: ViewStyle,
    buttonWrapV: ViewStyle,
    close: TextStyle,
    closeWrap: ViewStyle,
    container: ViewStyle,
    footer: ViewStyle,
    header: TextStyle,
    innerContainer: ViewStyle,
    maskClosable: ViewStyle,
    operationBody: ViewStyle,
    operationContainer: ViewStyle,
    popupContainer: ViewStyle,
    wrap: ViewStyle
  ): IModalStyle = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], buttonGroupH = buttonGroupH.asInstanceOf[js.Any], buttonGroupV = buttonGroupV.asInstanceOf[js.Any], buttonText = buttonText.asInstanceOf[js.Any], buttonTextOperation = buttonTextOperation.asInstanceOf[js.Any], buttonWrapH = buttonWrapH.asInstanceOf[js.Any], buttonWrapV = buttonWrapV.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], closeWrap = closeWrap.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], footer = footer.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], innerContainer = innerContainer.asInstanceOf[js.Any], maskClosable = maskClosable.asInstanceOf[js.Any], operationBody = operationBody.asInstanceOf[js.Any], operationContainer = operationContainer.asInstanceOf[js.Any], popupContainer = popupContainer.asInstanceOf[js.Any], wrap = wrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[IModalStyle]
  }
  @scala.inline
  implicit class IModalStyleOps[Self <: IModalStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtonGroupH(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonGroupH")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtonGroupV(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonGroupV")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtonText(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtonTextOperation(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonTextOperation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtonWrapH(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonWrapH")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtonWrapV(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonWrapV")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClose(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCloseWrap(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeWrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainer(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFooter(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeader(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInnerContainer(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaskClosable(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskClosable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperationBody(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperationContainer(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPopupContainer(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWrap(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrap")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

