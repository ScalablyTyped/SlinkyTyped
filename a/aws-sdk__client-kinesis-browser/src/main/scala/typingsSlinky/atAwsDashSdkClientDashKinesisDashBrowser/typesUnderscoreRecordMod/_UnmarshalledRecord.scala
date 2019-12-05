package typingsSlinky.atAwsDashSdkClientDashKinesisDashBrowser.typesUnderscoreRecordMod

import typingsSlinky.atAwsDashSdkClientDashKinesisDashBrowser.atAwsDashSdkClientDashKinesisDashBrowserStrings.KMS
import typingsSlinky.atAwsDashSdkClientDashKinesisDashBrowser.atAwsDashSdkClientDashKinesisDashBrowserStrings.NONE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledRecord extends _Record {
  /**
    * <p>The approximate time that the record was inserted into the stream.</p>
    */
  @JSName("ApproximateArrivalTimestamp")
  var ApproximateArrivalTimestamp__UnmarshalledRecord: js.UndefOr[js.Date] = js.undefined
  /**
    * <p>The data blob. The data in the blob is both opaque and immutable to Kinesis Data Streams, which does not inspect, interpret, or change the data in the blob in any way. When the data blob (the payload before base64-encoding) is added to the partition key size, the total size must not exceed the maximum record size (1 MB).</p>
    */
  @JSName("Data")
  var Data__UnmarshalledRecord: scala.scalajs.js.typedarray.Uint8Array
}

object _UnmarshalledRecord {
  @scala.inline
  def apply(
    Data: scala.scalajs.js.typedarray.Uint8Array,
    PartitionKey: String,
    SequenceNumber: String,
    ApproximateArrivalTimestamp: js.Date = null,
    EncryptionType: NONE | KMS | String = null
  ): _UnmarshalledRecord = {
    val __obj = js.Dynamic.literal(Data = Data.asInstanceOf[js.Any], PartitionKey = PartitionKey.asInstanceOf[js.Any], SequenceNumber = SequenceNumber.asInstanceOf[js.Any])
    if (ApproximateArrivalTimestamp != null) __obj.updateDynamic("ApproximateArrivalTimestamp")(ApproximateArrivalTimestamp.asInstanceOf[js.Any])
    if (EncryptionType != null) __obj.updateDynamic("EncryptionType")(EncryptionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledRecord]
  }
}

