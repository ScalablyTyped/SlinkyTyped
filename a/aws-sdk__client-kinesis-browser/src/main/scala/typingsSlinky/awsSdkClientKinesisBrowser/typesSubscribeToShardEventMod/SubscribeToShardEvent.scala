package typingsSlinky.awsSdkClientKinesisBrowser.typesSubscribeToShardEventMod

import typingsSlinky.awsSdkClientKinesisBrowser.typesRecordMod.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscribeToShardEvent extends js.Object {
  /**
    * <p>Use this as <code>StartingSequenceNumber</code> in the next call to <a>SubscribeToShard</a>.</p>
    */
  var ContinuationSequenceNumber: String = js.native
  /**
    * <p>The number of milliseconds the read records are from the tip of the stream, indicating how far behind current time the consumer is. A value of zero indicates that record processing is caught up, and there are no new records to process at this moment.</p>
    */
  var MillisBehindLatest: Double = js.native
  /**
    * <p/>
    */
  var Records: js.Array[Record] | js.Iterable[Record] = js.native
}

object SubscribeToShardEvent {
  @scala.inline
  def apply(
    ContinuationSequenceNumber: String,
    MillisBehindLatest: Double,
    Records: js.Array[Record] | js.Iterable[Record]
  ): SubscribeToShardEvent = {
    val __obj = js.Dynamic.literal(ContinuationSequenceNumber = ContinuationSequenceNumber.asInstanceOf[js.Any], MillisBehindLatest = MillisBehindLatest.asInstanceOf[js.Any], Records = Records.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscribeToShardEvent]
  }
  @scala.inline
  implicit class SubscribeToShardEventOps[Self <: SubscribeToShardEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContinuationSequenceNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContinuationSequenceNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMillisBehindLatest(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MillisBehindLatest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecordsIterable(value: js.Iterable[Record]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Records")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecords(value: js.Array[Record] | js.Iterable[Record]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Records")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

