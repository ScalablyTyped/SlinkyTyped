package typingsSlinky.baseui.tableDashSemanticMod

import slinky.core.TagMod
import typingsSlinky.baseui.baseuiStrings.ASC
import typingsSlinky.baseui.baseuiStrings.DESC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableBuilderProps[RowT] extends js.Object {
  var children: js.UndefOr[TagMod[Any]] = js.undefined
  var data: js.Array[RowT]
  var horizontalScrollWidth: js.UndefOr[String] = js.undefined
  var onSort: js.UndefOr[js.Function1[/* columnId */ String, Unit]] = js.undefined
  var overrides: js.UndefOr[BuilderOverrides] = js.undefined
  var sortColumn: js.UndefOr[String | Null] = js.undefined
  var sortOrder: js.UndefOr[ASC | DESC | Null] = js.undefined
}

object TableBuilderProps {
  @scala.inline
  def apply[RowT](
    data: js.Array[RowT],
    children: TagMod[Any] = null,
    horizontalScrollWidth: String = null,
    onSort: /* columnId */ String => Unit = null,
    overrides: BuilderOverrides = null,
    sortColumn: String = null,
    sortOrder: ASC | DESC = null
  ): TableBuilderProps[RowT] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (horizontalScrollWidth != null) __obj.updateDynamic("horizontalScrollWidth")(horizontalScrollWidth.asInstanceOf[js.Any])
    if (onSort != null) __obj.updateDynamic("onSort")(js.Any.fromFunction1(onSort))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (sortColumn != null) __obj.updateDynamic("sortColumn")(sortColumn.asInstanceOf[js.Any])
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableBuilderProps[RowT]]
  }
}

