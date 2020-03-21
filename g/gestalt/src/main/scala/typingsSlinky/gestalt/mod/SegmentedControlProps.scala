package typingsSlinky.gestalt.mod

import slinky.core.TagMod
import typingsSlinky.gestalt.AnonActiveIndex
import typingsSlinky.gestalt.gestaltStrings.lg
import typingsSlinky.gestalt.gestaltStrings.md
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SegmentedControlProps extends js.Object {
  var items: js.Array[TagMod[Any]]
  var selectedItemIndex: Double
  var size: js.UndefOr[md | lg] = js.undefined
  def onChange(args: AnonActiveIndex): Unit
}

object SegmentedControlProps {
  @scala.inline
  def apply(
    items: js.Array[TagMod[Any]],
    onChange: AnonActiveIndex => Unit,
    selectedItemIndex: Double,
    size: md | lg = null
  ): SegmentedControlProps = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), selectedItemIndex = selectedItemIndex.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[SegmentedControlProps]
  }
}

