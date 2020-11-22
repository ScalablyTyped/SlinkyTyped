package typingsSlinky.reactBootstrapTypeahead.components

import org.scalajs.dom.raw.Event
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactBootstrapTypeahead.mod.AllTypeaheadOwnAndInjectedProps
import typingsSlinky.reactBootstrapTypeahead.mod.AsyncTypeaheadProps
import typingsSlinky.reactBootstrapTypeahead.mod.InputProps
import typingsSlinky.reactBootstrapTypeahead.mod.TypeaheadAlign
import typingsSlinky.reactBootstrapTypeahead.mod.TypeaheadBsSizes
import typingsSlinky.reactBootstrapTypeahead.mod.TypeaheadLabelKey
import typingsSlinky.reactBootstrapTypeahead.mod.TypeaheadMenuProps
import typingsSlinky.reactBootstrapTypeahead.mod.TypeaheadModel
import typingsSlinky.reactBootstrapTypeahead.mod.TypeaheadResult
import typingsSlinky.reactBootstrapTypeahead.mod.TypeaheadState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AsyncTypeahead {
  
  @JSImport("react-bootstrap-typeahead", "AsyncTypeahead")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[T /* <: TypeaheadModel */] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactBootstrapTypeahead.mod.AsyncTypeahead[T]] {
    
    @scala.inline
    def a11yNumResults(value: () => Unit): this.type = set("a11yNumResults", js.Any.fromFunction0(value))
    
    @scala.inline
    def a11yNumSelected(value: () => Unit): this.type = set("a11yNumSelected", js.Any.fromFunction0(value))
    
    @scala.inline
    def align(value: TypeaheadAlign): this.type = set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def allowNewFunction2(value: (/* results */ js.Array[T], /* props */ AllTypeaheadOwnAndInjectedProps[T]) => Boolean): this.type = set("allowNew", js.Any.fromFunction2(value))
    
    @scala.inline
    def allowNew(
      value: Boolean | (js.Function2[/* results */ js.Array[T], /* props */ AllTypeaheadOwnAndInjectedProps[T], Boolean])
    ): this.type = set("allowNew", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def bodyContainer(value: Boolean): this.type = set("bodyContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def bsSize(value: TypeaheadBsSizes): this.type = set("bsSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def caseSensitive(value: Boolean): this.type = set("caseSensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def clearButton(value: Boolean): this.type = set("clearButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultInputValue(value: String): this.type = set("defaultInputValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultOpen(value: Boolean): this.type = set("defaultOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultSelectedVarargs(value: T*): this.type = set("defaultSelected", js.Array(value :_*))
    
    @scala.inline
    def defaultSelected(value: js.Array[T]): this.type = set("defaultSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delay(value: Double): this.type = set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dropup(value: Boolean): this.type = set("dropup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def emptyLabel(value: String): this.type = set("emptyLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def filterByFunction2(value: (T, /* props */ AllTypeaheadOwnAndInjectedProps[T]) => Boolean): this.type = set("filterBy", js.Any.fromFunction2(value))
    
    @scala.inline
    def filterByVarargs(value: String*): this.type = set("filterBy", js.Array(value :_*))
    
    @scala.inline
    def filterBy(
      value: js.Array[String] | (js.Function2[T, /* props */ AllTypeaheadOwnAndInjectedProps[T], Boolean])
    ): this.type = set("filterBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def flip(value: Boolean): this.type = set("flip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def highlightOnlyResult(value: Boolean): this.type = set("highlightOnlyResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String | Double): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def ignoreDiacritics(value: Boolean): this.type = set("ignoreDiacritics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inputProps(value: InputProps): this.type = set("inputProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isInvalid(value: Boolean): this.type = set("isInvalid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isValid(value: Boolean): this.type = set("isValid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelKeyFunction1(value: T => String): this.type = set("labelKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def labelKey(value: TypeaheadLabelKey[T]): this.type = set("labelKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxHeight(value: String): this.type = set("maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxResults(value: Double): this.type = set("maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def menuId(value: String): this.type = set("menuId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minLength(value: Double): this.type = set("minLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def multiple(value: Boolean): this.type = set("multiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def newSelectionPrefix(value: String): this.type = set("newSelectionPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onBlur(value: /* e */ Event => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def onChange(value: /* selected */ js.Array[T] => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onFocus(value: /* e */ Event => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def onInputChange(value: (/* input */ String, /* e */ Event) => Unit): this.type = set("onInputChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def onKeyDown(value: /* e */ Event => Unit): this.type = set("onKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMenuHide(value: () => Unit): this.type = set("onMenuHide", js.Any.fromFunction0(value))
    
    @scala.inline
    def onMenuShow(value: () => Unit): this.type = set("onMenuShow", js.Any.fromFunction0(value))
    
    @scala.inline
    def onMenuToggle(value: /* show */ Boolean => Unit): this.type = set("onMenuToggle", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPaginate(value: (/* e */ Event, /* numResults */ Double) => Unit): this.type = set("onPaginate", js.Any.fromFunction2(value))
    
    @scala.inline
    def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def paginate(value: Boolean): this.type = set("paginate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def paginationText(value: String): this.type = set("paginationText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def positionFixed(value: Boolean): this.type = set("positionFixed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def promptTextReactElement(value: ReactElement): this.type = set("promptText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def promptText(value: ReactElement): this.type = set("promptText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def renderMenu(
      value: (/* results */ js.Array[TypeaheadResult[T]], /* menuProps */ TypeaheadMenuProps[T], /* state */ TypeaheadState[T]) => ReactElement
    ): this.type = set("renderMenu", js.Any.fromFunction3(value))
    
    @scala.inline
    def renderMenuItemChildren(
      value: (/* option */ TypeaheadResult[T], /* props */ TypeaheadMenuProps[T], /* index */ Double) => ReactElement
    ): this.type = set("renderMenuItemChildren", js.Any.fromFunction3(value))
    
    @scala.inline
    def renderToken(value: (T, /* props */ TypeaheadMenuProps[T], /* index */ Double) => ReactElement): this.type = set("renderToken", js.Any.fromFunction3(value))
    
    @scala.inline
    def searchTextReactElement(value: ReactElement): this.type = set("searchText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def searchText(value: ReactElement): this.type = set("searchText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selectHintOnEnter(value: Boolean): this.type = set("selectHintOnEnter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selectedVarargs(value: T*): this.type = set("selected", js.Array(value :_*))
    
    @scala.inline
    def selected(value: js.Array[T]): this.type = set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def useCache(value: Boolean): this.type = set("useCache", value.asInstanceOf[js.Any])
  }
  
  def withProps[T /* <: TypeaheadModel */](p: AsyncTypeaheadProps[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply[T /* <: TypeaheadModel */](isLoading: Boolean, onSearch: String => Unit, options: js.Array[T]): Builder[T] = {
    val __props = js.Dynamic.literal(isLoading = isLoading.asInstanceOf[js.Any], onSearch = js.Any.fromFunction1(onSearch), options = options.asInstanceOf[js.Any])
    new Builder[T](js.Array(this.component, __props.asInstanceOf[AsyncTypeaheadProps[T]]))
  }
}
