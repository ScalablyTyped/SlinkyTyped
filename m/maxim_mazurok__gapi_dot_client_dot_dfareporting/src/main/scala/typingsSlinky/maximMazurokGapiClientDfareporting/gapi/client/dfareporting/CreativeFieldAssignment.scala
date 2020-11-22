package typingsSlinky.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreativeFieldAssignment extends js.Object {
  
  /** ID of the creative field. */
  var creativeFieldId: js.UndefOr[String] = js.native
  
  /** ID of the creative field value. */
  var creativeFieldValueId: js.UndefOr[String] = js.native
}
object CreativeFieldAssignment {
  
  @scala.inline
  def apply(): CreativeFieldAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreativeFieldAssignment]
  }
  
  @scala.inline
  implicit class CreativeFieldAssignmentOps[Self <: CreativeFieldAssignment] (val x: Self) extends AnyVal {
    
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
    def setCreativeFieldId(value: String): Self = this.set("creativeFieldId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreativeFieldId: Self = this.set("creativeFieldId", js.undefined)
    
    @scala.inline
    def setCreativeFieldValueId(value: String): Self = this.set("creativeFieldValueId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreativeFieldValueId: Self = this.set("creativeFieldValueId", js.undefined)
  }
}
