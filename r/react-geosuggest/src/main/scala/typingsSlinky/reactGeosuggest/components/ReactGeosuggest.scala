package typingsSlinky.reactGeosuggest.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.googlemaps.google.maps.LatLng
import typingsSlinky.googlemaps.google.maps.LatLngBounds
import typingsSlinky.googlemaps.google.maps.places.AutocompletePrediction
import typingsSlinky.reactGeosuggest.anon.Typeofmaps
import typingsSlinky.reactGeosuggest.mod.Fixture
import typingsSlinky.reactGeosuggest.mod.GeosuggestProps
import typingsSlinky.reactGeosuggest.mod.QueryType
import typingsSlinky.reactGeosuggest.mod.Styles
import typingsSlinky.reactGeosuggest.mod.Suggest
import typingsSlinky.reactGeosuggest.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactGeosuggest {
  
  @JSImport("react-geosuggest", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def autoActivateFirstSuggest(value: Boolean): this.type = set("autoActivateFirstSuggest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoComplete(value: String): this.type = set("autoComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def bounds(value: LatLngBounds): this.type = set("bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def countryVarargs(value: String*): this.type = set("country", js.Array(value :_*))
    
    @scala.inline
    def country(value: String | js.Array[String]): this.type = set("country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fixturesVarargs(value: Fixture*): this.type = set("fixtures", js.Array(value :_*))
    
    @scala.inline
    def fixtures(value: js.Array[Fixture]): this.type = set("fixtures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def getSuggestLabel(value: /* googleSuggest */ AutocompletePrediction => String): this.type = set("getSuggestLabel", js.Any.fromFunction1(value))
    
    @scala.inline
    def googleMaps(value: Typeofmaps): this.type = set("googleMaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def highlightMatch(value: Boolean): this.type = set("highlightMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def ignoreEnter(value: Boolean): this.type = set("ignoreEnter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def ignoreTab(value: Boolean): this.type = set("ignoreTab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def initialValue(value: String): this.type = set("initialValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inputClassName(value: String): this.type = set("inputClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def label(value: String): this.type = set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def location(value: LatLng): this.type = set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxFixtures(value: Double): this.type = set("maxFixtures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minLength(value: Double): this.type = set("minLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onActivateSuggest(value: /* suggest */ Suggest => Unit): this.type = set("onActivateSuggest", js.Any.fromFunction1(value))
    
    @scala.inline
    def onBlur(value: /* value */ js.Any => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def onChange(value: /* value */ js.Any => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onFocus(value: /* value */ js.Any => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def onKeyDown(value: /* event */ js.Any => Unit): this.type = set("onKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def onKeyPress(value: /* event */ js.Any => Unit): this.type = set("onKeyPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSuggestNoResults(value: /* userInput */ String => Unit): this.type = set("onSuggestNoResults", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSuggestSelect(value: /* suggest */ Suggest => Unit): this.type = set("onSuggestSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def onUpdateSuggests(value: (/* suggests */ js.Any, /* activeSuggest */ js.Any) => Unit): this.type = set("onUpdateSuggests", js.Any.fromFunction2(value))
    
    @scala.inline
    def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def queryDelay(value: Double): this.type = set("queryDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def radius(value: Double): this.type = set("radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def renderSuggestItem(value: /* googleSuggest */ AutocompletePrediction => _): this.type = set("renderSuggestItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def skipSuggest(value: /* googleSuggest */ AutocompletePrediction => Boolean): this.type = set("skipSuggest", js.Any.fromFunction1(value))
    
    @scala.inline
    def style(value: Styles): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def suggestItemActiveClassName(value: String): this.type = set("suggestItemActiveClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def suggestItemClassName(value: String): this.type = set("suggestItemClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def suggestsClassName(value: String): this.type = set("suggestsClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def suggestsHiddenClassName(value: String): this.type = set("suggestsHiddenClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def typesVarargs(value: QueryType*): this.type = set("types", js.Array(value :_*))
    
    @scala.inline
    def types(value: js.Array[QueryType]): this.type = set("types", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: GeosuggestProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ReactGeosuggest.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
