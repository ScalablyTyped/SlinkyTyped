package typingsSlinky.materialUi.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.materialUi.MaterialUI.Table.TableBodyProps
import typingsSlinky.materialUi.tableBodyMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TableBody
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("material-ui/Table/TableBody", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, style */
  def apply(
    allRowsSelected: js.UndefOr[Boolean] = js.undefined,
    deselectOnClickaway: js.UndefOr[Boolean] = js.undefined,
    displayRowCheckbox: js.UndefOr[Boolean] = js.undefined,
    multiSelectable: js.UndefOr[Boolean] = js.undefined,
    onCellClick: (/* row */ Double, /* column */ Double) => Unit = null,
    onCellHover: (/* row */ Double, /* column */ Double) => Unit = null,
    onCellHoverExit: (/* row */ Double, /* column */ Double) => Unit = null,
    onRowHover: /* row */ Double => Unit = null,
    onRowHoverExit: /* row */ Double => Unit = null,
    onRowSelection: /* selectedRows */ js.Array[Double] | String => Unit = null,
    preScanRows: js.UndefOr[Boolean] = js.undefined,
    selectable: js.UndefOr[Boolean] = js.undefined,
    showRowHover: js.UndefOr[Boolean] = js.undefined,
    stripedRows: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allRowsSelected)) __obj.updateDynamic("allRowsSelected")(allRowsSelected.asInstanceOf[js.Any])
    if (!js.isUndefined(deselectOnClickaway)) __obj.updateDynamic("deselectOnClickaway")(deselectOnClickaway.asInstanceOf[js.Any])
    if (!js.isUndefined(displayRowCheckbox)) __obj.updateDynamic("displayRowCheckbox")(displayRowCheckbox.asInstanceOf[js.Any])
    if (!js.isUndefined(multiSelectable)) __obj.updateDynamic("multiSelectable")(multiSelectable.asInstanceOf[js.Any])
    if (onCellClick != null) __obj.updateDynamic("onCellClick")(js.Any.fromFunction2(onCellClick))
    if (onCellHover != null) __obj.updateDynamic("onCellHover")(js.Any.fromFunction2(onCellHover))
    if (onCellHoverExit != null) __obj.updateDynamic("onCellHoverExit")(js.Any.fromFunction2(onCellHoverExit))
    if (onRowHover != null) __obj.updateDynamic("onRowHover")(js.Any.fromFunction1(onRowHover))
    if (onRowHoverExit != null) __obj.updateDynamic("onRowHoverExit")(js.Any.fromFunction1(onRowHoverExit))
    if (onRowSelection != null) __obj.updateDynamic("onRowSelection")(js.Any.fromFunction1(onRowSelection))
    if (!js.isUndefined(preScanRows)) __obj.updateDynamic("preScanRows")(preScanRows.asInstanceOf[js.Any])
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable.asInstanceOf[js.Any])
    if (!js.isUndefined(showRowHover)) __obj.updateDynamic("showRowHover")(showRowHover.asInstanceOf[js.Any])
    if (!js.isUndefined(stripedRows)) __obj.updateDynamic("stripedRows")(stripedRows.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.materialUi.tableBodyMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = TableBodyProps
}

