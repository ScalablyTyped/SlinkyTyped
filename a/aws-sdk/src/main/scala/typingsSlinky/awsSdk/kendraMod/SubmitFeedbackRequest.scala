package typingsSlinky.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubmitFeedbackRequest extends js.Object {
  /**
    * Tells Amazon Kendra that a particular search result link was chosen by the user. 
    */
  var ClickFeedbackItems: js.UndefOr[ClickFeedbackList] = js.native
  /**
    * The identifier of the index that was queried.
    */
  var IndexId: typingsSlinky.awsSdk.kendraMod.IndexId = js.native
  /**
    * The identifier of the specific query for which you are submitting feedback. The query ID is returned in the response to the operation.
    */
  var QueryId: typingsSlinky.awsSdk.kendraMod.QueryId = js.native
  /**
    * Provides Amazon Kendra with relevant or not relevant feedback for whether a particular item was relevant to the search.
    */
  var RelevanceFeedbackItems: js.UndefOr[RelevanceFeedbackList] = js.native
}

object SubmitFeedbackRequest {
  @scala.inline
  def apply(IndexId: IndexId, QueryId: QueryId): SubmitFeedbackRequest = {
    val __obj = js.Dynamic.literal(IndexId = IndexId.asInstanceOf[js.Any], QueryId = QueryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubmitFeedbackRequest]
  }
  @scala.inline
  implicit class SubmitFeedbackRequestOps[Self <: SubmitFeedbackRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndexId(value: IndexId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IndexId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueryId(value: QueryId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QueryId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClickFeedbackItems(value: ClickFeedbackList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClickFeedbackItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickFeedbackItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClickFeedbackItems")(js.undefined)
        ret
    }
    @scala.inline
    def withRelevanceFeedbackItems(value: RelevanceFeedbackList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RelevanceFeedbackItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelevanceFeedbackItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RelevanceFeedbackItems")(js.undefined)
        ret
    }
  }
  
}

