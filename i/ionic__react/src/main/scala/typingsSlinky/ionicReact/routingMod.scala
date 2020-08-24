package typingsSlinky.ionicReact

import typingsSlinky.ionicReact.navManagerMod.NavManagerProps
import typingsSlinky.ionicReact.routeManagerContextMod.RouteManagerContextState
import typingsSlinky.ionicReact.stackContextMod.StackContextState
import typingsSlinky.ionicReact.viewLifeCycleManagerMod.ViewTransitionManagerProps
import typingsSlinky.react.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/react/dist/types/routing", JSImport.Namespace)
@js.native
object routingMod extends js.Object {
  @js.native
  class LocationHistory ()
    extends typingsSlinky.ionicReact.locationHistoryMod.LocationHistory
  
  @js.native
  class NavManager protected ()
    extends typingsSlinky.ionicReact.navManagerMod.NavManager {
    def this(props: NavManagerProps) = this()
  }
  
  @js.native
  class ViewLifeCycleManager protected ()
    extends typingsSlinky.ionicReact.viewLifeCycleManagerMod.ViewLifeCycleManager {
    def this(props: ViewTransitionManagerProps) = this()
  }
  
  @js.native
  abstract class ViewStacks ()
    extends typingsSlinky.ionicReact.viewStacksMod.ViewStacks
  
  val RouteManagerContext: Context[RouteManagerContextState] = js.native
  val StackContext: Context[StackContextState] = js.native
}

