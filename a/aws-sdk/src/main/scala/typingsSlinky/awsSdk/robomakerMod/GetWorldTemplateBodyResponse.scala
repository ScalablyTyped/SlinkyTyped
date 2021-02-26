package typingsSlinky.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetWorldTemplateBodyResponse extends StObject {
  
  /**
    * The world template body.
    */
  var templateBody: js.UndefOr[Json] = js.native
}
object GetWorldTemplateBodyResponse {
  
  @scala.inline
  def apply(): GetWorldTemplateBodyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetWorldTemplateBodyResponse]
  }
  
  @scala.inline
  implicit class GetWorldTemplateBodyResponseMutableBuilder[Self <: GetWorldTemplateBodyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTemplateBody(value: Json): Self = StObject.set(x, "templateBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateBodyUndefined: Self = StObject.set(x, "templateBody", js.undefined)
  }
}
