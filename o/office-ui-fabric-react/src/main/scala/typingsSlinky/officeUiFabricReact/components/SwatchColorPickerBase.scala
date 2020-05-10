package typingsSlinky.officeUiFabricReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.officeUiFabricReact.colorPickerGridCellTypesMod.IColorCellProps
import typingsSlinky.officeUiFabricReact.colorPickerGridCellTypesMod.IColorPickerGridCellStyleProps
import typingsSlinky.officeUiFabricReact.colorPickerGridCellTypesMod.IColorPickerGridCellStyles
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.circle
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.square
import typingsSlinky.officeUiFabricReact.swatchColorPickerTypesMod.ISwatchColorPickerProps
import typingsSlinky.officeUiFabricReact.swatchColorPickerTypesMod.ISwatchColorPickerStyleProps
import typingsSlinky.officeUiFabricReact.swatchColorPickerTypesMod.ISwatchColorPickerStyles
import typingsSlinky.std.Partial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SwatchColorPickerBase {
  @JSImport("office-ui-fabric-react", "SwatchColorPickerBase")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.officeUiFabricReact.mod.SwatchColorPickerBase] {
    @scala.inline
    def ariaPosInSet(value: Double): this.type = set("ariaPosInSet", value.asInstanceOf[js.Any])
    @scala.inline
    def ariaSetSize(value: Double): this.type = set("ariaSetSize", value.asInstanceOf[js.Any])
    @scala.inline
    def cellBorderWidth(value: Double): this.type = set("cellBorderWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def cellHeight(value: Double): this.type = set("cellHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def cellMargin(value: Double): this.type = set("cellMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def cellShape(value: circle | square): this.type = set("cellShape", value.asInstanceOf[js.Any])
    @scala.inline
    def cellWidth(value: Double): this.type = set("cellWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def doNotContainWithinFocusZone(value: Boolean): this.type = set("doNotContainWithinFocusZone", value.asInstanceOf[js.Any])
    @scala.inline
    def focusOnHover(value: Boolean): this.type = set("focusOnHover", value.asInstanceOf[js.Any])
    @scala.inline
    def getColorGridCellStylesFunction1(value: IColorPickerGridCellStyleProps => Partial[IColorPickerGridCellStyles]): this.type = set("getColorGridCellStyles", js.Any.fromFunction1(value))
    @scala.inline
    def getColorGridCellStyles(value: IStyleFunctionOrObject[IColorPickerGridCellStyleProps, IColorPickerGridCellStyles]): this.type = set("getColorGridCellStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def isControlled(value: Boolean): this.type = set("isControlled", value.asInstanceOf[js.Any])
    @scala.inline
    def mouseLeaveParentSelector(value: String): this.type = set("mouseLeaveParentSelector", value.asInstanceOf[js.Any])
    @scala.inline
    def onCellFocused(value: (/* id */ js.UndefOr[String], /* color */ js.UndefOr[String]) => Unit): this.type = set("onCellFocused", js.Any.fromFunction2(value))
    @scala.inline
    def onCellHovered(value: (/* id */ js.UndefOr[String], /* color */ js.UndefOr[String]) => Unit): this.type = set("onCellHovered", js.Any.fromFunction2(value))
    @scala.inline
    def onColorChanged(value: (/* id */ js.UndefOr[String], /* color */ js.UndefOr[String]) => Unit): this.type = set("onColorChanged", js.Any.fromFunction2(value))
    @scala.inline
    def positionInSet(value: Double): this.type = set("positionInSet", value.asInstanceOf[js.Any])
    @scala.inline
    def selectedId(value: String): this.type = set("selectedId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double): this.type = set("setSize", value.asInstanceOf[js.Any])
    @scala.inline
    def shouldFocusCircularNavigate(value: Boolean): this.type = set("shouldFocusCircularNavigate", value.asInstanceOf[js.Any])
    @scala.inline
    def stylesFunction1(value: ISwatchColorPickerStyleProps => Partial[ISwatchColorPickerStyles]): this.type = set("styles", js.Any.fromFunction1(value))
    @scala.inline
    def styles(value: IStyleFunctionOrObject[ISwatchColorPickerStyleProps, ISwatchColorPickerStyles]): this.type = set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def theme(value: ITheme): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ISwatchColorPickerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(colorCells: js.Array[IColorCellProps], columnCount: Double): Builder = {
    val __props = js.Dynamic.literal(colorCells = colorCells.asInstanceOf[js.Any], columnCount = columnCount.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ISwatchColorPickerProps]))
  }
}

