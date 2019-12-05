package typingsSlinky.reactDashFns

import slinky.core.ReactComponentClass
import typingsSlinky.reactDashFns.distWindowSizeWindowSizeMod.WindowSizeConfig
import typingsSlinky.reactDashFns.distWindowSizeWindowSizeMod.WindowSizeProps
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-fns/dist/WindowSize", JSImport.Namespace)
@js.native
object distWindowSizeMod extends js.Object {
  @js.native
  class WindowSize ()
    extends typingsSlinky.reactDashFns.distWindowSizeWindowSizeMod.WindowSize
  
  def withWindowSize[Props](Component: ReactComponentClass[Props with WindowSizeProps]): ReactComponentClass[Props] = js.native
  /* static members */
  @js.native
  object WindowSize extends js.Object {
    var defaultProps: Partial[WindowSizeConfig] = js.native
  }
  
}

