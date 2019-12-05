package typingsSlinky.reactDashAlert.reactDashAlertMod

import slinky.core.TagMod
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlertComponentPropsWithStyle extends AlertComponentProps {
  var style: CSSProperties
}

object AlertComponentPropsWithStyle {
  @scala.inline
  def apply(
    close: () => Unit,
    id: String,
    message: TagMod[Any],
    options: AlertCustomOptionsWithType,
    style: CSSProperties
  ): AlertComponentPropsWithStyle = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), id = id.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AlertComponentPropsWithStyle]
  }
}

