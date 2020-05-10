package typingsSlinky.officeUiFabricReact.components

import org.scalajs.dom.raw.HTMLButtonElement
import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.TouchEvent
import slinky.core.facade.ReactRef
import slinky.web.html.button.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.officeUiFabricReact.sliderTypesMod.ISlider
import typingsSlinky.officeUiFabricReact.sliderTypesMod.ISliderProps
import typingsSlinky.officeUiFabricReact.sliderTypesMod.ISliderStyleProps
import typingsSlinky.officeUiFabricReact.sliderTypesMod.ISliderStyles
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.std.Partial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SliderBase {
  @JSImport("office-ui-fabric-react", "SliderBase")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.officeUiFabricReact.mod.SliderBase] {
    @scala.inline
    def ariaLabel(value: String): this.type = set("ariaLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def ariaValueText(value: /* value */ Double => String): this.type = set("ariaValueText", js.Any.fromFunction1(value))
    @scala.inline
    def buttonProps(value: HTMLAttributes[HTMLButtonElement]): this.type = set("buttonProps", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def componentRefFunction1(value: /* ref */ ISlider | Null => Unit): this.type = set("componentRef", js.Any.fromFunction1(value))
    @scala.inline
    def componentRefRefObject(value: ReactRef[ISlider]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def componentRef(value: IRefObject[ISlider]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultValue(value: Double): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def label(value: String): this.type = set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def max(value: Double): this.type = set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def min(value: Double): this.type = set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def onChange(value: /* value */ Double => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def onChanged(value: (/* event */ MouseEvent | TouchEvent | KeyboardEvent, /* value */ Double) => Unit): this.type = set("onChanged", js.Any.fromFunction2(value))
    @scala.inline
    def originFromZero(value: Boolean): this.type = set("originFromZero", value.asInstanceOf[js.Any])
    @scala.inline
    def showValue(value: Boolean): this.type = set("showValue", value.asInstanceOf[js.Any])
    @scala.inline
    def snapToStep(value: Boolean): this.type = set("snapToStep", value.asInstanceOf[js.Any])
    @scala.inline
    def step(value: Double): this.type = set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def stylesFunction1(value: ISliderStyleProps => Partial[ISliderStyles]): this.type = set("styles", js.Any.fromFunction1(value))
    @scala.inline
    def styles(value: IStyleFunctionOrObject[ISliderStyleProps, ISliderStyles]): this.type = set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def theme(value: ITheme): this.type = set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def value(value: Double): this.type = set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def valueFormat(value: /* value */ Double => String): this.type = set("valueFormat", js.Any.fromFunction1(value))
    @scala.inline
    def vertical(value: Boolean): this.type = set("vertical", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ISliderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: SliderBase.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

