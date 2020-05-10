package typingsSlinky.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDestinationInput extends js.Object {
  /**
    * Obtain this value from the VersionId result of DeliveryStreamDescription. This value is required, and helps the service perform conditional operations. For example, if there is an interleaving update and this value is null, then the update destination fails. After the update is successful, the VersionId value is updated. The service then performs a merge of the old configuration with the new configuration.
    */
  var CurrentDeliveryStreamVersionId: DeliveryStreamVersionId = js.native
  /**
    * The name of the delivery stream.
    */
  var DeliveryStreamName: typingsSlinky.awsSdk.firehoseMod.DeliveryStreamName = js.native
  /**
    * The ID of the destination.
    */
  var DestinationId: typingsSlinky.awsSdk.firehoseMod.DestinationId = js.native
  /**
    * Describes an update for a destination in Amazon ES.
    */
  var ElasticsearchDestinationUpdate: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.ElasticsearchDestinationUpdate] = js.native
  /**
    * Describes an update for a destination in Amazon S3.
    */
  var ExtendedS3DestinationUpdate: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.ExtendedS3DestinationUpdate] = js.native
  /**
    * Describes an update for a destination in Amazon Redshift.
    */
  var RedshiftDestinationUpdate: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.RedshiftDestinationUpdate] = js.native
  /**
    * [Deprecated] Describes an update for a destination in Amazon S3.
    */
  var S3DestinationUpdate: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.S3DestinationUpdate] = js.native
  /**
    * Describes an update for a destination in Splunk.
    */
  var SplunkDestinationUpdate: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.SplunkDestinationUpdate] = js.native
}

object UpdateDestinationInput {
  @scala.inline
  def apply(
    CurrentDeliveryStreamVersionId: DeliveryStreamVersionId,
    DeliveryStreamName: DeliveryStreamName,
    DestinationId: DestinationId
  ): UpdateDestinationInput = {
    val __obj = js.Dynamic.literal(CurrentDeliveryStreamVersionId = CurrentDeliveryStreamVersionId.asInstanceOf[js.Any], DeliveryStreamName = DeliveryStreamName.asInstanceOf[js.Any], DestinationId = DestinationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDestinationInput]
  }
  @scala.inline
  implicit class UpdateDestinationInputOps[Self <: UpdateDestinationInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentDeliveryStreamVersionId(value: DeliveryStreamVersionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentDeliveryStreamVersionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeliveryStreamName(value: DeliveryStreamName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeliveryStreamName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestinationId(value: DestinationId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElasticsearchDestinationUpdate(value: ElasticsearchDestinationUpdate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ElasticsearchDestinationUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElasticsearchDestinationUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ElasticsearchDestinationUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withExtendedS3DestinationUpdate(value: ExtendedS3DestinationUpdate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExtendedS3DestinationUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtendedS3DestinationUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExtendedS3DestinationUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withRedshiftDestinationUpdate(value: RedshiftDestinationUpdate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RedshiftDestinationUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedshiftDestinationUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RedshiftDestinationUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withS3DestinationUpdate(value: S3DestinationUpdate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3DestinationUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3DestinationUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3DestinationUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withSplunkDestinationUpdate(value: SplunkDestinationUpdate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SplunkDestinationUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSplunkDestinationUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SplunkDestinationUpdate")(js.undefined)
        ret
    }
  }
  
}

