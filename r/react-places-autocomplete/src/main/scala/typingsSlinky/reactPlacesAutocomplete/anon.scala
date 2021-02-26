package typingsSlinky.reactPlacesAutocomplete

import org.scalajs.dom.raw.Element
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticTouchEvent
import typingsSlinky.googlemaps.google.maps.GeocoderComponentRestrictions
import typingsSlinky.googlemaps.google.maps.LatLng
import typingsSlinky.googlemaps.google.maps.LatLngBounds
import typingsSlinky.googlemaps.google.maps.LatLngBoundsLiteral
import typingsSlinky.googlemaps.google.maps.LatLngLiteral
import typingsSlinky.react.mod.FocusEventHandler
import typingsSlinky.react.mod.KeyboardEventHandler
import typingsSlinky.react.mod.MouseEventHandler
import typingsSlinky.react.mod.TouchEventHandler
import typingsSlinky.reactPlacesAutocomplete.mod.Suggestion
import typingsSlinky.reactPlacesAutocomplete.reactPlacesAutocompleteStrings.combobox
import typingsSlinky.reactPlacesAutocomplete.reactPlacesAutocompleteStrings.list
import typingsSlinky.reactPlacesAutocomplete.reactPlacesAutocompleteStrings.off
import typingsSlinky.reactPlacesAutocomplete.reactPlacesAutocompleteStrings.option
import typingsSlinky.reactPlacesAutocomplete.reactPlacesAutocompleteStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Ariaactivedescendant extends StObject {
    
    var `aria-activedescendant`: js.UndefOr[String] = js.native
    
    var `aria-autocomplete`: list = js.native
    
    var `aria-expanded`: Boolean = js.native
    
    var autoComplete: off = js.native
    
    var disabled: Boolean = js.native
    
    var onBlur: FocusEventHandler[Element] = js.native
    
    def onChange(ev: Target): Unit = js.native
    
    var onKeyDown: KeyboardEventHandler[Element] = js.native
    
    var role: combobox = js.native
    
    var `type`: text = js.native
    
    var value: js.UndefOr[String] = js.native
  }
  object Ariaactivedescendant {
    
    @scala.inline
    def apply(
      `aria-autocomplete`: list,
      `aria-expanded`: Boolean,
      autoComplete: off,
      disabled: Boolean,
      onBlur: SyntheticFocusEvent[Element] => Unit,
      onChange: Target => Unit,
      onKeyDown: SyntheticKeyboardEvent[Element] => Unit,
      role: combobox,
      `type`: text
    ): Ariaactivedescendant = {
      val __obj = js.Dynamic.literal(autoComplete = autoComplete.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], onBlur = js.Any.fromFunction1(onBlur), onChange = js.Any.fromFunction1(onChange), onKeyDown = js.Any.fromFunction1(onKeyDown), role = role.asInstanceOf[js.Any])
      __obj.updateDynamic("aria-autocomplete")(`aria-autocomplete`.asInstanceOf[js.Any])
      __obj.updateDynamic("aria-expanded")(`aria-expanded`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ariaactivedescendant]
    }
    
    @scala.inline
    implicit class AriaactivedescendantMutableBuilder[Self <: Ariaactivedescendant] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `setAria-activedescendant`(value: String): Self = StObject.set(x, "aria-activedescendant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-activedescendantUndefined`: Self = StObject.set(x, "aria-activedescendant", js.undefined)
      
      @scala.inline
      def `setAria-autocomplete`(value: list): Self = StObject.set(x, "aria-autocomplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-expanded`(value: Boolean): Self = StObject.set(x, "aria-expanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoComplete(value: off): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnBlur(value: SyntheticFocusEvent[Element] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChange(value: Target => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyDown(value: SyntheticKeyboardEvent[Element] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRole(value: combobox): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: text): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait Bounds extends StObject {
    
    var bounds: js.UndefOr[LatLngBounds | LatLngBoundsLiteral] = js.native
    
    var componentRestrictions: js.UndefOr[GeocoderComponentRestrictions] = js.native
    
    var location: js.UndefOr[LatLng | LatLngLiteral] = js.native
    
    var offset: js.UndefOr[Double | String] = js.native
    
    var radius: js.UndefOr[Double | String] = js.native
    
    var sessionToken: js.UndefOr[js.Any] = js.native
    
    var types: js.UndefOr[js.Array[String]] = js.native
  }
  object Bounds {
    
    @scala.inline
    def apply(): Bounds = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Bounds]
    }
    
    @scala.inline
    implicit class BoundsMutableBuilder[Self <: Bounds] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBounds(value: LatLngBounds | LatLngBoundsLiteral): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
      
      @scala.inline
      def setComponentRestrictions(value: GeocoderComponentRestrictions): Self = StObject.set(x, "componentRestrictions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentRestrictionsUndefined: Self = StObject.set(x, "componentRestrictions", js.undefined)
      
      @scala.inline
      def setLocation(value: LatLng | LatLngLiteral): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      @scala.inline
      def setOffset(value: Double | String): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setRadius(value: Double | String): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      @scala.inline
      def setSessionToken(value: js.Any): Self = StObject.set(x, "sessionToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionTokenUndefined: Self = StObject.set(x, "sessionToken", js.undefined)
      
      @scala.inline
      def setTypes(value: js.Array[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
      
      @scala.inline
      def setTypesVarargs(value: String*): Self = StObject.set(x, "types", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Id extends StObject {
    
    var id: js.UndefOr[String] = js.native
    
    var key: Double = js.native
    
    var onClick: MouseEventHandler[Element] = js.native
    
    var onMouseDown: MouseEventHandler[Element] = js.native
    
    var onMouseEnter: MouseEventHandler[Element] = js.native
    
    var onMouseLeave: MouseEventHandler[Element] = js.native
    
    var onMouseUp: MouseEventHandler[Element] = js.native
    
    var onTouchEnd: TouchEventHandler[Element] = js.native
    
    var onTouchStart: TouchEventHandler[Element] = js.native
    
    var role: option = js.native
  }
  object Id {
    
    @scala.inline
    def apply(
      key: Double,
      onClick: SyntheticMouseEvent[Element] => Unit,
      onMouseDown: SyntheticMouseEvent[Element] => Unit,
      onMouseEnter: SyntheticMouseEvent[Element] => Unit,
      onMouseLeave: SyntheticMouseEvent[Element] => Unit,
      onMouseUp: SyntheticMouseEvent[Element] => Unit,
      onTouchEnd: SyntheticTouchEvent[Element] => Unit,
      onTouchStart: SyntheticTouchEvent[Element] => Unit,
      role: option
    ): Id = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick), onMouseDown = js.Any.fromFunction1(onMouseDown), onMouseEnter = js.Any.fromFunction1(onMouseEnter), onMouseLeave = js.Any.fromFunction1(onMouseLeave), onMouseUp = js.Any.fromFunction1(onMouseUp), onTouchEnd = js.Any.fromFunction1(onTouchEnd), onTouchStart = js.Any.fromFunction1(onTouchStart), role = role.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    @scala.inline
    implicit class IdMutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setKey(value: Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnClick(value: SyntheticMouseEvent[Element] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseDown(value: SyntheticMouseEvent[Element] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseEnter(value: SyntheticMouseEvent[Element] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseLeave(value: SyntheticMouseEvent[Element] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseUp(value: SyntheticMouseEvent[Element] => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchEnd(value: SyntheticTouchEvent[Element] => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchStart(value: SyntheticTouchEvent[Element] => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRole(value: option): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MainText extends StObject {
    
    var mainText: String = js.native
    
    var secondaryText: String = js.native
  }
  object MainText {
    
    @scala.inline
    def apply(mainText: String, secondaryText: String): MainText = {
      val __obj = js.Dynamic.literal(mainText = mainText.asInstanceOf[js.Any], secondaryText = secondaryText.asInstanceOf[js.Any])
      __obj.asInstanceOf[MainText]
    }
    
    @scala.inline
    implicit class MainTextMutableBuilder[Self <: MainText] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMainText(value: String): Self = StObject.set(x, "mainText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondaryText(value: String): Self = StObject.set(x, "secondaryText", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Readonly<{  loading :boolean,   suggestions :std.ReadonlyArray<react-places-autocomplete.react-places-autocomplete.Suggestion>, getInputProps <InputProps extends {}>(options : InputProps | undefined): {  type :'text',   autoComplete :'off',   role :'combobox',   aria-autocomplete :'list',   aria-expanded :boolean,   aria-activedescendant :string | undefined,   disabled :boolean,   onKeyDown :react.react.KeyboardEventHandler<std.Element>,   onBlur :react.react.FocusEventHandler<std.Element>,   value :string | undefined, onChange (ev : {  target :{  value :string}}): void} & InputProps, getSuggestionItemProps <SuggestionProps extends {}>(suggestion : react-places-autocomplete.react-places-autocomplete.Suggestion, options : SuggestionProps | undefined): {  key :number,   id :string | undefined,   role :'option',   onMouseEnter :react.react.MouseEventHandler<std.Element>,   onMouseLeave :react.react.MouseEventHandler<std.Element>,   onMouseDown :react.react.MouseEventHandler<std.Element>,   onMouseUp :react.react.MouseEventHandler<std.Element>,   onTouchStart :react.react.TouchEventHandler<std.Element>,   onTouchEnd :react.react.TouchEventHandler<std.Element>,   onClick :react.react.MouseEventHandler<std.Element>} & SuggestionProps}> */
  @js.native
  trait Readonlyloadingbooleansug extends StObject {
    
    val getInputProps: js.Function1[/* options */ js.UndefOr[js.Object], Ariaactivedescendant with js.Object] = js.native
    
    val getSuggestionItemProps: js.Function2[/* suggestion */ Suggestion, /* options */ js.UndefOr[js.Object], Id with js.Object] = js.native
    
    val loading: Boolean = js.native
    
    val suggestions: js.Array[Suggestion] = js.native
  }
  object Readonlyloadingbooleansug {
    
    @scala.inline
    def apply(
      getInputProps: /* options */ js.UndefOr[js.Object] => Ariaactivedescendant with js.Object,
      getSuggestionItemProps: (/* suggestion */ Suggestion, /* options */ js.UndefOr[js.Object]) => Id with js.Object,
      loading: Boolean,
      suggestions: js.Array[Suggestion]
    ): Readonlyloadingbooleansug = {
      val __obj = js.Dynamic.literal(getInputProps = js.Any.fromFunction1(getInputProps), getSuggestionItemProps = js.Any.fromFunction2(getSuggestionItemProps), loading = loading.asInstanceOf[js.Any], suggestions = suggestions.asInstanceOf[js.Any])
      __obj.asInstanceOf[Readonlyloadingbooleansug]
    }
    
    @scala.inline
    implicit class ReadonlyloadingbooleansugMutableBuilder[Self <: Readonlyloadingbooleansug] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetInputProps(value: /* options */ js.UndefOr[js.Object] => Ariaactivedescendant with js.Object): Self = StObject.set(x, "getInputProps", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetSuggestionItemProps(value: (/* suggestion */ Suggestion, /* options */ js.UndefOr[js.Object]) => Id with js.Object): Self = StObject.set(x, "getSuggestionItemProps", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuggestions(value: js.Array[Suggestion]): Self = StObject.set(x, "suggestions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuggestionsVarargs(value: Suggestion*): Self = StObject.set(x, "suggestions", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Target extends StObject {
    
    var target: Value = js.native
  }
  object Target {
    
    @scala.inline
    def apply(target: Value): Target = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[Target]
    }
    
    @scala.inline
    implicit class TargetMutableBuilder[Self <: Target] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTarget(value: Value): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Value extends StObject {
    
    var value: String = js.native
  }
  object Value {
    
    @scala.inline
    def apply(value: String): Value = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value]
    }
    
    @scala.inline
    implicit class ValueMutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
