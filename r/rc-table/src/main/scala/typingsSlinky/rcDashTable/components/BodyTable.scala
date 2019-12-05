package typingsSlinky.rcDashTable.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.SyntheticUIEvent
import slinky.web.SyntheticWheelEvent
import slinky.web.html.`*`.tag
import typingsSlinky.rcDashTable.libBodyTableMod.BodyTableProps
import typingsSlinky.rcDashTable.libInterfaceMod.ColumnType
import typingsSlinky.rcDashTable.libInterfaceMod.DefaultValueType
import typingsSlinky.rcDashTable.libInterfaceMod.Expander
import typingsSlinky.rcDashTable.libInterfaceMod.FixedType
import typingsSlinky.rcDashTable.libInterfaceMod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object BodyTable
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("rc-table/lib/BodyTable", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply[ValueType](
    columns: js.Array[ColumnType[DefaultValueType]],
    expander: Expander[DefaultValueType],
    getRowKey: (ValueType, /* index */ Double) => Key,
    handleBodyScroll: SyntheticUIEvent[HTMLDivElement] => Unit,
    handleWheel: SyntheticWheelEvent[HTMLDivElement] => Unit,
    tableClassName: String,
    fixed: FixedType = null,
    isAnyColumnsFixed: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], expander = expander.asInstanceOf[js.Any], getRowKey = js.Any.fromFunction2(getRowKey), handleBodyScroll = js.Any.fromFunction1(handleBodyScroll), handleWheel = js.Any.fromFunction1(handleWheel), tableClassName = tableClassName.asInstanceOf[js.Any])
    if (fixed != null) __obj.updateDynamic("fixed")(fixed.asInstanceOf[js.Any])
    if (!js.isUndefined(isAnyColumnsFixed)) __obj.updateDynamic("isAnyColumnsFixed")(isAnyColumnsFixed.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, js.Object]]
  }
  type Props = BodyTableProps[js.Any]
}

