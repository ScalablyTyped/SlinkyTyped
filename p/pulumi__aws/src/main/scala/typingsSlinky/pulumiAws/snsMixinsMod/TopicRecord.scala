package typingsSlinky.pulumiAws.snsMixinsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TopicRecord extends js.Object {
  var EventSource: String = js.native
  var EventSubscriptionArn: String = js.native
  var EventVersion: String = js.native
  var Sns: SNSItem = js.native
}

object TopicRecord {
  @scala.inline
  def apply(EventSource: String, EventSubscriptionArn: String, EventVersion: String, Sns: SNSItem): TopicRecord = {
    val __obj = js.Dynamic.literal(EventSource = EventSource.asInstanceOf[js.Any], EventSubscriptionArn = EventSubscriptionArn.asInstanceOf[js.Any], EventVersion = EventVersion.asInstanceOf[js.Any], Sns = Sns.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicRecord]
  }
  @scala.inline
  implicit class TopicRecordOps[Self <: TopicRecord] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEventSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventSubscriptionArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventSubscriptionArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSns(value: SNSItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sns")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

