package typingsSlinky.reactFns

import slinky.core.ReactComponentClass
import typingsSlinky.reactFns.deviceOrientationDeviceOrientationMod.DeviceOrientationProps
import typingsSlinky.reactFns.typesMod.SharedRenderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deviceOrientationMod {
  
  @JSImport("react-fns/dist/DeviceOrientation", "DeviceOrientation")
  @js.native
  class DeviceOrientation protected ()
    extends typingsSlinky.reactFns.deviceOrientationDeviceOrientationMod.DeviceOrientation {
    def this(props: SharedRenderProps[DeviceOrientationProps]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SharedRenderProps[DeviceOrientationProps], context: js.Any) = this()
  }
  
  @JSImport("react-fns/dist/DeviceOrientation", "withDeviceOrientation")
  @js.native
  def withDeviceOrientation[Props](Component: ReactComponentClass[Props with DeviceOrientationProps]): ReactComponentClass[Props] = js.native
}
