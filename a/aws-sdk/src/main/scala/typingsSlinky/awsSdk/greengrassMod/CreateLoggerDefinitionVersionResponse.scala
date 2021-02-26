package typingsSlinky.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateLoggerDefinitionVersionResponse extends StObject {
  
  /**
    * The ARN of the version.
    */
  var Arn: js.UndefOr[string] = js.native
  
  /**
    * The time, in milliseconds since the epoch, when the version was created.
    */
  var CreationTimestamp: js.UndefOr[string] = js.native
  
  /**
    * The ID of the parent definition that the version is associated with.
    */
  var Id: js.UndefOr[string] = js.native
  
  /**
    * The ID of the version.
    */
  var Version: js.UndefOr[string] = js.native
}
object CreateLoggerDefinitionVersionResponse {
  
  @scala.inline
  def apply(): CreateLoggerDefinitionVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLoggerDefinitionVersionResponse]
  }
  
  @scala.inline
  implicit class CreateLoggerDefinitionVersionResponseMutableBuilder[Self <: CreateLoggerDefinitionVersionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: string): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setCreationTimestamp(value: string): Self = StObject.set(x, "CreationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimestampUndefined: Self = StObject.set(x, "CreationTimestamp", js.undefined)
    
    @scala.inline
    def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setVersion(value: string): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
