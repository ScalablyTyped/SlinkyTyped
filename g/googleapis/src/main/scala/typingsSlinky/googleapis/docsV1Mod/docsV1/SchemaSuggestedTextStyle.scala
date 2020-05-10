package typingsSlinky.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A suggested change to a TextStyle.
  */
@js.native
trait SchemaSuggestedTextStyle extends js.Object {
  /**
    * A TextStyle that only includes the changes made in this suggestion. This
    * can be used along with the text_style_suggestion_state to see which
    * fields have changed and their new values.
    */
  var textStyle: js.UndefOr[SchemaTextStyle] = js.native
  /**
    * A mask that indicates which of the fields on the base TextStyle have been
    * changed in this suggestion.
    */
  var textStyleSuggestionState: js.UndefOr[SchemaTextStyleSuggestionState] = js.native
}

object SchemaSuggestedTextStyle {
  @scala.inline
  def apply(): SchemaSuggestedTextStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSuggestedTextStyle]
  }
  @scala.inline
  implicit class SchemaSuggestedTextStyleOps[Self <: SchemaSuggestedTextStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

