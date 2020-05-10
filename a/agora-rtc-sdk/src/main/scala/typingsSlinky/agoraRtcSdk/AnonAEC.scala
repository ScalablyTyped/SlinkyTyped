package typingsSlinky.agoraRtcSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAEC extends js.Object {
  /**
    * Marks whether to enable acoustic echo cancellation.
    *
    * The default value is `true` (enable). If you wish not to enable the  acoustic echo cancellation, set `AEC` as `false`.
    *
    * **Note:**
    *
    * Safari does not support this setting.
    */
  var AEC: js.UndefOr[Boolean] = js.native
  /**
    * Marks whether to enable audio gain control.
    *
    * The default value is `true` (enable). If you wish not to enable the audio gain control, set `AGC` as `false`.
    *
    * **Note:**
    *
    * Safari does not support this setting.
    */
  var AGC: js.UndefOr[Boolean] = js.native
  /**
    * Marks whether to enable automatic noise suppression.
    *
    * The default value is `true` (enable). If you wish not to enable automatic noise suppression, set `ANS` as `false`.
    *
    * **Note:**
    *
    * - Safari does not support this setting.
    * - Noise suppression is always enabled on Firefox. Setting `ANS` as `false` does not take effect on Firefox.
    */
  var ANS: js.UndefOr[Boolean] = js.native
}

object AnonAEC {
  @scala.inline
  def apply(): AnonAEC = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAEC]
  }
  @scala.inline
  implicit class AnonAECOps[Self <: AnonAEC] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAEC(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AEC")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAEC: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AEC")(js.undefined)
        ret
    }
    @scala.inline
    def withAGC(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AGC")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAGC: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AGC")(js.undefined)
        ret
    }
    @scala.inline
    def withANS(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ANS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutANS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ANS")(js.undefined)
        ret
    }
  }
  
}

