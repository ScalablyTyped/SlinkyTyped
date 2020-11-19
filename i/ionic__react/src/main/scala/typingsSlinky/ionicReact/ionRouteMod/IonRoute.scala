package typingsSlinky.ionicReact.ionRouteMod

import typingsSlinky.ionicReact.navContextMod.NavContextState
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.Context
import typingsSlinky.react.mod.ContextType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/react/dist/types/components/IonRoute", "IonRoute")
@js.native
class IonRoute ()
  extends Component[IonRouteProps, IonRouteState, js.Any] {
  
  @JSName("context")
  var context_IonRoute: ContextType[Context[NavContextState]] = js.native
}
/* static members */
@JSImport("@ionic/react/dist/types/components/IonRoute", "IonRoute")
@js.native
object IonRoute extends js.Object {
  
  def contextType: Context[NavContextState] = js.native
}
