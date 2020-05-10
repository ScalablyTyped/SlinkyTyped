package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.baseTextureMod.BaseTexture
import typingsSlinky.babylonjs.mathColorMod.Color3
import typingsSlinky.babylonjs.mathVectorMod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<babylonjs.babylonjs/Helpers/environmentHelper.IEnvironmentHelperOptions> */
@js.native
trait PartialIEnvironmentHelper extends js.Object {
  var backgroundYRotation: js.UndefOr[Double] = js.native
  var cameraContrast: js.UndefOr[Double] = js.native
  var cameraExposure: js.UndefOr[Double] = js.native
  var createGround: js.UndefOr[Boolean] = js.native
  var createSkybox: js.UndefOr[Boolean] = js.native
  var enableGroundMirror: js.UndefOr[Boolean] = js.native
  var enableGroundShadow: js.UndefOr[Boolean] = js.native
  var environmentTexture: js.UndefOr[String | BaseTexture] = js.native
  var groundColor: js.UndefOr[Color3] = js.native
  var groundMirrorAmount: js.UndefOr[Double] = js.native
  var groundMirrorBlurKernel: js.UndefOr[Double] = js.native
  var groundMirrorFallOffDistance: js.UndefOr[Double] = js.native
  var groundMirrorFresnelWeight: js.UndefOr[Double] = js.native
  var groundMirrorSizeRatio: js.UndefOr[Double] = js.native
  var groundMirrorTextureType: js.UndefOr[Double] = js.native
  var groundOpacity: js.UndefOr[Double] = js.native
  var groundShadowLevel: js.UndefOr[Double] = js.native
  var groundSize: js.UndefOr[Double] = js.native
  var groundTexture: js.UndefOr[String | BaseTexture] = js.native
  var groundYBias: js.UndefOr[Double] = js.native
  var rootPosition: js.UndefOr[Vector3] = js.native
  var setupImageProcessing: js.UndefOr[Boolean] = js.native
  var sizeAuto: js.UndefOr[Boolean] = js.native
  var skyboxColor: js.UndefOr[Color3] = js.native
  var skyboxSize: js.UndefOr[Double] = js.native
  var skyboxTexture: js.UndefOr[String | BaseTexture] = js.native
  var toneMappingEnabled: js.UndefOr[Boolean] = js.native
}

object PartialIEnvironmentHelper {
  @scala.inline
  def apply(): PartialIEnvironmentHelper = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIEnvironmentHelper]
  }
  @scala.inline
  implicit class PartialIEnvironmentHelperOps[Self <: PartialIEnvironmentHelper] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundYRotation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundYRotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundYRotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundYRotation")(js.undefined)
        ret
    }
    @scala.inline
    def withCameraContrast(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cameraContrast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCameraContrast: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cameraContrast")(js.undefined)
        ret
    }
    @scala.inline
    def withCameraExposure(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cameraExposure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCameraExposure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cameraExposure")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateGround(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createGround")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateGround: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createGround")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateSkybox(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createSkybox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateSkybox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createSkybox")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableGroundMirror(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableGroundMirror")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableGroundMirror: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableGroundMirror")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableGroundShadow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableGroundShadow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableGroundShadow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableGroundShadow")(js.undefined)
        ret
    }
    @scala.inline
    def withEnvironmentTexture(value: String | BaseTexture): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environmentTexture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvironmentTexture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environmentTexture")(js.undefined)
        ret
    }
    @scala.inline
    def withGroundColor(value: Color3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withGroundMirrorAmount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groundMirrorAmount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroundMirrorAmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groundMirrorAmount")(js.undefined)
        ret
    }
    @scala.inline
    def withGroundMirrorBlurKernel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groundMirrorBlurKernel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroundMirrorBlurKernel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groundMirrorBlurKernel")(js.undefined)
        ret
    }
    @scala.inline
    def withGroundMirrorFallOffDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groundMirrorFallOffDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroundMirrorFallOffDistance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groundMirrorFallOffDistance")(js.undefined)
        ret
    }
    @scala.inline
    def withGroundMirrorFresnelWeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groundMirrorFresnelWeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroundMirrorFresnelWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groundMirrorFresnelWeight")(js.undefined)
        ret
    }
    @scala.inline
    def withGroundMirrorSizeRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groundMirrorSizeRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroundMirrorSizeRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groundMirrorSizeRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withGroundMirrorTextureType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groundMirrorTextureType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroundMirrorTextureType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groundMirrorTextureType")(js.undefined)
        ret
    }
    @scala.inline
    def withGroundOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groundOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroundOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groundOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withGroundShadowLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groundShadowLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroundShadowLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groundShadowLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withGroundSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groundSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroundSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groundSize")(js.undefined)
        ret
    }
    @scala.inline
    def withGroundTexture(value: String | BaseTexture): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groundTexture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroundTexture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groundTexture")(js.undefined)
        ret
    }
    @scala.inline
    def withGroundYBias(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groundYBias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroundYBias: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groundYBias")(js.undefined)
        ret
    }
    @scala.inline
    def withRootPosition(value: Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withSetupImageProcessing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setupImageProcessing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetupImageProcessing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setupImageProcessing")(js.undefined)
        ret
    }
    @scala.inline
    def withSizeAuto(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeAuto")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizeAuto: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeAuto")(js.undefined)
        ret
    }
    @scala.inline
    def withSkyboxColor(value: Color3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skyboxColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkyboxColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skyboxColor")(js.undefined)
        ret
    }
    @scala.inline
    def withSkyboxSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skyboxSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkyboxSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skyboxSize")(js.undefined)
        ret
    }
    @scala.inline
    def withSkyboxTexture(value: String | BaseTexture): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skyboxTexture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkyboxTexture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skyboxTexture")(js.undefined)
        ret
    }
    @scala.inline
    def withToneMappingEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toneMappingEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToneMappingEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toneMappingEnabled")(js.undefined)
        ret
    }
  }
  
}

