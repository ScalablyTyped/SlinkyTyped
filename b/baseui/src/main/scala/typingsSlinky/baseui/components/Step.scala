package typingsSlinky.baseui.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.baseui.progressStepsMod.StepOverrides
import typingsSlinky.baseui.progressStepsMod.StepProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Step {
  
  @JSImport("baseui/progress-steps", "Step")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def isActive(value: Boolean): this.type = set("isActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isCompleted(value: Boolean): this.type = set("isCompleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isLast(value: Boolean): this.type = set("isLast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def overrides(value: StepOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def title(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def titleReactElement(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Step.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: StepProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
