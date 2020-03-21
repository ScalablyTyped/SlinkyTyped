package typingsSlinky.antDesignReactNative

import typingsSlinky.reactNative.mod.RegisteredStyle
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonProgressBar extends js.Object {
  var progressBar: RegisteredStyle[ViewStyle]
  var progressOuter: RegisteredStyle[ViewStyle]
}

object AnonProgressBar {
  @scala.inline
  def apply(progressBar: RegisteredStyle[ViewStyle], progressOuter: RegisteredStyle[ViewStyle]): AnonProgressBar = {
    val __obj = js.Dynamic.literal(progressBar = progressBar.asInstanceOf[js.Any], progressOuter = progressOuter.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonProgressBar]
  }
}

