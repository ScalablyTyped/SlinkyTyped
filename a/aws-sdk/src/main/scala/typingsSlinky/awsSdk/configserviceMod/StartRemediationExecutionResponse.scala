package typingsSlinky.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartRemediationExecutionResponse extends StObject {
  
  /**
    * For resources that have failed to start execution, the API returns a resource key object.
    */
  var FailedItems: js.UndefOr[ResourceKeys] = js.native
  
  /**
    * Returns a failure message. For example, the resource is already compliant.
    */
  var FailureMessage: js.UndefOr[String] = js.native
}
object StartRemediationExecutionResponse {
  
  @scala.inline
  def apply(): StartRemediationExecutionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartRemediationExecutionResponse]
  }
  
  @scala.inline
  implicit class StartRemediationExecutionResponseMutableBuilder[Self <: StartRemediationExecutionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailedItems(value: ResourceKeys): Self = StObject.set(x, "FailedItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailedItemsUndefined: Self = StObject.set(x, "FailedItems", js.undefined)
    
    @scala.inline
    def setFailedItemsVarargs(value: ResourceKey*): Self = StObject.set(x, "FailedItems", js.Array(value :_*))
    
    @scala.inline
    def setFailureMessage(value: String): Self = StObject.set(x, "FailureMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureMessageUndefined: Self = StObject.set(x, "FailureMessage", js.undefined)
  }
}
