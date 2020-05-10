package typingsSlinky.officeUiFabricReact.baseFloatingPickerTypesMod

import typingsSlinky.officeUiFabricReact.suggestionsDottypesMod.ISuggestionsHeaderFooterProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/FloatingPicker/Suggestions/Suggestions.types.ISuggestionsControlProps<any>, 'shouldSelectFirstItem' | 'headerItemsProps' | 'footerItemsProps' | 'showRemoveButtons'> */
@js.native
trait IBaseFloatingPickerSuggestionProps extends js.Object {
  var footerItemsProps: js.UndefOr[js.Array[ISuggestionsHeaderFooterProps]] = js.native
  var headerItemsProps: js.UndefOr[js.Array[ISuggestionsHeaderFooterProps]] = js.native
  var shouldSelectFirstItem: js.UndefOr[js.Function0[Boolean]] = js.native
  var showRemoveButtons: js.UndefOr[Boolean] = js.native
}

object IBaseFloatingPickerSuggestionProps {
  @scala.inline
  def apply(): IBaseFloatingPickerSuggestionProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBaseFloatingPickerSuggestionProps]
  }
  @scala.inline
  implicit class IBaseFloatingPickerSuggestionPropsOps[Self <: IBaseFloatingPickerSuggestionProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFooterItemsProps(value: js.Array[ISuggestionsHeaderFooterProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerItemsProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooterItemsProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerItemsProps")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderItemsProps(value: js.Array[ISuggestionsHeaderFooterProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerItemsProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderItemsProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerItemsProps")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldSelectFirstItem(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldSelectFirstItem")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutShouldSelectFirstItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldSelectFirstItem")(js.undefined)
        ret
    }
    @scala.inline
    def withShowRemoveButtons(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRemoveButtons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowRemoveButtons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRemoveButtons")(js.undefined)
        ret
    }
  }
  
}

