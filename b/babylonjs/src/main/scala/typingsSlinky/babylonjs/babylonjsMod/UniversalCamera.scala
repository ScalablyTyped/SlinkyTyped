package typingsSlinky.babylonjs.babylonjsMod

import typingsSlinky.babylonjs.mathVectorMod.Vector3
import typingsSlinky.babylonjs.sceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Cameras/index", "UniversalCamera")
@js.native
class UniversalCamera protected ()
  extends typingsSlinky.babylonjs.universalCameraMod.UniversalCamera {
  /**
    * The Universal Camera is the one to choose for first person shooter type games, and works with all the keyboard, mouse, touch and gamepads. This replaces the earlier Free Camera,
    * which still works and will still be found in many Playgrounds.
    * @see http://doc.babylonjs.com/features/cameras#universal-camera
    * @param name Define the name of the camera in the scene
    * @param position Define the start position of the camera in the scene
    * @param scene Define the scene the camera belongs to
    */
  def this(name: String, position: Vector3, scene: Scene) = this()
}
