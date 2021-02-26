package typingsSlinky.babylonjs.babylonjsMod

import typingsSlinky.babylonjs.mathVectorMod.Vector3
import typingsSlinky.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Cameras/index", "AnaglyphArcRotateCamera")
@js.native
class AnaglyphArcRotateCamera protected ()
  extends typingsSlinky.babylonjs.stereoscopicIndexMod.AnaglyphArcRotateCamera {
  /**
    * Creates a new AnaglyphArcRotateCamera
    * @param name defines camera name
    * @param alpha defines alpha angle (in radians)
    * @param beta defines beta angle (in radians)
    * @param radius defines radius
    * @param target defines camera target
    * @param interaxialDistance defines distance between each color axis
    * @param scene defines the hosting scene
    */
  def this(
    name: String,
    alpha: Double,
    beta: Double,
    radius: Double,
    target: Vector3,
    interaxialDistance: Double,
    scene: Scene
  ) = this()
}
