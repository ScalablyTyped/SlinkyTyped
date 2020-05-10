package typingsSlinky.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateActionResultsMessage extends js.Object {
  /**
    * Update actions that have been processed successfully
    */
  var ProcessedUpdateActions: js.UndefOr[ProcessedUpdateActionList] = js.native
  /**
    * Update actions that haven't been processed successfully
    */
  var UnprocessedUpdateActions: js.UndefOr[UnprocessedUpdateActionList] = js.native
}

object UpdateActionResultsMessage {
  @scala.inline
  def apply(): UpdateActionResultsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateActionResultsMessage]
  }
  @scala.inline
  implicit class UpdateActionResultsMessageOps[Self <: UpdateActionResultsMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProcessedUpdateActions(value: ProcessedUpdateActionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProcessedUpdateActions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessedUpdateActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProcessedUpdateActions")(js.undefined)
        ret
    }
    @scala.inline
    def withUnprocessedUpdateActions(value: UnprocessedUpdateActionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnprocessedUpdateActions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnprocessedUpdateActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnprocessedUpdateActions")(js.undefined)
        ret
    }
  }
  
}

