package typingsSlinky.baseui.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.baseui.progressStepsMod.ProgressStepsOverrides
import typingsSlinky.baseui.progressStepsMod.ProgressStepsProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ProgressSteps {
  
  @JSImport("baseui/progress-steps", "ProgressSteps")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def current(value: Double): this.type = set("current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def overrides(value: ProgressStepsOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ProgressSteps.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ProgressStepsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
