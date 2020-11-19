package typingsSlinky.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Deletes an object, either pages or page elements, from the presentation.
  */
@js.native
trait SchemaDeleteObjectRequest extends js.Object {
  
  /**
    * The object ID of the page or page element to delete.  If after a delete
    * operation a group contains only 1 or no page elements, the group is also
    * deleted.  If a placeholder is deleted on a layout, any empty inheriting
    * shapes are also deleted.
    */
  var objectId: js.UndefOr[String] = js.native
}
object SchemaDeleteObjectRequest {
  
  @scala.inline
  def apply(): SchemaDeleteObjectRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeleteObjectRequest]
  }
  
  @scala.inline
  implicit class SchemaDeleteObjectRequestOps[Self <: SchemaDeleteObjectRequest] (val x: Self) extends AnyVal {
    
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
    def setObjectId(value: String): Self = this.set("objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectId: Self = this.set("objectId", js.undefined)
  }
}
