package typingsSlinky.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A suggested change to the DocumentStyle.
  */
@js.native
trait SchemaSuggestedDocumentStyle extends js.Object {
  /**
    * A DocumentStyle that only includes the changes made in this suggestion.
    * This can be used along with the document_style_suggestion_state to see
    * which fields have changed and their new values.
    */
  var documentStyle: js.UndefOr[SchemaDocumentStyle] = js.native
  /**
    * A mask that indicates which of the fields on the base DocumentStyle have
    * been changed in this suggestion.
    */
  var documentStyleSuggestionState: js.UndefOr[SchemaDocumentStyleSuggestionState] = js.native
}

object SchemaSuggestedDocumentStyle {
  @scala.inline
  def apply(): SchemaSuggestedDocumentStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSuggestedDocumentStyle]
  }
  @scala.inline
  implicit class SchemaSuggestedDocumentStyleOps[Self <: SchemaSuggestedDocumentStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocumentStyle(value: SchemaDocumentStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withDocumentStyleSuggestionState(value: SchemaDocumentStyleSuggestionState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentStyleSuggestionState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentStyleSuggestionState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentStyleSuggestionState")(js.undefined)
        ret
    }
  }
  
}

