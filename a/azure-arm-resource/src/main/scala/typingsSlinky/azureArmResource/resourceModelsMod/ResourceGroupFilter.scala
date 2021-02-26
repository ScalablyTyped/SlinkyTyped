package typingsSlinky.azureArmResource.resourceModelsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceGroupFilter extends StObject {
  
  /**
    * The tag name.
    */
  var tagName: js.UndefOr[String] = js.native
  
  /**
    * The tag value.
    */
  var tagValue: js.UndefOr[String] = js.native
}
object ResourceGroupFilter {
  
  @scala.inline
  def apply(): ResourceGroupFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceGroupFilter]
  }
  
  @scala.inline
  implicit class ResourceGroupFilterMutableBuilder[Self <: ResourceGroupFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagNameUndefined: Self = StObject.set(x, "tagName", js.undefined)
    
    @scala.inline
    def setTagValue(value: String): Self = StObject.set(x, "tagValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagValueUndefined: Self = StObject.set(x, "tagValue", js.undefined)
  }
}
