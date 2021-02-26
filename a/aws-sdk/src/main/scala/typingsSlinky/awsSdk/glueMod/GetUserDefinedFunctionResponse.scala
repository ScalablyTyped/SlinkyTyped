package typingsSlinky.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetUserDefinedFunctionResponse extends StObject {
  
  /**
    * The requested function definition.
    */
  var UserDefinedFunction: js.UndefOr[typingsSlinky.awsSdk.glueMod.UserDefinedFunction] = js.native
}
object GetUserDefinedFunctionResponse {
  
  @scala.inline
  def apply(): GetUserDefinedFunctionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetUserDefinedFunctionResponse]
  }
  
  @scala.inline
  implicit class GetUserDefinedFunctionResponseMutableBuilder[Self <: GetUserDefinedFunctionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUserDefinedFunction(value: UserDefinedFunction): Self = StObject.set(x, "UserDefinedFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserDefinedFunctionUndefined: Self = StObject.set(x, "UserDefinedFunction", js.undefined)
  }
}
