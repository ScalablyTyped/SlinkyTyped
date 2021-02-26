package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Output extends StObject {
  
  /**
    * Describes the data format when records are written to the destination. 
    */
  var DestinationSchema: typingsSlinky.awsSdk.kinesisanalyticsv2Mod.DestinationSchema = js.native
  
  /**
    * Identifies a Kinesis Data Firehose delivery stream as the destination.
    */
  var KinesisFirehoseOutput: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.KinesisFirehoseOutput] = js.native
  
  /**
    * Identifies a Kinesis data stream as the destination.
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
  implicit class OutputMutableBuilder[Self <: Output] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestinationSchema(value: DestinationSchema): Self = StObject.set(x, "DestinationSchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKinesisFirehoseOutput(value: KinesisFirehoseOutput): Self = StObject.set(x, "KinesisFirehoseOutput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKinesisFirehoseOutputUndefined: Self = StObject.set(x, "KinesisFirehoseOutput", js.undefined)
    
    @scala.inline
    def setKinesisStreamsOutput(value: KinesisStreamsOutput): Self = StObject.set(x, "KinesisStreamsOutput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKinesisStreamsOutputUndefined: Self = StObject.set(x, "KinesisStreamsOutput", js.undefined)
    
    @scala.inline
    def setLambdaOutput(value: LambdaOutput): Self = StObject.set(x, "LambdaOutput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLambdaOutputUndefined: Self = StObject.set(x, "LambdaOutput", js.undefined)
    
    @scala.inline
    def setName(value: InAppStreamName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
