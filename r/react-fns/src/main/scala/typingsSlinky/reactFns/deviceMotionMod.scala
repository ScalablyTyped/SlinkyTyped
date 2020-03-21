package typingsSlinky.reactFns

import slinky.core.ReactComponentClass
import typingsSlinky.reactFns.deviceMotionDeviceMotionMod.DeviceMotionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-fns/dist/DeviceMotion", JSImport.Namespace)
@js.native
object deviceMotionMod extends js.Object {
  @js.native
  class DeviceMotion ()
    extends typingsSlinky.reactFns.deviceMotionDeviceMotionMod.DeviceMotion
  
  def withDeviceMotion[Props](Component: ReactComponentClass[Props with DeviceMotionProps]): ReactComponentClass[Props] = js.native
}

