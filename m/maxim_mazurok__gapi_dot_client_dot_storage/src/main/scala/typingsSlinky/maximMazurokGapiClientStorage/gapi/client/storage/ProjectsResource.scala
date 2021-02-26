package typingsSlinky.maximMazurokGapiClientStorage.gapi.client.storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectsResource extends StObject {
  
  var hmacKeys: HmacKeysResource = js.native
  
  var serviceAccount: ServiceAccountResource = js.native
}
object ProjectsResource {
  
  @scala.inline
  def apply(hmacKeys: HmacKeysResource, serviceAccount: ServiceAccountResource): ProjectsResource = {
    val __obj = js.Dynamic.literal(hmacKeys = hmacKeys.asInstanceOf[js.Any], serviceAccount = serviceAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsResource]
  }
  
  @scala.inline
  implicit class ProjectsResourceMutableBuilder[Self <: ProjectsResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHmacKeys(value: HmacKeysResource): Self = StObject.set(x, "hmacKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceAccount(value: ServiceAccountResource): Self = StObject.set(x, "serviceAccount", value.asInstanceOf[js.Any])
  }
}
