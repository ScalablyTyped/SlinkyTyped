package typingsSlinky.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WatchCreativeRequest extends js.Object {
  /**
    * The Pub/Sub topic to publish notifications to.
    * This topic must already exist and must give permission to
    * ad-exchange-buyside-reports@google.com to write to the topic.
    * This should be the full resource name in
    * "projects/{project_id}/topics/{topic_id}" format.
    */
  var topic: js.UndefOr[String] = js.native
}

object WatchCreativeRequest {
  @scala.inline
  def apply(): WatchCreativeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WatchCreativeRequest]
  }
  @scala.inline
  implicit class WatchCreativeRequestOps[Self <: WatchCreativeRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTopic(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topic")(js.undefined)
        ret
    }
  }
  
}

