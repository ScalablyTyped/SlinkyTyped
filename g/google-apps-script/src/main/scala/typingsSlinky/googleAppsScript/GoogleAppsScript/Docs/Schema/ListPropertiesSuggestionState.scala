package typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPropertiesSuggestionState extends js.Object {
  var nestingLevelsSuggestionStates: js.UndefOr[js.Array[NestingLevelSuggestionState]] = js.native
}

object ListPropertiesSuggestionState {
  @scala.inline
  def apply(): ListPropertiesSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPropertiesSuggestionState]
  }
  @scala.inline
  implicit class ListPropertiesSuggestionStateOps[Self <: ListPropertiesSuggestionState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNestingLevelsSuggestionStates(value: js.Array[NestingLevelSuggestionState]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nestingLevelsSuggestionStates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNestingLevelsSuggestionStates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nestingLevelsSuggestionStates")(js.undefined)
        ret
    }
  }
  
}

