package typingsSlinky.reactFns

import slinky.core.ReactComponentClass
import typingsSlinky.reactFns.deviceOrientationDeviceOrientationMod.DeviceOrientationProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-fns/dist/DeviceOrientation", JSImport.Namespace)
@js.native
object deviceOrientationMod extends js.Object {
  @js.native
  class DeviceOrientation ()
    extends typingsSlinky.reactFns.deviceOrientationDeviceOrientationMod.DeviceOrientation
  
  def withDeviceOrientation[Props](Component: ReactComponentClass[Props with DeviceOrientationProps]): ReactComponentClass[Props] = js.native
}

