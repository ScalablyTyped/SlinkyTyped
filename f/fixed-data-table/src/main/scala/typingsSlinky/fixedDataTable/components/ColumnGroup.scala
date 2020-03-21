package typingsSlinky.fixedDataTable.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.fixedDataTable.mod.CellProps
import typingsSlinky.fixedDataTable.mod.ColumnGroupProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ColumnGroup
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.fixedDataTable.mod.ColumnGroup] {
  @JSImport("fixed-data-table", "ColumnGroup")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    header: String | ReactElement | (js.Function1[/* props */ CellProps, String | ReactElement]),
    align: String = null,
    fixed: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.fixedDataTable.mod.ColumnGroup] = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(fixed)) __obj.updateDynamic("fixed")(fixed.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ColumnGroupProps
}

