package typingsSlinky.reactAlert.mod

import typingsSlinky.reactAlert.reactAlertStrings.fade
import typingsSlinky.reactAlert.reactAlertStrings.scale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transitions_ extends js.Object {
  var FADE: fade = js.native
  var SCALE: scale = js.native
}

object Transitions_ {
  @scala.inline
  def apply(FADE: fade, SCALE: scale): Transitions_ = {
    val __obj = js.Dynamic.literal(FADE = FADE.asInstanceOf[js.Any], SCALE = SCALE.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transitions_]
  }
  @scala.inline
  implicit class Transitions_Ops[Self <: Transitions_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFADE(value: fade): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FADE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSCALE(value: scale): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SCALE")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

