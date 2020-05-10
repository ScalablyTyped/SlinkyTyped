package typingsSlinky.rcSwipeout.components

import typingsSlinky.rcSwipeout.mod.default
import typingsSlinky.rcSwipeout.propTypesMod.IPropTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RcSwipeout {
  @JSImport("rc-swipeout", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: IPropTypes): SharedBuilder_IPropTypes2132500085[default] = new SharedBuilder_IPropTypes2132500085[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: RcSwipeout.type): SharedBuilder_IPropTypes2132500085[default] = new SharedBuilder_IPropTypes2132500085[default](js.Array(this.component, js.Dictionary.empty))()
}

