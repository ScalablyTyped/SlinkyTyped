package typingsSlinky.awsSdkClientKinesisBrowser.typesSubscribeToShardEventStreamMod

import typingsSlinky.awsSdkClientKinesisBrowser.typesSubscribeToShardEventMod.UnmarshalledSubscribeToShardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledSubscribeToShardEventStream extends SubscribeToShardEventStream {
  /**
    * <p>After you call <a>SubscribeToShard</a>, Kinesis Data Streams sends events of this type to your consumer. </p>
    */
  @JSName("SubscribeToShardEvent")
  var SubscribeToShardEvent_UnmarshalledSubscribeToShardEventStream: UnmarshalledSubscribeToShardEvent = js.native
}

object UnmarshalledSubscribeToShardEventStream {
  @scala.inline
  def apply(SubscribeToShardEvent: UnmarshalledSubscribeToShardEvent): UnmarshalledSubscribeToShardEventStream = {
    val __obj = js.Dynamic.literal(SubscribeToShardEvent = SubscribeToShardEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledSubscribeToShardEventStream]
  }
  @scala.inline
  implicit class UnmarshalledSubscribeToShardEventStreamOps[Self <: UnmarshalledSubscribeToShardEventStream] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSubscribeToShardEvent(value: UnmarshalledSubscribeToShardEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubscribeToShardEvent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

