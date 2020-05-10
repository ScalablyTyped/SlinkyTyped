package typingsSlinky.awsSdk.kinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputDescription extends js.Object {
  /**
    * Data format used for writing data to the destination.
    */
  var DestinationSchema: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsMod.DestinationSchema] = js.native
  /**
    * Describes the Amazon Kinesis Firehose delivery stream configured as the destination where output is written.
    */
  var KinesisFirehoseOutputDescription: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsMod.KinesisFirehoseOutputDescription] = js.native
  /**
    * Describes Amazon Kinesis stream configured as the destination where output is written.
    */
  var KinesisStreamsOutputDescription: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsMod.KinesisStreamsOutputDescription] = js.native
  /**
    * Describes the AWS Lambda function configured as the destination where output is written.
    */
  var LambdaOutputDescription: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsMod.LambdaOutputDescription] = js.native
  /**
    * Name of the in-application stream configured as output.
    */
  var Name: js.UndefOr[InAppStreamName] = js.native
  /**
    * A unique identifier for the output configuration.
    */
  var OutputId: js.UndefOr[Id] = js.native
}

object OutputDescription {
  @scala.inline
  def apply(): OutputDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputDescription]
  }
  @scala.inline
  implicit class OutputDescriptionOps[Self <: OutputDescription] (val x: Self) extends AnyVal {
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
    def withoutDestinationSchema: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationSchema")(js.undefined)
        ret
    }
    @scala.inline
    def withKinesisFirehoseOutputDescription(value: KinesisFirehoseOutputDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KinesisFirehoseOutputDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKinesisFirehoseOutputDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KinesisFirehoseOutputDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withKinesisStreamsOutputDescription(value: KinesisStreamsOutputDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KinesisStreamsOutputDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKinesisStreamsOutputDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KinesisStreamsOutputDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withLambdaOutputDescription(value: LambdaOutputDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LambdaOutputDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLambdaOutputDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LambdaOutputDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: InAppStreamName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputId(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputId")(js.undefined)
        ret
    }
  }
  
}

