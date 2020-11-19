package typingsSlinky.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateModelResponse extends js.Object {
  
  /**
    * The content-type for the model, for example, "application/json".
    */
  var ContentType: js.UndefOr[StringWithLengthBetween1And256] = js.native
  
  /**
    * The description of the model.
    */
  var Description: js.UndefOr[StringWithLengthBetween0And1024] = js.native
  
  /**
    * The model identifier.
    */
  var ModelId: js.UndefOr[Id] = js.native
  
  /**
    * The name of the model. Must be alphanumeric.
    */
  var Name: js.UndefOr[StringWithLengthBetween1And128] = js.native
  
  /**
    * The schema for the model. For application/json models, this should be JSON schema draft 4 model.
    */
  var Schema: js.UndefOr[StringWithLengthBetween0And32K] = js.native
}
object CreateModelResponse {
  
  @scala.inline
  def apply(): CreateModelResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateModelResponse]
  }
  
  @scala.inline
  implicit class CreateModelResponseOps[Self <: CreateModelResponse] (val x: Self) extends AnyVal {
    
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
    def setContentType(value: StringWithLengthBetween1And256): Self = this.set("ContentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentType: Self = this.set("ContentType", js.undefined)
    
    @scala.inline
    def setDescription(value: StringWithLengthBetween0And1024): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setModelId(value: Id): Self = this.set("ModelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModelId: Self = this.set("ModelId", js.undefined)
    
    @scala.inline
    def setName(value: StringWithLengthBetween1And128): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setSchema(value: StringWithLengthBetween0And32K): Self = this.set("Schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchema: Self = this.set("Schema", js.undefined)
  }
}
