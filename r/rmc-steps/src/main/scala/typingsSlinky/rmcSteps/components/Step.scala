package typingsSlinky.rmcSteps.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rmcSteps.stepMod.IStepProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Step {
  
  @JSImport("rmc-steps/lib", "Step")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.rmcSteps.mod.Step] {
    
    @scala.inline
    def adjustMarginRight(value: Double | String): this.type = set("adjustMarginRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def description(value: js.Any): this.type = set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def iconReactElement(value: ReactElement): this.type = set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def icon(value: ReactElement): this.type = set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def iconPrefix(value: String): this.type = set("iconPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemWidth(value: Double | String): this.type = set("itemWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def progressDot(value: Boolean | js.Function): this.type = set("progressDot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def status(value: String): this.type = set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stepNumber(value: Double): this.type = set("stepNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: js.Any): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def title(value: js.Any): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def wrapperStyle(value: js.Any): this.type = set("wrapperStyle", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IStepProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Step.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
