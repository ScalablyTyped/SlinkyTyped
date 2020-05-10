package typingsSlinky.ionicReact.ionTabsMod

import typingsSlinky.ionicCore.componentsMod._Global_.HTMLIonRouterOutletElement
import typingsSlinky.ionicReact.navContextMod.NavContextState
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.Context
import typingsSlinky.react.mod.ContextType
import typingsSlinky.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/react/dist/types/components/navigation/IonTabs", "IonTabs")
@js.native
class IonTabs protected ()
  extends Component[Props, js.Object, js.Any] {
  def this(props: Props) = this()
  @JSName("context")
  var context_IonTabs: ContextType[Context[NavContextState]] = js.native
  var routerOutletRef: Ref[HTMLIonRouterOutletElement] = js.native
}

/* static members */
@JSImport("@ionic/react/dist/types/components/navigation/IonTabs", "IonTabs")
@js.native
object IonTabs extends js.Object {
  def contextType: Context[NavContextState] = js.native
}

