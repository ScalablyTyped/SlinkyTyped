package typingsSlinky.babylonjs.legacyMod

import typingsSlinky.babylonjs.vrExperienceHelperMod.VRExperienceHelperOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "VRExperienceHelper")
@js.native
class VRExperienceHelper protected ()
  extends typingsSlinky.babylonjs.indexMod.VRExperienceHelper {
  /**
    * Instantiates a VRExperienceHelper.
    * Helps to quickly add VR support to an existing scene.
    * @param scene The scene the VRExperienceHelper belongs to.
    * @param webVROptions Options to modify the vr experience helper's behavior.
    */
  def this(scene: typingsSlinky.babylonjs.sceneMod.Scene) = this()
  def this(
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    /** Options to modify the vr experience helper's behavior. */
  webVROptions: VRExperienceHelperOptions
  ) = this()
}
/* static members */
@JSImport("babylonjs/Legacy/legacy", "VRExperienceHelper")
@js.native
object VRExperienceHelper extends js.Object {
  
  /**
    * Speed Constant Teleportation Mode
    */
  val TELEPORTATIONMODE_CONSTANTSPEED: Double = js.native
  
  /**
    * Time Constant Teleportation Mode
    */
  val TELEPORTATIONMODE_CONSTANTTIME: Double = js.native
}
