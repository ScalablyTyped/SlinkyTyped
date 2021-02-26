package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecordFormat extends StObject {
  
  /**
    * When you configure application input at the time of creating or updating an application, provides additional mapping information specific to the record format (such as JSON, CSV, or record fields delimited by some delimiter) on the streaming source.
    */
  var MappingParameters: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.MappingParameters] = js.native
  
  /**
    * The type of record format.
    */
  var RecordFormatType: typingsSlinky.awsSdk.kinesisanalyticsv2Mod.RecordFormatType = js.native
}
object RecordFormat {
  
  @scala.inline
  def apply(RecordFormatType: RecordFormatType): RecordFormat = {
    val __obj = js.Dynamic.literal(RecordFormatType = RecordFormatType.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordFormat]
  }
  
  @scala.inline
  implicit class RecordFormatMutableBuilder[Self <: RecordFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMappingParameters(value: MappingParameters): Self = StObject.set(x, "MappingParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMappingParametersUndefined: Self = StObject.set(x, "MappingParameters", js.undefined)
    
    @scala.inline
    def setRecordFormatType(value: RecordFormatType): Self = StObject.set(x, "RecordFormatType", value.asInstanceOf[js.Any])
  }
}
