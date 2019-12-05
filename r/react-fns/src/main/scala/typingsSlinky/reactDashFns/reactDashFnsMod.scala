package typingsSlinky.reactDashFns

import slinky.core.ReactComponentClass
import typingsSlinky.reactDashFns.distDeviceMotionDeviceMotionMod.DeviceMotionProps
import typingsSlinky.reactDashFns.distDeviceOrientationDeviceOrientationMod.DeviceOrientationProps
import typingsSlinky.reactDashFns.distGeoPositionGeoPositionMod.GeoPositionProps
import typingsSlinky.reactDashFns.distLocalesLocalesMod.LocalesProps
import typingsSlinky.reactDashFns.distMediaMediaMod.MediaProps
import typingsSlinky.reactDashFns.distNetworkNetworkMod.NetworkProps
import typingsSlinky.reactDashFns.distScrollScrollMod.ScrollConfig
import typingsSlinky.reactDashFns.distScrollScrollMod.ScrollProps
import typingsSlinky.reactDashFns.distTypesMod.SharedRenderProps
import typingsSlinky.reactDashFns.distWindowSizeWindowSizeMod.WindowSizeConfig
import typingsSlinky.reactDashFns.distWindowSizeWindowSizeMod.WindowSizeProps
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-fns", JSImport.Namespace)
@js.native
object reactDashFnsMod extends js.Object {
  @js.native
  class DeviceMotion ()
    extends typingsSlinky.reactDashFns.distDeviceMotionDeviceMotionMod.DeviceMotion
  
  @js.native
  class DeviceOrientation ()
    extends typingsSlinky.reactDashFns.distDeviceOrientationDeviceOrientationMod.DeviceOrientation
  
  @js.native
  class GeoPosition ()
    extends typingsSlinky.reactDashFns.distGeoPositionGeoPositionMod.GeoPosition
  
  @js.native
  class Locales ()
    extends typingsSlinky.reactDashFns.distLocalesLocalesMod.Locales
  
  @js.native
  class Network ()
    extends typingsSlinky.reactDashFns.distNetworkNetworkMod.Network
  
  @js.native
  class Scroll ()
    extends typingsSlinky.reactDashFns.distScrollMod.Scroll
  
  @js.native
  class WindowSize ()
    extends typingsSlinky.reactDashFns.distWindowSizeMod.WindowSize
  
  val Media: ReactComponentClass[SharedRenderProps[MediaProps]] = js.native
  def withDeviceMotion[Props](Component: ReactComponentClass[Props with DeviceMotionProps]): ReactComponentClass[Props] = js.native
  def withDeviceOrientation[Props](Component: ReactComponentClass[Props with DeviceOrientationProps]): ReactComponentClass[Props] = js.native
  def withGeoPosition[Props](Component: ReactComponentClass[Props with GeoPositionProps]): ReactComponentClass[Props] = js.native
  def withLocales[Props](Component: ReactComponentClass[Props with LocalesProps]): ReactComponentClass[Props] = js.native
  def withNetwork[Props](Component: ReactComponentClass[Props with NetworkProps]): ReactComponentClass[Props] = js.native
  def withScroll[Props](Component: ReactComponentClass[Props with ScrollProps]): ReactComponentClass[Props] = js.native
  def withWindowSize[Props](Component: ReactComponentClass[Props with WindowSizeProps]): ReactComponentClass[Props] = js.native
  /* static members */
  @js.native
  object Scroll extends js.Object {
    var defaultProps: Partial[ScrollConfig] = js.native
  }
  
  /* static members */
  @js.native
  object WindowSize extends js.Object {
    var defaultProps: Partial[WindowSizeConfig] = js.native
  }
  
}

