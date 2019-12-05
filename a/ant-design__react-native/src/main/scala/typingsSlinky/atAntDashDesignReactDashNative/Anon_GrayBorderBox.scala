package typingsSlinky.atAntDashDesignReactDashNative

import typingsSlinky.reactDashNative.reactDashNativeMod.ImageStyle
import typingsSlinky.reactDashNative.reactDashNativeMod.RegisteredStyle
import typingsSlinky.reactDashNative.reactDashNativeMod.TextStyle
import typingsSlinky.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GrayBorderBox extends js.Object {
  var grayBorderBox: RegisteredStyle[ViewStyle]
  var icon: RegisteredStyle[ImageStyle]
  var text: RegisteredStyle[TextStyle]
}

object Anon_GrayBorderBox {
  @scala.inline
  def apply(
    grayBorderBox: RegisteredStyle[ViewStyle],
    icon: RegisteredStyle[ImageStyle],
    text: RegisteredStyle[TextStyle]
  ): Anon_GrayBorderBox = {
    val __obj = js.Dynamic.literal(grayBorderBox = grayBorderBox.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_GrayBorderBox]
  }
}

