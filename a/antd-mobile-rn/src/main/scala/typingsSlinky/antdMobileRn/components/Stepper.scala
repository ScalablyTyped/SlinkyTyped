package typingsSlinky.antdMobileRn.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antdMobileRn.anon.DisabledStepTextColor
import typingsSlinky.antdMobileRn.stepperIndexNativeMod.StepProps
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Stepper {
  @JSImport("antd-mobile-rn", "Stepper")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.antdMobileRn.mod.Stepper] {
    @scala.inline
    def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultValue(value: Double): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def downStyle(value: js.Object): this.type = set("downStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def inputStyle(value: js.Object): this.type = set("inputStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def max(value: Double): this.type = set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def min(value: Double): this.type = set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def onChange(value: /* value */ js.Any => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def readOnly(value: Boolean): this.type = set("readOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def step(value: Double | String): this.type = set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def styleNull: this.type = set("style", null)
    @scala.inline
    def styles(value: DisabledStepTextColor): this.type = set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def upStyle(value: js.Object): this.type = set("upStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def value(value: Double): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: StepProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Stepper.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

