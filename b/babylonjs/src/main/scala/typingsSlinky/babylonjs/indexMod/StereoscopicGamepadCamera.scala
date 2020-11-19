package typingsSlinky.babylonjs.indexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "StereoscopicGamepadCamera")
@js.native
class StereoscopicGamepadCamera protected ()
  extends typingsSlinky.babylonjs.babylonjsMod.StereoscopicGamepadCamera {
  /**
    * Creates a new StereoscopicGamepadCamera
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
