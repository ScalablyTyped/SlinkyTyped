package typingsSlinky.instagramPrivateApi.reelsTrayFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReelsTrayFeedResponsePollSticker extends js.Object {
  
  var finished: Boolean = js.native
  
  var id: String = js.native
  
  var is_shared_result: Boolean = js.native
  
  var poll_id: String = js.native
  
  var promotion_tallies: Null = js.native
  
  var question: String = js.native
  
  var tallies: js.Array[ReelsTrayFeedResponseTalliesItem] = js.native
  
  var viewer_can_vote: Boolean = js.native
}
object ReelsTrayFeedResponsePollSticker {
  
  @scala.inline
  def apply(
    finished: Boolean,
    id: String,
    is_shared_result: Boolean,
    poll_id: String,
    promotion_tallies: Null,
    question: String,
    tallies: js.Array[ReelsTrayFeedResponseTalliesItem],
    viewer_can_vote: Boolean
  ): ReelsTrayFeedResponsePollSticker = {
    val __obj = js.Dynamic.literal(finished = finished.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], is_shared_result = is_shared_result.asInstanceOf[js.Any], poll_id = poll_id.asInstanceOf[js.Any], promotion_tallies = promotion_tallies.asInstanceOf[js.Any], question = question.asInstanceOf[js.Any], tallies = tallies.asInstanceOf[js.Any], viewer_can_vote = viewer_can_vote.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReelsTrayFeedResponsePollSticker]
  }
  
  @scala.inline
  implicit class ReelsTrayFeedResponsePollStickerOps[Self <: ReelsTrayFeedResponsePollSticker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFinished(value: Boolean): Self = this.set("finished", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_shared_result(value: Boolean): Self = this.set("is_shared_result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoll_id(value: String): Self = this.set("poll_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromotion_tallies(value: Null): Self = this.set("promotion_tallies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuestion(value: String): Self = this.set("question", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTalliesVarargs(value: ReelsTrayFeedResponseTalliesItem*): Self = this.set("tallies", js.Array(value :_*))
    
    @scala.inline
    def setTallies(value: js.Array[ReelsTrayFeedResponseTalliesItem]): Self = this.set("tallies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewer_can_vote(value: Boolean): Self = this.set("viewer_can_vote", value.asInstanceOf[js.Any])
  }
}
