package typingsSlinky.babylonjs.babylonjsMod

import typingsSlinky.babylonjs.mathVectorMod.Vector3
import typingsSlinky.babylonjs.sceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Cameras/index", "AnaglyphUniversalCamera")
@js.native
class AnaglyphUniversalCamera protected ()
  extends typingsSlinky.babylonjs.stereoscopicIndexMod.AnaglyphUniversalCamera {
  /**
    * Creates a new AnaglyphUniversalCamera
    * @param name defines camera name
    * @param position defines initial position
    * @param interaxialDistance defines distance between each color axis
    * @param scene defines the hosting scene
    */
  def this(name: String, position: Vector3, interaxialDistance: Double, scene: Scene) = this()
}
