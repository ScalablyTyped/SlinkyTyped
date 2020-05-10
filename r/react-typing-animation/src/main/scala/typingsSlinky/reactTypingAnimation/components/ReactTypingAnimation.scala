package typingsSlinky.reactTypingAnimation.components

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactTypingAnimation.mod.TypingProps
import typingsSlinky.reactTypingAnimation.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    def cursor(value: TagMod[Any]): this.type = set("cursor", value.asInstanceOf[js.Any])
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
}

