package typingsSlinky.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIssue extends js.Object {
  var issue: js.UndefOr[js.Array[AnonIssueDisplayNumber]] = js.native
  var orderNumber: js.UndefOr[Double] = js.native
  var seriesBookType: js.UndefOr[String] = js.native
  var seriesId: js.UndefOr[String] = js.native
}

object AnonIssue {
  @scala.inline
  def apply(): AnonIssue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonIssue]
  }
  @scala.inline
  implicit class AnonIssueOps[Self <: AnonIssue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIssue(value: js.Array[AnonIssueDisplayNumber]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIssue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issue")(js.undefined)
        ret
    }
    @scala.inline
    def withOrderNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrderNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withSeriesBookType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesBookType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeriesBookType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesBookType")(js.undefined)
        ret
    }
    @scala.inline
    def withSeriesId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeriesId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesId")(js.undefined)
        ret
    }
  }
  
}

