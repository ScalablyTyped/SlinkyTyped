package typingsSlinky.babylonjs.webXRControllerTeleportationMod

import typingsSlinky.babylonjs.AnonDisableAnimation
import typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh
import typingsSlinky.babylonjs.mathVectorMod.Vector3
import typingsSlinky.babylonjs.sceneMod.Scene
import typingsSlinky.babylonjs.webXRInputMod.WebXRInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWebXRTeleportationOptions extends js.Object {
  /**
    * if provided, this scene will be used to render meshes.
    */
  var customUtilityLayerScene: js.UndefOr[Scene] = js.native
  /**
    * Values to configure the default target mesh
    */
  var defaultTargetMeshOptions: js.UndefOr[AnonDisableAnimation] = js.native
  /**
    * A list of meshes to use as floor meshes.
    * Meshes can be added and removed after initializing the feature using the
    * addFloorMesh and removeFloorMesh functions
    * If empty, rotation will still work
    */
  var floorMeshes: js.UndefOr[js.Array[AbstractMesh]] = js.native
  /**
    *  use this rendering group id for the meshes (optional)
    */
  var renderingGroupId: js.UndefOr[Double] = js.native
  /**
    * Should teleportation move only to snap points
    */
  var snapPointsOnly: js.UndefOr[Boolean] = js.native
  /**
    * An array of points to which the teleportation will snap to.
    * If the teleportation ray is in the proximity of one of those points, it will be corrected to this point.
    */
  var snapPositions: js.UndefOr[js.Array[Vector3]] = js.native
  /**
    * How close should the teleportation ray be in order to snap to position.
    * Default to 0.8 units (meters)
    */
  var snapToPositionRadius: js.UndefOr[Double] = js.native
  /**
    * Provide your own teleportation mesh instead of babylon's wonderful doughnut.
    * If you want to support rotation, make sure your mesh has a direction indicator.
    *
    * When left untouched, the default mesh will be initialized.
    */
  var teleportationTargetMesh: js.UndefOr[AbstractMesh] = js.native
  /**
    * If main component is used (no thumbstick), how long should the "long press" take before teleport
    */
  var timeToTeleport: js.UndefOr[Double] = js.native
  /**
    * Disable using the thumbstick and use the main component (usually trigger) on long press.
    * This will be automatically true if the controller doesn't have a thumbstick or touchpad.
    */
  var useMainComponentOnly: js.UndefOr[Boolean] = js.native
  /**
    * Should meshes created here be added to a utility layer or the main scene
    */
  var useUtilityLayer: js.UndefOr[Boolean] = js.native
  /**
    * Babylon XR Input class for controller
    */
  var xrInput: WebXRInput = js.native
}

object IWebXRTeleportationOptions {
  @scala.inline
  def apply(xrInput: WebXRInput): IWebXRTeleportationOptions = {
    val __obj = js.Dynamic.literal(xrInput = xrInput.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebXRTeleportationOptions]
  }
  @scala.inline
  implicit class IWebXRTeleportationOptionsOps[Self <: IWebXRTeleportationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withXrInput(value: WebXRInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xrInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomUtilityLayerScene(value: Scene): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customUtilityLayerScene")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomUtilityLayerScene: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customUtilityLayerScene")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultTargetMeshOptions(value: AnonDisableAnimation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultTargetMeshOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultTargetMeshOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultTargetMeshOptions")(js.undefined)
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
    def withRenderingGroupId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderingGroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderingGroupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderingGroupId")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapPointsOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapPointsOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapPointsOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapPointsOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapPositions(value: js.Array[Vector3]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapPositions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapPositions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapPositions")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapToPositionRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapToPositionRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapToPositionRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapToPositionRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withTeleportationTargetMesh(value: AbstractMesh): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teleportationTargetMesh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTeleportationTargetMesh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teleportationTargetMesh")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeToTeleport(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeToTeleport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeToTeleport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeToTeleport")(js.undefined)
        ret
    }
    @scala.inline
    def withUseMainComponentOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useMainComponentOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseMainComponentOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useMainComponentOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withUseUtilityLayer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useUtilityLayer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseUtilityLayer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useUtilityLayer")(js.undefined)
        ret
    }
  }
  
}

