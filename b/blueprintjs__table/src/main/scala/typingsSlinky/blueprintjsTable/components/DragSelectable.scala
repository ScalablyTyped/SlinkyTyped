package typingsSlinky.blueprintjsTable.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.raw.MouseEvent
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.blueprintjsTable.commonCellMod.IFocusedCellCoordinates
import typingsSlinky.blueprintjsTable.draggableMod.ICoordinateData
import typingsSlinky.blueprintjsTable.esmRegionsMod.IRegion
import typingsSlinky.blueprintjsTable.selectableMod.IDragSelectableProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DragSelectable
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.blueprintjsTable.mod.DragSelectable] {
  @JSImport("@blueprintjs/table", "DragSelectable")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    locateClick: MouseEvent => IRegion,
    locateDrag: (MouseEvent, ICoordinateData, js.UndefOr[Boolean]) => IRegion,
    onFocusedCell: IFocusedCellCoordinates => Unit,
    onSelection: js.Array[IRegion] => Unit,
    disabled: Boolean | (js.Function1[/* event */ MouseEvent, Boolean]) = null,
    enableMultipleSelection: js.UndefOr[Boolean] = js.undefined,
    focusedCell: IFocusedCellCoordinates = null,
    ignoredSelectors: js.Array[String] = null,
    onSelectionEnd: /* regions */ js.Array[IRegion] => Unit = null,
    selectedRegionTransform: (/* region */ IRegion, /* event */ MouseEvent | KeyboardEvent, /* coords */ js.UndefOr[ICoordinateData]) => IRegion = null,
    selectedRegions: js.Array[IRegion] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.blueprintjsTable.mod.DragSelectable] = {
    val __obj = js.Dynamic.literal(locateClick = js.Any.fromFunction1(locateClick), locateDrag = js.Any.fromFunction3(locateDrag), onFocusedCell = js.Any.fromFunction1(onFocusedCell), onSelection = js.Any.fromFunction1(onSelection))
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(enableMultipleSelection)) __obj.updateDynamic("enableMultipleSelection")(enableMultipleSelection.asInstanceOf[js.Any])
    if (focusedCell != null) __obj.updateDynamic("focusedCell")(focusedCell.asInstanceOf[js.Any])
    if (ignoredSelectors != null) __obj.updateDynamic("ignoredSelectors")(ignoredSelectors.asInstanceOf[js.Any])
    if (onSelectionEnd != null) __obj.updateDynamic("onSelectionEnd")(js.Any.fromFunction1(onSelectionEnd))
    if (selectedRegionTransform != null) __obj.updateDynamic("selectedRegionTransform")(js.Any.fromFunction3(selectedRegionTransform))
    if (selectedRegions != null) __obj.updateDynamic("selectedRegions")(selectedRegions.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = IDragSelectableProps
}

