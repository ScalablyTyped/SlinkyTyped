package typingsSlinky.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonUH extends js.Object {
  var UH: AnonAttack = js.native
  var UH2O: Anon24 = js.native
  var XUH2O: Anon25 = js.native
}

object AnonUH {
  @scala.inline
  def apply(UH: AnonAttack, UH2O: Anon24, XUH2O: Anon25): AnonUH = {
    val __obj = js.Dynamic.literal(UH = UH.asInstanceOf[js.Any], UH2O = UH2O.asInstanceOf[js.Any], XUH2O = XUH2O.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonUH]
  }
  @scala.inline
  implicit class AnonUHOps[Self <: AnonUH] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUH(value: AnonAttack): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UH")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUH2O(value: Anon24): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UH2O")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXUH2O(value: Anon25): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("XUH2O")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

