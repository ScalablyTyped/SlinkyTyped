package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.freeCameraMod.FreeCamera
import typingsSlinky.babylonjs.mathVectorMod.Vector3
import typingsSlinky.babylonjs.sceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Cameras/virtualJoysticksCamera", JSImport.Namespace)
@js.native
object virtualJoysticksCameraMod extends js.Object {
  
  @js.native
  class VirtualJoysticksCamera protected () extends FreeCamera {
    /**
      * Intantiates a VirtualJoysticksCamera. It can be useful in First Person Shooter game for instance.
      * It is identical to the Free Camera and simply adds by default a virtual joystick.
      * Virtual Joysticks are on-screen 2D graphics that are used to control the camera or other scene items.
      * @see https://doc.babylonjs.com/features/cameras#virtual-joysticks-camera
      * @param name Define the name of the camera in the scene
      * @param position Define the start position of the camera in the scene
      * @param scene Define the scene the camera belongs to
      */
    def this(name: String, position: Vector3, scene: Scene) = this()
  }
}
