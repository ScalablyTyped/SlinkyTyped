package typingsSlinky.openapiTypes.mod.OpenAPIV2

import typingsSlinky.openapiTypes.openapiTypesStrings.apiKey
import typingsSlinky.openapiTypes.openapiTypesStrings.basic
import typingsSlinky.openapiTypes.openapiTypesStrings.oauth2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecuritySchemeObjectBase extends js.Object {
  
  var description: js.UndefOr[String] = js.native
  
  var `type`: basic | apiKey | oauth2 = js.native
}
object SecuritySchemeObjectBase {
  
  @scala.inline
  def apply(`type`: basic | apiKey | oauth2): SecuritySchemeObjectBase = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecuritySchemeObjectBase]
  }
  
  @scala.inline
  implicit class SecuritySchemeObjectBaseOps[Self <: SecuritySchemeObjectBase] (val x: Self) extends AnyVal {
    
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
    def setType(value: basic | apiKey | oauth2): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
  }
}
