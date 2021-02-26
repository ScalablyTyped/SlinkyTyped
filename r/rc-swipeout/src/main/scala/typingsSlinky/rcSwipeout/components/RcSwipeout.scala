package typingsSlinky.rcSwipeout.components

import typingsSlinky.rcSwipeout.mod.default
import typingsSlinky.rcSwipeout.propTypesMod.IPropTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RcSwipeout {
  
  @JSImport("rc-swipeout", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: RcSwipeout.type): SharedBuilder_IPropTypes2132500085[default] = new SharedBuilder_IPropTypes2132500085[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: IPropTypes): SharedBuilder_IPropTypes2132500085[default] = new SharedBuilder_IPropTypes2132500085[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
