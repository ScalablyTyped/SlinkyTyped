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
import typingsSlinky.reactFns.scrollScrollMod.ScrollConfig
import typingsSlinky.reactFns.scrollScrollMod.ScrollProps
import typingsSlinky.reactFns.typesMod.SharedRenderProps
import typingsSlinky.reactFns.windowSizeWindowSizeMod.WindowSizeConfig
import typingsSlinky.reactFns.windowSizeWindowSizeMod.WindowSizeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-fns", "DeviceMotion")
  @js.native
  class DeviceMotion protected ()
    extends typingsSlinky.reactFns.deviceMotionMod.DeviceMotion {
    def this(props: SharedRenderProps[DeviceMotionProps]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SharedRenderProps[DeviceMotionProps], context: js.Any) = this()
  }
  
  @JSImport("react-fns", "DeviceOrientation")
  @js.native
  class DeviceOrientation protected ()
    extends typingsSlinky.reactFns.deviceOrientationMod.DeviceOrientation {
    def this(props: SharedRenderProps[DeviceOrientationProps]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SharedRenderProps[DeviceOrientationProps], context: js.Any) = this()
  }
  
  @JSImport("react-fns", "GeoPosition")
  @js.native
  class GeoPosition protected ()
    extends typingsSlinky.reactFns.geoPositionMod.GeoPosition {
    def this(props: SharedRenderProps[GeoPositionProps]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SharedRenderProps[GeoPositionProps], context: js.Any) = this()
  }
  
  @JSImport("react-fns", "Locales")
  @js.native
  class Locales protected ()
    extends typingsSlinky.reactFns.localesMod.Locales {
    def this(props: SharedRenderProps[LocalesProps]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SharedRenderProps[LocalesProps], context: js.Any) = this()
  }
  
  @JSImport("react-fns", "Media")
  @js.native
  val Media: ReactComponentClass[SharedRenderProps[MediaProps]] = js.native
  
  @JSImport("react-fns", "Network")
  @js.native
  class Network protected ()
    extends typingsSlinky.reactFns.networkMod.Network {
    def this(props: SharedRenderProps[NetworkProps]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SharedRenderProps[NetworkProps], context: js.Any) = this()
  }
  
  @JSImport("react-fns", "Scroll")
  @js.native
  class Scroll protected ()
    extends typingsSlinky.reactFns.scrollMod.Scroll {
    def this(props: ScrollConfig with SharedRenderProps[ScrollProps]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ScrollConfig with SharedRenderProps[ScrollProps], context: js.Any) = this()
  }
  /* static members */
  object Scroll {
    
    @JSImport("react-fns", "Scroll")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-fns", "Scroll.defaultProps")
    @js.native
    def defaultProps: PartialScrollConfig = js.native
    @scala.inline
    def defaultProps_=(x: PartialScrollConfig): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-fns", "WindowSize")
  @js.native
  class WindowSize protected ()
    extends typingsSlinky.reactFns.windowSizeMod.WindowSize {
    def this(props: WindowSizeConfig with SharedRenderProps[WindowSizeProps]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: WindowSizeConfig with SharedRenderProps[WindowSizeProps], context: js.Any) = this()
  }
  /* static members */
  object WindowSize {
    
    @JSImport("react-fns", "WindowSize")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-fns", "WindowSize.defaultProps")
    @js.native
    def defaultProps: PartialWindowSizeConfig = js.native
    @scala.inline
    def defaultProps_=(x: PartialWindowSizeConfig): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-fns", "withDeviceMotion")
  @js.native
  def withDeviceMotion[Props](Component: ReactComponentClass[Props with DeviceMotionProps]): ReactComponentClass[Props] = js.native
  
  @JSImport("react-fns", "withDeviceOrientation")
  @js.native
  def withDeviceOrientation[Props](Component: ReactComponentClass[Props with DeviceOrientationProps]): ReactComponentClass[Props] = js.native
  
  @JSImport("react-fns", "withGeoPosition")
  @js.native
  def withGeoPosition[Props](Component: ReactComponentClass[Props with GeoPositionProps]): ReactComponentClass[Props] = js.native
  
  @JSImport("react-fns", "withLocales")
  @js.native
  def withLocales[Props](Component: ReactComponentClass[Props with LocalesProps]): ReactComponentClass[Props] = js.native
  
  @JSImport("react-fns", "withNetwork")
  @js.native
  def withNetwork[Props](Component: ReactComponentClass[Props with NetworkProps]): ReactComponentClass[Props] = js.native
  
  @JSImport("react-fns", "withScroll")
  @js.native
  def withScroll[Props](Component: ReactComponentClass[Props with ScrollProps]): ReactComponentClass[Props] = js.native
  
  @JSImport("react-fns", "withWindowSize")
  @js.native
  def withWindowSize[Props](Component: ReactComponentClass[Props with WindowSizeProps]): ReactComponentClass[Props] = js.native
}
