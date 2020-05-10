package typingsSlinky.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCA_ extends js.Object {
  var cA: Boolean = js.native
  var pathLen: Double = js.native
}

object AnonCA_ {
  @scala.inline
  def apply(cA: Boolean, pathLen: Double): AnonCA_ = {
    val __obj = js.Dynamic.literal(cA = cA.asInstanceOf[js.Any], pathLen = pathLen.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCA_]
  }
  @scala.inline
  implicit class AnonCA_Ops[Self <: AnonCA_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCA(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cA")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPathLen(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathLen")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

