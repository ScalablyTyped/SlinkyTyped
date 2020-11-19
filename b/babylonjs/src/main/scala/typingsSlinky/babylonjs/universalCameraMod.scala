package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.mathVectorMod.Vector3
import typingsSlinky.babylonjs.sceneMod.Scene
import typingsSlinky.babylonjs.touchCameraMod.TouchCamera
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Cameras/universalCamera", JSImport.Namespace)
@js.native
object universalCameraMod extends js.Object {
  
  @js.native
  class UniversalCamera protected () extends TouchCamera {
    /**
      * The Universal Camera is the one to choose for first person shooter type games, and works with all the keyboard, mouse, touch and gamepads. This replaces the earlier Free Camera,
      * which still works and will still be found in many Playgrounds.
      * @see http://doc.babylonjs.com/features/cameras#universal-camera
      * @param name Define the name of the camera in the scene
      * @param position Define the start position of the camera in the scene
      * @param scene Define the scene the camera belongs to
      */
    def this(name: String, position: Vector3, scene: Scene) = this()
    
    /**
      * Defines the gamepad rotation sensiblity.
      * This is the threshold from when rotation starts to be accounted for to prevent jittering.
      */
    def gamepadAngularSensibility: Double = js.native
    def gamepadAngularSensibility_=(value: Double): Unit = js.native
    
    /**
      * Defines the gamepad move sensiblity.
      * This is the threshold from when moving starts to be accounted for for to prevent jittering.
      */
    def gamepadMoveSensibility: Double = js.native
    def gamepadMoveSensibility_=(value: Double): Unit = js.native
  }
}
