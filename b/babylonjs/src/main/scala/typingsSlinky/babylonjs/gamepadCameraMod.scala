package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.mathVectorMod.Vector3
import typingsSlinky.babylonjs.sceneMod.Scene
import typingsSlinky.babylonjs.universalCameraMod.UniversalCamera
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gamepadCameraMod {
  
  @JSImport("babylonjs/Cameras/gamepadCamera", "GamepadCamera")
  @js.native
  class GamepadCamera protected () extends UniversalCamera {
    /**
      * Instantiates a new Gamepad Camera
      * This represents a FPS type of camera. This is only here for back compat purpose.
      * Please use the UniversalCamera instead as both are identical.
      * @see https://doc.babylonjs.com/features/cameras#universal-camera
      * @param name Define the name of the camera in the scene
      * @param position Define the start position of the camera in the scene
      * @param scene Define the scene the camera belongs to
      */
    def this(name: String, position: Vector3, scene: Scene) = this()
  }
}
