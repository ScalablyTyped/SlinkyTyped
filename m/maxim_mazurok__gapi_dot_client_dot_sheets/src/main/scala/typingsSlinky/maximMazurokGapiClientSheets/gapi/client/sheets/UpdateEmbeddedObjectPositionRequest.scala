package typingsSlinky.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateEmbeddedObjectPositionRequest extends StObject {
  
  /**
    * The fields of OverlayPosition that should be updated when setting a new position. Used only if newPosition.overlayPosition is set, in which case at least one field must be
    * specified. The root `newPosition.overlayPosition` is implied and should not be specified. A single `"*"` can be used as short-hand for listing every field.
    */
  var fields: js.UndefOr[String] = js.native
  
  /**
    * An explicit position to move the embedded object to. If newPosition.sheetId is set, a new sheet with that ID will be created. If newPosition.newSheet is set to true, a new sheet
    * will be created with an ID that will be chosen for you.
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
  implicit class UpdateEmbeddedObjectPositionRequestMutableBuilder[Self <: UpdateEmbeddedObjectPositionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setNewPosition(value: EmbeddedObjectPosition): Self = StObject.set(x, "newPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewPositionUndefined: Self = StObject.set(x, "newPosition", js.undefined)
    
    @scala.inline
    def setObjectId(value: Double): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
  }
}
