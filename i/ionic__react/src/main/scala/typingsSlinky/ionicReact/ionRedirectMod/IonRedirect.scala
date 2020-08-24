package typingsSlinky.ionicReact.ionRedirectMod

import typingsSlinky.ionicReact.navContextMod.NavContextState
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.Context
import typingsSlinky.react.mod.ContextType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/react/dist/types/components/IonRedirect", "IonRedirect")
@js.native
class IonRedirect ()
  extends Component[IonRedirectProps, IonRedirectState, js.Any] {
  @JSName("context")
  var context_IonRedirect: ContextType[Context[NavContextState]] = js.native
}

/* static members */
@JSImport("@ionic/react/dist/types/components/IonRedirect", "IonRedirect")
@js.native
object IonRedirect extends js.Object {
  def contextType: Context[NavContextState] = js.native
}

