package typingsSlinky.babylonjs.vrExperienceHelperMod

import typingsSlinky.babylonjs.easingMod.EasingFunction
import typingsSlinky.babylonjs.meshMod.Mesh
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VRTeleportationOptions extends js.Object {
  /**
    * The easing function used in the animation or null for Linear. (default CircleEase)
    */
  var easingFunction: js.UndefOr[EasingFunction] = js.native
  /**
    * The name of the mesh which should be used as the teleportation floor. (default: null)
    */
  var floorMeshName: js.UndefOr[String] = js.native
  /**
    * A list of meshes to be used as the teleportation floor. (default: empty)
    */
  var floorMeshes: js.UndefOr[js.Array[Mesh]] = js.native
  /**
    * The teleportation mode. (default: TELEPORTATIONMODE_CONSTANTTIME)
    */
  var teleportationMode: js.UndefOr[Double] = js.native
  /**
    * The speed of the animation in distance/sec, apply when animationMode is TELEPORTATIONMODE_CONSTANTSPEED. (default 20 units / sec)
    */
  var teleportationSpeed: js.UndefOr[Double] = js.native
  /**
    * The duration of the animation in ms, apply when animationMode is TELEPORTATIONMODE_CONSTANTTIME. (default 122ms)
    */
  var teleportationTime: js.UndefOr[Double] = js.native
}

object VRTeleportationOptions {
  @scala.inline
  def apply(): VRTeleportationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VRTeleportationOptions]
  }
  @scala.inline
  implicit class VRTeleportationOptionsOps[Self <: VRTeleportationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEasingFunction(value: EasingFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easingFunction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEasingFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easingFunction")(js.undefined)
        ret
    }
    @scala.inline
    def withFloorMeshName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floorMeshName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloorMeshName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floorMeshName")(js.undefined)
        ret
    }
    @scala.inline
    def withFloorMeshes(value: js.Array[Mesh]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floorMeshes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloorMeshes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floorMeshes")(js.undefined)
        ret
    }
    @scala.inline
    def withTeleportationMode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teleportationMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTeleportationMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teleportationMode")(js.undefined)
        ret
    }
    @scala.inline
    def withTeleportationSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teleportationSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTeleportationSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teleportationSpeed")(js.undefined)
        ret
    }
    @scala.inline
    def withTeleportationTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teleportationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTeleportationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teleportationTime")(js.undefined)
        ret
    }
  }
  
}

