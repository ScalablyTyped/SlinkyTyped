package typingsSlinky.babylonjs.indexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "ArcRotateCamera")
@js.native
class ArcRotateCamera protected ()
  extends typingsSlinky.babylonjs.babylonjsMod.ArcRotateCamera {
  /**
    * Instantiates a new ArcRotateCamera in a given scene
    * @param name Defines the name of the camera
    * @param alpha Defines the camera rotation along the logitudinal axis
    * @param beta Defines the camera rotation along the latitudinal axis
    * @param radius Defines the camera distance from its target
    * @param target Defines the camera target
    * @param scene Defines the scene the camera belongs to
    * @param setActiveOnSceneIfNoneActive Defines wheter the camera should be marked as active if not other active cameras have been defined
    */
  def this(
    name: String,
    alpha: Double,
    beta: Double,
    radius: Double,
    target: typingsSlinky.babylonjs.mathVectorMod.Vector3,
    scene: typingsSlinky.babylonjs.sceneMod.Scene
  ) = this()
  def this(
    name: String,
    alpha: Double,
    beta: Double,
    radius: Double,
    target: typingsSlinky.babylonjs.mathVectorMod.Vector3,
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    setActiveOnSceneIfNoneActive: Boolean
  ) = this()
}
