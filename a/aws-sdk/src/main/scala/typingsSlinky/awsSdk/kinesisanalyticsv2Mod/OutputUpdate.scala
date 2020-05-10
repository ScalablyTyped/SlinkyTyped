package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputUpdate extends js.Object {
  /**
    * Describes the data format when records are written to the destination. 
    */
  var DestinationSchemaUpdate: js.UndefOr[DestinationSchema] = js.native
  /**
    * Describes a Kinesis Data Firehose delivery stream as the destination for the output.
    */
  var KinesisFirehoseOutputUpdate: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.KinesisFirehoseOutputUpdate] = js.native
  /**
    * Describes a Kinesis data stream as the destination for the output.
    */
  var KinesisStreamsOutputUpdate: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.KinesisStreamsOutputUpdate] = js.native
  /**
    * Describes an AWS Lambda function as the destination for the output.
    */
  var LambdaOutputUpdate: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.LambdaOutputUpdate] = js.native
  /**
    * If you want to specify a different in-application stream for this output configuration, use this field to specify the new in-application stream name.
    */
  var NameUpdate: js.UndefOr[InAppStreamName] = js.native
  /**
    * Identifies the specific output configuration that you want to update.
    */
  var OutputId: Id = js.native
}

object OutputUpdate {
  @scala.inline
  def apply(OutputId: Id): OutputUpdate = {
    val __obj = js.Dynamic.literal(OutputId = OutputId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputUpdate]
  }
  @scala.inline
  implicit class OutputUpdateOps[Self <: OutputUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOutputId(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestinationSchemaUpdate(value: DestinationSchema): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationSchemaUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationSchemaUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationSchemaUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withKinesisFirehoseOutputUpdate(value: KinesisFirehoseOutputUpdate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KinesisFirehoseOutputUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKinesisFirehoseOutputUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KinesisFirehoseOutputUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withKinesisStreamsOutputUpdate(value: KinesisStreamsOutputUpdate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KinesisStreamsOutputUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKinesisStreamsOutputUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KinesisStreamsOutputUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withLambdaOutputUpdate(value: LambdaOutputUpdate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LambdaOutputUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLambdaOutputUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LambdaOutputUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withNameUpdate(value: InAppStreamName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NameUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNameUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NameUpdate")(js.undefined)
        ret
    }
  }
  
}

