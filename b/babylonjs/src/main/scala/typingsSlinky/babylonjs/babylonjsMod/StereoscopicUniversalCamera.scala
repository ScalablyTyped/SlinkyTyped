package typingsSlinky.babylonjs.babylonjsMod

import typingsSlinky.babylonjs.mathVectorMod.Vector3
import typingsSlinky.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Cameras/index", "StereoscopicUniversalCamera")
@js.native
class StereoscopicUniversalCamera protected ()
  extends typingsSlinky.babylonjs.stereoscopicIndexMod.StereoscopicUniversalCamera {
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
    position: Vector3,
    interaxialDistance: Double,
    isStereoscopicSideBySide: Boolean,
    scene: Scene
  ) = this()
}
