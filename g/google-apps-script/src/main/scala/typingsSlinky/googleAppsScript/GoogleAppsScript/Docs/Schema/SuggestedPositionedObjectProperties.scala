package typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuggestedPositionedObjectProperties extends js.Object {
  var positionedObjectProperties: js.UndefOr[PositionedObjectProperties] = js.native
  var positionedObjectPropertiesSuggestionState: js.UndefOr[PositionedObjectPropertiesSuggestionState] = js.native
}

object SuggestedPositionedObjectProperties {
  @scala.inline
  def apply(): SuggestedPositionedObjectProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuggestedPositionedObjectProperties]
  }
  @scala.inline
  implicit class SuggestedPositionedObjectPropertiesOps[Self <: SuggestedPositionedObjectProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPositionedObjectProperties(value: PositionedObjectProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionedObjectProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPositionedObjectProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionedObjectProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withPositionedObjectPropertiesSuggestionState(value: PositionedObjectPropertiesSuggestionState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionedObjectPropertiesSuggestionState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPositionedObjectPropertiesSuggestionState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionedObjectPropertiesSuggestionState")(js.undefined)
        ret
    }
  }
  
}

