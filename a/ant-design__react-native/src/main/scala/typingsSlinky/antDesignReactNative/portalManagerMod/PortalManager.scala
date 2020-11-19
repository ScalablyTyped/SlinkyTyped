package typingsSlinky.antDesignReactNative.portalManagerMod

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PortalManager
  extends Component[js.Object, PortalManagerState, js.Any] {
  
  def mount(key: Double, children: ReactElement): Unit = js.native
  
  @JSName("state")
  var state_PortalManager: State = js.native
  
  def unmount(key: Double): Unit = js.native
  
  def update(key: Double, children: ReactElement): Unit = js.native
}
