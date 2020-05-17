package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NullEngineOptions extends js.Object {
  /**
    * If delta time between frames should be constant
    * @see https://doc.babylonjs.com/babylon101/animations#deterministic-lockstep
    */
  var deterministicLockstep: Boolean = js.native
  /**
    * Maximum about of steps between frames (Default: 4)
    * @see https://doc.babylonjs.com/babylon101/animations#deterministic-lockstep
    */
  var lockstepMaxSteps: Double = js.native
  /**
    * Render height (Default: 256)
    */
  var renderHeight: Double = js.native
  /**
    * Render width (Default: 512)
    */
  var renderWidth: Double = js.native
  /**
    * Texture size (Default: 512)
    */
  var textureSize: Double = js.native
}

object NullEngineOptions {
  @scala.inline
  def apply(
    deterministicLockstep: Boolean,
    lockstepMaxSteps: Double,
    renderHeight: Double,
    renderWidth: Double,
    textureSize: Double
  ): NullEngineOptions = {
    val __obj = js.Dynamic.literal(deterministicLockstep = deterministicLockstep.asInstanceOf[js.Any], lockstepMaxSteps = lockstepMaxSteps.asInstanceOf[js.Any], renderHeight = renderHeight.asInstanceOf[js.Any], renderWidth = renderWidth.asInstanceOf[js.Any], textureSize = textureSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[NullEngineOptions]
  }
  @scala.inline
  implicit class NullEngineOptionsOps[Self <: NullEngineOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeterministicLockstep(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deterministicLockstep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLockstepMaxSteps(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockstepMaxSteps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextureSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textureSize")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

