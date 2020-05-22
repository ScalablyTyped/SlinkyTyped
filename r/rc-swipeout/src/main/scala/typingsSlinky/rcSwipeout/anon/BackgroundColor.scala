package typingsSlinky.rcSwipeout.anon

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackgroundColor extends js.Object {
  var backgroundColor: String
  var color: String
  var component: ReactElement
  var disabled: Boolean
  var onPress: js.Any
  var text: js.Any
  var `type`: String
}

object BackgroundColor {
  @scala.inline
  def apply(
    backgroundColor: String,
    color: String,
    component: ReactElement,
    disabled: Boolean,
    onPress: js.Any,
    text: js.Any,
    `type`: String
  ): BackgroundColor = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], onPress = onPress.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundColor]
  }
}

