package typingsSlinky.officeUiFabricReact.components

import org.scalajs.dom.raw.Element
import slinky.core.facade.ReactRef
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.officeUiFabricReact.colorSliderTypesMod.IColorSlider
import typingsSlinky.officeUiFabricReact.colorSliderTypesMod.IColorSliderProps
import typingsSlinky.officeUiFabricReact.colorSliderTypesMod.IColorSliderStyleProps
import typingsSlinky.officeUiFabricReact.colorSliderTypesMod.IColorSliderStyles
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.std.Partial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ColorSliderBase {
  @JSImport("office-ui-fabric-react/lib/components/ColorPicker/ColorSlider/ColorSlider.base", "ColorSliderBase")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.officeUiFabricReact.colorSliderBaseMod.ColorSliderBase] {
    @scala.inline
    def ariaLabel(value: String): this.type = set("ariaLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def componentRefFunction1(value: /* ref */ IColorSlider | Null => Unit): this.type = set("componentRef", js.Any.fromFunction1(value))
    @scala.inline
    def componentRefRefObject(value: ReactRef[IColorSlider]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def componentRef(value: IRefObject[IColorSlider]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def isAlpha(value: Boolean): this.type = set("isAlpha", value.asInstanceOf[js.Any])
    @scala.inline
    def maxValue(value: Double): this.type = set("maxValue", value.asInstanceOf[js.Any])
    @scala.inline
    def minValue(value: Double): this.type = set("minValue", value.asInstanceOf[js.Any])
    @scala.inline
    def onChange(
      value: (/* event */ SyntheticMouseEvent[Element] | SyntheticKeyboardEvent[Element], /* newValue */ js.UndefOr[Double]) => Unit
    ): this.type = set("onChange", js.Any.fromFunction2(value))
    @scala.inline
    def overlayColor(value: String): this.type = set("overlayColor", value.asInstanceOf[js.Any])
    @scala.inline
    def overlayStyle(value: CSSProperties): this.type = set("overlayStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def stylesFunction1(value: IColorSliderStyleProps => Partial[IColorSliderStyles]): this.type = set("styles", js.Any.fromFunction1(value))
    @scala.inline
    def styles(value: IStyleFunctionOrObject[IColorSliderStyleProps, IColorSliderStyles]): this.type = set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def theme(value: ITheme): this.type = set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def thumbColor(value: String): this.type = set("thumbColor", value.asInstanceOf[js.Any])
    @scala.inline
    def value(value: Double): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IColorSliderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ColorSliderBase.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

