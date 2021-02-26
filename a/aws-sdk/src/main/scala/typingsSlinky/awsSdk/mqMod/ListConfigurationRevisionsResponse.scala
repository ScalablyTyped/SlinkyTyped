package typingsSlinky.awsSdk.mqMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListConfigurationRevisionsResponse extends StObject {
  
  /**
    * The unique ID that Amazon MQ generates for the configuration.
    */
  var ConfigurationId: js.UndefOr[string] = js.native
  
  /**
    * The maximum number of configuration revisions that can be returned per page (20 by default). This value must be an integer from 5 to 100.
    */
  var MaxResults: js.UndefOr[integer] = js.native
  
  /**
    * The token that specifies the next page of results Amazon MQ should return. To request the first page, leave nextToken empty.
    */
  var NextToken: js.UndefOr[string] = js.native
  
  /**
    * The list of all revisions for the specified configuration.
    */
  var Revisions: js.UndefOr[listOfConfigurationRevision] = js.native
}
object ListConfigurationRevisionsResponse {
  
  @scala.inline
  def apply(): ListConfigurationRevisionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListConfigurationRevisionsResponse]
  }
  
  @scala.inline
  implicit class ListConfigurationRevisionsResponseMutableBuilder[Self <: ListConfigurationRevisionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurationId(value: string): Self = StObject.set(x, "ConfigurationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationIdUndefined: Self = StObject.set(x, "ConfigurationId", js.undefined)
    
    @scala.inline
    def setMaxResults(value: integer): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setRevisions(value: listOfConfigurationRevision): Self = StObject.set(x, "Revisions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionsUndefined: Self = StObject.set(x, "Revisions", js.undefined)
    
    @scala.inline
    def setRevisionsVarargs(value: ConfigurationRevision*): Self = StObject.set(x, "Revisions", js.Array(value :_*))
  }
}
