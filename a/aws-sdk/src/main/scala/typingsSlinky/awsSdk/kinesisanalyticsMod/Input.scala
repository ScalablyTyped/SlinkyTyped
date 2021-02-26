package typingsSlinky.awsSdk.kinesisanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Input extends StObject {
  
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
  implicit class InputMutableBuilder[Self <: Input] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputParallelism(value: InputParallelism): Self = StObject.set(x, "InputParallelism", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputParallelismUndefined: Self = StObject.set(x, "InputParallelism", js.undefined)
    
    @scala.inline
    def setInputProcessingConfiguration(value: InputProcessingConfiguration): Self = StObject.set(x, "InputProcessingConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputProcessingConfigurationUndefined: Self = StObject.set(x, "InputProcessingConfiguration", js.undefined)
    
    @scala.inline
    def setInputSchema(value: SourceSchema): Self = StObject.set(x, "InputSchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKinesisFirehoseInput(value: KinesisFirehoseInput): Self = StObject.set(x, "KinesisFirehoseInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKinesisFirehoseInputUndefined: Self = StObject.set(x, "KinesisFirehoseInput", js.undefined)
    
    @scala.inline
    def setKinesisStreamsInput(value: KinesisStreamsInput): Self = StObject.set(x, "KinesisStreamsInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKinesisStreamsInputUndefined: Self = StObject.set(x, "KinesisStreamsInput", js.undefined)
    
    @scala.inline
    def setNamePrefix(value: InAppStreamName): Self = StObject.set(x, "NamePrefix", value.asInstanceOf[js.Any])
  }
}
