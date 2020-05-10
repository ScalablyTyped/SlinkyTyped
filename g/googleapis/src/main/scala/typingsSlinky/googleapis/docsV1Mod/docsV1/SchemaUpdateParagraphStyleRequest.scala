package typingsSlinky.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Update the styling of all paragraphs that overlap with the given range.
  */
@js.native
trait SchemaUpdateParagraphStyleRequest extends js.Object {
  /**
    * The fields that should be updated.  At least one field must be specified.
    * The root `paragraph_style` is implied and should not be specified.  For
    * example, to update the paragraph style&#39;s alignment property, set
    * `fields` to `&quot;alignment&quot;`.  To reset a property to its default
    * value, include its field name in the field mask but leave the field
    * itself unset.
    */
  var fields: js.UndefOr[String] = js.native
  /**
    * The styles to set on the paragraphs.  Certain paragraph style changes may
    * cause other changes in order to mirror the behavior of the Docs editor.
    * See the documentation of ParagraphStyle for more information.
    */
  var paragraphStyle: js.UndefOr[SchemaParagraphStyle] = js.native
  /**
    * The range overlapping the paragraphs to style.
    */
  var range: js.UndefOr[SchemaRange] = js.native
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
    def withParagraphStyle(value: SchemaParagraphStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paragraphStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParagraphStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paragraphStyle")(js.undefined)
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
  }
  
}

