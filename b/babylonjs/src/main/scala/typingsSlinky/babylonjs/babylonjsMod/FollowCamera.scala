package typingsSlinky.babylonjs.babylonjsMod

import typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh
import typingsSlinky.babylonjs.mathVectorMod.Vector3
import typingsSlinky.babylonjs.sceneMod.Scene
import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Cameras/index", "FollowCamera")
@js.native
class FollowCamera protected ()
  extends typingsSlinky.babylonjs.followCameraMod.FollowCamera {
  /**
    * Instantiates the follow camera.
    * @see https://doc.babylonjs.com/features/cameras#follow-camera
    * @param name Define the name of the camera in the scene
    * @param position Define the position of the camera
    * @param scene Define the scene the camera belong to
    * @param lockedTarget Define the target of the camera
    */
  def this(name: String, position: Vector3, scene: Scene) = this()
  def this(name: String, position: Vector3, scene: Scene, lockedTarget: Nullable[AbstractMesh]) = this()
}
