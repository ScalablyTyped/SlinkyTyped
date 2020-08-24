package typingsSlinky.reactPlacesAutocomplete.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactPlacesAutocomplete.anon.Bounds
import typingsSlinky.reactPlacesAutocomplete.anon.Readonlyloadingbooleansug
import typingsSlinky.reactPlacesAutocomplete.mod.PropTypes
import typingsSlinky.reactPlacesAutocomplete.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactPlacesAutocomplete {
  @JSImport("react-places-autocomplete", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def debounce(value: Double): this.type = set("debounce", value.asInstanceOf[js.Any])
    @scala.inline
    def googleCallbackName(value: String): this.type = set("googleCallbackName", value.asInstanceOf[js.Any])
    @scala.inline
    def highlightFirstSuggestion(value: Boolean): this.type = set("highlightFirstSuggestion", value.asInstanceOf[js.Any])
    @scala.inline
    def onChange(value: /* value */ String => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def onError(value: (/* status */ String, /* clearSuggestion */ js.Function0[Unit]) => Unit): this.type = set("onError", js.Any.fromFunction2(value))
    @scala.inline
    def onSelect(value: (/* address */ String, /* placeID */ String) => Unit): this.type = set("onSelect", js.Any.fromFunction2(value))
    @scala.inline
    def searchOptions(value: Bounds): this.type = set("searchOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def shouldFetchSuggestions(value: Boolean): this.type = set("shouldFetchSuggestions", value.asInstanceOf[js.Any])
    @scala.inline
    def value(value: String): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PropTypes): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(children: Readonlyloadingbooleansug => ReactElement): Builder = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Builder(js.Array(this.component, __props.asInstanceOf[PropTypes]))
  }
}

