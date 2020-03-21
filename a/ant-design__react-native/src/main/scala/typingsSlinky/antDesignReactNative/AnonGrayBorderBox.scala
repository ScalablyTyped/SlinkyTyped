package typingsSlinky.antDesignReactNative

import typingsSlinky.reactNative.mod.ImageStyle
import typingsSlinky.reactNative.mod.RegisteredStyle
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGrayBorderBox extends js.Object {
  var grayBorderBox: RegisteredStyle[ViewStyle]
  var icon: RegisteredStyle[ImageStyle]
  var text: RegisteredStyle[TextStyle]
}

object AnonGrayBorderBox {
  @scala.inline
  def apply(
    grayBorderBox: RegisteredStyle[ViewStyle],
    icon: RegisteredStyle[ImageStyle],
    text: RegisteredStyle[TextStyle]
  ): AnonGrayBorderBox = {
    val __obj = js.Dynamic.literal(grayBorderBox = grayBorderBox.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonGrayBorderBox]
  }
}

