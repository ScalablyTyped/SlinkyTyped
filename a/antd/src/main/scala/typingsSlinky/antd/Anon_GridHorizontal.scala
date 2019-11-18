package typingsSlinky.antd

import typingsSlinky.antd.antdStrings.horizontal
import typingsSlinky.antd.antdStrings.vertical
import typingsSlinky.antd.esListMod.ListGridType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GridHorizontal extends js.Object {
  var grid: js.UndefOr[ListGridType] = js.undefined
  var itemLayout: js.UndefOr[horizontal | vertical] = js.undefined
}

object Anon_GridHorizontal {
  @scala.inline
  def apply(grid: ListGridType = null, itemLayout: horizontal | vertical = null): Anon_GridHorizontal = {
    val __obj = js.Dynamic.literal()
    if (grid != null) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (itemLayout != null) __obj.updateDynamic("itemLayout")(itemLayout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_GridHorizontal]
  }
}

