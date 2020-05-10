package typingsSlinky.gapiClientBooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIssueDisplayNumber extends js.Object {
  var issueDisplayNumber: js.UndefOr[String] = js.native
  var issueOrderNumber: js.UndefOr[Double] = js.native
}

object AnonIssueDisplayNumber {
  @scala.inline
  def apply(): AnonIssueDisplayNumber = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonIssueDisplayNumber]
  }
  @scala.inline
  implicit class AnonIssueDisplayNumberOps[Self <: AnonIssueDisplayNumber] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIssueDisplayNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issueDisplayNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIssueDisplayNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issueDisplayNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withIssueOrderNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issueOrderNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIssueOrderNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issueOrderNumber")(js.undefined)
        ret
    }
  }
  
}

