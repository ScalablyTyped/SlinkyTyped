package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StaticImageDeactivateScheduleActionSettings extends js.Object {
  /**
    * The time in milliseconds for the image to fade out. Default is 0 (no fade-out).
    */
  var FadeOut: js.UndefOr[integerMin0] = js.native
  /**
    * The image overlay layer to deactivate, 0 to 7. Default is 0.
    */
  var Layer: js.UndefOr[integerMin0Max7] = js.native
}

object StaticImageDeactivateScheduleActionSettings {
  @scala.inline
  def apply(): StaticImageDeactivateScheduleActionSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StaticImageDeactivateScheduleActionSettings]
  }
  @scala.inline
  implicit class StaticImageDeactivateScheduleActionSettingsOps[Self <: StaticImageDeactivateScheduleActionSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFadeOut(value: integerMin0): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FadeOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFadeOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FadeOut")(js.undefined)
        ret
    }
    @scala.inline
    def withLayer(value: integerMin0Max7): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Layer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Layer")(js.undefined)
        ret
    }
  }
  
}

