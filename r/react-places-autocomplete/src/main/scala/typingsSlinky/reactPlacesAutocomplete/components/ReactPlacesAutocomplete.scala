package typingsSlinky.reactPlacesAutocomplete.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactPlacesAutocomplete.AnonBounds
import typingsSlinky.reactPlacesAutocomplete.mod.PropTypes
import typingsSlinky.reactPlacesAutocomplete.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactPlacesAutocomplete
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-places-autocomplete", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    debounce: Int | Double = null,
    googleCallbackName: String = null,
    highlightFirstSuggestion: js.UndefOr[Boolean] = js.undefined,
    onChange: /* value */ String => Unit = null,
    onError: (/* status */ String, /* clearSuggestion */ js.Function0[Unit]) => Unit = null,
    onSelect: (/* address */ String, /* placeID */ String) => Unit = null,
    searchOptions: AnonBounds = null,
    shouldFetchSuggestions: js.UndefOr[Boolean] = js.undefined,
    value: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (debounce != null) __obj.updateDynamic("debounce")(debounce.asInstanceOf[js.Any])
    if (googleCallbackName != null) __obj.updateDynamic("googleCallbackName")(googleCallbackName.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightFirstSuggestion)) __obj.updateDynamic("highlightFirstSuggestion")(highlightFirstSuggestion.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction2(onError))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction2(onSelect))
    if (searchOptions != null) __obj.updateDynamic("searchOptions")(searchOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldFetchSuggestions)) __obj.updateDynamic("shouldFetchSuggestions")(shouldFetchSuggestions.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactPlacesAutocomplete.mod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = PropTypes
}

