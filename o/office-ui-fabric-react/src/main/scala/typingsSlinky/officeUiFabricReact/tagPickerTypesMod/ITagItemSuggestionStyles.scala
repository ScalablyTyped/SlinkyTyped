package typingsSlinky.officeUiFabricReact.tagPickerTypesMod

import typingsSlinky.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITagItemSuggestionStyles extends js.Object {
  /** Refers to the text element of the TagItemSuggestion */
  var suggestionTextOverflow: js.UndefOr[IStyle] = js.native
}

object ITagItemSuggestionStyles {
  @scala.inline
  def apply(): ITagItemSuggestionStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITagItemSuggestionStyles]
  }
  @scala.inline
  implicit class ITagItemSuggestionStylesOps[Self <: ITagItemSuggestionStyles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSuggestionTextOverflow(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestionTextOverflow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggestionTextOverflow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestionTextOverflow")(js.undefined)
        ret
    }
    @scala.inline
    def withSuggestionTextOverflowNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestionTextOverflow")(null)
        ret
    }
  }
  
}

