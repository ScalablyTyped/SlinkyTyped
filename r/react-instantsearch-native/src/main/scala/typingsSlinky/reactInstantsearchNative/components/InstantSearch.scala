package typingsSlinky.reactInstantsearchNative.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactInstantsearchCore.mod.InstantSearchProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InstantSearch {
  
  @scala.inline
  def apply(indexName: String, searchClient: js.Any): Builder = {
    val __props = js.Dynamic.literal(indexName = indexName.asInstanceOf[js.Any], searchClient = searchClient.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[InstantSearchProps]))
  }
  
  @JSImport("react-instantsearch-native", "InstantSearch")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactInstantsearchNative.mod.InstantSearch] {
    
    @scala.inline
    def createURL(value: /* repeated */ js.Any => _): this.type = set("createURL", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSearchParameters(value: /* repeated */ js.Any => _): this.type = set("onSearchParameters", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSearchStateChange(value: /* repeated */ js.Any => _): this.type = set("onSearchStateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def refresh(value: Boolean): this.type = set("refresh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def resultsState(value: js.Any): this.type = set("resultsState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def searchState(value: js.Any): this.type = set("searchState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stalledSearchDelay(value: Double): this.type = set("stalledSearchDelay", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: InstantSearchProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
