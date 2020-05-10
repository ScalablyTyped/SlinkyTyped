package typingsSlinky.awsSdk.kinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Input extends js.Object {
  /**
    * Describes the number of in-application streams to create.  Data from your source is routed to these in-application input streams.  (see Configuring Application Input.
    */
  var InputParallelism: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsMod.InputParallelism] = js.native
  /**
    * The InputProcessingConfiguration for the input. An input processor transforms records as they are received from the stream, before the application's SQL code executes. Currently, the only input processing configuration available is InputLambdaProcessor.
    */
  var InputProcessingConfiguration: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsMod.InputProcessingConfiguration] = js.native
  /**
    * Describes the format of the data in the streaming source, and how each data element maps to corresponding columns in the in-application stream that is being created. Also used to describe the format of the reference data source.
    */
  var InputSchema: SourceSchema = js.native
  /**
    * If the streaming source is an Amazon Kinesis Firehose delivery stream, identifies the delivery stream's ARN and an IAM role that enables Amazon Kinesis Analytics to access the stream on your behalf. Note: Either KinesisStreamsInput or KinesisFirehoseInput is required.
    */
  var KinesisFirehoseInput: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsMod.KinesisFirehoseInput] = js.native
  /**
    * If the streaming source is an Amazon Kinesis stream, identifies the stream's Amazon Resource Name (ARN) and an IAM role that enables Amazon Kinesis Analytics to access the stream on your behalf. Note: Either KinesisStreamsInput or KinesisFirehoseInput is required.
    */
  var KinesisStreamsInput: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsMod.KinesisStreamsInput] = js.native
  /**
    * Name prefix to use when creating an in-application stream. Suppose that you specify a prefix "MyInApplicationStream." Amazon Kinesis Analytics then creates one or more (as per the InputParallelism count you specified) in-application streams with names "MyInApplicationStream_001," "MyInApplicationStream_002," and so on. 
    */
  var NamePrefix: InAppStreamName = js.native
}

object Input {
  @scala.inline
  def apply(InputSchema: SourceSchema, NamePrefix: InAppStreamName): Input = {
    val __obj = js.Dynamic.literal(InputSchema = InputSchema.asInstanceOf[js.Any], NamePrefix = NamePrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Input]
  }
  @scala.inline
  implicit class InputOps[Self <: Input] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInputSchema(value: SourceSchema): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputSchema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNamePrefix(value: InAppStreamName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NamePrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputParallelism(value: InputParallelism): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputParallelism")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputParallelism: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputParallelism")(js.undefined)
        ret
    }
    @scala.inline
    def withInputProcessingConfiguration(value: InputProcessingConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputProcessingConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputProcessingConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputProcessingConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withKinesisFirehoseInput(value: KinesisFirehoseInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KinesisFirehoseInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKinesisFirehoseInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KinesisFirehoseInput")(js.undefined)
        ret
    }
    @scala.inline
    def withKinesisStreamsInput(value: KinesisStreamsInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KinesisStreamsInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKinesisStreamsInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KinesisStreamsInput")(js.undefined)
        ret
    }
  }
  
}

