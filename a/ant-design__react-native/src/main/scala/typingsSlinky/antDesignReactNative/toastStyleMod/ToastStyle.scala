package typingsSlinky.antDesignReactNative.toastStyleMod

import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToastStyle extends js.Object {
  var centering: ViewStyle = js.native
  var container: ViewStyle = js.native
  var content: TextStyle = js.native
  var iconToast: ViewStyle = js.native
  var image: TextStyle = js.native
  var innerContainer: ViewStyle = js.native
  var innerWrap: ViewStyle = js.native
  var textToast: ViewStyle = js.native
}

object ToastStyle {
  @scala.inline
  def apply(
    centering: ViewStyle,
    container: ViewStyle,
    content: TextStyle,
    iconToast: ViewStyle,
    image: TextStyle,
    innerContainer: ViewStyle,
    innerWrap: ViewStyle,
    textToast: ViewStyle
  ): ToastStyle = {
    val __obj = js.Dynamic.literal(centering = centering.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], iconToast = iconToast.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], innerContainer = innerContainer.asInstanceOf[js.Any], innerWrap = innerWrap.asInstanceOf[js.Any], textToast = textToast.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastStyle]
  }
  @scala.inline
  implicit class ToastStyleOps[Self <: ToastStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCentering(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainer(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContent(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIconToast(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconToast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImage(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInnerContainer(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInnerWrap(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerWrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextToast(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textToast")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

