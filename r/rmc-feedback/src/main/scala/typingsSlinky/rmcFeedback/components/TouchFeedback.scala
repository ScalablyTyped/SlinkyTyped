package typingsSlinky.rmcFeedback.components

import typingsSlinky.rmcFeedback.propTypesMod.ITouchProps
import typingsSlinky.rmcFeedback.touchFeedbackMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TouchFeedback {
  @JSImport("rmc-feedback/lib/TouchFeedback", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: ITouchProps): SharedBuilder_ITouchProps1919177276[default] = new SharedBuilder_ITouchProps1919177276[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: TouchFeedback.type): SharedBuilder_ITouchProps1919177276[default] = new SharedBuilder_ITouchProps1919177276[default](js.Array(this.component, js.Dictionary.empty))()
}

