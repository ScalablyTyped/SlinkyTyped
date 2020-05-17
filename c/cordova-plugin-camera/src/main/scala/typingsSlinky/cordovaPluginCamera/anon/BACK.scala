package typingsSlinky.cordovaPluginCamera.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BACK extends js.Object {
  var BACK: Double = js.native
  var FRONT: Double = js.native
}

object BACK {
  @scala.inline
  def apply(BACK: Double, FRONT: Double): BACK = {
    val __obj = js.Dynamic.literal(BACK = BACK.asInstanceOf[js.Any], FRONT = FRONT.asInstanceOf[js.Any])
    __obj.asInstanceOf[BACK]
  }
  @scala.inline
  implicit class BACKOps[Self <: BACK] (val x: Self) extends AnyVal {
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

