package typingsSlinky.babylonjs.legacyMod

import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "ArcFollowCamera")
@js.native
class ArcFollowCamera protected ()
  extends typingsSlinky.babylonjs.indexMod.ArcFollowCamera {
  /**
    * Instantiates a new ArcFollowCamera
    * @see https://doc.babylonjs.com/features/cameras#follow-camera
    * @param name Define the name of the camera
    * @param alpha Define the rotation angle of the camera around the logitudinal axis
    * @param beta Define the rotation angle of the camera around the elevation axis
    * @param radius Define the radius of the camera from its target point
    * @param target Define the target of the camera
    * @param scene Define the scene the camera belongs to
    */
  def this(
    name: String,
    /** The longitudinal angle of the camera */
  alpha: Double,
    /** The latitudinal angle of the camera */
  beta: Double,
    /** The radius of the camera from its target */
  radius: Double,
    /** Define the camera target (the mesh it should follow) */
  target: Nullable[typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh],
    scene: typingsSlinky.babylonjs.sceneMod.Scene
  ) = this()
}
