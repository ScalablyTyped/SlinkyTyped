package typingsSlinky.reactLazylog

import typingsSlinky.react.mod.Component
import typingsSlinky.reactLazylog.anon.PartialLazyLogProps
import typingsSlinky.reactLazylog.scrollFollowMod.ScrollFollowProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-lazylog", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class LazyLog ()
    extends typingsSlinky.reactLazylog.lazyLogMod.LazyLog
  /* static members */
  @js.native
  object LazyLog extends js.Object {
    
    var defaultProps: PartialLazyLogProps = js.native
  }
  
  @js.native
  class ScrollFollow ()
    extends Component[ScrollFollowProps, js.Object, js.Any]
}
