package typingsSlinky.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClickFeedback extends js.Object {
  /**
    * The Unix timestamp of the data and time that the result was clicked.
    */
  var ClickTime: js.Date = js.native
  /**
    * The unique identifier of the search result that was clicked.
    */
  var ResultId: typingsSlinky.awsSdk.kendraMod.ResultId = js.native
}

object ClickFeedback {
  @scala.inline
  def apply(ClickTime: js.Date, ResultId: ResultId): ClickFeedback = {
    val __obj = js.Dynamic.literal(ClickTime = ClickTime.asInstanceOf[js.Any], ResultId = ResultId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClickFeedback]
  }
  @scala.inline
  implicit class ClickFeedbackOps[Self <: ClickFeedback] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClickTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClickTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResultId(value: ResultId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResultId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

