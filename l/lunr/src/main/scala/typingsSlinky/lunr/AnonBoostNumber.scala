package typingsSlinky.lunr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBoostNumber extends js.Object {
  var boost: js.UndefOr[Double] = js.native
}

object AnonBoostNumber {
  @scala.inline
  def apply(): AnonBoostNumber = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonBoostNumber]
  }
  @scala.inline
  implicit class AnonBoostNumberOps[Self <: AnonBoostNumber] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBoost(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boost")(js.undefined)
        ret
    }
  }
  
}

