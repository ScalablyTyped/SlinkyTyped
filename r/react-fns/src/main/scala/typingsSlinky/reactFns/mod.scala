package typingsSlinky.reactFns

import slinky.core.ReactComponentClass
import typingsSlinky.reactFns.anon.PartialScrollConfig
import typingsSlinky.reactFns.anon.PartialWindowSizeConfig
import typingsSlinky.reactFns.deviceMotionDeviceMotionMod.DeviceMotionProps
import typingsSlinky.reactFns.deviceOrientationDeviceOrientationMod.DeviceOrientationProps
import typingsSlinky.reactFns.geoPositionGeoPositionMod.GeoPositionProps
import typingsSlinky.reactFns.localesLocalesMod.LocalesProps
import typingsSlinky.reactFns.mediaMediaMod.MediaProps
import typingsSlinky.reactFns.networkNetworkMod.NetworkProps
import typingsSlinky.reactFns.scrollScrollMod.ScrollProps
import typingsSlinky.reactFns.typesMod.SharedRenderProps
import typingsSlinky.reactFns.windowSizeWindowSizeMod.WindowSizeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-fns", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class DeviceMotion ()
    extends typingsSlinky.reactFns.deviceMotionDeviceMotionMod.DeviceMotion
  
  @js.native
  class DeviceOrientation ()
    extends typingsSlinky.reactFns.deviceOrientationDeviceOrientationMod.DeviceOrientation
  
  @js.native
  class GeoPosition ()
    extends typingsSlinky.reactFns.geoPositionGeoPositionMod.GeoPosition
  
  @js.native
  class Locales ()
    extends typingsSlinky.reactFns.localesLocalesMod.Locales
  
  @js.native
  class Network ()
    extends typingsSlinky.reactFns.networkNetworkMod.Network
  
  @js.native
  class Scroll ()
    extends typingsSlinky.reactFns.scrollMod.Scroll
  
  @js.native
  class WindowSize ()
    extends typingsSlinky.reactFns.windowSizeMod.WindowSize
  
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
    var defaultProps: PartialScrollConfig = js.native
  }
  
  /* static members */
  @js.native
  object WindowSize extends js.Object {
    var defaultProps: PartialWindowSizeConfig = js.native
  }
  
}

