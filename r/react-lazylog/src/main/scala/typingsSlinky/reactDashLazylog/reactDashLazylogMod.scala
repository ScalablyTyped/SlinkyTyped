package typingsSlinky.reactDashLazylog

import typingsSlinky.react.reactMod.Component
import typingsSlinky.reactDashLazylog.buildLazyLogMod.LazyLogProps
import typingsSlinky.reactDashLazylog.buildScrollFollowMod.ScrollFollowProps
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-lazylog", JSImport.Namespace)
@js.native
object reactDashLazylogMod extends js.Object {
  @js.native
  class LazyLog ()
    extends typingsSlinky.reactDashLazylog.buildLazyLogMod.LazyLog
  
  @js.native
  class ScrollFollow ()
    extends Component[ScrollFollowProps, js.Object, js.Any]
  
  /* static members */
  @js.native
  object LazyLog extends js.Object {
    var defaultProps: Partial[LazyLogProps] = js.native
  }
  
}

