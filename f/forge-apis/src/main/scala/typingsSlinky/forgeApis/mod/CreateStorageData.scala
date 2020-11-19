package typingsSlinky.forgeApis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateStorageData extends js.Object {
  
  var attributes: js.UndefOr[CreateStorageDataAttributes] = js.native
  
  var relationships: js.UndefOr[CreateStorageDataRelationships] = js.native
  
  var `type`: String = js.native
}
object CreateStorageData {
  
  @scala.inline
  def apply(`type`: String): CreateStorageData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateStorageData]
  }
  
  @scala.inline
  implicit class CreateStorageDataOps[Self <: CreateStorageData] (val x: Self) extends AnyVal {
    
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
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributes(value: CreateStorageDataAttributes): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    
    @scala.inline
    def setRelationships(value: CreateStorageDataRelationships): Self = this.set("relationships", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelationships: Self = this.set("relationships", js.undefined)
  }
}
