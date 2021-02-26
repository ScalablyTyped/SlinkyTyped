package typingsSlinky.awsSdk.mqMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListConfigurationRevisionsRequest extends StObject {
  
  /**
    * The unique ID that Amazon MQ generates for the configuration.
    */
  var ConfigurationId: string = js.native
  
  /**
    * The maximum number of configurations that Amazon MQ can return per page (20 by default). This value must be an integer from 5 to 100.
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.mqMod.MaxResults] = js.native
  
  /**
    * The token that specifies the next page of results Amazon MQ should return. To request the first page, leave nextToken empty.
    */
  var NextToken: js.UndefOr[string] = js.native
}
object ListConfigurationRevisionsRequest {
  
  @scala.inline
  def apply(ConfigurationId: string): ListConfigurationRevisionsRequest = {
    val __obj = js.Dynamic.literal(ConfigurationId = ConfigurationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListConfigurationRevisionsRequest]
  }
  
  @scala.inline
  implicit class ListConfigurationRevisionsRequestMutableBuilder[Self <: ListConfigurationRevisionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurationId(value: string): Self = StObject.set(x, "ConfigurationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
