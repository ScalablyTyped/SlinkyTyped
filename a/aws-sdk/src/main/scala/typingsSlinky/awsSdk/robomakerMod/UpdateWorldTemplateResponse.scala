package typingsSlinky.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateWorldTemplateResponse extends StObject {
  
  /**
    * The Amazon Resource Name (arn) of the world template.
    */
  var arn: js.UndefOr[Arn] = js.native
  
  /**
    * The time, in milliseconds since the epoch, when the world template was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.native
  
  /**
    * The time, in milliseconds since the epoch, when the world template was last updated.
    */
  var lastUpdatedAt: js.UndefOr[js.Date] = js.native
  
  /**
    * The name of the world template.
    */
  var name: js.UndefOr[TemplateName] = js.native
}
object UpdateWorldTemplateResponse {
  
  @scala.inline
  def apply(): UpdateWorldTemplateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateWorldTemplateResponse]
  }
  
  @scala.inline
  implicit class UpdateWorldTemplateResponseMutableBuilder[Self <: UpdateWorldTemplateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: Arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    @scala.inline
    def setLastUpdatedAt(value: js.Date): Self = StObject.set(x, "lastUpdatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedAtUndefined: Self = StObject.set(x, "lastUpdatedAt", js.undefined)
    
    @scala.inline
    def setName(value: TemplateName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
