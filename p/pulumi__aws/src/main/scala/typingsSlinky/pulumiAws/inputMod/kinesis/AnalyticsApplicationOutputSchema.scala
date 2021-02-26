package typingsSlinky.pulumiAws.inputMod.kinesis

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnalyticsApplicationOutputSchema extends StObject {
  
  /**
    * The Format Type of the records on the output stream. Can be `CSV` or `JSON`.
    */
  var recordFormatType: js.UndefOr[Input[String]] = js.native
}
object AnalyticsApplicationOutputSchema {
  
  @scala.inline
  def apply(): AnalyticsApplicationOutputSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalyticsApplicationOutputSchema]
  }
  
  @scala.inline
  implicit class AnalyticsApplicationOutputSchemaMutableBuilder[Self <: AnalyticsApplicationOutputSchema] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRecordFormatType(value: Input[String]): Self = StObject.set(x, "recordFormatType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordFormatTypeUndefined: Self = StObject.set(x, "recordFormatType", js.undefined)
  }
}
