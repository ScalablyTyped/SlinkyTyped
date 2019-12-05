package typingsSlinky.baseui.tableMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableProps extends js.Object {
  var columns: js.Array[String | TagMod[Any]]
  var data: js.Array[js.Array[TagMod[Any]]]
  var horizontalScrollWidth: js.UndefOr[String] = js.undefined
  var isLoading: js.UndefOr[Boolean] = js.undefined
}

object TableProps {
  @scala.inline
  def apply(
    columns: js.Array[String | TagMod[Any]],
    data: js.Array[js.Array[TagMod[Any]]],
    horizontalScrollWidth: String = null,
    isLoading: js.UndefOr[Boolean] = js.undefined
  ): TableProps = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    if (horizontalScrollWidth != null) __obj.updateDynamic("horizontalScrollWidth")(horizontalScrollWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(isLoading)) __obj.updateDynamic("isLoading")(isLoading.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableProps]
  }
}

