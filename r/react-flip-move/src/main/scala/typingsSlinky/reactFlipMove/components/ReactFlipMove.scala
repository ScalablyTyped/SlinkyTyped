package typingsSlinky.reactFlipMove.components

import org.scalajs.dom.raw.ClientRect
import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactFlipMove.mod.FlipMove.AnimationProp
import typingsSlinky.reactFlipMove.mod.FlipMove.FlipMoveProps
import typingsSlinky.reactFlipMove.mod.FlipMove.Styles
import typingsSlinky.reactFlipMove.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactFlipMove {
  
  @JSImport("react-flip-move", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def appearAnimation(value: AnimationProp): this.type = set("appearAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delay(value: Double | String): this.type = set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disableAllAnimations(value: Boolean): this.type = set("disableAllAnimations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def duration(value: Double | String): this.type = set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def easing(value: String): this.type = set("easing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def enterAnimation(value: AnimationProp): this.type = set("enterAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def getPosition(value: /* node */ HTMLElement => ClientRect): this.type = set("getPosition", js.Any.fromFunction1(value))
    
    @scala.inline
    def leaveAnimation(value: AnimationProp): this.type = set("leaveAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maintainContainerHeight(value: Boolean): this.type = set("maintainContainerHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onFinish(value: (/* childElement */ ReactElement, /* domNode */ HTMLElement) => Unit): this.type = set("onFinish", js.Any.fromFunction2(value))
    
    @scala.inline
    def onFinishAll(value: (/* childElements */ js.Array[ReactElement], /* domNodes */ js.Array[HTMLElement]) => Unit): this.type = set("onFinishAll", js.Any.fromFunction2(value))
    
    @scala.inline
    def onStart(value: (/* childElement */ ReactElement, /* domNode */ HTMLElement) => Unit): this.type = set("onStart", js.Any.fromFunction2(value))
    
    @scala.inline
    def onStartAll(value: (/* childElements */ js.Array[ReactElement], /* domNodes */ js.Array[HTMLElement]) => Unit): this.type = set("onStartAll", js.Any.fromFunction2(value))
    
    @scala.inline
    def staggerDelayBy(value: Double | String): this.type = set("staggerDelayBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def staggerDurationBy(value: Double | String): this.type = set("staggerDurationBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: Styles): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def typeName(value: String): this.type = set("typeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def typeNameNull: this.type = set("typeName", null)
    
    @scala.inline
    def verticalAlignment(value: String): this.type = set("verticalAlignment", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: FlipMoveProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ReactFlipMove.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
