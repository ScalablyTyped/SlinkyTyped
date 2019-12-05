package typingsSlinky.atJupyterlabLogconsole.libWidgetMod.ScrollingWidget

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.atPhosphorWidgets.atPhosphorWidgetsMod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptions[T /* <: Widget */]
  extends typingsSlinky.atPhosphorWidgets.libWidgetMod.Widget.IOptions {
  var content: T
}

object IOptions {
  @scala.inline
  def apply[T /* <: Widget */](content: T, node: HTMLElement = null): IOptions[T] = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    if (node != null) __obj.updateDynamic("node")(node.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions[T]]
  }
}

