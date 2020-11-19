package typingsSlinky.reactTypingAnimation.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactTypingAnimation.mod.Typing.BackspaceProperties
import typingsSlinky.reactTypingAnimation.mod.Typing.DelayProperties
import typingsSlinky.reactTypingAnimation.mod.Typing.ResetProperties
import typingsSlinky.reactTypingAnimation.mod.Typing.SpeedProperties
import typingsSlinky.reactTypingAnimation.mod.TypingProps
import typingsSlinky.reactTypingAnimation.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactTypingAnimation {
  
  @JSImport("react-typing-animation", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def cursorReactElement(value: ReactElement): this.type = set("cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def cursor(value: ReactElement): this.type = set("cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def cursorClassName(value: String): this.type = set("cursorClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hideCursor(value: Boolean): this.type = set("hideCursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def loop(value: Boolean): this.type = set("loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onAfterType(value: () => Unit): this.type = set("onAfterType", js.Any.fromFunction0(value))
    
    @scala.inline
    def onBeforeType(value: () => Unit): this.type = set("onBeforeType", js.Any.fromFunction0(value))
    
    @scala.inline
    def onFinishedTyping(value: () => Unit): this.type = set("onFinishedTyping", js.Any.fromFunction0(value))
    
    @scala.inline
    def onStartedTyping(value: () => Unit): this.type = set("onStartedTyping", js.Any.fromFunction0(value))
    
    @scala.inline
    def speed(value: Double): this.type = set("speed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def startDelay(value: Double): this.type = set("startDelay", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TypingProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ReactTypingAnimation.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  object Backspace {
    
    @JSImport("react-typing-animation", "default.Backspace")
    @js.native
    object component extends js.Object
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, typingsSlinky.reactTypingAnimation.mod.default.Backspace] {
      
      @scala.inline
      def count(value: Double): this.type = set("count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def delay(value: Double): this.type = set("delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def speed(value: Double): this.type = set("speed", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: BackspaceProperties): typingsSlinky.reactTypingAnimation.components.ReactTypingAnimation.Backspace.Builder = new typingsSlinky.reactTypingAnimation.components.ReactTypingAnimation.Backspace.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
    
    implicit def make(companion: Backspace.type): typingsSlinky.reactTypingAnimation.components.ReactTypingAnimation.Backspace.Builder = new typingsSlinky.reactTypingAnimation.components.ReactTypingAnimation.Backspace.Builder(js.Array(this.component, js.Dictionary.empty))()
  }
  
  object Delay {
    
    @JSImport("react-typing-animation", "default.Delay")
    @js.native
    object component extends js.Object
    
    def withProps(p: DelayProperties): Default[tag.type, typingsSlinky.reactTypingAnimation.mod.default.Delay] = new Default[tag.type, typingsSlinky.reactTypingAnimation.mod.default.Delay](js.Array(this.component, p.asInstanceOf[js.Any]))
    
    @scala.inline
    def apply(ms: Double): Default[tag.type, typingsSlinky.reactTypingAnimation.mod.default.Delay] = {
      val __props = js.Dynamic.literal(ms = ms.asInstanceOf[js.Any])
      new Default[tag.type, typingsSlinky.reactTypingAnimation.mod.default.Delay](js.Array(this.component, __props.asInstanceOf[DelayProperties]))
    }
  }
  
  object Reset {
    
    @JSImport("react-typing-animation", "default.Reset")
    @js.native
    object component extends js.Object
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, typingsSlinky.reactTypingAnimation.mod.default.Reset] {
      
      @scala.inline
      def count(value: Double): this.type = set("count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def delay(value: Double): this.type = set("delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def speed(value: Double): this.type = set("speed", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: ResetProperties): typingsSlinky.reactTypingAnimation.components.ReactTypingAnimation.Reset.Builder = new typingsSlinky.reactTypingAnimation.components.ReactTypingAnimation.Reset.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
    
    implicit def make(companion: Reset.type): typingsSlinky.reactTypingAnimation.components.ReactTypingAnimation.Reset.Builder = new typingsSlinky.reactTypingAnimation.components.ReactTypingAnimation.Reset.Builder(js.Array(this.component, js.Dictionary.empty))()
  }
  
  object Speed {
    
    @JSImport("react-typing-animation", "default.Speed")
    @js.native
    object component extends js.Object
    
    def withProps(p: SpeedProperties): Default[tag.type, typingsSlinky.reactTypingAnimation.mod.default.Speed] = new Default[tag.type, typingsSlinky.reactTypingAnimation.mod.default.Speed](js.Array(this.component, p.asInstanceOf[js.Any]))
    
    @scala.inline
    def apply(ms: Double): Default[tag.type, typingsSlinky.reactTypingAnimation.mod.default.Speed] = {
      val __props = js.Dynamic.literal(ms = ms.asInstanceOf[js.Any])
      new Default[tag.type, typingsSlinky.reactTypingAnimation.mod.default.Speed](js.Array(this.component, __props.asInstanceOf[SpeedProperties]))
    }
  }
}
