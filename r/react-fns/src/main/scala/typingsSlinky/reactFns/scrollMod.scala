package typingsSlinky.reactFns

import slinky.core.ReactComponentClass
import typingsSlinky.reactFns.scrollScrollMod.ScrollProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-fns/dist/Scroll", JSImport.Namespace)
@js.native
object scrollMod extends js.Object {
  @js.native
  class Scroll ()
    extends typingsSlinky.reactFns.scrollScrollMod.Scroll
  
  def withScroll[Props](Component: ReactComponentClass[Props with ScrollProps]): ReactComponentClass[Props] = js.native
  /* static members */
  @js.native
  object Scroll extends js.Object {
    var defaultProps: PartialScrollConfig = js.native
  }
  
}

