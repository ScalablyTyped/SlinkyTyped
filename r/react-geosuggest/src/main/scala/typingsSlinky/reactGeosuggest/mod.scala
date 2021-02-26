package typingsSlinky.reactGeosuggest

import typingsSlinky.googlemaps.google.maps.GeocoderResult
import typingsSlinky.googlemaps.google.maps.LatLng
import typingsSlinky.googlemaps.google.maps.LatLngBounds
import typingsSlinky.googlemaps.google.maps.places.AutocompletePrediction
import typingsSlinky.react.mod.Component
import typingsSlinky.reactGeosuggest.anon.Lat
import typingsSlinky.reactGeosuggest.anon.Typeofmaps
import typingsSlinky.std.Pick
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-geosuggest", JSImport.Default)
  @js.native
  class default () extends Geosuggest
  
  @js.native
  trait Fixture extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var label: String = js.native
    
    var location: js.UndefOr[LatLng] = js.native
  }
  object Fixture {
    
    @scala.inline
    def apply(label: String): Fixture = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fixture]
    }
    
    @scala.inline
    implicit class FixtureMutableBuilder[Self <: Fixture] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocation(value: LatLng): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    }
  }
  
  @js.native
  trait Geosuggest
    extends Component[GeosuggestProps, js.Object, js.Any] {
    
    def blur(): Unit = js.native
    
    def clear(): Unit = js.native
    
    def focus(): Unit = js.native
    
    def selectSuggest(): Unit = js.native
    def selectSuggest(value: Suggest): Unit = js.native
    
    def update(value: String): Unit = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in {[ P in keyof react.react.InputHTMLAttributes<std.HTMLInputElement> ]: P} & {[ P in 'style' ]: never} & {[x: string] : never, [x: number] : never}[keyof react.react.InputHTMLAttributes<std.HTMLInputElement>] ]: react.react.InputHTMLAttributes<std.HTMLInputElement>[P]} */ @js.native
  trait GeosuggestProps extends StObject {
    
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
    implicit class GeosuggestPropsMutableBuilder[Self <: GeosuggestProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoActivateFirstSuggest(value: Boolean): Self = StObject.set(x, "autoActivateFirstSuggest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoActivateFirstSuggestUndefined: Self = StObject.set(x, "autoActivateFirstSuggest", js.undefined)
      
      @scala.inline
      def setAutoComplete(value: String): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
      
      @scala.inline
      def setBounds(value: LatLngBounds): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCountry(value: String | js.Array[String]): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
      
      @scala.inline
      def setCountryVarargs(value: String*): Self = StObject.set(x, "country", js.Array(value :_*))
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setFixtures(value: js.Array[Fixture]): Self = StObject.set(x, "fixtures", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixturesUndefined: Self = StObject.set(x, "fixtures", js.undefined)
      
      @scala.inline
      def setFixturesVarargs(value: Fixture*): Self = StObject.set(x, "fixtures", js.Array(value :_*))
      
      @scala.inline
      def setGetSuggestLabel(value: /* googleSuggest */ AutocompletePrediction => String): Self = StObject.set(x, "getSuggestLabel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetSuggestLabelUndefined: Self = StObject.set(x, "getSuggestLabel", js.undefined)
      
      @scala.inline
      def setGoogleMaps(value: Typeofmaps): Self = StObject.set(x, "googleMaps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGoogleMapsUndefined: Self = StObject.set(x, "googleMaps", js.undefined)
      
      @scala.inline
      def setHighlightMatch(value: Boolean): Self = StObject.set(x, "highlightMatch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightMatchUndefined: Self = StObject.set(x, "highlightMatch", js.undefined)
      
      @scala.inline
      def setIgnoreEnter(value: Boolean): Self = StObject.set(x, "ignoreEnter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreEnterUndefined: Self = StObject.set(x, "ignoreEnter", js.undefined)
      
      @scala.inline
      def setIgnoreTab(value: Boolean): Self = StObject.set(x, "ignoreTab", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreTabUndefined: Self = StObject.set(x, "ignoreTab", js.undefined)
      
      @scala.inline
      def setInitialValue(value: String): Self = StObject.set(x, "initialValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialValueUndefined: Self = StObject.set(x, "initialValue", js.undefined)
      
      @scala.inline
      def setInputClassName(value: String): Self = StObject.set(x, "inputClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputClassNameUndefined: Self = StObject.set(x, "inputClassName", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setLocation(value: LatLng): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      @scala.inline
      def setMaxFixtures(value: Double): Self = StObject.set(x, "maxFixtures", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxFixturesUndefined: Self = StObject.set(x, "maxFixtures", js.undefined)
      
      @scala.inline
      def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
      
      @scala.inline
      def setOnActivateSuggest(value: /* suggest */ Suggest => Unit): Self = StObject.set(x, "onActivateSuggest", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnActivateSuggestUndefined: Self = StObject.set(x, "onActivateSuggest", js.undefined)
      
      @scala.inline
      def setOnBlur(value: /* value */ js.Any => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* value */ js.Any => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnFocus(value: /* value */ js.Any => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOnKeyDown(value: /* event */ js.Any => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      @scala.inline
      def setOnKeyPress(value: /* event */ js.Any => Unit): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      @scala.inline
      def setOnSuggestNoResults(value: /* userInput */ String => Unit): Self = StObject.set(x, "onSuggestNoResults", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSuggestNoResultsUndefined: Self = StObject.set(x, "onSuggestNoResults", js.undefined)
      
      @scala.inline
      def setOnSuggestSelect(value: /* suggest */ Suggest => Unit): Self = StObject.set(x, "onSuggestSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSuggestSelectUndefined: Self = StObject.set(x, "onSuggestSelect", js.undefined)
      
      @scala.inline
      def setOnUpdateSuggests(value: (/* suggests */ js.Any, /* activeSuggest */ js.Any) => Unit): Self = StObject.set(x, "onUpdateSuggests", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnUpdateSuggestsUndefined: Self = StObject.set(x, "onUpdateSuggests", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setQueryDelay(value: Double): Self = StObject.set(x, "queryDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryDelayUndefined: Self = StObject.set(x, "queryDelay", js.undefined)
      
      @scala.inline
      def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      @scala.inline
      def setRenderSuggestItem(value: /* googleSuggest */ AutocompletePrediction => _): Self = StObject.set(x, "renderSuggestItem", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderSuggestItemUndefined: Self = StObject.set(x, "renderSuggestItem", js.undefined)
      
      @scala.inline
      def setSkipSuggest(value: /* googleSuggest */ AutocompletePrediction => Boolean): Self = StObject.set(x, "skipSuggest", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSkipSuggestUndefined: Self = StObject.set(x, "skipSuggest", js.undefined)
      
      @scala.inline
      def setStyle(value: Styles): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setSuggestItemActiveClassName(value: String): Self = StObject.set(x, "suggestItemActiveClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuggestItemActiveClassNameUndefined: Self = StObject.set(x, "suggestItemActiveClassName", js.undefined)
      
      @scala.inline
      def setSuggestItemClassName(value: String): Self = StObject.set(x, "suggestItemClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuggestItemClassNameUndefined: Self = StObject.set(x, "suggestItemClassName", js.undefined)
      
      @scala.inline
      def setSuggestsClassName(value: String): Self = StObject.set(x, "suggestsClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuggestsClassNameUndefined: Self = StObject.set(x, "suggestsClassName", js.undefined)
      
      @scala.inline
      def setSuggestsHiddenClassName(value: String): Self = StObject.set(x, "suggestsHiddenClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuggestsHiddenClassNameUndefined: Self = StObject.set(x, "suggestsHiddenClassName", js.undefined)
      
      @scala.inline
      def setTypes(value: js.Array[QueryType]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
      
      @scala.inline
      def setTypesVarargs(value: QueryType*): Self = StObject.set(x, "types", js.Array(value :_*))
    }
  }
  
  type Omit[T, K /* <: /* keyof T */ String */] = Pick[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: P} & {[ P in K ]: never} & {[x: string] : never, [x: number] : never}[keyof T] */ js.Any
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactGeosuggest.reactGeosuggestStrings.address
    - typingsSlinky.reactGeosuggest.reactGeosuggestStrings.establishment
    - typingsSlinky.reactGeosuggest.reactGeosuggestStrings.geocode
    - typingsSlinky.reactGeosuggest.reactGeosuggestStrings.LeftparenthesiscitiesRightparenthesis
    - typingsSlinky.reactGeosuggest.reactGeosuggestStrings.LeftparenthesisregionsRightparenthesis
  */
  trait QueryType extends StObject
  object QueryType {
    
    @scala.inline
    def LeftparenthesiscitiesRightparenthesis: typingsSlinky.reactGeosuggest.reactGeosuggestStrings.LeftparenthesiscitiesRightparenthesis = "(cities)".asInstanceOf[typingsSlinky.reactGeosuggest.reactGeosuggestStrings.LeftparenthesiscitiesRightparenthesis]
    
    @scala.inline
    def LeftparenthesisregionsRightparenthesis: typingsSlinky.reactGeosuggest.reactGeosuggestStrings.LeftparenthesisregionsRightparenthesis = "(regions)".asInstanceOf[typingsSlinky.reactGeosuggest.reactGeosuggestStrings.LeftparenthesisregionsRightparenthesis]
    
    @scala.inline
    def address: typingsSlinky.reactGeosuggest.reactGeosuggestStrings.address = "address".asInstanceOf[typingsSlinky.reactGeosuggest.reactGeosuggestStrings.address]
    
    @scala.inline
    def establishment: typingsSlinky.reactGeosuggest.reactGeosuggestStrings.establishment = "establishment".asInstanceOf[typingsSlinky.reactGeosuggest.reactGeosuggestStrings.establishment]
    
    @scala.inline
    def geocode: typingsSlinky.reactGeosuggest.reactGeosuggestStrings.geocode = "geocode".asInstanceOf[typingsSlinky.reactGeosuggest.reactGeosuggestStrings.geocode]
  }
  
  @js.native
  trait Styles extends StObject {
    
    var input: js.UndefOr[Record[String, _]] = js.native
    
    var suggestItem: js.UndefOr[Record[String, _]] = js.native
    
    var suggests: js.UndefOr[Record[String, _]] = js.native
  }
  object Styles {
    
    @scala.inline
    def apply(): Styles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Styles]
    }
    
    @scala.inline
    implicit class StylesMutableBuilder[Self <: Styles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInput(value: Record[String, _]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
      
      @scala.inline
      def setSuggestItem(value: Record[String, _]): Self = StObject.set(x, "suggestItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuggestItemUndefined: Self = StObject.set(x, "suggestItem", js.undefined)
      
      @scala.inline
      def setSuggests(value: Record[String, _]): Self = StObject.set(x, "suggests", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuggestsUndefined: Self = StObject.set(x, "suggests", js.undefined)
    }
  }
  
  @js.native
  trait Suggest extends StObject {
    
    var gmaps: js.UndefOr[GeocoderResult] = js.native
    
    var label: String = js.native
    
    var location: Lat = js.native
    
    var placeId: String = js.native
  }
  object Suggest {
    
    @scala.inline
    def apply(label: String, location: Lat, placeId: String): Suggest = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], placeId = placeId.asInstanceOf[js.Any])
      __obj.asInstanceOf[Suggest]
    }
    
    @scala.inline
    implicit class SuggestMutableBuilder[Self <: Suggest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGmaps(value: GeocoderResult): Self = StObject.set(x, "gmaps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGmapsUndefined: Self = StObject.set(x, "gmaps", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocation(value: Lat): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceId(value: String): Self = StObject.set(x, "placeId", value.asInstanceOf[js.Any])
    }
  }
}
