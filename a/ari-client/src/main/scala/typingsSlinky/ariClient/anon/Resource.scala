package typingsSlinky.ariClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Resource extends StObject {
  
  var resource: String = js.native
  
  var tech: String = js.native
}
object Resource {
  
  @scala.inline
  def apply(resource: String, tech: String): Resource = {
    val __obj = js.Dynamic.literal(resource = resource.asInstanceOf[js.Any], tech = tech.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  
  @scala.inline
  implicit class ResourceMutableBuilder[Self <: Resource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTech(value: String): Self = StObject.set(x, "tech", value.asInstanceOf[js.Any])
  }
}
