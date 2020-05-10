package typingsSlinky.officeUiFabricReact.suggestionsTypesMod

import typingsSlinky.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISuggestionsStyles extends js.Object {
  /** Refers to the 'Force resolve' actionButton. */
  var forceResolveButton: IStyle = js.native
  /** Refers to the text rendered when no suggestions are found. */
  var noSuggestions: IStyle = js.native
  /** Root element of the suggestions outer wrapper. */
  var root: IStyle = js.native
  /** Refers to the 'Search for more' actionButton. */
  var searchForMoreButton: IStyle = js.native
  /** SubComponents (Spinner) styles. */
  var subComponentStyles: ISuggestionsSubComponentStyles = js.native
  /** Refers to the text displaying if more suggestions available. */
  var suggestionsAvailable: IStyle = js.native
  /** Refers to the suggestions container. */
  var suggestionsContainer: IStyle = js.native
  /** Refers to the title rendered for suggestions container header and/or footer (if provided). */
  var title: IStyle = js.native
}

object ISuggestionsStyles {
  @scala.inline
  def apply(subComponentStyles: ISuggestionsSubComponentStyles): ISuggestionsStyles = {
    val __obj = js.Dynamic.literal(subComponentStyles = subComponentStyles.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISuggestionsStyles]
  }
  @scala.inline
  implicit class ISuggestionsStylesOps[Self <: ISuggestionsStyles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSubComponentStyles(value: ISuggestionsSubComponentStyles): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subComponentStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForceResolveButton(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceResolveButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceResolveButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceResolveButton")(js.undefined)
        ret
    }
    @scala.inline
    def withForceResolveButtonNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceResolveButton")(null)
        ret
    }
    @scala.inline
    def withNoSuggestions(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noSuggestions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoSuggestions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noSuggestions")(js.undefined)
        ret
    }
    @scala.inline
    def withNoSuggestionsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noSuggestions")(null)
        ret
    }
    @scala.inline
    def withRoot(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(js.undefined)
        ret
    }
    @scala.inline
    def withRootNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(null)
        ret
    }
    @scala.inline
    def withSearchForMoreButton(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchForMoreButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchForMoreButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchForMoreButton")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchForMoreButtonNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchForMoreButton")(null)
        ret
    }
    @scala.inline
    def withSuggestionsAvailable(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestionsAvailable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggestionsAvailable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestionsAvailable")(js.undefined)
        ret
    }
    @scala.inline
    def withSuggestionsAvailableNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestionsAvailable")(null)
        ret
    }
    @scala.inline
    def withSuggestionsContainer(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestionsContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggestionsContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestionsContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withSuggestionsContainerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestionsContainer")(null)
        ret
    }
    @scala.inline
    def withTitle(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(null)
        ret
    }
  }
  
}

