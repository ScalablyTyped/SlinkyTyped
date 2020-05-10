package typingsSlinky.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DestinationDescription extends js.Object {
  /**
    * The ID of the destination.
    */
  var DestinationId: typingsSlinky.awsSdk.firehoseMod.DestinationId = js.native
  /**
    * The destination in Amazon ES.
    */
  var ElasticsearchDestinationDescription: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.ElasticsearchDestinationDescription] = js.native
  /**
    * The destination in Amazon S3.
    */
  var ExtendedS3DestinationDescription: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.ExtendedS3DestinationDescription] = js.native
  /**
    * The destination in Amazon Redshift.
    */
  var RedshiftDestinationDescription: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.RedshiftDestinationDescription] = js.native
  /**
    * [Deprecated] The destination in Amazon S3.
    */
  var S3DestinationDescription: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.S3DestinationDescription] = js.native
  /**
    * The destination in Splunk.
    */
  var SplunkDestinationDescription: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.SplunkDestinationDescription] = js.native
}

object DestinationDescription {
  @scala.inline
  def apply(DestinationId: DestinationId): DestinationDescription = {
    val __obj = js.Dynamic.literal(DestinationId = DestinationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DestinationDescription]
  }
  @scala.inline
  implicit class DestinationDescriptionOps[Self <: DestinationDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestinationId(value: DestinationId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElasticsearchDestinationDescription(value: ElasticsearchDestinationDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ElasticsearchDestinationDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElasticsearchDestinationDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ElasticsearchDestinationDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withExtendedS3DestinationDescription(value: ExtendedS3DestinationDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExtendedS3DestinationDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtendedS3DestinationDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExtendedS3DestinationDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withRedshiftDestinationDescription(value: RedshiftDestinationDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RedshiftDestinationDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedshiftDestinationDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RedshiftDestinationDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withS3DestinationDescription(value: S3DestinationDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3DestinationDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3DestinationDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3DestinationDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withSplunkDestinationDescription(value: SplunkDestinationDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SplunkDestinationDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSplunkDestinationDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SplunkDestinationDescription")(js.undefined)
        ret
    }
  }
  
}

