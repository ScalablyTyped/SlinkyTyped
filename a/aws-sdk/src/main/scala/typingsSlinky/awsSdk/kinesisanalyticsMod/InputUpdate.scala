package typingsSlinky.awsSdk.kinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputUpdate extends js.Object {
  /**
    * Input ID of the application input to be updated.
    */
  var InputId: Id = js.native
  /**
    * Describes the parallelism updates (the number in-application streams Amazon Kinesis Analytics creates for the specific streaming source).
    */
  var InputParallelismUpdate: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsMod.InputParallelismUpdate] = js.native
  /**
    * Describes updates for an input processing configuration.
    */
  var InputProcessingConfigurationUpdate: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsMod.InputProcessingConfigurationUpdate] = js.native
  /**
    * Describes the data format on the streaming source, and how record elements on the streaming source map to columns of the in-application stream that is created.
    */
  var InputSchemaUpdate: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsMod.InputSchemaUpdate] = js.native
  /**
    * If an Amazon Kinesis Firehose delivery stream is the streaming source to be updated, provides an updated stream ARN and IAM role ARN.
    */
  var KinesisFirehoseInputUpdate: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsMod.KinesisFirehoseInputUpdate] = js.native
  /**
    * If an Amazon Kinesis stream is the streaming source to be updated, provides an updated stream Amazon Resource Name (ARN) and IAM role ARN.
    */
  var KinesisStreamsInputUpdate: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsMod.KinesisStreamsInputUpdate] = js.native
  /**
    * Name prefix for in-application streams that Amazon Kinesis Analytics creates for the specific streaming source.
    */
  var NamePrefixUpdate: js.UndefOr[InAppStreamName] = js.native
}

object InputUpdate {
  @scala.inline
  def apply(InputId: Id): InputUpdate = {
    val __obj = js.Dynamic.literal(InputId = InputId.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputUpdate]
  }
  @scala.inline
  implicit class InputUpdateOps[Self <: InputUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInputId(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputParallelismUpdate(value: InputParallelismUpdate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputParallelismUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputParallelismUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputParallelismUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withInputProcessingConfigurationUpdate(value: InputProcessingConfigurationUpdate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputProcessingConfigurationUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputProcessingConfigurationUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputProcessingConfigurationUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withInputSchemaUpdate(value: InputSchemaUpdate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputSchemaUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputSchemaUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputSchemaUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withKinesisFirehoseInputUpdate(value: KinesisFirehoseInputUpdate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KinesisFirehoseInputUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKinesisFirehoseInputUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KinesisFirehoseInputUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withKinesisStreamsInputUpdate(value: KinesisStreamsInputUpdate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KinesisStreamsInputUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKinesisStreamsInputUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KinesisStreamsInputUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withNamePrefixUpdate(value: InAppStreamName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NamePrefixUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamePrefixUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NamePrefixUpdate")(js.undefined)
        ret
    }
  }
  
}

