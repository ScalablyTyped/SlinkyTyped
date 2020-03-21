package typingsSlinky.reResizable.resizerMod

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.TagMod
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticTouchEvent
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var children: TagMod[Any]
  var className: js.UndefOr[String] = js.undefined
  var direction: Direction
  var onResizeStart: OnStartCallback
  var replaceStyles: js.UndefOr[CSSProperties] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    children: TagMod[Any],
    direction: Direction,
    onResizeStart: (/* e */ SyntheticMouseEvent[HTMLDivElement] | SyntheticTouchEvent[HTMLDivElement], /* dir */ Direction) => Unit,
    className: String = null,
    replaceStyles: CSSProperties = null
  ): Props = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], onResizeStart = js.Any.fromFunction2(onResizeStart))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (replaceStyles != null) __obj.updateDynamic("replaceStyles")(replaceStyles.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

