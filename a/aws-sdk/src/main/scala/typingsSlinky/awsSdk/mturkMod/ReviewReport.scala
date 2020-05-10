package typingsSlinky.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReviewReport extends js.Object {
  /**
    *  A list of ReviewAction objects for each action specified in the Review Policy. 
    */
  var ReviewActions: js.UndefOr[ReviewActionDetailList] = js.native
  /**
    *  A list of ReviewResults objects for each action specified in the Review Policy. 
    */
  var ReviewResults: js.UndefOr[ReviewResultDetailList] = js.native
}

object ReviewReport {
  @scala.inline
  def apply(): ReviewReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReviewReport]
  }
  @scala.inline
  implicit class ReviewReportOps[Self <: ReviewReport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReviewActions(value: ReviewActionDetailList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReviewActions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReviewActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReviewActions")(js.undefined)
        ret
    }
    @scala.inline
    def withReviewResults(value: ReviewResultDetailList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReviewResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReviewResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReviewResults")(js.undefined)
        ret
    }
  }
  
}

