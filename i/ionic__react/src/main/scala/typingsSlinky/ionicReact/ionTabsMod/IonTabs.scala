package typingsSlinky.ionicReact.ionTabsMod

import slinky.core.facade.ReactRef
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonRouterOutletElement
import typingsSlinky.ionicReact.ionTabsContextMod.IonTabsContextState
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
  var ionTabContextState: IonTabsContextState = js.native
  var routerOutletRef: Ref[HTMLIonRouterOutletElement] = js.native
  var selectTabHandler: js.UndefOr[js.Function1[/* tag */ String, Boolean]] = js.native
  var tabBarRef: ReactRef[_] = js.native
  @JSName("componentDidMount")
  def componentDidMount_MIonTabs(): Unit = js.native
}

/* static members */
@JSImport("@ionic/react/dist/types/components/navigation/IonTabs", "IonTabs")
@js.native
object IonTabs extends js.Object {
  def contextType: Context[NavContextState] = js.native
}

