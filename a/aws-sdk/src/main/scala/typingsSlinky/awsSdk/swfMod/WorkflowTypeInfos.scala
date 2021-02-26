package typingsSlinky.awsSdk.swfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkflowTypeInfos extends StObject {
  
  /**
    * If a NextPageToken was returned by a previous call, there are more results available. To retrieve the next page of results, make the call again using the returned token in nextPageToken. Keep all other arguments unchanged. The configured maximumPageSize determines how many results can be returned in a single call.
    */
  var nextPageToken: js.UndefOr[PageToken] = js.native
  
  /**
    * The list of workflow type information.
    */
  var typeInfos: WorkflowTypeInfoList = js.native
}
object WorkflowTypeInfos {
  
  @scala.inline
  def apply(typeInfos: WorkflowTypeInfoList): WorkflowTypeInfos = {
    val __obj = js.Dynamic.literal(typeInfos = typeInfos.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkflowTypeInfos]
  }
  
  @scala.inline
  implicit class WorkflowTypeInfosMutableBuilder[Self <: WorkflowTypeInfos] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: PageToken): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setTypeInfos(value: WorkflowTypeInfoList): Self = StObject.set(x, "typeInfos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeInfosVarargs(value: WorkflowTypeInfo*): Self = StObject.set(x, "typeInfos", js.Array(value :_*))
  }
}
