package typingsSlinky.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A named style. Paragraphs in the document can inherit their TextStyle and
  * ParagraphStyle from this named style when they have the same named style
  * type.
  */
@js.native
trait SchemaNamedStyle extends js.Object {
  /**
    * The type of this named style.
    */
  var namedStyleType: js.UndefOr[String] = js.native
  /**
    * The paragraph style of this named style.
    */
  var paragraphStyle: js.UndefOr[SchemaParagraphStyle] = js.native
  /**
    * The text style of this named style.
    */
  var textStyle: js.UndefOr[SchemaTextStyle] = js.native
}

object SchemaNamedStyle {
  @scala.inline
  def apply(): SchemaNamedStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNamedStyle]
  }
  @scala.inline
  implicit class SchemaNamedStyleOps[Self <: SchemaNamedStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNamedStyleType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namedStyleType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamedStyleType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namedStyleType")(js.undefined)
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

