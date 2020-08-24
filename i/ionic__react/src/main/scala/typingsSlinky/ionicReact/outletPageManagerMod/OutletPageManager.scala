package typingsSlinky.ionicReact.outletPageManagerMod

import typingsSlinky.ionicCore.componentsMod.global.HTMLIonRouterOutletElement
import typingsSlinky.ionicReact.ionLifeCycleContextMod.IonLifeCycleContextInterface
import typingsSlinky.ionicReact.stackContextMod.StackContextState
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.Context
import typingsSlinky.react.mod.ContextType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/react/dist/types/routing/OutletPageManager", "OutletPageManager")
@js.native
class OutletPageManager protected ()
  extends Component[OutletPageManagerProps, js.Object, js.Any] {
  def this(props: OutletPageManagerProps) = this()
  @JSName("context")
  var context_OutletPageManager: ContextType[Context[StackContextState]] = js.native
  var ionLifeCycleContext: ContextType[Context[IonLifeCycleContextInterface]] = js.native
  var ionRouterOutlet: js.UndefOr[HTMLIonRouterOutletElement] = js.native
  @JSName("componentDidMount")
  def componentDidMount_MOutletPageManager(): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MOutletPageManager(): Unit = js.native
  def ionViewDidEnterHandler(): Unit = js.native
  def ionViewDidLeaveHandler(): Unit = js.native
  def ionViewWillEnterHandler(): Unit = js.native
  def ionViewWillLeaveHandler(): Unit = js.native
}

/* static members */
@JSImport("@ionic/react/dist/types/routing/OutletPageManager", "OutletPageManager")
@js.native
object OutletPageManager extends js.Object {
  def contextType: Context[StackContextState] = js.native
}

