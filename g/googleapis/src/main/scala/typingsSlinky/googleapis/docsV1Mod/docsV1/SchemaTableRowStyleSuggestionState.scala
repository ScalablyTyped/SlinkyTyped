package typingsSlinky.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A mask that indicates which of the fields on the base TableRowStyle have
  * been changed in this suggestion. For any field set to true, there is a new
  * suggested value.
  */
@js.native
trait SchemaTableRowStyleSuggestionState extends js.Object {
  /**
    * Indicates if there was a suggested change to min_row_height.
    */
  var minRowHeightSuggested: js.UndefOr[Boolean] = js.native
}

object SchemaTableRowStyleSuggestionState {
  @scala.inline
  def apply(): SchemaTableRowStyleSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTableRowStyleSuggestionState]
  }
  @scala.inline
  implicit class SchemaTableRowStyleSuggestionStateOps[Self <: SchemaTableRowStyleSuggestionState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMinRowHeightSuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minRowHeightSuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinRowHeightSuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minRowHeightSuggested")(js.undefined)
        ret
    }
  }
  
}

