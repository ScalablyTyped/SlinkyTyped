package typingsSlinky.rcDashTable.libBodyTableMod

import org.scalajs.dom.raw.HTMLDivElement
import slinky.web.SyntheticUIEvent
import slinky.web.SyntheticWheelEvent
import typingsSlinky.rcDashTable.libInterfaceMod.ColumnType
import typingsSlinky.rcDashTable.libInterfaceMod.DefaultValueType
import typingsSlinky.rcDashTable.libInterfaceMod.Expander
import typingsSlinky.rcDashTable.libInterfaceMod.FixedType
import typingsSlinky.rcDashTable.libInterfaceMod.GetRowKey
import typingsSlinky.rcDashTable.libInterfaceMod.Key
import typingsSlinky.react.reactMod.UIEventHandler
import typingsSlinky.react.reactMod.WheelEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodyTableProps[ValueType] extends js.Object {
  var columns: js.Array[ColumnType[DefaultValueType]]
  var expander: Expander[DefaultValueType]
  var fixed: js.UndefOr[FixedType] = js.undefined
  var getRowKey: GetRowKey[ValueType]
  var handleBodyScroll: UIEventHandler[HTMLDivElement]
  var handleWheel: WheelEventHandler[HTMLDivElement]
  var isAnyColumnsFixed: js.UndefOr[Boolean] = js.undefined
  var tableClassName: String
}

object BodyTableProps {
  @scala.inline
  def apply[ValueType](
    columns: js.Array[ColumnType[DefaultValueType]],
    expander: Expander[DefaultValueType],
    getRowKey: (ValueType, /* index */ Double) => Key,
    handleBodyScroll: SyntheticUIEvent[HTMLDivElement] => Unit,
    handleWheel: SyntheticWheelEvent[HTMLDivElement] => Unit,
    tableClassName: String,
    fixed: FixedType = null,
    isAnyColumnsFixed: js.UndefOr[Boolean] = js.undefined
  ): BodyTableProps[ValueType] = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], expander = expander.asInstanceOf[js.Any], getRowKey = js.Any.fromFunction2(getRowKey), handleBodyScroll = js.Any.fromFunction1(handleBodyScroll), handleWheel = js.Any.fromFunction1(handleWheel), tableClassName = tableClassName.asInstanceOf[js.Any])
    if (fixed != null) __obj.updateDynamic("fixed")(fixed.asInstanceOf[js.Any])
    if (!js.isUndefined(isAnyColumnsFixed)) __obj.updateDynamic("isAnyColumnsFixed")(isAnyColumnsFixed.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyTableProps[ValueType]]
  }
}

