package typingsSlinky.reactFns

import org.scalajs.dom.experimental.deviceorientation.DeviceAcceleration
import org.scalajs.dom.experimental.deviceorientation.DeviceMotionEvent
import org.scalajs.dom.experimental.deviceorientation.DeviceRotationRate
import typingsSlinky.react.mod.Component
import typingsSlinky.reactFns.typesMod.SharedRenderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deviceMotionDeviceMotionMod {
  
  @JSImport("react-fns/dist/DeviceMotion/DeviceMotion", "DeviceMotion")
  @js.native
  class DeviceMotion protected ()
    extends Component[SharedRenderProps[DeviceMotionProps], DeviceMotionProps, js.Any] {
    def this(props: SharedRenderProps[DeviceMotionProps]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SharedRenderProps[DeviceMotionProps], context: js.Any) = this()
    
    @JSName("componentDidMount")
    def componentDidMount_MDeviceMotion(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MDeviceMotion(): Unit = js.native
    
    def handleDeviceMotion(e: DeviceMotionEvent): Unit = js.native
  }
  
  @js.native
  trait DeviceMotionProps extends StObject {
    
    var acceleration: DeviceAcceleration | Null = js.native
    
    var accelerationIncludingGravity: DeviceAcceleration | Null = js.native
    
    var interval: Double | Null = js.native
    
    var rotationRate: DeviceRotationRate | Null = js.native
  }
  object DeviceMotionProps {
    
    @scala.inline
    def apply(): DeviceMotionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeviceMotionProps]
    }
    
    @scala.inline
    implicit class DeviceMotionPropsMutableBuilder[Self <: DeviceMotionProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAcceleration(value: DeviceAcceleration): Self = StObject.set(x, "acceleration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccelerationIncludingGravity(value: DeviceAcceleration): Self = StObject.set(x, "accelerationIncludingGravity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccelerationIncludingGravityNull: Self = StObject.set(x, "accelerationIncludingGravity", null)
      
      @scala.inline
      def setAccelerationNull: Self = StObject.set(x, "acceleration", null)
      
      @scala.inline
      def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntervalNull: Self = StObject.set(x, "interval", null)
      
      @scala.inline
      def setRotationRate(value: DeviceRotationRate): Self = StObject.set(x, "rotationRate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotationRateNull: Self = StObject.set(x, "rotationRate", null)
    }
  }
}
