package typingsSlinky.officeUiFabricReact.basePickerTypesMod

import slinky.core.facade.ReactElement
import typingsSlinky.officeUiFabricReact.suggestionsTypesMod.ISuggestionsProps
import typingsSlinky.uifabricUtilities.irenderfunctionMod.IRenderFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/pickers/Suggestions/Suggestions.types.ISuggestionsProps<T>, 'onRenderNoResultFound' | 'suggestionsHeaderText' | 'mostRecentlyUsedHeaderText' | 'noResultsFoundText' | 'className' | 'suggestionsClassName' | 'suggestionsItemClassName' | 'searchForMoreText' | 'forceResolveText' | 'loadingText' | 'searchingText' | 'resultsFooterFull' | 'resultsFooter' | 'resultsMaximumNumber' | 'showRemoveButtons' | 'suggestionsAvailableAlertText' | 'suggestionsContainerAriaLabel' | 'showForceResolve'> */
@js.native
trait IBasePickerSuggestionsProps[T] extends js.Object {
  var className: js.UndefOr[String] = js.native
  var forceResolveText: js.UndefOr[String] = js.native
  var loadingText: js.UndefOr[String] = js.native
  var mostRecentlyUsedHeaderText: js.UndefOr[String] = js.native
  var noResultsFoundText: js.UndefOr[String] = js.native
  var onRenderNoResultFound: js.UndefOr[IRenderFunction[Unit]] = js.native
  var resultsFooter: js.UndefOr[js.Function1[/* props */ ISuggestionsProps[T], ReactElement]] = js.native
  var resultsFooterFull: js.UndefOr[js.Function1[/* props */ ISuggestionsProps[T], ReactElement]] = js.native
  var resultsMaximumNumber: js.UndefOr[Double] = js.native
  var searchForMoreText: js.UndefOr[String] = js.native
  var searchingText: js.UndefOr[String] = js.native
  var showForceResolve: js.UndefOr[js.Function0[Boolean]] = js.native
  var showRemoveButtons: js.UndefOr[Boolean] = js.native
  var suggestionsAvailableAlertText: js.UndefOr[String] = js.native
  var suggestionsClassName: js.UndefOr[String] = js.native
  var suggestionsContainerAriaLabel: js.UndefOr[String] = js.native
  var suggestionsHeaderText: js.UndefOr[String] = js.native
  var suggestionsItemClassName: js.UndefOr[String] = js.native
}

object IBasePickerSuggestionsProps {
  @scala.inline
  def apply[T](): IBasePickerSuggestionsProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBasePickerSuggestionsProps[T]]
  }
  @scala.inline
  implicit class IBasePickerSuggestionsPropsOps[Self[t] <: IBasePickerSuggestionsProps[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withClassName(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withForceResolveText(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceResolveText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceResolveText: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceResolveText")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadingText(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadingText: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingText")(js.undefined)
        ret
    }
    @scala.inline
    def withMostRecentlyUsedHeaderText(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mostRecentlyUsedHeaderText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMostRecentlyUsedHeaderText: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mostRecentlyUsedHeaderText")(js.undefined)
        ret
    }
    @scala.inline
    def withNoResultsFoundText(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noResultsFoundText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoResultsFoundText: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noResultsFoundText")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRenderNoResultFound(
      value: (/* props */ js.UndefOr[Unit], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[Unit], ReactElement | Null]]) => ReactElement | Null
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderNoResultFound")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRenderNoResultFound: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderNoResultFound")(js.undefined)
        ret
    }
    @scala.inline
    def withResultsFooter(value: /* props */ ISuggestionsProps[T] => ReactElement): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultsFooter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutResultsFooter: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultsFooter")(js.undefined)
        ret
    }
    @scala.inline
    def withResultsFooterFull(value: /* props */ ISuggestionsProps[T] => ReactElement): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultsFooterFull")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutResultsFooterFull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultsFooterFull")(js.undefined)
        ret
    }
    @scala.inline
    def withResultsMaximumNumber(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultsMaximumNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResultsMaximumNumber: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultsMaximumNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchForMoreText(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchForMoreText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchForMoreText: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchForMoreText")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchingText(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchingText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchingText: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchingText")(js.undefined)
        ret
    }
    @scala.inline
    def withShowForceResolve(value: () => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showForceResolve")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutShowForceResolve: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showForceResolve")(js.undefined)
        ret
    }
    @scala.inline
    def withShowRemoveButtons(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRemoveButtons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowRemoveButtons: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRemoveButtons")(js.undefined)
        ret
    }
    @scala.inline
    def withSuggestionsAvailableAlertText(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestionsAvailableAlertText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggestionsAvailableAlertText: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestionsAvailableAlertText")(js.undefined)
        ret
    }
    @scala.inline
    def withSuggestionsClassName(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestionsClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggestionsClassName: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestionsClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withSuggestionsContainerAriaLabel(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestionsContainerAriaLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggestionsContainerAriaLabel: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestionsContainerAriaLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withSuggestionsHeaderText(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestionsHeaderText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggestionsHeaderText: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestionsHeaderText")(js.undefined)
        ret
    }
    @scala.inline
    def withSuggestionsItemClassName(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestionsItemClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggestionsItemClassName: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestionsItemClassName")(js.undefined)
        ret
    }
  }
  
}

