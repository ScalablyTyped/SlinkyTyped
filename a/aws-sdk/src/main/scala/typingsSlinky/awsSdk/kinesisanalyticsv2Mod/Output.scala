package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Output extends js.Object {
  /**
    * Describes the data format when records are written to the destination. 
    */
  var DestinationSchema: typingsSlinky.awsSdk.kinesisanalyticsv2Mod.DestinationSchema = js.native
  /**
    * Identifies an Amazon Kinesis Data Firehose delivery stream as the destination.
    */
  var KinesisFirehoseOutput: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.KinesisFirehoseOutput] = js.native
  /**
    * Identifies an Amazon Kinesis data stream as the destination.
    */
  var KinesisStreamsOutput: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.KinesisStreamsOutput] = js.native
  /**
    * Identifies an AWS Lambda function as the destination.
    */
  var LambdaOutput: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.LambdaOutput] = js.native
  /**
    * The name of the in-application stream.
    */
  var Name: InAppStreamName = js.native
}

object Output {
  @scala.inline
  def apply(DestinationSchema: DestinationSchema, Name: InAppStreamName): Output = {
    val __obj = js.Dynamic.literal(DestinationSchema = DestinationSchema.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Output]
  }
  @scala.inline
  implicit class OutputOps[Self <: Output] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestinationSchema(value: DestinationSchema): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationSchema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: InAppStreamName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKinesisFirehoseOutput(value: KinesisFirehoseOutput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KinesisFirehoseOutput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKinesisFirehoseOutput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KinesisFirehoseOutput")(js.undefined)
        ret
    }
    @scala.inline
    def withKinesisStreamsOutput(value: KinesisStreamsOutput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KinesisStreamsOutput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKinesisStreamsOutput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KinesisStreamsOutput")(js.undefined)
        ret
    }
    @scala.inline
    def withLambdaOutput(value: LambdaOutput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LambdaOutput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLambdaOutput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LambdaOutput")(js.undefined)
        ret
    }
  }
  
}

