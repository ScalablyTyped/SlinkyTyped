package typingsSlinky.atAntDashDesignReactDashNative.libPortalPortalDashHostMod

import slinky.core.TagMod
import typingsSlinky.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PortalHost
  extends Component[PortalHostProps, js.Object, js.Any] {
  var _manager: js.UndefOr[
    typingsSlinky.atAntDashDesignReactDashNative.libPortalPortalDashManagerMod.default
  ] = js.native
  var _nextKey: Double = js.native
  var _queue: js.Array[Operation] = js.native
  def _mount(children: TagMod[Any]): Double = js.native
  def _mount(children: TagMod[Any], _key: Double): Double = js.native
  def _setManager(): Unit = js.native
  def _setManager(manager: js.Any): Unit = js.native
  def _unmount(key: Double): Unit = js.native
  def _update(key: Double, children: TagMod[Any]): Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MPortalHost(): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MPortalHost(): Unit = js.native
}

