package typingsSlinky.babylonjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "SpotLight")
@js.native
class SpotLight protected ()
  extends typingsSlinky.babylonjs.legacyMod.SpotLight {
  /**
    * Creates a SpotLight object in the scene. A spot light is a simply light oriented cone.
    * It can cast shadows.
    * Documentation : https://doc.babylonjs.com/babylon101/lights
    * @param name The light friendly name
    * @param position The position of the spot light in the scene
    * @param direction The direction of the light in the scene
    * @param angle The cone angle of the light in Radians
    * @param exponent The light decay speed with the distance from the emission spot
    * @param scene The scene the lights belongs to
    */
  def this(
    name: String,
    position: typingsSlinky.babylonjs.mathVectorMod.Vector3,
    direction: typingsSlinky.babylonjs.mathVectorMod.Vector3,
    angle: Double,
    exponent: Double,
    scene: typingsSlinky.babylonjs.sceneMod.Scene
  ) = this()
}
/* static members */
@JSImport("babylonjs", "SpotLight")
@js.native
object SpotLight extends js.Object {
  
  var _IsProceduralTexture: js.Any = js.native
  
  var _IsTexture: js.Any = js.native
}
