package typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuggestedNamedStyles extends js.Object {
  var namedStyles: js.UndefOr[NamedStyles] = js.native
  var namedStylesSuggestionState: js.UndefOr[NamedStylesSuggestionState] = js.native
}

object SuggestedNamedStyles {
  @scala.inline
  def apply(): SuggestedNamedStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuggestedNamedStyles]
  }
  @scala.inline
  implicit class SuggestedNamedStylesOps[Self <: SuggestedNamedStyles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNamedStyles(value: NamedStyles): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namedStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamedStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namedStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withNamedStylesSuggestionState(value: NamedStylesSuggestionState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namedStylesSuggestionState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamedStylesSuggestionState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namedStylesSuggestionState")(js.undefined)
        ret
    }
  }
  
}

