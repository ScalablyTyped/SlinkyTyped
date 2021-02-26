package typingsSlinky.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.HemisphericLight")
@js.native
class HemisphericLight protected ()
  extends typingsSlinky.babylonjs.BABYLON.HemisphericLight {
  /**
    * Creates a HemisphericLight object in the scene according to the passed direction (Vector3).
    * The HemisphericLight simulates the ambient environment light, so the passed direction is the light reflection direction, not the incoming direction.
    * The HemisphericLight can't cast shadows.
    * Documentation : https://doc.babylonjs.com/babylon101/lights
    * @param name The friendly name of the light
    * @param direction The direction of the light reflection
    * @param scene The scene the light belongs to
    */
  def this(
    name: String,
    direction: typingsSlinky.babylonjs.BABYLON.Vector3,
    scene: typingsSlinky.babylonjs.BABYLON.Scene
  ) = this()
}
