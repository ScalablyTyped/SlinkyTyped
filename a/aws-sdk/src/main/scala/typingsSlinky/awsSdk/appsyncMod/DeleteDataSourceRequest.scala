package typingsSlinky.awsSdk.appsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteDataSourceRequest extends StObject {
  
  /**
    * The API ID.
    */
  var apiId: String = js.native
  
  /**
    * The name of the data source.
    */
  var name: ResourceName = js.native
}
object DeleteDataSourceRequest {
  
  @scala.inline
  def apply(apiId: String, name: ResourceName): DeleteDataSourceRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDataSourceRequest]
  }
  
  @scala.inline
  implicit class DeleteDataSourceRequestMutableBuilder[Self <: DeleteDataSourceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiId(value: String): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
