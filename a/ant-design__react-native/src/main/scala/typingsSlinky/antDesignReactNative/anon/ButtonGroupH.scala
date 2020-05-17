package typingsSlinky.antDesignReactNative.anon

import typingsSlinky.reactNative.mod.RegisteredStyle
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ButtonGroupH extends js.Object {
  var body: RegisteredStyle[ViewStyle] = js.native
  var buttonGroupH: RegisteredStyle[ViewStyle] = js.native
  var buttonGroupV: RegisteredStyle[ViewStyle] = js.native
  var buttonText: RegisteredStyle[TextStyle] = js.native
  var buttonTextOperation: RegisteredStyle[TextStyle] = js.native
  var buttonWrapH: RegisteredStyle[ViewStyle] = js.native
  var buttonWrapV: RegisteredStyle[ViewStyle] = js.native
  var close: RegisteredStyle[TextStyle] = js.native
  var closeWrap: RegisteredStyle[ViewStyle] = js.native
  var container: RegisteredStyle[ViewStyle] = js.native
  var footer: RegisteredStyle[ViewStyle] = js.native
  var header: RegisteredStyle[TextStyle] = js.native
  var innerContainer: RegisteredStyle[ViewStyle] = js.native
  var maskClosable: RegisteredStyle[ViewStyle] = js.native
  var operationBody: RegisteredStyle[ViewStyle] = js.native
  var operationContainer: RegisteredStyle[ViewStyle] = js.native
  var popupContainer: RegisteredStyle[ViewStyle] = js.native
  var popupSlideDown: RegisteredStyle[ViewStyle] = js.native
  var popupSlideUp: RegisteredStyle[ViewStyle] = js.native
  var wrap: RegisteredStyle[ViewStyle] = js.native
}

object ButtonGroupH {
  @scala.inline
  def apply(
    body: RegisteredStyle[ViewStyle],
    buttonGroupH: RegisteredStyle[ViewStyle],
    buttonGroupV: RegisteredStyle[ViewStyle],
    buttonText: RegisteredStyle[TextStyle],
    buttonTextOperation: RegisteredStyle[TextStyle],
    buttonWrapH: RegisteredStyle[ViewStyle],
    buttonWrapV: RegisteredStyle[ViewStyle],
    close: RegisteredStyle[TextStyle],
    closeWrap: RegisteredStyle[ViewStyle],
    container: RegisteredStyle[ViewStyle],
    footer: RegisteredStyle[ViewStyle],
    header: RegisteredStyle[TextStyle],
    innerContainer: RegisteredStyle[ViewStyle],
    maskClosable: RegisteredStyle[ViewStyle],
    operationBody: RegisteredStyle[ViewStyle],
    operationContainer: RegisteredStyle[ViewStyle],
    popupContainer: RegisteredStyle[ViewStyle],
    popupSlideDown: RegisteredStyle[ViewStyle],
    popupSlideUp: RegisteredStyle[ViewStyle],
    wrap: RegisteredStyle[ViewStyle]
  ): ButtonGroupH = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], buttonGroupH = buttonGroupH.asInstanceOf[js.Any], buttonGroupV = buttonGroupV.asInstanceOf[js.Any], buttonText = buttonText.asInstanceOf[js.Any], buttonTextOperation = buttonTextOperation.asInstanceOf[js.Any], buttonWrapH = buttonWrapH.asInstanceOf[js.Any], buttonWrapV = buttonWrapV.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], closeWrap = closeWrap.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], footer = footer.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], innerContainer = innerContainer.asInstanceOf[js.Any], maskClosable = maskClosable.asInstanceOf[js.Any], operationBody = operationBody.asInstanceOf[js.Any], operationContainer = operationContainer.asInstanceOf[js.Any], popupContainer = popupContainer.asInstanceOf[js.Any], popupSlideDown = popupSlideDown.asInstanceOf[js.Any], popupSlideUp = popupSlideUp.asInstanceOf[js.Any], wrap = wrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonGroupH]
  }
  @scala.inline
  implicit class ButtonGroupHOps[Self <: ButtonGroupH] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtonGroupH(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonGroupH")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtonGroupV(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonGroupV")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtonText(value: RegisteredStyle[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtonTextOperation(value: RegisteredStyle[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonTextOperation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtonWrapH(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonWrapH")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtonWrapV(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonWrapV")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClose(value: RegisteredStyle[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCloseWrap(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeWrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainer(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFooter(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeader(value: RegisteredStyle[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInnerContainer(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaskClosable(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskClosable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperationBody(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperationContainer(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPopupContainer(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPopupSlideDown(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupSlideDown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPopupSlideUp(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupSlideUp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWrap(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrap")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

