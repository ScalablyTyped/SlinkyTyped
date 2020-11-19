package typingsSlinky.reactOnsenui.components

import org.scalajs.dom.raw.Event
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactOnsenui.anon.HTMLAttributesidclassNameAnimation
import typingsSlinky.reactOnsenui.mod.AnimationOptions
import typingsSlinky.reactOnsenui.reactOnsenuiStrings.collapse
import typingsSlinky.reactOnsenui.reactOnsenuiStrings.default
import typingsSlinky.reactOnsenui.reactOnsenuiStrings.landscape
import typingsSlinky.reactOnsenui.reactOnsenuiStrings.left
import typingsSlinky.reactOnsenui.reactOnsenuiStrings.overlay
import typingsSlinky.reactOnsenui.reactOnsenuiStrings.portrait
import typingsSlinky.reactOnsenui.reactOnsenuiStrings.right
import typingsSlinky.reactOnsenui.reactOnsenuiStrings.split
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SplitterSide {
  
  @JSImport("react-onsenui", "SplitterSide")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactOnsenui.mod.SplitterSide] {
    
    @scala.inline
    def animation(value: overlay | default): this.type = set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def animationOptions(value: AnimationOptions): this.type = set("animationOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def collapse(value: portrait | landscape | Boolean): this.type = set("collapse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isOpen(value: Boolean): this.type = set("isOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mode(value: collapse | split): this.type = set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onClose(value: /* e */ js.UndefOr[Event] => Unit): this.type = set("onClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def onModeChange(value: /* e */ js.UndefOr[Event] => Unit): this.type = set("onModeChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onOpen(value: /* e */ js.UndefOr[Event] => Unit): this.type = set("onOpen", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPreClose(value: /* e */ js.UndefOr[Event] => Unit): this.type = set("onPreClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPreOpen(value: /* e */ js.UndefOr[Event] => Unit): this.type = set("onPreOpen", js.Any.fromFunction1(value))
    
    @scala.inline
    def openThreshold(value: Double): this.type = set("openThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def side(value: left | right): this.type = set("side", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def swipeTargetWidth(value: Double): this.type = set("swipeTargetWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def swipeable(value: Boolean): this.type = set("swipeable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: HTMLAttributesidclassNameAnimation): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: SplitterSide.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
