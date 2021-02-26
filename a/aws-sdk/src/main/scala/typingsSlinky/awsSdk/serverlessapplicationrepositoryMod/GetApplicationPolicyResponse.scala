package typingsSlinky.awsSdk.serverlessapplicationrepositoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetApplicationPolicyResponse extends StObject {
  
  /**
    * An array of policy statements applied to the application.
    */
  var Statements: js.UndefOr[listOfApplicationPolicyStatement] = js.native
}
object GetApplicationPolicyResponse {
  
  @scala.inline
  def apply(): GetApplicationPolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetApplicationPolicyResponse]
  }
  
  @scala.inline
  implicit class GetApplicationPolicyResponseMutableBuilder[Self <: GetApplicationPolicyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatements(value: listOfApplicationPolicyStatement): Self = StObject.set(x, "Statements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatementsUndefined: Self = StObject.set(x, "Statements", js.undefined)
    
    @scala.inline
    def setStatementsVarargs(value: ApplicationPolicyStatement*): Self = StObject.set(x, "Statements", js.Array(value :_*))
  }
}
