package typingsSlinky.babylonjs.legacyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Legacy/legacy", "GamepadCamera")
@js.native
class GamepadCamera protected ()
  extends typingsSlinky.babylonjs.indexMod.GamepadCamera {
  /**
    * Instantiates a new Gamepad Camera
    * This represents a FPS type of camera. This is only here for back compat purpose.
    * Please use the UniversalCamera instead as both are identical.
    * @see http://doc.babylonjs.com/features/cameras#universal-camera
    * @param name Define the name of the camera in the scene
    * @param position Define the start position of the camera in the scene
    * @param scene Define the scene the camera belongs to
    */
  def this(
    name: String,
    position: typingsSlinky.babylonjs.mathVectorMod.Vector3,
    scene: typingsSlinky.babylonjs.sceneMod.Scene
  ) = this()
}

