package typingsSlinky.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Updates the styling for all of the paragraphs within a Shape or Table that
  * overlap with the given text index range.
  */
@js.native
trait SchemaUpdateParagraphStyleRequest extends StObject {
  
  /**
    * The location of the cell in the table containing the paragraph(s) to
    * style. If `object_id` refers to a table, `cell_location` must have a
    * value. Otherwise, it must not.
    */
  var cellLocation: js.UndefOr[SchemaTableCellLocation] = js.native
  
  /**
    * The fields that should be updated.  At least one field must be specified.
    * The root `style` is implied and should not be specified. A single
    * `&quot;*&quot;` can be used as short-hand for listing every field.  For
    * example, to update the paragraph alignment, set `fields` to
    * `&quot;alignment&quot;`.  To reset a property to its default value,
    * include its field name in the field mask but leave the field itself
    * unset.
    */
  var fields: js.UndefOr[String] = js.native
  
  /**
    * The object ID of the shape or table with the text to be styled.
    */
  var objectId: js.UndefOr[String] = js.native
  
  /**
    * The paragraph&#39;s style.
    */
  var style: js.UndefOr[SchemaParagraphStyle] = js.native
  
  /**
    * The range of text containing the paragraph(s) to style.
    */
  var textRange: js.UndefOr[SchemaRange] = js.native
}
object SchemaUpdateParagraphStyleRequest {
  
  @scala.inline
  def apply(): SchemaUpdateParagraphStyleRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateParagraphStyleRequest]
  }
  
  @scala.inline
  implicit class SchemaUpdateParagraphStyleRequestMutableBuilder[Self <: SchemaUpdateParagraphStyleRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCellLocation(value: SchemaTableCellLocation): Self = StObject.set(x, "cellLocation", value.asInstanceOf[js.Any])
    
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
    def setStyle(value: SchemaParagraphStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTextRange(value: SchemaRange): Self = StObject.set(x, "textRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextRangeUndefined: Self = StObject.set(x, "textRange", js.undefined)
  }
}
