package typingsSlinky.rcTable.anon

import org.scalajs.dom.raw.HTMLElement
import slinky.core.TagMod
import slinky.web.SyntheticMouseEvent
import typingsSlinky.rcTable.interfaceMod.ColumnsType
import typingsSlinky.rcTable.interfaceMod.GetRowKey
import typingsSlinky.rcTable.interfaceMod.Key
import typingsSlinky.rcTable.interfaceMod.RenderExpandIcon
import typingsSlinky.rcTable.interfaceMod.RenderExpandIconProps
import typingsSlinky.rcTable.interfaceMod.TriggerEventHandler
import typingsSlinky.rcTable.rcTableStrings.ltr
import typingsSlinky.rcTable.rcTableStrings.rtl
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Columns[RecordType] extends js.Object {
  var children: js.UndefOr[TagMod[Any]] = js.undefined
  var columns: js.UndefOr[ColumnsType[RecordType]] = js.undefined
  var direction: js.UndefOr[ltr | rtl] = js.undefined
  var expandIcon: js.UndefOr[RenderExpandIcon[RecordType]] = js.undefined
  var expandIconColumnIndex: js.UndefOr[Double] = js.undefined
  var expandRowByClick: js.UndefOr[Boolean] = js.undefined
  var expandable: Boolean
  var expandedKeys: Set[Key]
  var getRowKey: GetRowKey[RecordType]
  var onTriggerExpand: TriggerEventHandler[RecordType]
  var prefixCls: js.UndefOr[String] = js.undefined
  var rowExpandable: js.UndefOr[js.Function1[/* record */ RecordType, Boolean]] = js.undefined
}

object Columns {
  @scala.inline
  def apply[RecordType](
    expandable: Boolean,
    expandedKeys: Set[Key],
    getRowKey: (RecordType, /* index */ js.UndefOr[Double]) => Key,
    onTriggerExpand: (RecordType, /* event */ SyntheticMouseEvent[HTMLElement]) => Unit,
    children: TagMod[Any] = null,
    columns: ColumnsType[RecordType] = null,
    direction: ltr | rtl = null,
    expandIcon: /* props */ RenderExpandIconProps[RecordType] => TagMod[Any] = null,
    expandIconColumnIndex: js.UndefOr[Double] = js.undefined,
    expandRowByClick: js.UndefOr[Boolean] = js.undefined,
    prefixCls: String = null,
    rowExpandable: /* record */ RecordType => Boolean = null
  ): Columns[RecordType] = {
    val __obj = js.Dynamic.literal(expandable = expandable.asInstanceOf[js.Any], expandedKeys = expandedKeys.asInstanceOf[js.Any], getRowKey = js.Any.fromFunction2(getRowKey), onTriggerExpand = js.Any.fromFunction2(onTriggerExpand))
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (expandIcon != null) __obj.updateDynamic("expandIcon")(js.Any.fromFunction1(expandIcon))
    if (!js.isUndefined(expandIconColumnIndex)) __obj.updateDynamic("expandIconColumnIndex")(expandIconColumnIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(expandRowByClick)) __obj.updateDynamic("expandRowByClick")(expandRowByClick.get.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (rowExpandable != null) __obj.updateDynamic("rowExpandable")(js.Any.fromFunction1(rowExpandable))
    __obj.asInstanceOf[Columns[RecordType]]
  }
}

