package typingsSlinky.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A mask that indicates which of the fields on the base Background have been
  * changed in this suggestion. For any field set to true, the Backgound has a
  * new suggested value.
  */
@js.native
trait SchemaBackgroundSuggestionState extends js.Object {
  /**
    * Indicates whether the current background color has been modified in this
    * suggestion.
    */
  var backgroundColorSuggested: js.UndefOr[Boolean] = js.native
}

object SchemaBackgroundSuggestionState {
  @scala.inline
  def apply(): SchemaBackgroundSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBackgroundSuggestionState]
  }
  @scala.inline
  implicit class SchemaBackgroundSuggestionStateOps[Self <: SchemaBackgroundSuggestionState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundColorSuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColorSuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColorSuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColorSuggested")(js.undefined)
        ret
    }
  }
  
}

