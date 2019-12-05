package typingsSlinky.rcDashTable.libTableCellMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.TagMod
import typingsSlinky.rcDashTable.libInterfaceMod.ColumnType
import typingsSlinky.rcDashTable.libInterfaceMod.CustomizeComponent
import typingsSlinky.rcDashTable.libInterfaceMod.DefaultValueType
import typingsSlinky.react.reactMod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableCellProps[ValueType] extends js.Object {
  var column: js.UndefOr[ColumnType[DefaultValueType]] = js.undefined
  var component: js.UndefOr[CustomizeComponent[HTMLAttributes[HTMLElement]]] = js.undefined
  var expandIcon: js.UndefOr[TagMod[Any]] = js.undefined
  var indent: js.UndefOr[Double] = js.undefined
  var indentSize: js.UndefOr[Double] = js.undefined
  var index: js.UndefOr[Double] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var record: js.UndefOr[ValueType] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object TableCellProps {
  @scala.inline
  def apply[ValueType](
    column: ColumnType[DefaultValueType] = null,
    component: CustomizeComponent[HTMLAttributes[HTMLElement]] = null,
    expandIcon: TagMod[Any] = null,
    indent: Int | Double = null,
    indentSize: Int | Double = null,
    index: Int | Double = null,
    prefixCls: String = null,
    record: ValueType = null,
    title: String = null
  ): TableCellProps[ValueType] = {
    val __obj = js.Dynamic.literal()
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (expandIcon != null) __obj.updateDynamic("expandIcon")(expandIcon.asInstanceOf[js.Any])
    if (indent != null) __obj.updateDynamic("indent")(indent.asInstanceOf[js.Any])
    if (indentSize != null) __obj.updateDynamic("indentSize")(indentSize.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (record != null) __obj.updateDynamic("record")(record.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableCellProps[ValueType]]
  }
}

