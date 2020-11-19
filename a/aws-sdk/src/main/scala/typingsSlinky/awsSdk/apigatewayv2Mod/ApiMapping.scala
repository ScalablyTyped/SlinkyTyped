package typingsSlinky.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApiMapping extends js.Object {
  
  /**
    * The API identifier.
    */
  var ApiId: Id = js.native
  
  /**
    * The API mapping identifier.
    */
  var ApiMappingId: js.UndefOr[Id] = js.native
  
  /**
    * The API mapping key.
    */
  var ApiMappingKey: js.UndefOr[SelectionKey] = js.native
  
  /**
    * The API stage.
    */
  var Stage: StringWithLengthBetween1And128 = js.native
}
object ApiMapping {
  
  @scala.inline
  def apply(ApiId: Id, Stage: StringWithLengthBetween1And128): ApiMapping = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any], Stage = Stage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiMapping]
  }
  
  @scala.inline
  implicit class ApiMappingOps[Self <: ApiMapping] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApiId(value: Id): Self = this.set("ApiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStage(value: StringWithLengthBetween1And128): Self = this.set("Stage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiMappingId(value: Id): Self = this.set("ApiMappingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiMappingId: Self = this.set("ApiMappingId", js.undefined)
    
    @scala.inline
    def setApiMappingKey(value: SelectionKey): Self = this.set("ApiMappingKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiMappingKey: Self = this.set("ApiMappingKey", js.undefined)
  }
}
