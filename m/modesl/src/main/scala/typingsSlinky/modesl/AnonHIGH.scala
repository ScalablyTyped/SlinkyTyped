package typingsSlinky.modesl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHIGH extends js.Object {
  var HIGH: String = js.native
  var LOW: String = js.native
  var NORMAL: String = js.native
}

object AnonHIGH {
  @scala.inline
  def apply(HIGH: String, LOW: String, NORMAL: String): AnonHIGH = {
    val __obj = js.Dynamic.literal(HIGH = HIGH.asInstanceOf[js.Any], LOW = LOW.asInstanceOf[js.Any], NORMAL = NORMAL.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHIGH]
  }
  @scala.inline
  implicit class AnonHIGHOps[Self <: AnonHIGH] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHIGH(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HIGH")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLOW(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LOW")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNORMAL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NORMAL")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

