package typingsSlinky.reactabularTable.anon

import slinky.core.facade.ReactElement
import typingsSlinky.reactabularTable.mod.ColumnFormatter
import typingsSlinky.reactabularTable.mod.ColumnTransform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Draggable extends js.Object {
  var draggable: js.UndefOr[Boolean] = js.undefined
  var formatters: js.UndefOr[js.Array[ColumnFormatter]] = js.undefined
  var label: String | ReactElement
  var resizable: js.UndefOr[Boolean] = js.undefined
  var sortable: js.UndefOr[Boolean] = js.undefined
  var transforms: js.UndefOr[js.Array[ColumnTransform]] = js.undefined
}

object Draggable {
  @scala.inline
  def apply(
    label: String | ReactElement,
    draggable: js.UndefOr[Boolean] = js.undefined,
    formatters: js.Array[ColumnFormatter] = null,
    resizable: js.UndefOr[Boolean] = js.undefined,
    sortable: js.UndefOr[Boolean] = js.undefined,
    transforms: js.Array[ColumnTransform] = null
  ): Draggable = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.get.asInstanceOf[js.Any])
    if (formatters != null) __obj.updateDynamic("formatters")(formatters.asInstanceOf[js.Any])
    if (!js.isUndefined(resizable)) __obj.updateDynamic("resizable")(resizable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sortable)) __obj.updateDynamic("sortable")(sortable.get.asInstanceOf[js.Any])
    if (transforms != null) __obj.updateDynamic("transforms")(transforms.asInstanceOf[js.Any])
    __obj.asInstanceOf[Draggable]
  }
}

