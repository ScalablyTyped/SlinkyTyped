package typingsSlinky.reactFns.deviceOrientationDeviceOrientationMod

import org.scalajs.dom.experimental.deviceorientation.DeviceOrientationEvent
import typingsSlinky.react.mod.Component
import typingsSlinky.reactFns.typesMod.SharedRenderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-fns/dist/DeviceOrientation/DeviceOrientation", "DeviceOrientation")
@js.native
class DeviceOrientation ()
  extends Component[SharedRenderProps[DeviceOrientationProps], DeviceOrientationProps, js.Any] {
  @JSName("componentDidMount")
  def componentDidMount_MDeviceOrientation(): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MDeviceOrientation(): Unit = js.native
  def handleDeviceOrientation(e: DeviceOrientationEvent): Unit = js.native
}

