package typingsSlinky.rcTable.cellMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.TagMod
import typingsSlinky.rcTable.interfaceMod.AlignType
import typingsSlinky.rcTable.interfaceMod.CustomizeComponent
import typingsSlinky.rcTable.interfaceMod.DataIndex
import typingsSlinky.rcTable.interfaceMod.DefaultRecordType
import typingsSlinky.rcTable.interfaceMod.RenderedCell
import typingsSlinky.rcTable.rcTableBooleans.`false`
import typingsSlinky.react.mod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellProps[RecordType /* <: DefaultRecordType */] extends js.Object {
  var additionalProps: js.UndefOr[HTMLAttributes[HTMLElement]] = js.undefined
  var align: js.UndefOr[AlignType] = js.undefined
  /** @private Used for `expandable` with nest tree */
  var appendNode: js.UndefOr[TagMod[Any]] = js.undefined
  var children: js.UndefOr[TagMod[Any]] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var colSpan: js.UndefOr[Double] = js.undefined
  var component: js.UndefOr[CustomizeComponent] = js.undefined
  var dataIndex: js.UndefOr[DataIndex] = js.undefined
  var ellipsis: js.UndefOr[Boolean] = js.undefined
  var firstFixLeft: js.UndefOr[Boolean] = js.undefined
  var firstFixRight: js.UndefOr[Boolean] = js.undefined
  var fixLeft: js.UndefOr[Double | `false`] = js.undefined
  var fixRight: js.UndefOr[Double | `false`] = js.undefined
  /** `record` index. Not `column` index. */
  var index: js.UndefOr[Double] = js.undefined
  var lastFixLeft: js.UndefOr[Boolean] = js.undefined
  var lastFixRight: js.UndefOr[Boolean] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var record: js.UndefOr[RecordType] = js.undefined
  var render: js.UndefOr[
    js.Function3[
      /* value */ js.Any, 
      /* record */ RecordType, 
      /* index */ Double, 
      TagMod[Any] | RenderedCell[RecordType]
    ]
  ] = js.undefined
  var rowSpan: js.UndefOr[Double] = js.undefined
}

object CellProps {
  @scala.inline
  def apply[RecordType](
    additionalProps: HTMLAttributes[HTMLElement] = null,
    align: AlignType = null,
    appendNode: TagMod[Any] = null,
    children: TagMod[Any] = null,
    className: String = null,
    colSpan: js.UndefOr[Double] = js.undefined,
    component: CustomizeComponent = null,
    dataIndex: DataIndex = null,
    ellipsis: js.UndefOr[Boolean] = js.undefined,
    firstFixLeft: js.UndefOr[Boolean] = js.undefined,
    firstFixRight: js.UndefOr[Boolean] = js.undefined,
    fixLeft: Double | `false` = null,
    fixRight: Double | `false` = null,
    index: js.UndefOr[Double] = js.undefined,
    lastFixLeft: js.UndefOr[Boolean] = js.undefined,
    lastFixRight: js.UndefOr[Boolean] = js.undefined,
    prefixCls: String = null,
    record: RecordType = null,
    render: (/* value */ js.Any, /* record */ RecordType, /* index */ Double) => TagMod[Any] | RenderedCell[RecordType] = null,
    rowSpan: js.UndefOr[Double] = js.undefined
  ): CellProps[RecordType] = {
    val __obj = js.Dynamic.literal()
    if (additionalProps != null) __obj.updateDynamic("additionalProps")(additionalProps.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (appendNode != null) __obj.updateDynamic("appendNode")(appendNode.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(colSpan)) __obj.updateDynamic("colSpan")(colSpan.get.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (dataIndex != null) __obj.updateDynamic("dataIndex")(dataIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(ellipsis)) __obj.updateDynamic("ellipsis")(ellipsis.get.asInstanceOf[js.Any])
    if (!js.isUndefined(firstFixLeft)) __obj.updateDynamic("firstFixLeft")(firstFixLeft.get.asInstanceOf[js.Any])
    if (!js.isUndefined(firstFixRight)) __obj.updateDynamic("firstFixRight")(firstFixRight.get.asInstanceOf[js.Any])
    if (fixLeft != null) __obj.updateDynamic("fixLeft")(fixLeft.asInstanceOf[js.Any])
    if (fixRight != null) __obj.updateDynamic("fixRight")(fixRight.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lastFixLeft)) __obj.updateDynamic("lastFixLeft")(lastFixLeft.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lastFixRight)) __obj.updateDynamic("lastFixRight")(lastFixRight.get.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (record != null) __obj.updateDynamic("record")(record.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction3(render))
    if (!js.isUndefined(rowSpan)) __obj.updateDynamic("rowSpan")(rowSpan.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellProps[RecordType]]
  }
}

