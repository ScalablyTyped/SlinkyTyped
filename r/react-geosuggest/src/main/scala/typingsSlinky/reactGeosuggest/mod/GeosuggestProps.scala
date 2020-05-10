package typingsSlinky.reactGeosuggest.mod

import typingsSlinky.googlemaps.google.maps.LatLng
import typingsSlinky.googlemaps.google.maps.LatLngBounds
import typingsSlinky.googlemaps.google.maps.places.AutocompletePrediction
import typingsSlinky.reactGeosuggest.Typeofmaps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in {[ P in keyof react.react.InputHTMLAttributes<std.HTMLInputElement> ]: P} & {[ P in 'style' ]: never} & {[x: string] : never, [x: number] : never}[keyof react.react.InputHTMLAttributes<std.HTMLInputElement>] ]: react.react.InputHTMLAttributes<std.HTMLInputElement>[P]} */ @js.native
trait GeosuggestProps extends js.Object {
  var autoActivateFirstSuggest: js.UndefOr[Boolean] = js.native
  var autoComplete: js.UndefOr[String] = js.native
  var bounds: js.UndefOr[LatLngBounds] = js.native
  var className: js.UndefOr[String] = js.native
  var country: js.UndefOr[String | js.Array[String]] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var fixtures: js.UndefOr[js.Array[Fixture]] = js.native
  var getSuggestLabel: js.UndefOr[js.Function1[/* googleSuggest */ AutocompletePrediction, String]] = js.native
  var googleMaps: js.UndefOr[Typeofmaps] = js.native
  var highlightMatch: js.UndefOr[Boolean] = js.native
  var ignoreEnter: js.UndefOr[Boolean] = js.native
  var ignoreTab: js.UndefOr[Boolean] = js.native
  var initialValue: js.UndefOr[String] = js.native
  var inputClassName: js.UndefOr[String] = js.native
  var label: js.UndefOr[String] = js.native
  var location: js.UndefOr[LatLng] = js.native
  var maxFixtures: js.UndefOr[Double] = js.native
  var minLength: js.UndefOr[Double] = js.native
  var onActivateSuggest: js.UndefOr[js.Function1[/* suggest */ Suggest, Unit]] = js.native
  var onBlur: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.native
  var onChange: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.native
  var onFocus: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.native
  var onKeyDown: js.UndefOr[js.Function1[/* event */ js.Any, Unit]] = js.native
  var onKeyPress: js.UndefOr[js.Function1[/* event */ js.Any, Unit]] = js.native
  var onSuggestNoResults: js.UndefOr[js.Function1[/* userInput */ String, Unit]] = js.native
  var onSuggestSelect: js.UndefOr[js.Function1[/* suggest */ Suggest, Unit]] = js.native
  var onUpdateSuggests: js.UndefOr[js.Function2[/* suggests */ js.Any, /* activeSuggest */ js.Any, Unit]] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var queryDelay: js.UndefOr[Double] = js.native
  var radius: js.UndefOr[Double] = js.native
  var renderSuggestItem: js.UndefOr[js.Function1[/* googleSuggest */ AutocompletePrediction, _]] = js.native
  var skipSuggest: js.UndefOr[js.Function1[/* googleSuggest */ AutocompletePrediction, Boolean]] = js.native
  var style: js.UndefOr[Styles] = js.native
  var suggestItemActiveClassName: js.UndefOr[String] = js.native
  var suggestItemClassName: js.UndefOr[String] = js.native
  var suggestsClassName: js.UndefOr[String] = js.native
  var suggestsHiddenClassName: js.UndefOr[String] = js.native
  var types: js.UndefOr[js.Array[QueryType]] = js.native
}

object GeosuggestProps {
  @scala.inline
  def apply(): GeosuggestProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeosuggestProps]
  }
  @scala.inline
  implicit class GeosuggestPropsOps[Self <: GeosuggestProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoActivateFirstSuggest(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoActivateFirstSuggest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoActivateFirstSuggest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoActivateFirstSuggest")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoComplete(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoComplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withBounds(value: LatLngBounds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBounds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds")(js.undefined)
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
    def withCountry(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withFixtures(value: js.Array[Fixture]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixtures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixtures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixtures")(js.undefined)
        ret
    }
    @scala.inline
    def withGetSuggestLabel(value: /* googleSuggest */ AutocompletePrediction => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSuggestLabel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetSuggestLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSuggestLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withGoogleMaps(value: Typeofmaps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googleMaps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGoogleMaps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googleMaps")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightMatch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightMatch")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreEnter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreEnter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreTab(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreTab")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreTab: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreTab")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialValue")(js.undefined)
        ret
    }
    @scala.inline
    def withInputClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: LatLng): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxFixtures(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFixtures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxFixtures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFixtures")(js.undefined)
        ret
    }
    @scala.inline
    def withMinLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minLength")(js.undefined)
        ret
    }
    @scala.inline
    def withOnActivateSuggest(value: /* suggest */ Suggest => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onActivateSuggest")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnActivateSuggest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onActivateSuggest")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBlur(value: /* value */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnBlur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: /* value */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFocus(value: /* value */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeyDown(value: /* event */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnKeyDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyDown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeyPress(value: /* event */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyPress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnKeyPress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyPress")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSuggestNoResults(value: /* userInput */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSuggestNoResults")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSuggestNoResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSuggestNoResults")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSuggestSelect(value: /* suggest */ Suggest => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSuggestSelect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSuggestSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSuggestSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUpdateSuggests(value: (/* suggests */ js.Any, /* activeSuggest */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUpdateSuggests")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnUpdateSuggests: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUpdateSuggests")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radius")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderSuggestItem(value: /* googleSuggest */ AutocompletePrediction => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderSuggestItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderSuggestItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderSuggestItem")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipSuggest(value: /* googleSuggest */ AutocompletePrediction => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipSuggest")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSkipSuggest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipSuggest")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: Styles): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withSuggestItemActiveClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestItemActiveClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggestItemActiveClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestItemActiveClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withSuggestItemClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestItemClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggestItemClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestItemClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withSuggestsClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestsClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggestsClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestsClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withSuggestsHiddenClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestsHiddenClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggestsHiddenClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestsHiddenClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withTypes(value: js.Array[QueryType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(js.undefined)
        ret
    }
  }
  
}

