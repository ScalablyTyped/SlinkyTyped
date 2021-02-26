package typingsSlinky.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetTemplateResponse extends StObject {
  
  var Template: js.UndefOr[typingsSlinky.awsSdk.sesMod.Template] = js.native
}
object GetTemplateResponse {
  
  @scala.inline
  def apply(): GetTemplateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTemplateResponse]
  }
  
  @scala.inline
  implicit class GetTemplateResponseMutableBuilder[Self <: GetTemplateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTemplate(value: Template): Self = StObject.set(x, "Template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateUndefined: Self = StObject.set(x, "Template", js.undefined)
  }
}
