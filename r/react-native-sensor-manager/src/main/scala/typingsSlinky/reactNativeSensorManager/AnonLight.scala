package typingsSlinky.reactNativeSensorManager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLight extends js.Object {
  var light: Double = js.native
}

object AnonLight {
  @scala.inline
  def apply(light: Double): AnonLight = {
    val __obj = js.Dynamic.literal(light = light.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLight]
  }
  @scala.inline
  implicit class AnonLightOps[Self <: AnonLight] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("light")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

