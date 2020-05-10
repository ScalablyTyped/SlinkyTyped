package typingsSlinky.officeUiFabricReact.components

import org.scalajs.dom.raw.Element
import slinky.core.facade.ReactRef
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.officeUiFabricReact.colorRectangleTypesMod.IColorRectangle
import typingsSlinky.officeUiFabricReact.colorRectangleTypesMod.IColorRectangleProps
import typingsSlinky.officeUiFabricReact.colorRectangleTypesMod.IColorRectangleStyleProps
import typingsSlinky.officeUiFabricReact.colorRectangleTypesMod.IColorRectangleStyles
import typingsSlinky.officeUiFabricReact.interfacesMod.IColor
import typingsSlinky.std.Partial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ColorRectangle {
  @JSImport("office-ui-fabric-react/lib/components/ColorPicker/ColorRectangle/ColorRectangle", "ColorRectangle")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def ariaDescription(value: String): this.type = set("ariaDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def ariaLabel(value: String): this.type = set("ariaLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def ariaValueFormat(value: String): this.type = set("ariaValueFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def componentRefFunction1(value: /* ref */ IColorRectangle | Null => Unit): this.type = set("componentRef", js.Any.fromFunction1(value))
    @scala.inline
    def componentRefRefObject(value: ReactRef[IColorRectangle]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def componentRef(value: IRefObject[IColorRectangle]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def minSize(value: Double): this.type = set("minSize", value.asInstanceOf[js.Any])
    @scala.inline
    def onChange(
      value: (/* ev */ SyntheticMouseEvent[Element] | SyntheticKeyboardEvent[Element], /* color */ IColor) => Unit
    ): this.type = set("onChange", js.Any.fromFunction2(value))
    @scala.inline
    def stylesFunction1(value: IColorRectangleStyleProps => Partial[IColorRectangleStyles]): this.type = set("styles", js.Any.fromFunction1(value))
    @scala.inline
    def styles(value: IStyleFunctionOrObject[IColorRectangleStyleProps, IColorRectangleStyles]): this.type = set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def theme(value: ITheme): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IColorRectangleProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(color: IColor): Builder = {
    val __props = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IColorRectangleProps]))
  }
}

