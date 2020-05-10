package typingsSlinky.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Updates the styling for all of the paragraphs within a Shape or Table that
  * overlap with the given text index range.
  */
@js.native
trait SchemaUpdateParagraphStyleRequest extends js.Object {
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
  implicit class SchemaUpdateParagraphStyleRequestOps[Self <: SchemaUpdateParagraphStyleRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCellLocation(value: SchemaTableCellLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withFields(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectId")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: SchemaParagraphStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withTextRange(value: SchemaRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textRange")(js.undefined)
        ret
    }
  }
  
}

