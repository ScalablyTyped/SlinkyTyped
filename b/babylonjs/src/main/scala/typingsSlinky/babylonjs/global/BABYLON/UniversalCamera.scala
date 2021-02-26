package typingsSlinky.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.UniversalCamera")
@js.native
class UniversalCamera protected ()
  extends typingsSlinky.babylonjs.BABYLON.UniversalCamera {
  /**
    * The Universal Camera is the one to choose for first person shooter type games, and works with all the keyboard, mouse, touch and gamepads. This replaces the earlier Free Camera,
    * which still works and will still be found in many Playgrounds.
    * @see https://doc.babylonjs.com/features/cameras#universal-camera
    * @param name Define the name of the camera in the scene
    * @param position Define the start position of the camera in the scene
    * @param scene Define the scene the camera belongs to
    */
  def this(
    name: String,
    position: typingsSlinky.babylonjs.BABYLON.Vector3,
    scene: typingsSlinky.babylonjs.BABYLON.Scene
  ) = this()
}
