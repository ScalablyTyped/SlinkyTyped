package typingsSlinky.awsSdkClientKinesisBrowser.typesSubscribeToShardEventMod

import typingsSlinky.awsSdkClientKinesisBrowser.typesRecordMod.UnmarshalledRecord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledSubscribeToShardEvent extends SubscribeToShardEvent {
  /**
    * <p/>
    */
  @JSName("Records")
  var Records_UnmarshalledSubscribeToShardEvent: js.Array[UnmarshalledRecord] = js.native
}

object UnmarshalledSubscribeToShardEvent {
  @scala.inline
  def apply(
    ContinuationSequenceNumber: String,
    MillisBehindLatest: Double,
    Records: js.Array[UnmarshalledRecord]
  ): UnmarshalledSubscribeToShardEvent = {
    val __obj = js.Dynamic.literal(ContinuationSequenceNumber = ContinuationSequenceNumber.asInstanceOf[js.Any], MillisBehindLatest = MillisBehindLatest.asInstanceOf[js.Any], Records = Records.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledSubscribeToShardEvent]
  }
  @scala.inline
  implicit class UnmarshalledSubscribeToShardEventOps[Self <: UnmarshalledSubscribeToShardEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRecords(value: js.Array[UnmarshalledRecord]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Records")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

