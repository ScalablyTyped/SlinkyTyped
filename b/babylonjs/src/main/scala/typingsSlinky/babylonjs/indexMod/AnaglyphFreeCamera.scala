package typingsSlinky.babylonjs.indexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/index", "AnaglyphFreeCamera")
@js.native
class AnaglyphFreeCamera protected ()
  extends typingsSlinky.babylonjs.babylonjsMod.AnaglyphFreeCamera {
  /**
    * Creates a new AnaglyphFreeCamera
    * @param name defines camera name
    * @param position defines initial position
    * @param interaxialDistance defines distance between each color axis
    * @param scene defines the hosting scene
    */
  def this(
    name: String,
    position: typingsSlinky.babylonjs.mathVectorMod.Vector3,
    interaxialDistance: Double,
    scene: typingsSlinky.babylonjs.sceneMod.Scene
  ) = this()
}

