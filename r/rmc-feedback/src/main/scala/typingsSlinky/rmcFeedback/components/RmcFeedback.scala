package typingsSlinky.rmcFeedback.components

import typingsSlinky.rmcFeedback.mod.default
import typingsSlinky.rmcFeedback.propTypesMod.ITouchProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RmcFeedback {
  @JSImport("rmc-feedback", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: ITouchProps): SharedBuilder_ITouchProps1919177276[default] = new SharedBuilder_ITouchProps1919177276[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: RmcFeedback.type): SharedBuilder_ITouchProps1919177276[default] = new SharedBuilder_ITouchProps1919177276[default](js.Array(this.component, js.Dictionary.empty))()
}

