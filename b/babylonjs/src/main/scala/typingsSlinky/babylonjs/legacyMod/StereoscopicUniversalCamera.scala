package typingsSlinky.babylonjs.legacyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Legacy/legacy", "StereoscopicUniversalCamera")
@js.native
class StereoscopicUniversalCamera protected ()
  extends typingsSlinky.babylonjs.indexMod.StereoscopicUniversalCamera {
  /**
    * Creates a new StereoscopicUniversalCamera
    * @param name defines camera name
    * @param position defines initial position
    * @param interaxialDistance defines distance between each color axis
    * @param isStereoscopicSideBySide defines is stereoscopic is done side by side or over under
    * @param scene defines the hosting scene
    */
  def this(
    name: String,
    position: typingsSlinky.babylonjs.mathVectorMod.Vector3,
    interaxialDistance: Double,
    isStereoscopicSideBySide: Boolean,
    scene: typingsSlinky.babylonjs.sceneMod.Scene
  ) = this()
}

