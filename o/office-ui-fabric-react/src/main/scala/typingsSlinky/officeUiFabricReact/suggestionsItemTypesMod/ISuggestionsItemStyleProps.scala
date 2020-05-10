package typingsSlinky.officeUiFabricReact.suggestionsItemTypesMod

import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/pickers/Suggestions/SuggestionsItem.types.ISuggestionItemProps<any>, 'theme'>> & std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/pickers/Suggestions/SuggestionsItem.types.ISuggestionItemProps<any>, 'className'> & {  suggested ? :boolean} */
@js.native
trait ISuggestionsItemStyleProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  /** Whether the suggestion item is selected or not. */
  var suggested: js.UndefOr[Boolean] = js.native
  var theme: ITheme = js.native
}

object ISuggestionsItemStyleProps {
  @scala.inline
  def apply(theme: ITheme): ISuggestionsItemStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISuggestionsItemStyleProps]
  }
  @scala.inline
  implicit class ISuggestionsItemStylePropsOps[Self <: ISuggestionsItemStyleProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTheme(value: ITheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withSuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggested")(js.undefined)
        ret
    }
  }
  
}

