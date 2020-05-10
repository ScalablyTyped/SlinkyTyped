package typingsSlinky.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonXZHO2 extends js.Object {
  var XZHO2: Anon29 = js.native
  var ZHO2: Anon28 = js.native
  var ZO: AnonFatigue = js.native
}

object AnonXZHO2 {
  @scala.inline
  def apply(XZHO2: Anon29, ZHO2: Anon28, ZO: AnonFatigue): AnonXZHO2 = {
    val __obj = js.Dynamic.literal(XZHO2 = XZHO2.asInstanceOf[js.Any], ZHO2 = ZHO2.asInstanceOf[js.Any], ZO = ZO.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonXZHO2]
  }
  @scala.inline
  implicit class AnonXZHO2Ops[Self <: AnonXZHO2] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withXZHO2(value: Anon29): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("XZHO2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZHO2(value: Anon28): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ZHO2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZO(value: AnonFatigue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ZO")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

