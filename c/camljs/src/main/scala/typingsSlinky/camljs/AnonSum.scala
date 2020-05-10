package typingsSlinky.camljs

import typingsSlinky.camljs.mod.Aggregation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSum extends Aggregation {
  var sum: String = js.native
}

object AnonSum {
  @scala.inline
  def apply(sum: String): AnonSum = {
    val __obj = js.Dynamic.literal(sum = sum.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSum]
  }
  @scala.inline
  implicit class AnonSumOps[Self <: AnonSum] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSum(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sum")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

