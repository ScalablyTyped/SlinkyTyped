package typingsSlinky.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateEmbeddedObjectPositionRequest extends js.Object {
  
  /**
    * The fields of OverlayPosition
    * that should be updated when setting a new position. Used only if
    * newPosition.overlayPosition
    * is set, in which case at least one field must
    * be specified.  The root `newPosition.overlayPosition` is implied and
    * should not be specified.
    * A single `"&#42;"` can be used as short-hand for listing every field.
    */
  var fields: js.UndefOr[String] = js.native
  
  /**
    * An explicit position to move the embedded object to.
    * If newPosition.sheetId is set,
    * a new sheet with that ID will be created.
    * If newPosition.newSheet is set to true,
    * a new sheet will be created with an ID that will be chosen for you.
    */
  var newPosition: js.UndefOr[EmbeddedObjectPosition] = js.native
  
  /** The ID of the object to moved. */
  var objectId: js.UndefOr[Double] = js.native
}
object UpdateEmbeddedObjectPositionRequest {
  
  @scala.inline
  def apply(): UpdateEmbeddedObjectPositionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateEmbeddedObjectPositionRequest]
  }
  
  @scala.inline
  implicit class UpdateEmbeddedObjectPositionRequestOps[Self <: UpdateEmbeddedObjectPositionRequest] (val x: Self) extends AnyVal {
    
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
    def setFields(value: String): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setNewPosition(value: EmbeddedObjectPosition): Self = this.set("newPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewPosition: Self = this.set("newPosition", js.undefined)
    
    @scala.inline
    def setObjectId(value: Double): Self = this.set("objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectId: Self = this.set("objectId", js.undefined)
  }
}
