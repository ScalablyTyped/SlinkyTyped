package typingsSlinky.googleapis.v1beta1aMod.pubsubV1beta1a

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for the PullBatch method.
  */
@js.native
trait SchemaPullBatchResponse extends js.Object {
  /**
    * Received Pub/Sub messages or status events. The Pub/Sub system will
    * return zero messages if there are no more messages available in the
    * backlog. The Pub/Sub system may return fewer than the max_events
    * requested even if there are more messages available in the backlog.
    */
  var pullResponses: js.UndefOr[js.Array[SchemaPullResponse]] = js.native
}

object SchemaPullBatchResponse {
  @scala.inline
  def apply(): SchemaPullBatchResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPullBatchResponse]
  }
  @scala.inline
  implicit class SchemaPullBatchResponseOps[Self <: SchemaPullBatchResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPullResponses(value: js.Array[SchemaPullResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullResponses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPullResponses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullResponses")(js.undefined)
        ret
    }
  }
  
}

