package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputDescription extends js.Object {
  /**
    * Returns the in-application stream names that are mapped to the stream source. 
    */
  var InAppStreamNames: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.InAppStreamNames] = js.native
  /**
    * The input ID that is associated with the application input. This is the ID that Kinesis Data Analytics assigns to each input configuration that you add to your application. 
    */
  var InputId: js.UndefOr[Id] = js.native
  /**
    * Describes the configured parallelism (number of in-application streams mapped to the streaming source). 
    */
  var InputParallelism: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.InputParallelism] = js.native
  /**
    * The description of the preprocessor that executes on records in this input before the application's code is run. 
    */
  var InputProcessingConfigurationDescription: js.UndefOr[
    typingsSlinky.awsSdk.kinesisanalyticsv2Mod.InputProcessingConfigurationDescription
  ] = js.native
  /**
    * Describes the format of the data in the streaming source, and how each data element maps to corresponding columns in the in-application stream that is being created. 
    */
  var InputSchema: js.UndefOr[SourceSchema] = js.native
  /**
    * The point at which the application is configured to read from the input stream.
    */
  var InputStartingPositionConfiguration: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.InputStartingPositionConfiguration] = js.native
  /**
    * If a Kinesis Data Firehose delivery stream is configured as a streaming source, provides the delivery stream's ARN. 
    */
  var KinesisFirehoseInputDescription: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.KinesisFirehoseInputDescription] = js.native
  /**
    * If a Kinesis data stream is configured as a streaming source, provides the Kinesis data stream's Amazon Resource Name (ARN). 
    */
  var KinesisStreamsInputDescription: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.KinesisStreamsInputDescription] = js.native
  /**
    * The in-application name prefix.
    */
  var NamePrefix: js.UndefOr[InAppStreamName] = js.native
}

object InputDescription {
  @scala.inline
  def apply(): InputDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputDescription]
  }
  @scala.inline
  implicit class InputDescriptionOps[Self <: InputDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInAppStreamNames(value: InAppStreamNames): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InAppStreamNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInAppStreamNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InAppStreamNames")(js.undefined)
        ret
    }
    @scala.inline
    def withInputId(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputId")(js.undefined)
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
    def withInputProcessingConfigurationDescription(value: InputProcessingConfigurationDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputProcessingConfigurationDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputProcessingConfigurationDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputProcessingConfigurationDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withInputSchema(value: SourceSchema): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputSchema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputSchema: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputSchema")(js.undefined)
        ret
    }
    @scala.inline
    def withInputStartingPositionConfiguration(value: InputStartingPositionConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputStartingPositionConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputStartingPositionConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputStartingPositionConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withKinesisFirehoseInputDescription(value: KinesisFirehoseInputDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KinesisFirehoseInputDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKinesisFirehoseInputDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KinesisFirehoseInputDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withKinesisStreamsInputDescription(value: KinesisStreamsInputDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KinesisStreamsInputDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKinesisStreamsInputDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KinesisStreamsInputDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withNamePrefix(value: InAppStreamName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NamePrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamePrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NamePrefix")(js.undefined)
        ret
    }
  }
  
}

