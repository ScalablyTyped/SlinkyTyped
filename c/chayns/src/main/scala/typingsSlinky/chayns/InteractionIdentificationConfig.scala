package typingsSlinky.chayns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// chayns.startInteractionIdentification()
@js.native
trait InteractionIdentificationConfig extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.native
  var callback: js.Any = js.native
  var delay: js.UndefOr[Double] = js.native
  var duration: Double = js.native
  var foregroundColor: String = js.native
  var resetOnInteraction: js.UndefOr[Boolean] = js.native
}

object InteractionIdentificationConfig {
  @scala.inline
  def apply(callback: js.Any, duration: Double, foregroundColor: String): InteractionIdentificationConfig = {
    val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], foregroundColor = foregroundColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractionIdentificationConfig]
  }
  @scala.inline
  implicit class InteractionIdentificationConfigOps[Self <: InteractionIdentificationConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallback(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForegroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foregroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(js.undefined)
        ret
    }
    @scala.inline
    def withResetOnInteraction(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetOnInteraction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResetOnInteraction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetOnInteraction")(js.undefined)
        ret
    }
  }
  
}

