package typingsSlinky.forgeApis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateItemIncluded extends js.Object {
  
  var attributes: js.UndefOr[CreateStorageDataAttributes] = js.native
  
  var id: String = js.native
  
  var relationships: js.UndefOr[CreateItemRelationships] = js.native
  
  var `type`: String = js.native
}
object CreateItemIncluded {
  
  @scala.inline
  def apply(id: String, `type`: String): CreateItemIncluded = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateItemIncluded]
  }
  
  @scala.inline
  implicit class CreateItemIncludedOps[Self <: CreateItemIncluded] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributes(value: CreateStorageDataAttributes): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    
    @scala.inline
    def setRelationships(value: CreateItemRelationships): Self = this.set("relationships", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelationships: Self = this.set("relationships", js.undefined)
  }
}
