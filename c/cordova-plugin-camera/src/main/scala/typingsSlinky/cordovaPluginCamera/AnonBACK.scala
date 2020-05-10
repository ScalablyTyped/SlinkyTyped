package typingsSlinky.cordovaPluginCamera

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBACK extends js.Object {
  var BACK: Double = js.native
  var FRONT: Double = js.native
}

object AnonBACK {
  @scala.inline
  def apply(BACK: Double, FRONT: Double): AnonBACK = {
    val __obj = js.Dynamic.literal(BACK = BACK.asInstanceOf[js.Any], FRONT = FRONT.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBACK]
  }
  @scala.inline
  implicit class AnonBACKOps[Self <: AnonBACK] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBACK(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BACK")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFRONT(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FRONT")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

