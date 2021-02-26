package typingsSlinky.awsSdk.kinesisanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputDescription extends StObject {
  
  /**
    * Returns the in-application stream names that are mapped to the stream source.
    */
  var InAppStreamNames: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsMod.InAppStreamNames] = js.native
  
  /**
    * Input ID associated with the application input. This is the ID that Amazon Kinesis Analytics assigns to each input configuration you add to your application. 
    */
  var InputId: js.UndefOr[Id] = js.native
  
  /**
    * Describes the configured parallelism (number of in-application streams mapped to the streaming source).
    */
  var InputParallelism: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsMod.InputParallelism] = js.native
  
  /**
    * The description of the preprocessor that executes on records in this input before the application's code is run.
    */
  var InputProcessingConfigurationDescription: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsMod.InputProcessingConfigurationDescription] = js.native
  
  /**
    * Describes the format of the data in the streaming source, and how each data element maps to corresponding columns in the in-application stream that is being created. 
    */
  var InputSchema: js.UndefOr[SourceSchema] = js.native
  
  /**
    * Point at which the application is configured to read from the input stream.
    */
  var InputStartingPositionConfiguration: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsMod.InputStartingPositionConfiguration] = js.native
  
  /**
    * If an Amazon Kinesis Firehose delivery stream is configured as a streaming source, provides the delivery stream's ARN and an IAM role that enables Amazon Kinesis Analytics to access the stream on your behalf.
    */
  var KinesisFirehoseInputDescription: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsMod.KinesisFirehoseInputDescription] = js.native
  
  /**
    * If an Amazon Kinesis stream is configured as streaming source, provides Amazon Kinesis stream's Amazon Resource Name (ARN) and an IAM role that enables Amazon Kinesis Analytics to access the stream on your behalf.
    */
  var KinesisStreamsInputDescription: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsMod.KinesisStreamsInputDescription] = js.native
  
  /**
    * In-application name prefix.
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
  implicit class InputDescriptionMutableBuilder[Self <: InputDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInAppStreamNames(value: InAppStreamNames): Self = StObject.set(x, "InAppStreamNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInAppStreamNamesUndefined: Self = StObject.set(x, "InAppStreamNames", js.undefined)
    
    @scala.inline
    def setInAppStreamNamesVarargs(value: InAppStreamName*): Self = StObject.set(x, "InAppStreamNames", js.Array(value :_*))
    
    @scala.inline
    def setInputId(value: Id): Self = StObject.set(x, "InputId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputIdUndefined: Self = StObject.set(x, "InputId", js.undefined)
    
    @scala.inline
    def setInputParallelism(value: InputParallelism): Self = StObject.set(x, "InputParallelism", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputParallelismUndefined: Self = StObject.set(x, "InputParallelism", js.undefined)
    
    @scala.inline
    def setInputProcessingConfigurationDescription(value: InputProcessingConfigurationDescription): Self = StObject.set(x, "InputProcessingConfigurationDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputProcessingConfigurationDescriptionUndefined: Self = StObject.set(x, "InputProcessingConfigurationDescription", js.undefined)
    
    @scala.inline
    def setInputSchema(value: SourceSchema): Self = StObject.set(x, "InputSchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputSchemaUndefined: Self = StObject.set(x, "InputSchema", js.undefined)
    
    @scala.inline
    def setInputStartingPositionConfiguration(value: InputStartingPositionConfiguration): Self = StObject.set(x, "InputStartingPositionConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputStartingPositionConfigurationUndefined: Self = StObject.set(x, "InputStartingPositionConfiguration", js.undefined)
    
    @scala.inline
    def setKinesisFirehoseInputDescription(value: KinesisFirehoseInputDescription): Self = StObject.set(x, "KinesisFirehoseInputDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKinesisFirehoseInputDescriptionUndefined: Self = StObject.set(x, "KinesisFirehoseInputDescription", js.undefined)
    
    @scala.inline
    def setKinesisStreamsInputDescription(value: KinesisStreamsInputDescription): Self = StObject.set(x, "KinesisStreamsInputDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKinesisStreamsInputDescriptionUndefined: Self = StObject.set(x, "KinesisStreamsInputDescription", js.undefined)
    
    @scala.inline
    def setNamePrefix(value: InAppStreamName): Self = StObject.set(x, "NamePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamePrefixUndefined: Self = StObject.set(x, "NamePrefix", js.undefined)
  }
}
