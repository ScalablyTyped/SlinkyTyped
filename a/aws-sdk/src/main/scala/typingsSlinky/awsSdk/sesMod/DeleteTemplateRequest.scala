package typingsSlinky.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteTemplateRequest extends StObject {
  
  /**
    * The name of the template to be deleted.
    */
  var TemplateName: typingsSlinky.awsSdk.sesMod.TemplateName = js.native
}
object DeleteTemplateRequest {
  
  @scala.inline
  def apply(TemplateName: TemplateName): DeleteTemplateRequest = {
    val __obj = js.Dynamic.literal(TemplateName = TemplateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTemplateRequest]
  }
  
  @scala.inline
  implicit class DeleteTemplateRequestMutableBuilder[Self <: DeleteTemplateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTemplateName(value: TemplateName): Self = StObject.set(x, "TemplateName", value.asInstanceOf[js.Any])
  }
}
