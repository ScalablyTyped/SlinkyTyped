package typingsSlinky.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A suggestion state of a NamedStyle message.
  */
@js.native
trait SchemaNamedStyleSuggestionState extends js.Object {
  /**
    * The named style type that this suggestion state corresponds to.  This
    * field is provided as a convenience for matching the
    * NamedStyleSuggestionState with its corresponding NamedStyle.
    */
  var namedStyleType: js.UndefOr[String] = js.native
  /**
    * A mask that indicates which of the fields in paragraph style have been
    * changed in this suggestion.
    */
  var paragraphStyleSuggestionState: js.UndefOr[SchemaParagraphStyleSuggestionState] = js.native
  /**
    * A mask that indicates which of the fields in text style have been changed
    * in this suggestion.
    */
  var textStyleSuggestionState: js.UndefOr[SchemaTextStyleSuggestionState] = js.native
}

object SchemaNamedStyleSuggestionState {
  @scala.inline
  def apply(): SchemaNamedStyleSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNamedStyleSuggestionState]
  }
  @scala.inline
  implicit class SchemaNamedStyleSuggestionStateOps[Self <: SchemaNamedStyleSuggestionState] (val x: Self) extends AnyVal {
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
    def withParagraphStyleSuggestionState(value: SchemaParagraphStyleSuggestionState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paragraphStyleSuggestionState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParagraphStyleSuggestionState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paragraphStyleSuggestionState")(js.undefined)
        ret
    }
    @scala.inline
    def withTextStyleSuggestionState(value: SchemaTextStyleSuggestionState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textStyleSuggestionState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextStyleSuggestionState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textStyleSuggestionState")(js.undefined)
        ret
    }
  }
  
}

