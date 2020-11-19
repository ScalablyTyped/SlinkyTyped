package typingsSlinky.reactSwipeable.components

import org.scalajs.dom.raw.HTMLElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactSwipeable.mod.EventData
import typingsSlinky.reactSwipeable.mod.SwipeableOptions
import typingsSlinky.reactSwipeable.mod.SwipeableProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Swipeable {
  
  @JSImport("react-swipeable", "Swipeable")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactSwipeable.mod.Swipeable] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delta(value: Double): this.type = set("delta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def innerRef(value: /* element */ HTMLElement | Null => Unit): this.type = set("innerRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def nodeName(value: String): this.type = set("nodeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onSwiped(value: /* eventData */ EventData => Unit): this.type = set("onSwiped", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSwipedDown(value: /* eventData */ EventData => Unit): this.type = set("onSwipedDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSwipedLeft(value: /* eventData */ EventData => Unit): this.type = set("onSwipedLeft", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSwipedRight(value: /* eventData */ EventData => Unit): this.type = set("onSwipedRight", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSwipedUp(value: /* eventData */ EventData => Unit): this.type = set("onSwipedUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSwiping(value: /* eventData */ EventData => Unit): this.type = set("onSwiping", js.Any.fromFunction1(value))
    
    @scala.inline
    def preventDefaultTouchmoveEvent(value: Boolean): this.type = set("preventDefaultTouchmoveEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rotationAngle(value: Double): this.type = set("rotationAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def trackMouse(value: Boolean): this.type = set("trackMouse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def trackTouch(value: Boolean): this.type = set("trackTouch", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SwipeableProps with SwipeableOptions): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Swipeable.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
