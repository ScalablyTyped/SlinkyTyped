package typingsSlinky.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Statement extends StObject {
  
  /**
    * The row and column of the end of a Statement in an IAM policy.
    */
  var EndPosition: js.UndefOr[Position] = js.native
  
  /**
    * The identifier of the policy that was provided as an input.
    */
  var SourcePolicyId: js.UndefOr[PolicyIdentifierType] = js.native
  
  /**
    * The type of the policy.
    */
  var SourcePolicyType: js.UndefOr[PolicySourceType] = js.native
  
  /**
    * The row and column of the beginning of the Statement in an IAM policy.
    */
  var StartPosition: js.UndefOr[Position] = js.native
}
object Statement {
  
  @scala.inline
  def apply(): Statement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Statement]
  }
  
  @scala.inline
  implicit class StatementMutableBuilder[Self <: Statement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndPosition(value: Position): Self = StObject.set(x, "EndPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndPositionUndefined: Self = StObject.set(x, "EndPosition", js.undefined)
    
    @scala.inline
    def setSourcePolicyId(value: PolicyIdentifierType): Self = StObject.set(x, "SourcePolicyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcePolicyIdUndefined: Self = StObject.set(x, "SourcePolicyId", js.undefined)
    
    @scala.inline
    def setSourcePolicyType(value: PolicySourceType): Self = StObject.set(x, "SourcePolicyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcePolicyTypeUndefined: Self = StObject.set(x, "SourcePolicyType", js.undefined)
    
    @scala.inline
    def setStartPosition(value: Position): Self = StObject.set(x, "StartPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartPositionUndefined: Self = StObject.set(x, "StartPosition", js.undefined)
  }
}
