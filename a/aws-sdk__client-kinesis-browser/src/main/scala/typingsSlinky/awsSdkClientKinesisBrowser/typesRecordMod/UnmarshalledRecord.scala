package typingsSlinky.awsSdkClientKinesisBrowser.typesRecordMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledRecord extends Record {
  /**
    * <p>The approximate time that the record was inserted into the stream.</p>
    */
  @JSName("ApproximateArrivalTimestamp")
  var ApproximateArrivalTimestamp_UnmarshalledRecord: js.UndefOr[js.Date] = js.native
  /**
    * <p>The data blob. The data in the blob is both opaque and immutable to Kinesis Data Streams, which does not inspect, interpret, or change the data in the blob in any way. When the data blob (the payload before base64-encoding) is added to the partition key size, the total size must not exceed the maximum record size (1 MB).</p>
    */
  @JSName("Data")
  var Data_UnmarshalledRecord: js.typedarray.Uint8Array = js.native
}

object UnmarshalledRecord {
  @scala.inline
  def apply(Data: js.typedarray.Uint8Array, PartitionKey: String, SequenceNumber: String): UnmarshalledRecord = {
    val __obj = js.Dynamic.literal(Data = Data.asInstanceOf[js.Any], PartitionKey = PartitionKey.asInstanceOf[js.Any], SequenceNumber = SequenceNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledRecord]
  }
  @scala.inline
  implicit class UnmarshalledRecordOps[Self <: UnmarshalledRecord] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApproximateArrivalTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApproximateArrivalTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApproximateArrivalTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApproximateArrivalTimestamp")(js.undefined)
        ret
    }
  }
  
}

