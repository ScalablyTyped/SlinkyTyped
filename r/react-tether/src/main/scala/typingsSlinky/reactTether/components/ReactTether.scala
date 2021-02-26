package typingsSlinky.reactTether.components

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactTether.mod.ReactTether.Constraints
import typingsSlinky.reactTether.mod.ReactTether.TetherComponentProps
import typingsSlinky.reactTether.mod.ReactTether.UpdateEventData
import typingsSlinky.reactTether.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactTether {
  
  @scala.inline
  def apply(attachment: String): Builder = {
    val __props = js.Dynamic.literal(attachment = attachment.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TetherComponentProps]))
  }
  
  @JSImport("react-tether", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def bodyElement(value: HTMLElement): this.type = set("bodyElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def classPrefix(value: String): this.type = set("classPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def constraints(value: js.Array[Constraints]): this.type = set("constraints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def constraintsVarargs(value: Constraints*): this.type = set("constraints", js.Array(value :_*))
    
    @scala.inline
    def element(value: HTMLElement | String | js.Any): this.type = set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def elementHTMLElement(value: HTMLElement): this.type = set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def enabled(value: Boolean): this.type = set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def offset(value: String): this.type = set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onRepositioned(value: () => Unit): this.type = set("onRepositioned", js.Any.fromFunction0(value))
    
    @scala.inline
    def onUpdate(value: /* data */ UpdateEventData => Unit): this.type = set("onUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def optimizations(value: js.Any): this.type = set("optimizations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def renderElement(value: /* ref */ ReactRef[Element] => ReactElement): this.type = set("renderElement", js.Any.fromFunction1(value))
    
    @scala.inline
    def renderElementTag(value: String): this.type = set("renderElementTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def renderElementTo(value: Element | String): this.type = set("renderElementTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def renderElementToElement(value: Element): this.type = set("renderElementTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def renderTarget(value: /* ref */ ReactRef[Element] => ReactElement): this.type = set("renderTarget", js.Any.fromFunction1(value))
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def target(value: HTMLElement | String | js.Any): this.type = set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def targetAttachment(value: String): this.type = set("targetAttachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def targetHTMLElement(value: HTMLElement): this.type = set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def targetModifier(value: String): this.type = set("targetModifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def targetOffset(value: String): this.type = set("targetOffset", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TetherComponentProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
