package typingsSlinky.reactPopover.components

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactPopover.mod.PopoverPlace
import typingsSlinky.reactPopover.mod.PopoverProps
import typingsSlinky.reactPopover.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactPopover {
  
  @JSImport("react-popover", JSImport.Namespace)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, ^] {
    
    @scala.inline
    def appendTarget(value: Element): this.type = set("appendTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def body(value: ReactElement): this.type = set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def enterExitTransitionDurationMs(value: Double): this.type = set("enterExitTransitionDurationMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isOpen(value: Boolean): this.type = set("isOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onOuterAction(value: /* event */ Event => Unit): this.type = set("onOuterAction", js.Any.fromFunction1(value))
    
    @scala.inline
    def place(value: PopoverPlace): this.type = set("place", value.asInstanceOf[js.Any])
    
    @scala.inline
    def preferPlace(value: PopoverPlace): this.type = set("preferPlace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def refreshIntervalMs(value: Double): this.type = set("refreshIntervalMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def target(value: ReactElement): this.type = set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tipSize(value: Double): this.type = set("tipSize", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PopoverProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ReactPopover.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
