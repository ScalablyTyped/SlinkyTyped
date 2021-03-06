package typingsSlinky.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response message for Agents.SearchAgents.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2beta1SearchAgentsResponse extends StObject {
  
  /**
    * The list of agents. There will be a maximum number of items returned
    * based on the page_size field in the request.
    */
  var agents: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2beta1Agent]] = js.native
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaGoogleCloudDialogflowV2beta1SearchAgentsResponse {
  
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2beta1SearchAgentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1SearchAgentsResponse]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2beta1SearchAgentsResponseMutableBuilder[Self <: SchemaGoogleCloudDialogflowV2beta1SearchAgentsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAgents(value: js.Array[SchemaGoogleCloudDialogflowV2beta1Agent]): Self = StObject.set(x, "agents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgentsUndefined: Self = StObject.set(x, "agents", js.undefined)
    
    @scala.inline
    def setAgentsVarargs(value: SchemaGoogleCloudDialogflowV2beta1Agent*): Self = StObject.set(x, "agents", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
