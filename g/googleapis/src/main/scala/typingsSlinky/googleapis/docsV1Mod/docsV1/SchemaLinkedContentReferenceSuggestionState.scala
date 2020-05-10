package typingsSlinky.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A mask that indicates which of the fields on the base
  * LinkedContentReference have been changed in this suggestion. For any field
  * set to true, there is a new suggested value.
  */
@js.native
trait SchemaLinkedContentReferenceSuggestionState extends js.Object {
  /**
    * A mask that indicates which of the fields in sheets_chart_reference have
    * been changed in this suggestion.
    */
  var sheetsChartReferenceSuggestionState: js.UndefOr[SchemaSheetsChartReferenceSuggestionState] = js.native
}

object SchemaLinkedContentReferenceSuggestionState {
  @scala.inline
  def apply(): SchemaLinkedContentReferenceSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLinkedContentReferenceSuggestionState]
  }
  @scala.inline
  implicit class SchemaLinkedContentReferenceSuggestionStateOps[Self <: SchemaLinkedContentReferenceSuggestionState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSheetsChartReferenceSuggestionState(value: SchemaSheetsChartReferenceSuggestionState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheetsChartReferenceSuggestionState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSheetsChartReferenceSuggestionState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheetsChartReferenceSuggestionState")(js.undefined)
        ret
    }
  }
  
}

