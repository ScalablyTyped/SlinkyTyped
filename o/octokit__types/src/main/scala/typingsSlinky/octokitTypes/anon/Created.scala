package typingsSlinky.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Created extends StObject {
  
  var created: String = js.native
  
  var lastModified: String = js.native
  
  var location: String = js.native
  
  var resourceType: String = js.native
}
object Created {
  
  @scala.inline
  def apply(created: String, lastModified: String, location: String, resourceType: String): Created = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], lastModified = lastModified.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Created]
  }
  
  @scala.inline
  implicit class CreatedMutableBuilder[Self <: Created] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModified(value: String): Self = StObject.set(x, "lastModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceType(value: String): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
