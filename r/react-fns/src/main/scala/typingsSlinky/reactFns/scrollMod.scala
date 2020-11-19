package typingsSlinky.reactFns

import slinky.core.ReactComponentClass
import typingsSlinky.reactFns.anon.PartialScrollConfig
import typingsSlinky.reactFns.scrollScrollMod.ScrollProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-fns/dist/Scroll", JSImport.Namespace)
@js.native
object scrollMod extends js.Object {
  
  def withScroll[Props](Component: ReactComponentClass[Props with ScrollProps]): ReactComponentClass[Props] = js.native
  
  @js.native
  class Scroll ()
    extends typingsSlinky.reactFns.scrollScrollMod.Scroll
  /* static members */
  @js.native
  object Scroll extends js.Object {
    
    var defaultProps: PartialScrollConfig = js.native
  }
}
