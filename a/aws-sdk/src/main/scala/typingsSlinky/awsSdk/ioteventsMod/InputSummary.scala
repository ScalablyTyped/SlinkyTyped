package typingsSlinky.awsSdk.ioteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputSummary extends StObject {
  
  /**
    * The time the input was created.
    */
  var creationTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The ARN of the input.
    */
  var inputArn: js.UndefOr[InputArn] = js.native
  
  /**
    * A brief description of the input.
    */
  var inputDescription: js.UndefOr[InputDescription] = js.native
  
  /**
    * The name of the input.
    */
  var inputName: js.UndefOr[InputName] = js.native
  
  /**
    * The last time the input was updated.
    */
  var lastUpdateTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The status of the input.
    */
  var status: js.UndefOr[InputStatus] = js.native
}
object InputSummary {
  
  @scala.inline
  def apply(): InputSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputSummary]
  }
  
  @scala.inline
  implicit class InputSummaryMutableBuilder[Self <: InputSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    @scala.inline
    def setInputArn(value: InputArn): Self = StObject.set(x, "inputArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputArnUndefined: Self = StObject.set(x, "inputArn", js.undefined)
    
    @scala.inline
    def setInputDescription(value: InputDescription): Self = StObject.set(x, "inputDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputDescriptionUndefined: Self = StObject.set(x, "inputDescription", js.undefined)
    
    @scala.inline
    def setInputName(value: InputName): Self = StObject.set(x, "inputName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputNameUndefined: Self = StObject.set(x, "inputName", js.undefined)
    
    @scala.inline
    def setLastUpdateTime(value: js.Date): Self = StObject.set(x, "lastUpdateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdateTimeUndefined: Self = StObject.set(x, "lastUpdateTime", js.undefined)
    
    @scala.inline
    def setStatus(value: InputStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
