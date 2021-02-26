package typingsSlinky.materialUi.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.materialUi.MaterialUI.Stepper.StepperProps
import typingsSlinky.materialUi.materialUiStrings.horizontal
import typingsSlinky.materialUi.materialUiStrings.vertical
import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Stepper {
  
  @JSImport("material-ui", "Stepper")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.materialUi.mod.Stepper] {
    
    @scala.inline
    def activeStep(value: Double): this.type = set("activeStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def linear(value: Boolean): this.type = set("linear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def orientation(value: horizontal | vertical): this.type = set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Stepper.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: StepperProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
