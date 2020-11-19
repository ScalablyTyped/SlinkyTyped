package typingsSlinky.antDesignReactNative.portalHostMod

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PortalHost
  extends Component[PortalHostProps, js.Object, js.Any] {
  
  var _manager: js.UndefOr[typingsSlinky.antDesignReactNative.portalManagerMod.default] = js.native
  
  def _mount(children: ReactElement): Double = js.native
  def _mount(children: ReactElement, _key: Double): Double = js.native
  
  var _nextKey: Double = js.native
  
  var _queue: js.Array[Operation] = js.native
  
  def _setManager(): Unit = js.native
  def _setManager(manager: js.Any): Unit = js.native
  
  def _unmount(key: Double): Unit = js.native
  
  def _update(key: Double, children: ReactElement): Unit = js.native
  
  @JSName("componentDidMount")
  def componentDidMount_MPortalHost(): Unit = js.native
  
  @JSName("componentWillUnmount")
  def componentWillUnmount_MPortalHost(): Unit = js.native
}
