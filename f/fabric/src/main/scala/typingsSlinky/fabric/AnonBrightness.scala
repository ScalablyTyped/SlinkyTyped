package typingsSlinky.fabric

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBrightness extends js.Object {
  /**
  			 * Value to brighten the image up (0..255)
  			 * @default 0
  			 */
  var brightness: Double = js.native
}

object AnonBrightness {
  @scala.inline
  def apply(brightness: Double): AnonBrightness = {
    val __obj = js.Dynamic.literal(brightness = brightness.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBrightness]
  }
  @scala.inline
  implicit class AnonBrightnessOps[Self <: AnonBrightness] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBrightness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brightness")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

