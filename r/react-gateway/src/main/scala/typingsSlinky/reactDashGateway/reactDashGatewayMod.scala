package typingsSlinky.reactDashGateway

import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import typingsSlinky.react.reactMod.Component
import typingsSlinky.reactDashGateway.gatewayDestMod.GatewayDestProps
import typingsSlinky.reactDashGateway.gatewayMod.GatewayProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-gateway", JSImport.Namespace)
@js.native
object reactDashGatewayMod extends js.Object {
  @js.native
  class Gateway ()
    extends Component[GatewayProps, js.Object, js.Any]
  
  @js.native
  class GatewayDest ()
    extends Component[GatewayDestProps, js.Object, js.Any]
  
  @js.native
  class GatewayProvider ()
    extends Component[js.Object, js.Object, js.Any]
  
  @js.native
  class GatewayRegistry ()
    extends typingsSlinky.reactDashGateway.gatewayRegistryMod.GatewayRegistry {
    /* CompleteClass */
    override var _children: StringDictionary[js.UndefOr[StringDictionary[TagMod[Any]]]] = js.native
    /* CompleteClass */
    override var _containers: StringDictionary[js.UndefOr[ReactComponentClass[js.Object] | Null]] = js.native
    /* CompleteClass */
    override var _currentId: Double = js.native
    /* CompleteClass */
    override def _renderContainer(name: String): Unit = js.native
    /* CompleteClass */
    override def addChild(name: String, gatewayId: String, child: TagMod[Any]): Unit = js.native
    /* CompleteClass */
    override def addContainer(name: String, container: ReactComponentClass[js.Object]): Unit = js.native
    /* CompleteClass */
    override def clearChild(name: String, gatewayId: String): Unit = js.native
    /* CompleteClass */
    override def register(name: String, child: TagMod[Any]): String = js.native
    /* CompleteClass */
    override def removeContainer(name: String): Unit = js.native
    /* CompleteClass */
    override def unregister(name: String, gatewayId: String): Unit = js.native
  }
  
}

