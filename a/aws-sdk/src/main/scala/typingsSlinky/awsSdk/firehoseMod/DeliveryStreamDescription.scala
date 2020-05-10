package typingsSlinky.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeliveryStreamDescription extends js.Object {
  /**
    * The date and time that the delivery stream was created.
    */
  var CreateTimestamp: js.UndefOr[js.Date] = js.native
  /**
    * The Amazon Resource Name (ARN) of the delivery stream. For more information, see Amazon Resource Names (ARNs) and AWS Service Namespaces.
    */
  var DeliveryStreamARN: typingsSlinky.awsSdk.firehoseMod.DeliveryStreamARN = js.native
  /**
    * Indicates the server-side encryption (SSE) status for the delivery stream.
    */
  var DeliveryStreamEncryptionConfiguration: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.DeliveryStreamEncryptionConfiguration] = js.native
  /**
    * The name of the delivery stream.
    */
  var DeliveryStreamName: typingsSlinky.awsSdk.firehoseMod.DeliveryStreamName = js.native
  /**
    * The status of the delivery stream. If the status of a delivery stream is CREATING_FAILED, this status doesn't change, and you can't invoke CreateDeliveryStream again on it. However, you can invoke the DeleteDeliveryStream operation to delete it.
    */
  var DeliveryStreamStatus: typingsSlinky.awsSdk.firehoseMod.DeliveryStreamStatus = js.native
  /**
    * The delivery stream type. This can be one of the following values:    DirectPut: Provider applications access the delivery stream directly.    KinesisStreamAsSource: The delivery stream uses a Kinesis data stream as a source.  
    */
  var DeliveryStreamType: typingsSlinky.awsSdk.firehoseMod.DeliveryStreamType = js.native
  /**
    * The destinations.
    */
  var Destinations: DestinationDescriptionList = js.native
  /**
    * Provides details in case one of the following operations fails due to an error related to KMS: CreateDeliveryStream, DeleteDeliveryStream, StartDeliveryStreamEncryption, StopDeliveryStreamEncryption.
    */
  var FailureDescription: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.FailureDescription] = js.native
  /**
    * Indicates whether there are more destinations available to list.
    */
  var HasMoreDestinations: BooleanObject = js.native
  /**
    * The date and time that the delivery stream was last updated.
    */
  var LastUpdateTimestamp: js.UndefOr[js.Date] = js.native
  /**
    * If the DeliveryStreamType parameter is KinesisStreamAsSource, a SourceDescription object describing the source Kinesis data stream.
    */
  var Source: js.UndefOr[SourceDescription] = js.native
  /**
    * Each time the destination is updated for a delivery stream, the version ID is changed, and the current version ID is required when updating the destination. This is so that the service knows it is applying the changes to the correct version of the delivery stream.
    */
  var VersionId: DeliveryStreamVersionId = js.native
}

object DeliveryStreamDescription {
  @scala.inline
  def apply(
    DeliveryStreamARN: DeliveryStreamARN,
    DeliveryStreamName: DeliveryStreamName,
    DeliveryStreamStatus: DeliveryStreamStatus,
    DeliveryStreamType: DeliveryStreamType,
    Destinations: DestinationDescriptionList,
    HasMoreDestinations: BooleanObject,
    VersionId: DeliveryStreamVersionId
  ): DeliveryStreamDescription = {
    val __obj = js.Dynamic.literal(DeliveryStreamARN = DeliveryStreamARN.asInstanceOf[js.Any], DeliveryStreamName = DeliveryStreamName.asInstanceOf[js.Any], DeliveryStreamStatus = DeliveryStreamStatus.asInstanceOf[js.Any], DeliveryStreamType = DeliveryStreamType.asInstanceOf[js.Any], Destinations = Destinations.asInstanceOf[js.Any], HasMoreDestinations = HasMoreDestinations.asInstanceOf[js.Any], VersionId = VersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeliveryStreamDescription]
  }
  @scala.inline
  implicit class DeliveryStreamDescriptionOps[Self <: DeliveryStreamDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeliveryStreamARN(value: DeliveryStreamARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeliveryStreamARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeliveryStreamName(value: DeliveryStreamName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeliveryStreamName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeliveryStreamStatus(value: DeliveryStreamStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeliveryStreamStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeliveryStreamType(value: DeliveryStreamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeliveryStreamType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestinations(value: DestinationDescriptionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Destinations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasMoreDestinations(value: BooleanObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HasMoreDestinations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersionId(value: DeliveryStreamVersionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VersionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withDeliveryStreamEncryptionConfiguration(value: DeliveryStreamEncryptionConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeliveryStreamEncryptionConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeliveryStreamEncryptionConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeliveryStreamEncryptionConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withFailureDescription(value: FailureDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailureDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailureDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailureDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withLastUpdateTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastUpdateTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdateTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastUpdateTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: SourceDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Source")(js.undefined)
        ret
    }
  }
  
}

