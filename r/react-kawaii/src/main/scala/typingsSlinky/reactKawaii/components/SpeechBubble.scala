package typingsSlinky.reactKawaii.components

import typingsSlinky.reactKawaii.mod.KawaiiProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SpeechBubble {
  @JSImport("react-kawaii", "SpeechBubble")
  @js.native
  object component extends js.Object
  
  def withProps(p: KawaiiProps): SharedBuilder_KawaiiProps_1650325302[typingsSlinky.reactKawaii.mod.SpeechBubble] = new SharedBuilder_KawaiiProps_1650325302[typingsSlinky.reactKawaii.mod.SpeechBubble](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: SpeechBubble.type): SharedBuilder_KawaiiProps_1650325302[typingsSlinky.reactKawaii.mod.SpeechBubble] = new SharedBuilder_KawaiiProps_1650325302[typingsSlinky.reactKawaii.mod.SpeechBubble](js.Array(this.component, js.Dictionary.empty))()
}

