package typingsSlinky.materialTabIndicator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonACTIVE extends js.Object {
  var ACTIVE: String = js.native
  var FADE: String = js.native
  var NO_TRANSITION: String = js.native
}

object AnonACTIVE {
  @scala.inline
  def apply(ACTIVE: String, FADE: String, NO_TRANSITION: String): AnonACTIVE = {
    val __obj = js.Dynamic.literal(ACTIVE = ACTIVE.asInstanceOf[js.Any], FADE = FADE.asInstanceOf[js.Any], NO_TRANSITION = NO_TRANSITION.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonACTIVE]
  }
  @scala.inline
  implicit class AnonACTIVEOps[Self <: AnonACTIVE] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withACTIVE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ACTIVE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFADE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FADE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNO_TRANSITION(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NO_TRANSITION")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

