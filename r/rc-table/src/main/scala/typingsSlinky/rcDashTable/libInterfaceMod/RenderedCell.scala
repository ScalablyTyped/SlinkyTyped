package typingsSlinky.rcDashTable.libInterfaceMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderedCell extends js.Object {
  var children: js.UndefOr[TagMod[Any]] = js.undefined
  var props: js.UndefOr[Cell] = js.undefined
}

object RenderedCell {
  @scala.inline
  def apply(children: TagMod[Any] = null, props: Cell = null): RenderedCell = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (props != null) __obj.updateDynamic("props")(props.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderedCell]
  }
}

