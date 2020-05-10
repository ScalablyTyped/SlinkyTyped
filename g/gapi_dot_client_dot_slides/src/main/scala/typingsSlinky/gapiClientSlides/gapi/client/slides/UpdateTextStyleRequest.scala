package typingsSlinky.gapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateTextStyleRequest extends js.Object {
  /**
    * The location of the cell in the table containing the text to style. If
    * `object_id` refers to a table, `cell_location` must have a value.
    * Otherwise, it must not.
    */
  var cellLocation: js.UndefOr[TableCellLocation] = js.native
  /**
    * The fields that should be updated.
    *
    * At least one field must be specified. The root `style` is implied and
    * should not be specified. A single `"&#42;"` can be used as short-hand for
    * listing every field.
    *
    * For example, to update the text style to bold, set `fields` to `"bold"`.
    *
    * To reset a property to its default value, include its field name in the
    * field mask but leave the field itself unset.
    */
  var fields: js.UndefOr[String] = js.native
  /** The object ID of the shape or table with the text to be styled. */
  var objectId: js.UndefOr[String] = js.native
  /**
    * The style(s) to set on the text.
    *
    * If the value for a particular style matches that of the parent, that style
    * will be set to inherit.
    *
    * Certain text style changes may cause other changes meant to mirror the
    * behavior of the Slides editor. See the documentation of
    * TextStyle for more information.
    */
  var style: js.UndefOr[TextStyle] = js.native
  /**
    * The range of text to style.
    *
    * The range may be extended to include adjacent newlines.
    *
    * If the range fully contains a paragraph belonging to a list, the
    * paragraph's bullet is also updated with the matching text style.
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
  implicit class UpdateTextStyleRequestOps[Self <: UpdateTextStyleRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCellLocation(value: TableCellLocation): Self = {
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
    def withStyle(value: TextStyle): Self = {
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
    def withTextRange(value: Range): Self = {
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

