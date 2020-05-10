package typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuggestedListProperties extends js.Object {
  var listProperties: js.UndefOr[ListProperties] = js.native
  var listPropertiesSuggestionState: js.UndefOr[ListPropertiesSuggestionState] = js.native
}

object SuggestedListProperties {
  @scala.inline
  def apply(): SuggestedListProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuggestedListProperties]
  }
  @scala.inline
  implicit class SuggestedListPropertiesOps[Self <: SuggestedListProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withListProperties(value: ListProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withListPropertiesSuggestionState(value: ListPropertiesSuggestionState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listPropertiesSuggestionState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListPropertiesSuggestionState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listPropertiesSuggestionState")(js.undefined)
        ret
    }
  }
  
}

