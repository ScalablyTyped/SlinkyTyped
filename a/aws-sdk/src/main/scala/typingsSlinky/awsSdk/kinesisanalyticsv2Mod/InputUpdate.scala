package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputUpdate extends StObject {
  
  /**
    * The input ID of the application input to be updated.
    */
  var InputId: Id = js.native
  
  /**
    * Describes the parallelism updates (the number of in-application streams Kinesis Data Analytics creates for the specific streaming source).
    */
  var InputParallelismUpdate: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.InputParallelismUpdate] = js.native
  
  /**
    * Describes updates to an InputProcessingConfiguration.
    */
  var InputProcessingConfigurationUpdate: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.InputProcessingConfigurationUpdate] = js.native
  
  /**
    * Describes the data format on the streaming source, and how record elements on the streaming source map to columns of the in-application stream that is created.
    */
  var InputSchemaUpdate: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.InputSchemaUpdate] = js.native
  
  /**
    * If a Kinesis Data Firehose delivery stream is the streaming source to be updated, provides an updated stream ARN.
    */
  var KinesisFirehoseInputUpdate: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.KinesisFirehoseInputUpdate] = js.native
  
  /**
    * If a Kinesis data stream is the streaming source to be updated, provides an updated stream Amazon Resource Name (ARN).
    */
  var KinesisStreamsInputUpdate: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.KinesisStreamsInputUpdate] = js.native
  
  /**
    * The name prefix for in-application streams that Kinesis Data Analytics creates for the specific streaming source.
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
  implicit class InputUpdateMutableBuilder[Self <: InputUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputId(value: Id): Self = StObject.set(x, "InputId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputParallelismUpdate(value: InputParallelismUpdate): Self = StObject.set(x, "InputParallelismUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputParallelismUpdateUndefined: Self = StObject.set(x, "InputParallelismUpdate", js.undefined)
    
    @scala.inline
    def setInputProcessingConfigurationUpdate(value: InputProcessingConfigurationUpdate): Self = StObject.set(x, "InputProcessingConfigurationUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputProcessingConfigurationUpdateUndefined: Self = StObject.set(x, "InputProcessingConfigurationUpdate", js.undefined)
    
    @scala.inline
    def setInputSchemaUpdate(value: InputSchemaUpdate): Self = StObject.set(x, "InputSchemaUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputSchemaUpdateUndefined: Self = StObject.set(x, "InputSchemaUpdate", js.undefined)
    
    @scala.inline
    def setKinesisFirehoseInputUpdate(value: KinesisFirehoseInputUpdate): Self = StObject.set(x, "KinesisFirehoseInputUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKinesisFirehoseInputUpdateUndefined: Self = StObject.set(x, "KinesisFirehoseInputUpdate", js.undefined)
    
    @scala.inline
    def setKinesisStreamsInputUpdate(value: KinesisStreamsInputUpdate): Self = StObject.set(x, "KinesisStreamsInputUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKinesisStreamsInputUpdateUndefined: Self = StObject.set(x, "KinesisStreamsInputUpdate", js.undefined)
    
    @scala.inline
    def setNamePrefixUpdate(value: InAppStreamName): Self = StObject.set(x, "NamePrefixUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamePrefixUpdateUndefined: Self = StObject.set(x, "NamePrefixUpdate", js.undefined)
  }
}
