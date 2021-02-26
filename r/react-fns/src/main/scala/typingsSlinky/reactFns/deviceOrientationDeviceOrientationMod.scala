package typingsSlinky.reactFns

import org.scalajs.dom.experimental.deviceorientation.DeviceOrientationEvent
import typingsSlinky.react.mod.Component
import typingsSlinky.reactFns.typesMod.SharedRenderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deviceOrientationDeviceOrientationMod {
  
  @JSImport("react-fns/dist/DeviceOrientation/DeviceOrientation", "DeviceOrientation")
  @js.native
  class DeviceOrientation protected ()
    extends Component[SharedRenderProps[DeviceOrientationProps], DeviceOrientationProps, js.Any] {
    def this(props: SharedRenderProps[DeviceOrientationProps]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SharedRenderProps[DeviceOrientationProps], context: js.Any) = this()
    
    @JSName("componentDidMount")
    def componentDidMount_MDeviceOrientation(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MDeviceOrientation(): Unit = js.native
    
    def handleDeviceOrientation(e: DeviceOrientationEvent): Unit = js.native
  }
  
  @js.native
  trait DeviceOrientationProps extends StObject {
    
    var absolute: Boolean = js.native
    
    var alpha: Double | Null = js.native
    
    var beta: Double | Null = js.native
    
    var gamma: Double | Null = js.native
  }
  object DeviceOrientationProps {
    
    @scala.inline
    def apply(absolute: Boolean): DeviceOrientationProps = {
      val __obj = js.Dynamic.literal(absolute = absolute.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeviceOrientationProps]
    }
    
    @scala.inline
    implicit class DeviceOrientationPropsMutableBuilder[Self <: DeviceOrientationProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbsolute(value: Boolean): Self = StObject.set(x, "absolute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlphaNull: Self = StObject.set(x, "alpha", null)
      
      @scala.inline
      def setBeta(value: Double): Self = StObject.set(x, "beta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBetaNull: Self = StObject.set(x, "beta", null)
      
      @scala.inline
      def setGamma(value: Double): Self = StObject.set(x, "gamma", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGammaNull: Self = StObject.set(x, "gamma", null)
    }
  }
}
