package typingsSlinky.agoraRtcSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLighteningContrastLevel extends js.Object {
  /**
    * The contrast level, used with the `lighteningLevel` parameter.
    *
    * - 0: Low contrast level.
    * - 1: (Default) The original contrast level.
    * - 2: High contrast level.
    */
  var lighteningContrastLevel: js.UndefOr[Double] = js.native
  /**
    * The brightness level.
    *
    * The value ranges from 0.0 (original) to 1.0. The default value is 0.7.
    */
  var lighteningLevel: js.UndefOr[Double] = js.native
  /**
    * The redness level.
    *
    * The value ranges from 0.0 (original) to 1.0. The default value is 0.1. This parameter adjusts the red saturation level.
    */
  var rednessLevel: js.UndefOr[Double] = js.native
  /**
    * The sharpness level.
    *
    * The value ranges from 0.0 (original) to 1.0. The default value is 0.5. This parameter is usually used to remove blemishes.
    */
  var smoothnessLevel: js.UndefOr[Double] = js.native
}

object AnonLighteningContrastLevel {
  @scala.inline
  def apply(): AnonLighteningContrastLevel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonLighteningContrastLevel]
  }
  @scala.inline
  implicit class AnonLighteningContrastLevelOps[Self <: AnonLighteningContrastLevel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLighteningContrastLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lighteningContrastLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLighteningContrastLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lighteningContrastLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withLighteningLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lighteningLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLighteningLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lighteningLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withRednessLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rednessLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRednessLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rednessLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withSmoothnessLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smoothnessLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmoothnessLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smoothnessLevel")(js.undefined)
        ret
    }
  }
  
}

