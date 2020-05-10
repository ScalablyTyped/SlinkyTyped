package typingsSlinky.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListJobMessagesResponse extends js.Object {
  /** Autoscaling events in ascending timestamp order. */
  var autoscalingEvents: js.UndefOr[js.Array[AutoscalingEvent]] = js.native
  /** Messages in ascending timestamp order. */
  var jobMessages: js.UndefOr[js.Array[JobMessage]] = js.native
  /** The token to obtain the next page of results if there are more. */
  var nextPageToken: js.UndefOr[String] = js.native
}

object ListJobMessagesResponse {
  @scala.inline
  def apply(): ListJobMessagesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListJobMessagesResponse]
  }
  @scala.inline
  implicit class ListJobMessagesResponseOps[Self <: ListJobMessagesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoscalingEvents(value: js.Array[AutoscalingEvent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoscalingEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoscalingEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoscalingEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withJobMessages(value: js.Array[JobMessage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobMessages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobMessages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobMessages")(js.undefined)
        ret
    }
    @scala.inline
    def withNextPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(js.undefined)
        ret
    }
  }
  
}

