package typingsSlinky.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListClustersResponse extends StObject {
  
  /**
    * The list of full Amazon Resource Name (ARN) entries for each cluster associated with your account.
    */
  var clusterArns: js.UndefOr[StringList] = js.native
  
  /**
    * The nextToken value to include in a future ListClusters request. When the results of a ListClusters request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.native
}
object ListClustersResponse {
  
  @scala.inline
  def apply(): ListClustersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListClustersResponse]
  }
  
  @scala.inline
  implicit class ListClustersResponseMutableBuilder[Self <: ListClustersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterArns(value: StringList): Self = StObject.set(x, "clusterArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterArnsUndefined: Self = StObject.set(x, "clusterArns", js.undefined)
    
    @scala.inline
    def setClusterArnsVarargs(value: String*): Self = StObject.set(x, "clusterArns", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
