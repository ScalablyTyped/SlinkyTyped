package typingsSlinky.antDesignReactNative.anon

import typingsSlinky.reactNative.mod.ImageStyle
import typingsSlinky.reactNative.mod.RegisteredStyle
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Icon extends js.Object {
  var icon: RegisteredStyle[ImageStyle]
  var radioItem: RegisteredStyle[ViewStyle]
  var radioItemContent: RegisteredStyle[TextStyle]
  var radioItemContentDisable: RegisteredStyle[TextStyle]
  var radioItemRadio: RegisteredStyle[ViewStyle]
  var wrapper: RegisteredStyle[ViewStyle]
}

object Icon {
  @scala.inline
  def apply(
    icon: RegisteredStyle[ImageStyle],
    radioItem: RegisteredStyle[ViewStyle],
    radioItemContent: RegisteredStyle[TextStyle],
    radioItemContentDisable: RegisteredStyle[TextStyle],
    radioItemRadio: RegisteredStyle[ViewStyle],
    wrapper: RegisteredStyle[ViewStyle]
  ): Icon = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], radioItem = radioItem.asInstanceOf[js.Any], radioItemContent = radioItemContent.asInstanceOf[js.Any], radioItemContentDisable = radioItemContentDisable.asInstanceOf[js.Any], radioItemRadio = radioItemRadio.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[Icon]
  }
}

