package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.VRExperienceHelperOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.VRExperienceHelper")
@js.native
class VRExperienceHelper protected ()
  extends typingsSlinky.babylonjs.BABYLON.VRExperienceHelper {
  /**
    * Instantiates a VRExperienceHelper.
    * Helps to quickly add VR support to an existing scene.
    * @param scene The scene the VRExperienceHelper belongs to.
    * @param webVROptions Options to modify the vr experience helper's behavior.
    */
  def this(scene: typingsSlinky.babylonjs.BABYLON.Scene) = this()
  def this(
    scene: typingsSlinky.babylonjs.BABYLON.Scene,
    /** Options to modify the vr experience helper's behavior. */
  webVROptions: VRExperienceHelperOptions
  ) = this()
}
/* static members */
object VRExperienceHelper {
  
  /**
    * Speed Constant Teleportation Mode
    */
  @JSGlobal("BABYLON.VRExperienceHelper.TELEPORTATIONMODE_CONSTANTSPEED")
  @js.native
  val TELEPORTATIONMODE_CONSTANTSPEED: Double = js.native
  
  /**
    * Time Constant Teleportation Mode
    */
  @JSGlobal("BABYLON.VRExperienceHelper.TELEPORTATIONMODE_CONSTANTTIME")
  @js.native
  val TELEPORTATIONMODE_CONSTANTTIME: Double = js.native
}
