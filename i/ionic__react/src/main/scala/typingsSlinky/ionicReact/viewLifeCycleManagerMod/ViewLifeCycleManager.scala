package typingsSlinky.ionicReact.viewLifeCycleManagerMod

import typingsSlinky.ionicReact.anon.ComponentCanBeDestroyed
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/react/dist/types/routing/ViewLifeCycleManager", "ViewLifeCycleManager")
@js.native
class ViewLifeCycleManager protected ()
  extends Component[ViewTransitionManagerProps, ViewTransitionManagerState, js.Any] {
  def this(props: ViewTransitionManagerProps) = this()
  
  var _isMounted: js.Any = js.native
  
  @JSName("componentDidMount")
  def componentDidMount_MViewLifeCycleManager(): Unit = js.native
  
  @JSName("componentWillUnmount")
  def componentWillUnmount_MViewLifeCycleManager(): Unit = js.native
  
  var ionLifeCycleContext: ComponentCanBeDestroyed = js.native
}
