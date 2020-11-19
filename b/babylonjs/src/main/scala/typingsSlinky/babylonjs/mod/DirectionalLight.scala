package typingsSlinky.babylonjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "DirectionalLight")
@js.native
class DirectionalLight protected ()
  extends typingsSlinky.babylonjs.legacyMod.DirectionalLight {
  /**
    * Creates a DirectionalLight object in the scene, oriented towards the passed direction (Vector3).
    * The directional light is emitted from everywhere in the given direction.
    * It can cast shadows.
    * Documentation : https://doc.babylonjs.com/babylon101/lights
    * @param name The friendly name of the light
    * @param direction The direction of the light
    * @param scene The scene the light belongs to
    */
  def this(
    name: String,
    direction: typingsSlinky.babylonjs.mathVectorMod.Vector3,
    scene: typingsSlinky.babylonjs.sceneMod.Scene
  ) = this()
}
