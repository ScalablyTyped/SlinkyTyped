package typingsSlinky.officeUiFabricReact.suggestionsTypesMod

import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/pickers/Suggestions/Suggestions.types.ISuggestionsProps<any>, 'theme'>> & std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/pickers/Suggestions/Suggestions.types.ISuggestionsProps<any>, 'className' | 'suggestionsClassName'> & {  forceResolveButtonSelected ? :boolean,   searchForMoreButtonSelected ? :boolean} */
@js.native
trait ISuggestionsStyleProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  /** Whether the forceResolve actionButton is selected. */
  var forceResolveButtonSelected: js.UndefOr[Boolean] = js.native
  /** Whether the searchForMore actionButton is selected. */
  var searchForMoreButtonSelected: js.UndefOr[Boolean] = js.native
  var suggestionsClassName: js.UndefOr[String] = js.native
  var theme: ITheme = js.native
}

object ISuggestionsStyleProps {
  @scala.inline
  def apply(theme: ITheme): ISuggestionsStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISuggestionsStyleProps]
  }
  @scala.inline
  implicit class ISuggestionsStylePropsOps[Self <: ISuggestionsStyleProps] (val x: Self) extends AnyVal {
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
    def withForceResolveButtonSelected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceResolveButtonSelected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceResolveButtonSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceResolveButtonSelected")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchForMoreButtonSelected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchForMoreButtonSelected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchForMoreButtonSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchForMoreButtonSelected")(js.undefined)
        ret
    }
    @scala.inline
    def withSuggestionsClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestionsClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggestionsClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestionsClassName")(js.undefined)
        ret
    }
  }
  
}

