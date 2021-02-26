package typingsSlinky.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociateTagOptionWithResourceInput extends StObject {
  
  /**
    * The resource identifier.
    */
  var ResourceId: typingsSlinky.awsSdk.servicecatalogMod.ResourceId = js.native
  
  /**
    * The TagOption identifier.
    */
  var TagOptionId: typingsSlinky.awsSdk.servicecatalogMod.TagOptionId = js.native
}
object AssociateTagOptionWithResourceInput {
  
  @scala.inline
  def apply(ResourceId: ResourceId, TagOptionId: TagOptionId): AssociateTagOptionWithResourceInput = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any], TagOptionId = TagOptionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateTagOptionWithResourceInput]
  }
  
  @scala.inline
  implicit class AssociateTagOptionWithResourceInputMutableBuilder[Self <: AssociateTagOptionWithResourceInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceId(value: ResourceId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagOptionId(value: TagOptionId): Self = StObject.set(x, "TagOptionId", value.asInstanceOf[js.Any])
  }
}
