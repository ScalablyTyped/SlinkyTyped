package typingsSlinky.babylonjs.indexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "RayHelper")
@js.native
class RayHelper protected ()
  extends typingsSlinky.babylonjs.debugIndexMod.RayHelper {
  /**
    * Instantiate a new ray helper.
    * As raycast might be hard to debug, the RayHelper can help rendering the different rays
    * in order to better appreciate the issue one might have.
    * @see http://doc.babylonjs.com/babylon101/raycasts#debugging
    * @param ray Defines the ray we are currently tryin to visualize
    */
  def this(ray: typingsSlinky.babylonjs.rayMod.Ray) = this()
}
/* static members */
@JSImport("babylonjs/index", "RayHelper")
@js.native
object RayHelper extends js.Object {
  
  /**
    * Helper function to create a colored helper in a scene in one line.
    * @param ray Defines the ray we are currently tryin to visualize
    * @param scene Defines the scene the ray is used in
    * @param color Defines the color we want to see the ray in
    * @returns The newly created ray helper.
    */
  def CreateAndShow(
    ray: typingsSlinky.babylonjs.rayMod.Ray,
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    color: typingsSlinky.babylonjs.mathColorMod.Color3
  ): typingsSlinky.babylonjs.rayHelperMod.RayHelper = js.native
}
