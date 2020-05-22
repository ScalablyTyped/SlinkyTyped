package typingsSlinky.reactAutosuggest.components

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import slinky.core.SyntheticEvent
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactAutosuggest.mod.InputProps
import typingsSlinky.reactAutosuggest.mod.RenderSuggestionParams
import typingsSlinky.reactAutosuggest.mod.RenderSuggestionsContainerParams
import typingsSlinky.reactAutosuggest.mod.SuggestionHighlightedParams
import typingsSlinky.reactAutosuggest.mod.SuggestionSelectedEventData
import typingsSlinky.reactAutosuggest.mod.SuggestionsFetchRequestedParams
import typingsSlinky.reactAutosuggest.mod.Theme
import typingsSlinky.reactAutosuggest.mod.^
import typingsSlinky.reactAutosuggest.reactAutosuggestBooleans.`false`
import typingsSlinky.reactAutosuggest.reactAutosuggestBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactAutosuggest {
  object AutosuggestPropsMultiSection {
    @JSImport("react-autosuggest", JSImport.Namespace)
    @js.native
    object component extends js.Object
    
    @scala.inline
    class Builder[T, T2] (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, ^[js.Any, js.Any]] {
      @scala.inline
      def alwaysRenderSuggestions(value: Boolean): this.type = set("alwaysRenderSuggestions", value.asInstanceOf[js.Any])
      @scala.inline
      def focusInputOnSuggestionClick(value: Boolean): this.type = set("focusInputOnSuggestionClick", value.asInstanceOf[js.Any])
      @scala.inline
      def getSectionSuggestions(value: T2 => js.Array[T]): this.type = set("getSectionSuggestions", js.Any.fromFunction1(value))
      @scala.inline
      def highlightFirstSuggestion(value: Boolean): this.type = set("highlightFirstSuggestion", value.asInstanceOf[js.Any])
      @scala.inline
      def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
      @scala.inline
      def onSuggestionHighlighted(value: /* params */ SuggestionHighlightedParams => Unit): this.type = set("onSuggestionHighlighted", js.Any.fromFunction1(value))
      @scala.inline
      def onSuggestionSelected(
        value: (SyntheticEvent[EventTarget with js.Any, Event], /* data */ SuggestionSelectedEventData[T]) => Unit
      ): this.type = set("onSuggestionSelected", js.Any.fromFunction2(value))
      @scala.inline
      def onSuggestionsClearRequested(value: () => Unit): this.type = set("onSuggestionsClearRequested", js.Any.fromFunction0(value))
      @scala.inline
      def renderInputComponent(value: /* inputProps */ InputProps[T] => TagMod[Any]): this.type = set("renderInputComponent", js.Any.fromFunction1(value))
      @scala.inline
      def renderSectionTitle(value: /* section */ js.Any => TagMod[Any]): this.type = set("renderSectionTitle", js.Any.fromFunction1(value))
      @scala.inline
      def renderSuggestionsContainer(value: /* params */ RenderSuggestionsContainerParams => TagMod[Any]): this.type = set("renderSuggestionsContainer", js.Any.fromFunction1(value))
      @scala.inline
      def shouldRenderSuggestions(value: /* value */ String => Boolean): this.type = set("shouldRenderSuggestions", js.Any.fromFunction1(value))
      @scala.inline
      def theme(value: Theme): this.type = set("theme", value.asInstanceOf[js.Any])
    }
    
    def withProps[T, T2](p: typingsSlinky.reactAutosuggest.mod.AutosuggestPropsMultiSection[T, T2]): Builder[T, T2] = new Builder[T, T2](js.Array(this.component, p.asInstanceOf[js.Any]))
    @scala.inline
    def apply[T, T2](
      getSuggestionValue: T => String,
      inputProps: InputProps[T],
      multiSection: `true`,
      onSuggestionsFetchRequested: /* request */ SuggestionsFetchRequestedParams => Unit,
      renderSuggestion: (T, /* params */ RenderSuggestionParams) => TagMod[Any],
      suggestions: js.Array[T2]
    ): Builder[T, T2] = {
        val __props = js.Dynamic.literal(getSuggestionValue = js.Any.fromFunction1(getSuggestionValue), inputProps = inputProps.asInstanceOf[js.Any], multiSection = multiSection.asInstanceOf[js.Any], onSuggestionsFetchRequested = js.Any.fromFunction1(onSuggestionsFetchRequested), renderSuggestion = js.Any.fromFunction2(renderSuggestion), suggestions = suggestions.asInstanceOf[js.Any])
        new Builder[T, T2](js.Array(this.component, __props.asInstanceOf[typingsSlinky.reactAutosuggest.mod.AutosuggestPropsMultiSection[T, T2]]))
    }
  }
  
  object AutosuggestPropsSingleSection {
    @JSImport("react-autosuggest", JSImport.Namespace)
    @js.native
    object component extends js.Object
    
    @scala.inline
    class Builder[T, T2] (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, ^[js.Any, js.Any]] {
      @scala.inline
      def alwaysRenderSuggestions(value: Boolean): this.type = set("alwaysRenderSuggestions", value.asInstanceOf[js.Any])
      @scala.inline
      def focusInputOnSuggestionClick(value: Boolean): this.type = set("focusInputOnSuggestionClick", value.asInstanceOf[js.Any])
      @scala.inline
      def highlightFirstSuggestion(value: Boolean): this.type = set("highlightFirstSuggestion", value.asInstanceOf[js.Any])
      @scala.inline
      def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
      @scala.inline
      def multiSection(value: `false`): this.type = set("multiSection", value.asInstanceOf[js.Any])
      @scala.inline
      def onSuggestionHighlighted(value: /* params */ SuggestionHighlightedParams => Unit): this.type = set("onSuggestionHighlighted", js.Any.fromFunction1(value))
      @scala.inline
      def onSuggestionSelected(
        value: (SyntheticEvent[EventTarget with js.Any, Event], /* data */ SuggestionSelectedEventData[T]) => Unit
      ): this.type = set("onSuggestionSelected", js.Any.fromFunction2(value))
      @scala.inline
      def onSuggestionsClearRequested(value: () => Unit): this.type = set("onSuggestionsClearRequested", js.Any.fromFunction0(value))
      @scala.inline
      def renderInputComponent(value: /* inputProps */ InputProps[T] => TagMod[Any]): this.type = set("renderInputComponent", js.Any.fromFunction1(value))
      @scala.inline
      def renderSuggestionsContainer(value: /* params */ RenderSuggestionsContainerParams => TagMod[Any]): this.type = set("renderSuggestionsContainer", js.Any.fromFunction1(value))
      @scala.inline
      def shouldRenderSuggestions(value: /* value */ String => Boolean): this.type = set("shouldRenderSuggestions", js.Any.fromFunction1(value))
      @scala.inline
      def theme(value: Theme): this.type = set("theme", value.asInstanceOf[js.Any])
    }
    
    def withProps[T, T2](p: typingsSlinky.reactAutosuggest.mod.AutosuggestPropsSingleSection[T]): Builder[T, T2] = new Builder[T, T2](js.Array(this.component, p.asInstanceOf[js.Any]))
    @scala.inline
    def apply[T, T2](
      getSuggestionValue: T => String,
      inputProps: InputProps[T],
      onSuggestionsFetchRequested: /* request */ SuggestionsFetchRequestedParams => Unit,
      renderSuggestion: (T, /* params */ RenderSuggestionParams) => TagMod[Any],
      suggestions: js.Array[T]
    ): Builder[T, T2] = {
        val __props = js.Dynamic.literal(getSuggestionValue = js.Any.fromFunction1(getSuggestionValue), inputProps = inputProps.asInstanceOf[js.Any], onSuggestionsFetchRequested = js.Any.fromFunction1(onSuggestionsFetchRequested), renderSuggestion = js.Any.fromFunction2(renderSuggestion), suggestions = suggestions.asInstanceOf[js.Any])
        new Builder[T, T2](js.Array(this.component, __props.asInstanceOf[typingsSlinky.reactAutosuggest.mod.AutosuggestPropsSingleSection[T]]))
    }
  }
  
}

