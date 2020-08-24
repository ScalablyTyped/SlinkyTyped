package typingsSlinky.officeUiFabricReact.components

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.officeUiFabricReact.personaTypesMod.IPersonaProps
import typingsSlinky.officeUiFabricReact.suggestionsItemTypesMod.ISuggestionItemProps
import typingsSlinky.officeUiFabricReact.suggestionsTypesMod.ISuggestionModel
import typingsSlinky.officeUiFabricReact.suggestionsTypesMod.ISuggestions
import typingsSlinky.officeUiFabricReact.suggestionsTypesMod.ISuggestionsProps
import typingsSlinky.uifabricMergeStyles.deepPartialMod.DeepPartial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import typingsSlinky.uifabricUtilities.keyCodesMod.KeyCodes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Suggestions {
  @JSImport("office-ui-fabric-react", "Suggestions")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[T] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.officeUiFabricReact.mod.Suggestions[T]] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def componentRefFunction1(value: /* ref */ ISuggestions[T] | Null => Unit): this.type = set("componentRef", js.Any.fromFunction1(value))
    @scala.inline
    def componentRefRefObject(value: ReactRef[ISuggestions[T]]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def componentRef(value: IRefObject[ISuggestions[T]]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def createGenericItem(value: () => Unit): this.type = set("createGenericItem", js.Any.fromFunction0(value))
    @scala.inline
    def forceResolveText(value: String): this.type = set("forceResolveText", value.asInstanceOf[js.Any])
    @scala.inline
    def isLoading(value: Boolean): this.type = set("isLoading", value.asInstanceOf[js.Any])
    @scala.inline
    def isMostRecentlyUsedVisible(value: Boolean): this.type = set("isMostRecentlyUsedVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def isResultsFooterVisible(value: Boolean): this.type = set("isResultsFooterVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def isSearching(value: Boolean): this.type = set("isSearching", value.asInstanceOf[js.Any])
    @scala.inline
    def loadingText(value: String): this.type = set("loadingText", value.asInstanceOf[js.Any])
    @scala.inline
    def moreSuggestionsAvailable(value: Boolean): this.type = set("moreSuggestionsAvailable", value.asInstanceOf[js.Any])
    @scala.inline
    def mostRecentlyUsedHeaderText(value: String): this.type = set("mostRecentlyUsedHeaderText", value.asInstanceOf[js.Any])
    @scala.inline
    def noResultsFoundText(value: String): this.type = set("noResultsFoundText", value.asInstanceOf[js.Any])
    @scala.inline
    def onGetMoreResults(value: () => Unit): this.type = set("onGetMoreResults", js.Any.fromFunction0(value))
    @scala.inline
    def onRenderNoResultFound(
      value: (/* props */ js.UndefOr[Unit], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[Unit], ReactElement | Null]]) => ReactElement | Null
    ): this.type = set("onRenderNoResultFound", js.Any.fromFunction2(value))
    @scala.inline
    def onSuggestionRemove(
      value: (/* ev */ js.UndefOr[SyntheticMouseEvent[HTMLElement]], /* item */ js.UndefOr[T | IPersonaProps], /* index */ js.UndefOr[Double]) => Unit
    ): this.type = set("onSuggestionRemove", js.Any.fromFunction3(value))
    @scala.inline
    def refocusSuggestions(value: /* keyCode */ KeyCodes => Unit): this.type = set("refocusSuggestions", js.Any.fromFunction1(value))
    @scala.inline
    def removeSuggestionAriaLabel(value: String): this.type = set("removeSuggestionAriaLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def resultsFooter(value: /* props */ ISuggestionsProps[T] => ReactElement): this.type = set("resultsFooter", js.Any.fromFunction1(value))
    @scala.inline
    def resultsFooterFull(value: /* props */ ISuggestionsProps[T] => ReactElement): this.type = set("resultsFooterFull", js.Any.fromFunction1(value))
    @scala.inline
    def resultsMaximumNumber(value: Double): this.type = set("resultsMaximumNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def searchErrorText(value: String): this.type = set("searchErrorText", value.asInstanceOf[js.Any])
    @scala.inline
    def searchForMoreText(value: String): this.type = set("searchForMoreText", value.asInstanceOf[js.Any])
    @scala.inline
    def searchingText(value: String): this.type = set("searchingText", value.asInstanceOf[js.Any])
    @scala.inline
    def showForceResolve(value: () => Boolean): this.type = set("showForceResolve", js.Any.fromFunction0(value))
    @scala.inline
    def showRemoveButtons(value: Boolean): this.type = set("showRemoveButtons", value.asInstanceOf[js.Any])
    @scala.inline
    def stylesFunction1(value: _ => DeepPartial[_]): this.type = set("styles", js.Any.fromFunction1(value))
    @scala.inline
    def styles(value: IStyleFunctionOrObject[_, _]): this.type = set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def suggestionsAvailableAlertText(value: String): this.type = set("suggestionsAvailableAlertText", value.asInstanceOf[js.Any])
    @scala.inline
    def suggestionsClassName(value: String): this.type = set("suggestionsClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def suggestionsContainerAriaLabel(value: String): this.type = set("suggestionsContainerAriaLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def suggestionsHeaderText(value: String): this.type = set("suggestionsHeaderText", value.asInstanceOf[js.Any])
    @scala.inline
    def suggestionsItemClassName(value: String): this.type = set("suggestionsItemClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def suggestionsListId(value: String): this.type = set("suggestionsListId", value.asInstanceOf[js.Any])
    @scala.inline
    def theme(value: ITheme): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps[T](p: ISuggestionsProps[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply[T](
    onRenderSuggestion: (T, ISuggestionItemProps[T]) => ReactElement,
    onSuggestionClick: (js.UndefOr[SyntheticMouseEvent[HTMLElement]], js.UndefOr[js.Any], js.UndefOr[Double]) => Unit,
    suggestions: js.Array[ISuggestionModel[T]]
  ): Builder[T] = {
    val __props = js.Dynamic.literal(onRenderSuggestion = js.Any.fromFunction2(onRenderSuggestion), onSuggestionClick = js.Any.fromFunction3(onSuggestionClick), suggestions = suggestions.asInstanceOf[js.Any])
    new Builder[T](js.Array(this.component, __props.asInstanceOf[ISuggestionsProps[T]]))
  }
}

