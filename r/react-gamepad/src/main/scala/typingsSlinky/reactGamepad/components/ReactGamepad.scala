package typingsSlinky.reactGamepad.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactGamepad.mod.Axis
import typingsSlinky.reactGamepad.mod.Button
import typingsSlinky.reactGamepad.mod.Layout
import typingsSlinky.reactGamepad.mod.Props
import typingsSlinky.reactGamepad.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactGamepad {
  
  @JSImport("react-gamepad", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def deadZone(value: Double): this.type = set("deadZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def gamepadIndex(value: Double): this.type = set("gamepadIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def layout(value: Layout): this.type = set("layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onA(value: () => Unit): this.type = set("onA", js.Any.fromFunction0(value))
    
    @scala.inline
    def onAxisChange(value: (/* axisName */ Axis, /* value */ Double, /* previousValue */ Double) => Unit): this.type = set("onAxisChange", js.Any.fromFunction3(value))
    
    @scala.inline
    def onB(value: () => Unit): this.type = set("onB", js.Any.fromFunction0(value))
    
    @scala.inline
    def onButtonChange(value: (/* buttonName */ Button, /* pressed */ Boolean) => Unit): this.type = set("onButtonChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def onButtonDown(value: /* buttonName */ Button => Unit): this.type = set("onButtonDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def onButtonUp(value: /* buttonName */ Button => Unit): this.type = set("onButtonUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def onConnect(value: /* gamepadIndex */ Double => Unit): this.type = set("onConnect", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDisconnect(value: /* gamepadIndex */ Double => Unit): this.type = set("onDisconnect", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDown(value: () => Unit): this.type = set("onDown", js.Any.fromFunction0(value))
    
    @scala.inline
    def onLB(value: () => Unit): this.type = set("onLB", js.Any.fromFunction0(value))
    
    @scala.inline
    def onLS(value: () => Unit): this.type = set("onLS", js.Any.fromFunction0(value))
    
    @scala.inline
    def onLT(value: () => Unit): this.type = set("onLT", js.Any.fromFunction0(value))
    
    @scala.inline
    def onLeft(value: () => Unit): this.type = set("onLeft", js.Any.fromFunction0(value))
    
    @scala.inline
    def onRB(value: () => Unit): this.type = set("onRB", js.Any.fromFunction0(value))
    
    @scala.inline
    def onRS(value: () => Unit): this.type = set("onRS", js.Any.fromFunction0(value))
    
    @scala.inline
    def onRT(value: () => Unit): this.type = set("onRT", js.Any.fromFunction0(value))
    
    @scala.inline
    def onRight(value: () => Unit): this.type = set("onRight", js.Any.fromFunction0(value))
    
    @scala.inline
    def onUp(value: () => Unit): this.type = set("onUp", js.Any.fromFunction0(value))
    
    @scala.inline
    def onX(value: () => Unit): this.type = set("onX", js.Any.fromFunction0(value))
    
    @scala.inline
    def onY(value: () => Unit): this.type = set("onY", js.Any.fromFunction0(value))
    
    @scala.inline
    def stickThreshold(value: Double): this.type = set("stickThreshold", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ReactGamepad.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
