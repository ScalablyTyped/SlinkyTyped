package typingsSlinky.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecordOutput extends StObject {
  
  /**
    * The description of the output.
    */
  var Description: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.Description] = js.native
  
  /**
    * The output key.
    */
  var OutputKey: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.OutputKey] = js.native
  
  /**
    * The output value.
    */
  var OutputValue: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.OutputValue] = js.native
}
object RecordOutput {
  
  @scala.inline
  def apply(): RecordOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecordOutput]
  }
  
  @scala.inline
  implicit class RecordOutputMutableBuilder[Self <: RecordOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setOutputKey(value: OutputKey): Self = StObject.set(x, "OutputKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputKeyUndefined: Self = StObject.set(x, "OutputKey", js.undefined)
    
    @scala.inline
    def setOutputValue(value: OutputValue): Self = StObject.set(x, "OutputValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputValueUndefined: Self = StObject.set(x, "OutputValue", js.undefined)
  }
}
