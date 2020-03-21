package typingsSlinky.reactGeosuggest.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.googlemaps.google.maps.LatLng
import typingsSlinky.googlemaps.google.maps.LatLngBounds
import typingsSlinky.googlemaps.google.maps.places.AutocompletePrediction
import typingsSlinky.reactGeosuggest.Typeofmaps
import typingsSlinky.reactGeosuggest.mod.Fixture
import typingsSlinky.reactGeosuggest.mod.GeosuggestProps
import typingsSlinky.reactGeosuggest.mod.QueryType
import typingsSlinky.reactGeosuggest.mod.Styles
import typingsSlinky.reactGeosuggest.mod.Suggest
import typingsSlinky.reactGeosuggest.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactGeosuggest
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-geosuggest", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: autoComplete, className, disabled, label, placeholder */
  def apply(
    autoActivateFirstSuggest: js.UndefOr[Boolean] = js.undefined,
    bounds: LatLngBounds = null,
    country: String | js.Array[String] = null,
    fixtures: js.Array[Fixture] = null,
    getSuggestLabel: /* googleSuggest */ AutocompletePrediction => String = null,
    googleMaps: Typeofmaps = null,
    highlightMatch: js.UndefOr[Boolean] = js.undefined,
    ignoreEnter: js.UndefOr[Boolean] = js.undefined,
    ignoreTab: js.UndefOr[Boolean] = js.undefined,
    initialValue: String = null,
    inputClassName: String = null,
    location: LatLng = null,
    maxFixtures: Int | Double = null,
    minLength: Int | Double = null,
    onActivateSuggest: /* suggest */ Suggest => Unit = null,
    onBlur: /* value */ js.Any => Unit = null,
    onChange: /* value */ js.Any => Unit = null,
    onFocus: /* value */ js.Any => Unit = null,
    onKeyDown: /* event */ js.Any => Unit = null,
    onKeyPress: /* event */ js.Any => Unit = null,
    onSuggestNoResults: /* userInput */ String => Unit = null,
    onSuggestSelect: /* suggest */ Suggest => Unit = null,
    onUpdateSuggests: (/* suggests */ js.Any, /* activeSuggest */ js.Any) => Unit = null,
    queryDelay: Int | Double = null,
    radius: Int | Double = null,
    renderSuggestItem: /* googleSuggest */ AutocompletePrediction => _ = null,
    skipSuggest: /* googleSuggest */ AutocompletePrediction => Boolean = null,
    style: Styles = null,
    suggestItemActiveClassName: String = null,
    suggestItemClassName: String = null,
    suggestsClassName: String = null,
    suggestsHiddenClassName: String = null,
    types: js.Array[QueryType] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoActivateFirstSuggest)) __obj.updateDynamic("autoActivateFirstSuggest")(autoActivateFirstSuggest.asInstanceOf[js.Any])
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (fixtures != null) __obj.updateDynamic("fixtures")(fixtures.asInstanceOf[js.Any])
    if (getSuggestLabel != null) __obj.updateDynamic("getSuggestLabel")(js.Any.fromFunction1(getSuggestLabel))
    if (googleMaps != null) __obj.updateDynamic("googleMaps")(googleMaps.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightMatch)) __obj.updateDynamic("highlightMatch")(highlightMatch.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreEnter)) __obj.updateDynamic("ignoreEnter")(ignoreEnter.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreTab)) __obj.updateDynamic("ignoreTab")(ignoreTab.asInstanceOf[js.Any])
    if (initialValue != null) __obj.updateDynamic("initialValue")(initialValue.asInstanceOf[js.Any])
    if (inputClassName != null) __obj.updateDynamic("inputClassName")(inputClassName.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (maxFixtures != null) __obj.updateDynamic("maxFixtures")(maxFixtures.asInstanceOf[js.Any])
    if (minLength != null) __obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
    if (onActivateSuggest != null) __obj.updateDynamic("onActivateSuggest")(js.Any.fromFunction1(onActivateSuggest))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction1(onKeyPress))
    if (onSuggestNoResults != null) __obj.updateDynamic("onSuggestNoResults")(js.Any.fromFunction1(onSuggestNoResults))
    if (onSuggestSelect != null) __obj.updateDynamic("onSuggestSelect")(js.Any.fromFunction1(onSuggestSelect))
    if (onUpdateSuggests != null) __obj.updateDynamic("onUpdateSuggests")(js.Any.fromFunction2(onUpdateSuggests))
    if (queryDelay != null) __obj.updateDynamic("queryDelay")(queryDelay.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (renderSuggestItem != null) __obj.updateDynamic("renderSuggestItem")(js.Any.fromFunction1(renderSuggestItem))
    if (skipSuggest != null) __obj.updateDynamic("skipSuggest")(js.Any.fromFunction1(skipSuggest))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (suggestItemActiveClassName != null) __obj.updateDynamic("suggestItemActiveClassName")(suggestItemActiveClassName.asInstanceOf[js.Any])
    if (suggestItemClassName != null) __obj.updateDynamic("suggestItemClassName")(suggestItemClassName.asInstanceOf[js.Any])
    if (suggestsClassName != null) __obj.updateDynamic("suggestsClassName")(suggestsClassName.asInstanceOf[js.Any])
    if (suggestsHiddenClassName != null) __obj.updateDynamic("suggestsHiddenClassName")(suggestsHiddenClassName.asInstanceOf[js.Any])
    if (types != null) __obj.updateDynamic("types")(types.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactGeosuggest.mod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = GeosuggestProps
}

