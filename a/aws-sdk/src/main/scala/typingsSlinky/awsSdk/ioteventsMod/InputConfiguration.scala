package typingsSlinky.awsSdk.ioteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputConfiguration extends StObject {
  
  /**
    * The time the input was created.
    */
  var creationTime: js.Date = js.native
  
  /**
    * The ARN of the input.
    */
  var inputArn: InputArn = js.native
  
  /**
    * A brief description of the input.
    */
  var inputDescription: js.UndefOr[InputDescription] = js.native
  
  /**
    * The name of the input.
    */
  var inputName: InputName = js.native
  
  /**
    * The last time the input was updated.
    */
  var lastUpdateTime: js.Date = js.native
  
  /**
    * The status of the input.
    */
  var status: InputStatus = js.native
}
object InputConfiguration {
  
  @scala.inline
  def apply(
    creationTime: js.Date,
    inputArn: InputArn,
    inputName: InputName,
    lastUpdateTime: js.Date,
    status: InputStatus
  ): InputConfiguration = {
    val __obj = js.Dynamic.literal(creationTime = creationTime.asInstanceOf[js.Any], inputArn = inputArn.asInstanceOf[js.Any], inputName = inputName.asInstanceOf[js.Any], lastUpdateTime = lastUpdateTime.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputConfiguration]
  }
  
  @scala.inline
  implicit class InputConfigurationMutableBuilder[Self <: InputConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputArn(value: InputArn): Self = StObject.set(x, "inputArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputDescription(value: InputDescription): Self = StObject.set(x, "inputDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputDescriptionUndefined: Self = StObject.set(x, "inputDescription", js.undefined)
    
    @scala.inline
    def setInputName(value: InputName): Self = StObject.set(x, "inputName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdateTime(value: js.Date): Self = StObject.set(x, "lastUpdateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: InputStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
