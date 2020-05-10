package typingsSlinky.officeUiFabricReact.basePickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBasePickerState extends js.Object {
  var isFocused: js.UndefOr[Boolean] = js.native
  var isMostRecentlyUsedVisible: js.UndefOr[Boolean] = js.native
  var isResultsFooterVisible: js.UndefOr[Boolean] = js.native
  var isSearching: js.UndefOr[Boolean] = js.native
  var items: js.UndefOr[js.Any] = js.native
  var moreSuggestionsAvailable: js.UndefOr[Boolean] = js.native
  var selectedIndices: js.UndefOr[js.Array[Double]] = js.native
  var suggestedDisplayValue: js.UndefOr[String] = js.native
  var suggestionsLoading: js.UndefOr[Boolean] = js.native
  var suggestionsVisible: js.UndefOr[Boolean] = js.native
}

object IBasePickerState {
  @scala.inline
  def apply(): IBasePickerState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBasePickerState]
  }
  @scala.inline
  implicit class IBasePickerStateOps[Self <: IBasePickerState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsFocused(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFocused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsFocused: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFocused")(js.undefined)
        ret
    }
    @scala.inline
    def withIsMostRecentlyUsedVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMostRecentlyUsedVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsMostRecentlyUsedVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMostRecentlyUsedVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withIsResultsFooterVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isResultsFooterVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsResultsFooterVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isResultsFooterVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withIsSearching(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSearching")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSearching: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSearching")(js.undefined)
        ret
    }
    @scala.inline
    def withItems(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
    @scala.inline
    def withMoreSuggestionsAvailable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moreSuggestionsAvailable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMoreSuggestionsAvailable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moreSuggestionsAvailable")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedIndices(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedIndices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedIndices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedIndices")(js.undefined)
        ret
    }
    @scala.inline
    def withSuggestedDisplayValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestedDisplayValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggestedDisplayValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestedDisplayValue")(js.undefined)
        ret
    }
    @scala.inline
    def withSuggestionsLoading(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestionsLoading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggestionsLoading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestionsLoading")(js.undefined)
        ret
    }
    @scala.inline
    def withSuggestionsVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestionsVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggestionsVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestionsVisible")(js.undefined)
        ret
    }
  }
  
}

