package typingsSlinky.antDesignReactNative.anon

import typingsSlinky.reactNative.mod.RegisteredStyle
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemLeftRadius extends js.Object {
  var item: RegisteredStyle[ViewStyle]
  var itemLeftRadius: RegisteredStyle[ViewStyle]
  var itemRightRadius: RegisteredStyle[ViewStyle]
  var itemText: RegisteredStyle[TextStyle]
  var segment: RegisteredStyle[ViewStyle]
}

object ItemLeftRadius {
  @scala.inline
  def apply(
    item: RegisteredStyle[ViewStyle],
    itemLeftRadius: RegisteredStyle[ViewStyle],
    itemRightRadius: RegisteredStyle[ViewStyle],
    itemText: RegisteredStyle[TextStyle],
    segment: RegisteredStyle[ViewStyle]
  ): ItemLeftRadius = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], itemLeftRadius = itemLeftRadius.asInstanceOf[js.Any], itemRightRadius = itemRightRadius.asInstanceOf[js.Any], itemText = itemText.asInstanceOf[js.Any], segment = segment.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemLeftRadius]
  }
}

