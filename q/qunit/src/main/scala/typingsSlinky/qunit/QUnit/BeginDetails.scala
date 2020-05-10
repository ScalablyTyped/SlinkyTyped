package typingsSlinky.qunit.QUnit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BeginDetails extends js.Object {
  var totalTests: Double = js.native
}

object BeginDetails {
  @scala.inline
  def apply(totalTests: Double): BeginDetails = {
    val __obj = js.Dynamic.literal(totalTests = totalTests.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeginDetails]
  }
  @scala.inline
  implicit class BeginDetailsOps[Self <: BeginDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTotalTests(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalTests")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

