package typingsSlinky.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteWorldTemplateRequest extends StObject {
  
  /**
    * The Amazon Resource Name (arn) of the world template you want to delete.
    */
  var template: Arn = js.native
}
object DeleteWorldTemplateRequest {
  
  @scala.inline
  def apply(template: Arn): DeleteWorldTemplateRequest = {
    val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteWorldTemplateRequest]
  }
  
  @scala.inline
  implicit class DeleteWorldTemplateRequestMutableBuilder[Self <: DeleteWorldTemplateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTemplate(value: Arn): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
  }
}
