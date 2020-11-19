package typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PositionedObject extends js.Object {
  
  var objectId: js.UndefOr[String] = js.native
  
  var positionedObjectProperties: js.UndefOr[PositionedObjectProperties] = js.native
  
  var suggestedDeletionIds: js.UndefOr[js.Array[String]] = js.native
  
  var suggestedInsertionId: js.UndefOr[String] = js.native
  
  var suggestedPositionedObjectPropertiesChanges: js.UndefOr[js.Object] = js.native
}
object PositionedObject {
  
  @scala.inline
  def apply(): PositionedObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PositionedObject]
  }
  
  @scala.inline
  implicit class PositionedObjectOps[Self <: PositionedObject] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setPositionedObjectProperties(value: PositionedObjectProperties): Self = this.set("positionedObjectProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePositionedObjectProperties: Self = this.set("positionedObjectProperties", js.undefined)
    
    @scala.inline
    def setSuggestedDeletionIdsVarargs(value: String*): Self = this.set("suggestedDeletionIds", js.Array(value :_*))
    
    @scala.inline
    def setSuggestedDeletionIds(value: js.Array[String]): Self = this.set("suggestedDeletionIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggestedDeletionIds: Self = this.set("suggestedDeletionIds", js.undefined)
    
    @scala.inline
    def setSuggestedInsertionId(value: String): Self = this.set("suggestedInsertionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggestedInsertionId: Self = this.set("suggestedInsertionId", js.undefined)
    
    @scala.inline
    def setSuggestedPositionedObjectPropertiesChanges(value: js.Object): Self = this.set("suggestedPositionedObjectPropertiesChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggestedPositionedObjectPropertiesChanges: Self = this.set("suggestedPositionedObjectPropertiesChanges", js.undefined)
  }
}
