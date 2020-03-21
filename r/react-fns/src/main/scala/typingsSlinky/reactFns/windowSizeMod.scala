package typingsSlinky.reactFns

import slinky.core.ReactComponentClass
import typingsSlinky.reactFns.windowSizeWindowSizeMod.WindowSizeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-fns/dist/WindowSize", JSImport.Namespace)
@js.native
object windowSizeMod extends js.Object {
  @js.native
  class WindowSize ()
    extends typingsSlinky.reactFns.windowSizeWindowSizeMod.WindowSize
  
  def withWindowSize[Props](Component: ReactComponentClass[Props with WindowSizeProps]): ReactComponentClass[Props] = js.native
  /* static members */
  @js.native
  object WindowSize extends js.Object {
    var defaultProps: PartialWindowSizeConfig = js.native
  }
  
}

