package typingsSlinky.openapiTypes.mod.OpenAPIV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContactObject extends StObject {
  
  var email: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var url: js.UndefOr[String] = js.native
}
object ContactObject {
  
  @scala.inline
  def apply(): ContactObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContactObject]
  }
  
  @scala.inline
  implicit class ContactObjectMutableBuilder[Self <: ContactObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
