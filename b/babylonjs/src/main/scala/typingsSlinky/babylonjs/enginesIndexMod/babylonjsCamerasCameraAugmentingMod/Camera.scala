package typingsSlinky.babylonjs.enginesIndexMod.babylonjsCamerasCameraAugmentingMod

import typingsSlinky.babylonjs.renderTargetTextureMod.RenderTargetTexture
import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Camera extends js.Object {
  /**
    * @hidden
    * For cameras that cannot use multiview images to display directly. (e.g. webVR camera will render to multiview texture, then copy to each eye texture and go from there)
    */
  var _multiviewTexture: Nullable[RenderTargetTexture] = js.native
  /**
    * @hidden
    * For cameras that cannot use multiview images to display directly. (e.g. webVR camera will render to multiview texture, then copy to each eye texture and go from there)
    */
  var _useMultiviewToSingleView: Boolean = js.native
  /**
    * @hidden
    * ensures the multiview texture of the camera exists and has the specified width/height
    * @param width height to set on the multiview texture
    * @param height width to set on the multiview texture
    */
  def _resizeOrCreateMultiviewTexture(width: Double, height: Double): Unit = js.native
}

object Camera {
  @scala.inline
  def apply(_resizeOrCreateMultiviewTexture: (Double, Double) => Unit, _useMultiviewToSingleView: Boolean): Camera = {
    val __obj = js.Dynamic.literal(_resizeOrCreateMultiviewTexture = js.Any.fromFunction2(_resizeOrCreateMultiviewTexture), _useMultiviewToSingleView = _useMultiviewToSingleView.asInstanceOf[js.Any])
    __obj.asInstanceOf[Camera]
  }
  @scala.inline
  implicit class CameraOps[Self <: Camera] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_resizeOrCreateMultiviewTexture(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_resizeOrCreateMultiviewTexture")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def with_useMultiviewToSingleView(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_useMultiviewToSingleView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_multiviewTexture(value: Nullable[RenderTargetTexture]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_multiviewTexture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_multiviewTextureNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_multiviewTexture")(null)
        ret
    }
  }
  
}

