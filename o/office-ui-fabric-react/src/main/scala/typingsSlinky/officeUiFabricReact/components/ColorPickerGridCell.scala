package typingsSlinky.officeUiFabricReact.components

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.html.button.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.officeUiFabricReact.colorPickerGridCellTypesMod.IColorCellProps
import typingsSlinky.officeUiFabricReact.colorPickerGridCellTypesMod.IColorPickerGridCellProps
import typingsSlinky.officeUiFabricReact.colorPickerGridCellTypesMod.IColorPickerGridCellStyleProps
import typingsSlinky.officeUiFabricReact.colorPickerGridCellTypesMod.IColorPickerGridCellStyles
import typingsSlinky.uifabricMergeStyles.deepPartialMod.DeepPartial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ColorPickerGridCell {
  @JSImport("office-ui-fabric-react", "ColorPickerGridCell")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def borderWidth(value: Double): this.type = set("borderWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def circle(value: Boolean): this.type = set("circle", value.asInstanceOf[js.Any])
    @scala.inline
    def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def idPrefix(value: String): this.type = set("idPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def index(value: Double): this.type = set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def label(value: String): this.type = set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def onClick(value: /* item */ IColorCellProps => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def onFocus(value: /* item */ IColorCellProps => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
    @scala.inline
    def onHover(value: /* item */ js.UndefOr[IColorCellProps] => Unit): this.type = set("onHover", js.Any.fromFunction1(value))
    @scala.inline
    def onKeyDown(value: /* ev */ SyntheticKeyboardEvent[HTMLButtonElement] => Unit): this.type = set("onKeyDown", js.Any.fromFunction1(value))
    @scala.inline
    def onMouseEnter(value: /* ev */ SyntheticMouseEvent[HTMLButtonElement] => Boolean): this.type = set("onMouseEnter", js.Any.fromFunction1(value))
    @scala.inline
    def onMouseLeave(value: /* ev */ SyntheticMouseEvent[HTMLButtonElement] => Unit): this.type = set("onMouseLeave", js.Any.fromFunction1(value))
    @scala.inline
    def onMouseMove(value: /* ev */ SyntheticMouseEvent[HTMLButtonElement] => Boolean): this.type = set("onMouseMove", js.Any.fromFunction1(value))
    @scala.inline
    def onWheel(value: /* ev */ SyntheticMouseEvent[HTMLButtonElement] => Unit): this.type = set("onWheel", js.Any.fromFunction1(value))
    @scala.inline
    def stylesFunction1(value: IColorPickerGridCellStyleProps => DeepPartial[IColorPickerGridCellStyles]): this.type = set("styles", js.Any.fromFunction1(value))
    @scala.inline
    def styles(value: IStyleFunctionOrObject[IColorPickerGridCellStyleProps, IColorPickerGridCellStyles]): this.type = set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def theme(value: ITheme): this.type = set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IColorPickerGridCellProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(item: IColorCellProps, selected: Boolean): Builder = {
    val __props = js.Dynamic.literal(item = item.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IColorPickerGridCellProps]))
  }
}

