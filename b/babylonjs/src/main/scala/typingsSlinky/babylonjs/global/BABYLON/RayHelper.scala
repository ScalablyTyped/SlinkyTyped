package typingsSlinky.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.RayHelper")
@js.native
class RayHelper protected ()
  extends typingsSlinky.babylonjs.BABYLON.RayHelper {
  /**
    * Instantiate a new ray helper.
    * As raycast might be hard to debug, the RayHelper can help rendering the different rays
    * in order to better appreciate the issue one might have.
    * @see https://doc.babylonjs.com/babylon101/raycasts#debugging
    * @param ray Defines the ray we are currently tryin to visualize
    */
  def this(ray: typingsSlinky.babylonjs.BABYLON.Ray) = this()
}
/* static members */
object RayHelper {
  
  /**
    * Helper function to create a colored helper in a scene in one line.
    * @param ray Defines the ray we are currently tryin to visualize
    * @param scene Defines the scene the ray is used in
    * @param color Defines the color we want to see the ray in
    * @returns The newly created ray helper.
    */
  @JSGlobal("BABYLON.RayHelper.CreateAndShow")
  @js.native
  def CreateAndShow(
    ray: typingsSlinky.babylonjs.BABYLON.Ray,
    scene: typingsSlinky.babylonjs.BABYLON.Scene,
    color: typingsSlinky.babylonjs.BABYLON.Color3
  ): typingsSlinky.babylonjs.BABYLON.RayHelper = js.native
}
