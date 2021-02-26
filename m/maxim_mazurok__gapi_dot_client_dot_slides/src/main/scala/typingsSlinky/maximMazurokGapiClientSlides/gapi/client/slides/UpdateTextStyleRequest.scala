package typingsSlinky.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateTextStyleRequest extends StObject {
  
  /** The location of the cell in the table containing the text to style. If `object_id` refers to a table, `cell_location` must have a value. Otherwise, it must not. */
  var cellLocation: js.UndefOr[TableCellLocation] = js.native
  
  /**
    * The fields that should be updated. At least one field must be specified. The root `style` is implied and should not be specified. A single `"*"` can be used as short-hand for
    * listing every field. For example, to update the text style to bold, set `fields` to `"bold"`. To reset a property to its default value, include its field name in the field mask but
    * leave the field itself unset.
    */
  var fields: js.UndefOr[String] = js.native
  
  /** The object ID of the shape or table with the text to be styled. */
  var objectId: js.UndefOr[String] = js.native
  
  /**
    * The style(s) to set on the text. If the value for a particular style matches that of the parent, that style will be set to inherit. Certain text style changes may cause other
    * changes meant to mirror the behavior of the Slides editor. See the documentation of TextStyle for more information.
    */
  var style: js.UndefOr[TextStyle] = js.native
  
  /**
    * The range of text to style. The range may be extended to include adjacent newlines. If the range fully contains a paragraph belonging to a list, the paragraph's bullet is also
    * updated with the matching text style.
    */
  var textRange: js.UndefOr[Range] = js.native
}
object UpdateTextStyleRequest {
  
  @scala.inline
  def apply(): UpdateTextStyleRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateTextStyleRequest]
  }
  
  @scala.inline
  implicit class UpdateTextStyleRequestMutableBuilder[Self <: UpdateTextStyleRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCellLocation(value: TableCellLocation): Self = StObject.set(x, "cellLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellLocationUndefined: Self = StObject.set(x, "cellLocation", js.undefined)
    
    @scala.inline
    def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
    @scala.inline
    def setStyle(value: TextStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTextRange(value: Range): Self = StObject.set(x, "textRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextRangeUndefined: Self = StObject.set(x, "textRange", js.undefined)
  }
}
