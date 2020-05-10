package typingsSlinky.blueprintjsCore.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.blueprintjsCore.intentMod.Intent
import typingsSlinky.blueprintjsCore.sliderMod.ISliderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Slider {
  @JSImport("@blueprintjs/core", "Slider")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.blueprintjsCore.mod.Slider] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def initialValue(value: Double): this.type = set("initialValue", value.asInstanceOf[js.Any])
    @scala.inline
    def intent(value: Intent): this.type = set("intent", value.asInstanceOf[js.Any])
    @scala.inline
    def labelPrecision(value: Double): this.type = set("labelPrecision", value.asInstanceOf[js.Any])
    @scala.inline
    def labelRendererFunction1(value: /* value */ Double => String | ReactElement): this.type = set("labelRenderer", js.Any.fromFunction1(value))
    @scala.inline
    def labelRenderer(value: Boolean | (js.Function1[/* value */ Double, String | ReactElement])): this.type = set("labelRenderer", value.asInstanceOf[js.Any])
    @scala.inline
    def labelStepSize(value: Double): this.type = set("labelStepSize", value.asInstanceOf[js.Any])
    @scala.inline
    def max(value: Double): this.type = set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def min(value: Double): this.type = set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def onChange(value: /* value */ Double => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def onRelease(value: /* value */ Double => Unit): this.type = set("onRelease", js.Any.fromFunction1(value))
    @scala.inline
    def showTrackFill(value: Boolean): this.type = set("showTrackFill", value.asInstanceOf[js.Any])
    @scala.inline
    def stepSize(value: Double): this.type = set("stepSize", value.asInstanceOf[js.Any])
    @scala.inline
    def value(value: Double): this.type = set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def vertical(value: Boolean): this.type = set("vertical", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ISliderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Slider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

