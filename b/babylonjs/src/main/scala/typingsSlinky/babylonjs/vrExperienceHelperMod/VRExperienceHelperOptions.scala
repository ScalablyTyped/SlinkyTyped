package typingsSlinky.babylonjs.vrExperienceHelperMod

import typingsSlinky.babylonjs.meshMod.Mesh
import typingsSlinky.babylonjs.vrCameraMetricsMod.VRCameraMetrics
import typingsSlinky.babylonjs.webVRCameraMod.WebVROptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VRExperienceHelperOptions extends WebVROptions {
  /**
    * Create a DeviceOrientationCamera to be used as your out of vr camera. (default: true)
    */
  var createDeviceOrientationCamera: js.UndefOr[Boolean] = js.native
  /**
    * Create a VRDeviceOrientationFreeCamera to be used for VR when no external HMD is found. (default: true)
    */
  var createFallbackVRDeviceOrientationFreeCamera: js.UndefOr[Boolean] = js.native
  /**
    * A list of meshes to be used as the teleportation floor. If specified, teleportation will be enabled (default: undefined)
    */
  var floorMeshes: js.UndefOr[js.Array[Mesh]] = js.native
  /**
    * Uses the main button on the controller to toggle the laser casted. (default: true)
    */
  var laserToggle: js.UndefOr[Boolean] = js.native
  /**
    * Defines if WebXR should be used instead of WebVR (if available)
    */
  var useXR: js.UndefOr[Boolean] = js.native
  /**
    * Distortion metrics for the fallback vrDeviceOrientationCamera (default: VRCameraMetrics.Default)
    */
  var vrDeviceOrientationCameraMetrics: js.UndefOr[VRCameraMetrics] = js.native
}

object VRExperienceHelperOptions {
  @scala.inline
  def apply(): VRExperienceHelperOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VRExperienceHelperOptions]
  }
  @scala.inline
  implicit class VRExperienceHelperOptionsOps[Self <: VRExperienceHelperOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateDeviceOrientationCamera(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createDeviceOrientationCamera")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateDeviceOrientationCamera: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createDeviceOrientationCamera")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateFallbackVRDeviceOrientationFreeCamera(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createFallbackVRDeviceOrientationFreeCamera")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateFallbackVRDeviceOrientationFreeCamera: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createFallbackVRDeviceOrientationFreeCamera")(js.undefined)
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
    def withLaserToggle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("laserToggle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLaserToggle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("laserToggle")(js.undefined)
        ret
    }
    @scala.inline
    def withUseXR(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useXR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseXR: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useXR")(js.undefined)
        ret
    }
    @scala.inline
    def withVrDeviceOrientationCameraMetrics(value: VRCameraMetrics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vrDeviceOrientationCameraMetrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVrDeviceOrientationCameraMetrics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vrDeviceOrientationCameraMetrics")(js.undefined)
        ret
    }
  }
  
}

