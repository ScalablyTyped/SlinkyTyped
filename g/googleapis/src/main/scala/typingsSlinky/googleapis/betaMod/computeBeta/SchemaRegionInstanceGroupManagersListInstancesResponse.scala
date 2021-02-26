package typingsSlinky.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaRegionInstanceGroupManagersListInstancesResponse extends StObject {
  
  /**
    * A list of managed instances.
    */
  var managedInstances: js.UndefOr[js.Array[SchemaManagedInstance]] = js.native
  
  /**
    * [Output Only] This token allows you to get the next page of results for
    * list requests. If the number of results is larger than maxResults, use
    * the nextPageToken as a value for the query parameter pageToken in the
    * next list request. Subsequent list requests will have their own
    * nextPageToken to continue paging through the results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaRegionInstanceGroupManagersListInstancesResponse {
  
  @scala.inline
  def apply(): SchemaRegionInstanceGroupManagersListInstancesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRegionInstanceGroupManagersListInstancesResponse]
  }
  
  @scala.inline
  implicit class SchemaRegionInstanceGroupManagersListInstancesResponseMutableBuilder[Self <: SchemaRegionInstanceGroupManagersListInstancesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setManagedInstances(value: js.Array[SchemaManagedInstance]): Self = StObject.set(x, "managedInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagedInstancesUndefined: Self = StObject.set(x, "managedInstances", js.undefined)
    
    @scala.inline
    def setManagedInstancesVarargs(value: SchemaManagedInstance*): Self = StObject.set(x, "managedInstances", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
