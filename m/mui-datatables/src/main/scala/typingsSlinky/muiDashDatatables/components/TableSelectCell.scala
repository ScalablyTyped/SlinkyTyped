package typingsSlinky.muiDashDatatables.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.muiDashDatatables.muiDashDatatablesMod.MUIDataTableSelectCell
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TableSelectCell
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("mui-datatables", "TableSelectCell")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: checked, onChange */
  def apply(
    fixedHeader: Boolean,
    classes: js.Object = null,
    expandableOn: js.UndefOr[Boolean] = js.undefined,
    isHeaderCell: js.UndefOr[Boolean] = js.undefined,
    isRowExpanded: js.UndefOr[Boolean] = js.undefined,
    isRowSelectable: js.UndefOr[Boolean] = js.undefined,
    onExpand: /* args */ js.Any => _ = null,
    otherProps: js.Any = null,
    selectableOn: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal(fixedHeader = fixedHeader.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (!js.isUndefined(expandableOn)) __obj.updateDynamic("expandableOn")(expandableOn.asInstanceOf[js.Any])
    if (!js.isUndefined(isHeaderCell)) __obj.updateDynamic("isHeaderCell")(isHeaderCell.asInstanceOf[js.Any])
    if (!js.isUndefined(isRowExpanded)) __obj.updateDynamic("isRowExpanded")(isRowExpanded.asInstanceOf[js.Any])
    if (!js.isUndefined(isRowSelectable)) __obj.updateDynamic("isRowSelectable")(isRowSelectable.asInstanceOf[js.Any])
    if (onExpand != null) __obj.updateDynamic("onExpand")(js.Any.fromFunction1(onExpand))
    if (otherProps != null) __obj.updateDynamic("otherProps")(otherProps.asInstanceOf[js.Any])
    if (!js.isUndefined(selectableOn)) __obj.updateDynamic("selectableOn")(selectableOn.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = MUIDataTableSelectCell
}

