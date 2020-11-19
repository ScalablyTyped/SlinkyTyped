package typingsSlinky.reactLazylog.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactLazylog.searchBarMod.SearchBarProps
import typingsSlinky.reactLazylog.searchBarMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SearchBar {
  
  @JSImport("react-lazylog/build/SearchBar", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def filterActive(value: Boolean): this.type = set("filterActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onClearSearch(value: () => Unit): this.type = set("onClearSearch", js.Any.fromFunction0(value))
    
    @scala.inline
    def onFilterLinesWithMatches(value: /* isFiltered */ Boolean => Unit): this.type = set("onFilterLinesWithMatches", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSearch(value: /* keyword */ String => Unit): this.type = set("onSearch", js.Any.fromFunction1(value))
    
    @scala.inline
    def resultsCount(value: Double): this.type = set("resultsCount", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SearchBarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: SearchBar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
