package typingsSlinky.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListV2LoggingLevelsResponse extends StObject {
  
  /**
    * The logging configuration for a target.
    */
  var logTargetConfigurations: js.UndefOr[LogTargetConfigurations] = js.native
  
  /**
    * The token to use to get the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object ListV2LoggingLevelsResponse {
  
  @scala.inline
  def apply(): ListV2LoggingLevelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListV2LoggingLevelsResponse]
  }
  
  @scala.inline
  implicit class ListV2LoggingLevelsResponseMutableBuilder[Self <: ListV2LoggingLevelsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLogTargetConfigurations(value: LogTargetConfigurations): Self = StObject.set(x, "logTargetConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogTargetConfigurationsUndefined: Self = StObject.set(x, "logTargetConfigurations", js.undefined)
    
    @scala.inline
    def setLogTargetConfigurationsVarargs(value: LogTargetConfiguration*): Self = StObject.set(x, "logTargetConfigurations", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
