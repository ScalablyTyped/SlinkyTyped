package typingsSlinky.awsSdk.eksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListNodegroupsResponse extends StObject {
  
  /**
    * The nextToken value to include in a future ListNodegroups request. When the results of a ListNodegroups request exceed maxResults, you can use this value to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.native
  
  /**
    * A list of all of the node groups associated with the specified cluster.
    */
  var nodegroups: js.UndefOr[StringList] = js.native
}
object ListNodegroupsResponse {
  
  @scala.inline
  def apply(): ListNodegroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListNodegroupsResponse]
  }
  
  @scala.inline
  implicit class ListNodegroupsResponseMutableBuilder[Self <: ListNodegroupsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setNodegroups(value: StringList): Self = StObject.set(x, "nodegroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodegroupsUndefined: Self = StObject.set(x, "nodegroups", js.undefined)
    
    @scala.inline
    def setNodegroupsVarargs(value: String*): Self = StObject.set(x, "nodegroups", js.Array(value :_*))
  }
}
