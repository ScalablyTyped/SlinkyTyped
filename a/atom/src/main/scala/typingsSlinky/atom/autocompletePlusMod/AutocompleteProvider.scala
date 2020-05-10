package typingsSlinky.atom.autocompletePlusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutocompleteProvider extends js.Object {
  /**
    *  Defines the scope selector(s) (can be comma-separated) for which your provider
    *  should not be used.
    */
  var disableForSelector: js.UndefOr[String] = js.native
  /** Will be called if your provider is being destroyed by autocomplete+ */
  var dispose: js.UndefOr[js.Function0[Unit]] = js.native
  /** Will not use lower priority providers when this provider is used. */
  var excludeLowerPriority: js.UndefOr[Boolean] = js.native
  /**
    *  (experimental) Is called when a suggestion is selected by the user for
    *  the purpose of loading more information about the suggestion. Return a
    *  Promise of the new suggestion to replace it with or return null if
    *  no change is needed.
    */
  var getSuggestionDetailsOnSelect: js.UndefOr[
    js.Function1[
      /* suggestion */ AnySuggestion, 
      (js.Promise[AnySuggestion | Null]) | AnySuggestion | Null
    ]
  ] = js.native
  /**
    *  A number to indicate its priority to be included in a suggestions request.
    *  The default provider has an inclusion priority of 0. Higher priority providers
    *  can suppress lower priority providers with excludeLowerPriority.
    */
  var inclusionPriority: js.UndefOr[Double] = js.native
  /**
    *  Function that is called when a suggestion from your provider was inserted
    *  into the buffer.
    */
  var onDidInsertSuggestion: js.UndefOr[js.Function1[/* params */ SuggestionInsertedEvent, Unit]] = js.native
  /**
    *  Defines the scope selector(s) (can be comma-separated) for which your provider
    *  should receive suggestion requests.
    */
  var selector: String = js.native
  /**
    *  A number to determine the sort order of suggestions. The default provider has
    *  an suggestion priority of 1.
    */
  var suggestionPriority: js.UndefOr[Double] = js.native
  /**
    *  Is called when a suggestion request has been dispatched by autocomplete+ to
    *  your provider. Return an array of suggestions (if any) in the order you would
    *  like them displayed to the user. Returning a Promise of an array of suggestions
    *  is also supported.
    */
  def getSuggestions(params: SuggestionsRequestedEvent): Suggestions | js.Promise[Suggestions] = js.native
}

object AutocompleteProvider {
  @scala.inline
  def apply(
    getSuggestions: SuggestionsRequestedEvent => Suggestions | js.Promise[Suggestions],
    selector: String
  ): AutocompleteProvider = {
    val __obj = js.Dynamic.literal(getSuggestions = js.Any.fromFunction1(getSuggestions), selector = selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutocompleteProvider]
  }
  @scala.inline
  implicit class AutocompleteProviderOps[Self <: AutocompleteProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetSuggestions(value: SuggestionsRequestedEvent => Suggestions | js.Promise[Suggestions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSuggestions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisableForSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableForSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableForSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableForSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withDispose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutDispose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispose")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludeLowerPriority(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeLowerPriority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludeLowerPriority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeLowerPriority")(js.undefined)
        ret
    }
    @scala.inline
    def withGetSuggestionDetailsOnSelect(value: /* suggestion */ AnySuggestion => (js.Promise[AnySuggestion | Null]) | AnySuggestion | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSuggestionDetailsOnSelect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetSuggestionDetailsOnSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSuggestionDetailsOnSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withInclusionPriority(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inclusionPriority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInclusionPriority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inclusionPriority")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDidInsertSuggestion(value: /* params */ SuggestionInsertedEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDidInsertSuggestion")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDidInsertSuggestion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDidInsertSuggestion")(js.undefined)
        ret
    }
    @scala.inline
    def withSuggestionPriority(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestionPriority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggestionPriority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestionPriority")(js.undefined)
        ret
    }
  }
  
}

