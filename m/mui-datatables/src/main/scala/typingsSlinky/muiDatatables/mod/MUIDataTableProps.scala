package typingsSlinky.muiDatatables.mod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MUIDataTableProps extends js.Object {
  var columns: js.Array[MUIDataTableColumnDef]
  var data: js.Array[js.Object | (js.Array[Double | String])]
  var options: js.UndefOr[MUIDataTableOptions] = js.undefined
  var title: String | TagMod[Any]
}

object MUIDataTableProps {
  @scala.inline
  def apply(
    columns: js.Array[MUIDataTableColumnDef],
    data: js.Array[js.Object | (js.Array[Double | String])],
    title: String | TagMod[Any],
    options: MUIDataTableOptions = null
  ): MUIDataTableProps = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableProps]
  }
}

