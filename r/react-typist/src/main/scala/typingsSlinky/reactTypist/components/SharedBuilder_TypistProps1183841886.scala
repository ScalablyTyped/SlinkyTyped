package typingsSlinky.reactTypist.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactTypist.mod.Typist.CurrentTextProps
import typingsSlinky.reactTypist.mod.Typist.CursorProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@scala.inline
class SharedBuilder_TypistProps1183841886[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  @scala.inline
  def avgTypingDelay(value: Double): this.type = set("avgTypingDelay", value.asInstanceOf[js.Any])
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  @scala.inline
  def cursor(value: CursorProps): this.type = set("cursor", value.asInstanceOf[js.Any])
  @scala.inline
  def delayGenerator(value: (/* mean */ Double, /* std */ Double, /* current */ CurrentTextProps) => Double): this.type = set("delayGenerator", js.Any.fromFunction3(value))
  @scala.inline
  def onCharacterTyped(value: (/* char */ String, /* charIndex */ Double) => Unit): this.type = set("onCharacterTyped", js.Any.fromFunction2(value))
  @scala.inline
  def onLineTyped(value: (/* line */ String, /* lineIndex */ Double) => Unit): this.type = set("onLineTyped", js.Any.fromFunction2(value))
  @scala.inline
  def onTypingDone(value: () => Unit): this.type = set("onTypingDone", js.Any.fromFunction0(value))
  @scala.inline
  def startDelay(value: Double): this.type = set("startDelay", value.asInstanceOf[js.Any])
  @scala.inline
  def stdTypingDelay(value: Double): this.type = set("stdTypingDelay", value.asInstanceOf[js.Any])
}

