package typingsSlinky.officeUiFabricReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.officeUiFabricReact.colorPickerGridCellTypesMod.IColorCellProps
import typingsSlinky.officeUiFabricReact.colorPickerGridCellTypesMod.IColorPickerGridCellStyleProps
import typingsSlinky.officeUiFabricReact.colorPickerGridCellTypesMod.IColorPickerGridCellStyles
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.circle
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.square
import typingsSlinky.officeUiFabricReact.swatchColorPickerTypesMod.ISwatchColorPickerProps
import typingsSlinky.officeUiFabricReact.swatchColorPickerTypesMod.ISwatchColorPickerStyleProps
import typingsSlinky.officeUiFabricReact.swatchColorPickerTypesMod.ISwatchColorPickerStyles
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SwatchColorPicker
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("office-ui-fabric-react", "SwatchColorPicker")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, disabled, id */
  def apply(
    colorCells: js.Array[IColorCellProps],
    columnCount: Double,
    ariaPosInSet: Int | Double = null,
    ariaSetSize: Int | Double = null,
    cellBorderWidth: Int | Double = null,
    cellHeight: Int | Double = null,
    cellMargin: Int | Double = null,
    cellShape: circle | square = null,
    cellWidth: Int | Double = null,
    doNotContainWithinFocusZone: js.UndefOr[Boolean] = js.undefined,
    focusOnHover: js.UndefOr[Boolean] = js.undefined,
    getColorGridCellStyles: IStyleFunctionOrObject[IColorPickerGridCellStyleProps, IColorPickerGridCellStyles] = null,
    isControlled: js.UndefOr[Boolean] = js.undefined,
    mouseLeaveParentSelector: String = null,
    onCellFocused: (/* id */ js.UndefOr[String], /* color */ js.UndefOr[String]) => Unit = null,
    onCellHovered: (/* id */ js.UndefOr[String], /* color */ js.UndefOr[String]) => Unit = null,
    onColorChanged: (/* id */ js.UndefOr[String], /* color */ js.UndefOr[String]) => Unit = null,
    positionInSet: Int | Double = null,
    selectedId: String = null,
    setSize: Int | Double = null,
    shouldFocusCircularNavigate: js.UndefOr[Boolean] = js.undefined,
    styles: IStyleFunctionOrObject[ISwatchColorPickerStyleProps, ISwatchColorPickerStyles] = null,
    theme: ITheme = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal(colorCells = colorCells.asInstanceOf[js.Any], columnCount = columnCount.asInstanceOf[js.Any])
    if (ariaPosInSet != null) __obj.updateDynamic("ariaPosInSet")(ariaPosInSet.asInstanceOf[js.Any])
    if (ariaSetSize != null) __obj.updateDynamic("ariaSetSize")(ariaSetSize.asInstanceOf[js.Any])
    if (cellBorderWidth != null) __obj.updateDynamic("cellBorderWidth")(cellBorderWidth.asInstanceOf[js.Any])
    if (cellHeight != null) __obj.updateDynamic("cellHeight")(cellHeight.asInstanceOf[js.Any])
    if (cellMargin != null) __obj.updateDynamic("cellMargin")(cellMargin.asInstanceOf[js.Any])
    if (cellShape != null) __obj.updateDynamic("cellShape")(cellShape.asInstanceOf[js.Any])
    if (cellWidth != null) __obj.updateDynamic("cellWidth")(cellWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(doNotContainWithinFocusZone)) __obj.updateDynamic("doNotContainWithinFocusZone")(doNotContainWithinFocusZone.asInstanceOf[js.Any])
    if (!js.isUndefined(focusOnHover)) __obj.updateDynamic("focusOnHover")(focusOnHover.asInstanceOf[js.Any])
    if (getColorGridCellStyles != null) __obj.updateDynamic("getColorGridCellStyles")(getColorGridCellStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(isControlled)) __obj.updateDynamic("isControlled")(isControlled.asInstanceOf[js.Any])
    if (mouseLeaveParentSelector != null) __obj.updateDynamic("mouseLeaveParentSelector")(mouseLeaveParentSelector.asInstanceOf[js.Any])
    if (onCellFocused != null) __obj.updateDynamic("onCellFocused")(js.Any.fromFunction2(onCellFocused))
    if (onCellHovered != null) __obj.updateDynamic("onCellHovered")(js.Any.fromFunction2(onCellHovered))
    if (onColorChanged != null) __obj.updateDynamic("onColorChanged")(js.Any.fromFunction2(onColorChanged))
    if (positionInSet != null) __obj.updateDynamic("positionInSet")(positionInSet.asInstanceOf[js.Any])
    if (selectedId != null) __obj.updateDynamic("selectedId")(selectedId.asInstanceOf[js.Any])
    if (setSize != null) __obj.updateDynamic("setSize")(setSize.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldFocusCircularNavigate)) __obj.updateDynamic("shouldFocusCircularNavigate")(shouldFocusCircularNavigate.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ISwatchColorPickerProps
}

