package typingsSlinky.reactDashFns

import slinky.core.ReactComponentClass
import typingsSlinky.reactDashFns.distScrollScrollMod.ScrollConfig
import typingsSlinky.reactDashFns.distScrollScrollMod.ScrollProps
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-fns/dist/Scroll", JSImport.Namespace)
@js.native
object distScrollMod extends js.Object {
  @js.native
  class Scroll ()
    extends typingsSlinky.reactDashFns.distScrollScrollMod.Scroll
  
  def withScroll[Props](Component: ReactComponentClass[Props with ScrollProps]): ReactComponentClass[Props] = js.native
  /* static members */
  @js.native
  object Scroll extends js.Object {
    var defaultProps: Partial[ScrollConfig] = js.native
  }
  
}

