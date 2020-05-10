package typingsSlinky.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A suggested change to a ParagraphStyle.
  */
@js.native
trait SchemaSuggestedParagraphStyle extends js.Object {
  /**
    * A ParagraphStyle that only includes the changes made in this suggestion.
    * This can be used along with the paragraph_suggestion_state to see which
    * fields have changed and their new values.
    */
  var paragraphStyle: js.UndefOr[SchemaParagraphStyle] = js.native
  /**
    * A mask that indicates which of the fields on the base ParagraphStyle have
    * been changed in this suggestion.
    */
  var paragraphStyleSuggestionState: js.UndefOr[SchemaParagraphStyleSuggestionState] = js.native
}

object SchemaSuggestedParagraphStyle {
  @scala.inline
  def apply(): SchemaSuggestedParagraphStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSuggestedParagraphStyle]
  }
  @scala.inline
  implicit class SchemaSuggestedParagraphStyleOps[Self <: SchemaSuggestedParagraphStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
  }
  
}

