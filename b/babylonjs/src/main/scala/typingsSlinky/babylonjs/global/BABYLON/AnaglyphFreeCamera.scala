package typingsSlinky.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.AnaglyphFreeCamera")
@js.native
class AnaglyphFreeCamera protected ()
  extends typingsSlinky.babylonjs.BABYLON.AnaglyphFreeCamera {
  /**
    * Creates a new AnaglyphFreeCamera
    * @param name defines camera name
    * @param position defines initial position
    * @param interaxialDistance defines distance between each color axis
    * @param scene defines the hosting scene
    */
  def this(
    name: String,
    position: typingsSlinky.babylonjs.BABYLON.Vector3,
    interaxialDistance: Double,
    scene: typingsSlinky.babylonjs.BABYLON.Scene
  ) = this()
}
