package typingsSlinky.rcSteps.components

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.div.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rcSteps.anon.Description
import typingsSlinky.rcSteps.anon.Index
import typingsSlinky.rcSteps.interfaceMod.Icons
import typingsSlinky.rcSteps.interfaceMod.Status
import typingsSlinky.rcSteps.stepMod.StepProps
import typingsSlinky.rcSteps.stepsMod.ProgressDotRender
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Step {
  
  @JSImport("rc-steps", "Step")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.rcSteps.mod.Step] {
    
    @scala.inline
    def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def descriptionReactElement(value: ReactElement): this.type = set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def description(value: ReactElement): this.type = set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def iconReactElement(value: ReactElement): this.type = set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def icon(value: ReactElement): this.type = set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def iconPrefix(value: String): this.type = set("iconPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def icons(value: Icons): this.type = set("icons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onClick(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def onStepClick(value: /* index */ Double => Unit): this.type = set("onStepClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def progressDotFunction2(value: (/* iconDot */ js.Any, /* info */ Index) => ReactElement): this.type = set("progressDot", js.Any.fromFunction2(value))
    
    @scala.inline
    def progressDot(value: ProgressDotRender | Boolean): this.type = set("progressDot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def status(value: Status): this.type = set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stepIcon(value: /* info */ Description => ReactElement): this.type = set("stepIcon", js.Any.fromFunction1(value))
    
    @scala.inline
    def stepIndex(value: Double): this.type = set("stepIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stepNumber(value: Double): this.type = set("stepNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def subTitleReactElement(value: ReactElement): this.type = set("subTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def subTitle(value: ReactElement): this.type = set("subTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tailContentReactElement(value: ReactElement): this.type = set("tailContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tailContent(value: ReactElement): this.type = set("tailContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def titleReactElement(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def title(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def wrapperStyle(value: CSSProperties): this.type = set("wrapperStyle", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: StepProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Step.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
