package typingsSlinky.firebaseAdmin.admin.messaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents settings to control notification LED that can be included in
  * {@link admin.messaging.AndroidNotification}.
  */
@js.native
trait LightSettings extends js.Object {
  /**
    * Required. Sets color of the LED in `#rrggbb` or `#rrggbbaa` format.
    */
  var color: String = js.native
  /**
    * Required. Along with `light_on_duration`, defines the blink rate of LED flashes.
    */
  var lightOffDurationMillis: Double = js.native
  /**
    * Required. Along with `light_off_duration`, defines the blink rate of LED flashes.
    */
  var lightOnDurationMillis: Double = js.native
}

object LightSettings {
  @scala.inline
  def apply(color: String, lightOffDurationMillis: Double, lightOnDurationMillis: Double): LightSettings = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], lightOffDurationMillis = lightOffDurationMillis.asInstanceOf[js.Any], lightOnDurationMillis = lightOnDurationMillis.asInstanceOf[js.Any])
    __obj.asInstanceOf[LightSettings]
  }
  @scala.inline
  implicit class LightSettingsOps[Self <: LightSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLightOffDurationMillis(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lightOffDurationMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLightOnDurationMillis(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lightOnDurationMillis")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

