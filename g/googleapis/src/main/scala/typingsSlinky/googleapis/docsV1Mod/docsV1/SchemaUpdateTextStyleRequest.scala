package typingsSlinky.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Update the styling of text.
  */
@js.native
trait SchemaUpdateTextStyleRequest extends js.Object {
  /**
    * The fields that should be updated.  At least one field must be specified.
    * The root `text_style` is implied and should not be specified. A single
    * `&quot;*&quot;` can be used as short-hand for listing every field.  For
    * example, to update the text style to bold, set `fields` to
    * `&quot;bold&quot;`.  To reset a property to its default value, include
    * its field name in the field mask but leave the field itself unset.
    */
  var fields: js.UndefOr[String] = js.native
  /**
    * The range of text to style.  The range may be extended to include
    * adjacent newlines.  If the range fully contains a paragraph belonging to
    * a list, the paragraph&#39;s bullet is also updated with the matching text
    * style.
    */
  var range: js.UndefOr[SchemaRange] = js.native
  /**
    * The styles to set on the text.  If the value for a particular style
    * matches that of the parent, that style will be set to inherit.  Certain
    * text style changes may cause other changes in order to to mirror the
    * behavior of the Docs editor. See the documentation of TextStyle for more
    * information.
    */
  var textStyle: js.UndefOr[SchemaTextStyle] = js.native
}

object SchemaUpdateTextStyleRequest {
  @scala.inline
  def apply(): SchemaUpdateTextStyleRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateTextStyleRequest]
  }
  @scala.inline
  implicit class SchemaUpdateTextStyleRequestOps[Self <: SchemaUpdateTextStyleRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withRange(value: SchemaRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(js.undefined)
        ret
    }
    @scala.inline
    def withTextStyle(value: SchemaTextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textStyle")(js.undefined)
        ret
    }
  }
  
}

