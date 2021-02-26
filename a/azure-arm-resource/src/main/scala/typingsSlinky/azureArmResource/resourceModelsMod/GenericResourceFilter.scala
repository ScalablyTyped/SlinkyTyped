package typingsSlinky.azureArmResource.resourceModelsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GenericResourceFilter extends StObject {
  
  /**
    * The resource type.
    */
  var resourceType: js.UndefOr[String] = js.native
  
  /**
    * The tag name.
    */
  var tagname: js.UndefOr[String] = js.native
  
  /**
    * The tag value.
    */
  var tagvalue: js.UndefOr[String] = js.native
}
object GenericResourceFilter {
  
  @scala.inline
  def apply(): GenericResourceFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenericResourceFilter]
  }
  
  @scala.inline
  implicit class GenericResourceFilterMutableBuilder[Self <: GenericResourceFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceType(value: String): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    
    @scala.inline
    def setTagname(value: String): Self = StObject.set(x, "tagname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagnameUndefined: Self = StObject.set(x, "tagname", js.undefined)
    
    @scala.inline
    def setTagvalue(value: String): Self = StObject.set(x, "tagvalue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagvalueUndefined: Self = StObject.set(x, "tagvalue", js.undefined)
  }
}
