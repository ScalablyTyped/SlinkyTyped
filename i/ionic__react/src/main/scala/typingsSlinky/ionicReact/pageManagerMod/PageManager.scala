package typingsSlinky.ionicReact.pageManagerMod

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactRef
import typingsSlinky.ionicReact.ionLifeCycleContextMod.IonLifeCycleContextInterface
import typingsSlinky.ionicReact.stackContextMod.StackContextState
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.Context
import typingsSlinky.react.mod.ContextType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/react/dist/types/routing/PageManager", "PageManager")
@js.native
class PageManager protected ()
  extends Component[PageManagerProps, js.Object, js.Any] {
  def this(props: PageManagerProps) = this()
  
  @JSName("componentDidMount")
  def componentDidMount_MPageManager(): Unit = js.native
  
  @JSName("componentWillUnmount")
  def componentWillUnmount_MPageManager(): Unit = js.native
  
  @JSName("context")
  var context_PageManager: ContextType[Context[StackContextState]] = js.native
  
  var ionLifeCycleContext: ContextType[Context[IonLifeCycleContextInterface]] = js.native
  
  var ionPageElementRef: ReactRef[HTMLDivElement] = js.native
  
  def ionViewDidEnterHandler(): Unit = js.native
  
  def ionViewDidLeaveHandler(): Unit = js.native
  
  def ionViewWillEnterHandler(): Unit = js.native
  
  def ionViewWillLeaveHandler(): Unit = js.native
}
/* static members */
@JSImport("@ionic/react/dist/types/routing/PageManager", "PageManager")
@js.native
object PageManager extends js.Object {
  
  def contextType: Context[StackContextState] = js.native
}
