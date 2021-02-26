package typingsSlinky.babylonjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "PointLight")
@js.native
class PointLight protected ()
  extends typingsSlinky.babylonjs.legacyMod.PointLight {
  /**
    * Creates a PointLight object from the passed name and position (Vector3) and adds it in the scene.
    * A PointLight emits the light in every direction.
    * It can cast shadows.
    * If the scene camera is already defined and you want to set your PointLight at the camera position, just set it :
    * ```javascript
    * var pointLight = new PointLight("pl", camera.position, scene);
    * ```
    * Documentation : https://doc.babylonjs.com/babylon101/lights
    * @param name The light friendly name
    * @param position The position of the point light in the scene
    * @param scene The scene the lights belongs to
    */
  def this(
    name: String,
    position: typingsSlinky.babylonjs.mathVectorMod.Vector3,
    scene: typingsSlinky.babylonjs.sceneMod.Scene
  ) = this()
}
