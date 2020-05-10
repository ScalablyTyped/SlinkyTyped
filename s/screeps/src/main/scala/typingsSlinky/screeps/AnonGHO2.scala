package typingsSlinky.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGHO2 extends js.Object {
  var GHO2: Anon30 = js.native
  var GO: AnonDamage = js.native
  var XGHO2: Anon31 = js.native
}

object AnonGHO2 {
  @scala.inline
  def apply(GHO2: Anon30, GO: AnonDamage, XGHO2: Anon31): AnonGHO2 = {
    val __obj = js.Dynamic.literal(GHO2 = GHO2.asInstanceOf[js.Any], GO = GO.asInstanceOf[js.Any], XGHO2 = XGHO2.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGHO2]
  }
  @scala.inline
  implicit class AnonGHO2Ops[Self <: AnonGHO2] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGHO2(value: Anon30): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GHO2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGO(value: AnonDamage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GO")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXGHO2(value: Anon31): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("XGHO2")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

