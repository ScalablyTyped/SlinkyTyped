package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebXRDefaultExperienceOptions extends js.Object {
  /**
    * Enable or disable default UI to enter XR
    */
  var disableDefaultUI: js.UndefOr[Boolean] = js.native
  /**
    * Should teleportation not initialize. defaults to false.
    */
  var disableTeleportation: js.UndefOr[Boolean] = js.native
  /**
    * Floor meshes that will be used for teleport
    */
  var floorMeshes: js.UndefOr[js.Array[AbstractMesh]] = js.native
  /**
    * If set to true, the first frame will not be used to reset position
    * The first frame is mainly used when copying transformation from the old camera
    * Mainly used in AR
    */
  var ignoreNativeCameraTransformation: js.UndefOr[Boolean] = js.native
  /**
    * Disable the controller mesh-loading. Can be used if you want to load your own meshes
    */
  var inputOptions: js.UndefOr[IWebXRInputOptions] = js.native
  /**
    * optional configuration for the output canvas
    */
  var outputCanvasOptions: js.UndefOr[WebXRManagedOutputCanvasOptions] = js.native
  /**
    * optional UI options. This can be used among other to change session mode and reference space type
    */
  var uiOptions: js.UndefOr[WebXREnterExitUIOptions] = js.native
  /**
    * When loading teleportation and pointer select, use stable versions instead of latest.
    */
  var useStablePlugins: js.UndefOr[Boolean] = js.native
}

object WebXRDefaultExperienceOptions {
  @scala.inline
  def apply(): WebXRDefaultExperienceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebXRDefaultExperienceOptions]
  }
  @scala.inline
  implicit class WebXRDefaultExperienceOptionsOps[Self <: WebXRDefaultExperienceOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisableDefaultUI(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableDefaultUI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableDefaultUI: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableDefaultUI")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableTeleportation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableTeleportation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableTeleportation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableTeleportation")(js.undefined)
        ret
    }
    @scala.inline
    def withFloorMeshes(value: js.Array[AbstractMesh]): Self = {
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
    def withIgnoreNativeCameraTransformation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreNativeCameraTransformation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreNativeCameraTransformation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreNativeCameraTransformation")(js.undefined)
        ret
    }
    @scala.inline
    def withInputOptions(value: IWebXRInputOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputCanvasOptions(value: WebXRManagedOutputCanvasOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputCanvasOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputCanvasOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputCanvasOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withUiOptions(value: WebXREnterExitUIOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uiOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUiOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uiOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withUseStablePlugins(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useStablePlugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseStablePlugins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useStablePlugins")(js.undefined)
        ret
    }
  }
  
}

