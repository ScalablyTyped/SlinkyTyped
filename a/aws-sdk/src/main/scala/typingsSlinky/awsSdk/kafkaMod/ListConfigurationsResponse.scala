package typingsSlinky.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListConfigurationsResponse extends StObject {
  
  /**
    * 
    An array of MSK configurations.
    
    */
  var Configurations: js.UndefOr[listOfConfiguration] = js.native
  
  /**
    * 
    The paginated results marker. When the result of a ListConfigurations operation is truncated, the call returns NextToken in the response. 
    To get another batch of configurations, provide this token in your next request.
    
    */
  var NextToken: js.UndefOr[string] = js.native
}
object ListConfigurationsResponse {
  
  @scala.inline
  def apply(): ListConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListConfigurationsResponse]
  }
  
  @scala.inline
  implicit class ListConfigurationsResponseMutableBuilder[Self <: ListConfigurationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurations(value: listOfConfiguration): Self = StObject.set(x, "Configurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationsUndefined: Self = StObject.set(x, "Configurations", js.undefined)
    
    @scala.inline
    def setConfigurationsVarargs(value: Configuration*): Self = StObject.set(x, "Configurations", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
