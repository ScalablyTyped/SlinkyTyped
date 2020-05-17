package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimationPropertiesOverride extends js.Object {
  /**
    * Gets or sets the blending speed to use when enableBlending is true
    */
  var blendingSpeed: Double = js.native
  /**
    * Gets or sets a value indicating if animation blending must be used
    */
  var enableBlending: Boolean = js.native
  /**
    * Gets or sets the default loop mode to use
    */
  var loopMode: Double = js.native
}

object AnimationPropertiesOverride {
  @scala.inline
  def apply(blendingSpeed: Double, enableBlending: Boolean, loopMode: Double): AnimationPropertiesOverride = {
    val __obj = js.Dynamic.literal(blendingSpeed = blendingSpeed.asInstanceOf[js.Any], enableBlending = enableBlending.asInstanceOf[js.Any], loopMode = loopMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationPropertiesOverride]
  }
  @scala.inline
  implicit class AnimationPropertiesOverrideOps[Self <: AnimationPropertiesOverride] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlendingSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blendingSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableBlending(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableBlending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoopMode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loopMode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

