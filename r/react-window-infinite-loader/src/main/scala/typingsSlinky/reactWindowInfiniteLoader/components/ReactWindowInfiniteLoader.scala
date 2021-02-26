package typingsSlinky.reactWindowInfiniteLoader.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactWindowInfiniteLoader.anon.OnItemsRendered
import typingsSlinky.reactWindowInfiniteLoader.mod.InfiniteLoaderProps
import typingsSlinky.reactWindowInfiniteLoader.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactWindowInfiniteLoader {
  
  @scala.inline
  def apply(
    children: OnItemsRendered => ReactElement,
    isItemLoaded: Double => Boolean,
    itemCount: Double,
    loadMoreItems: (Double, Double) => js.Promise[_] | Null
  ): Builder = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children), isItemLoaded = js.Any.fromFunction1(isItemLoaded), itemCount = itemCount.asInstanceOf[js.Any], loadMoreItems = js.Any.fromFunction2(loadMoreItems))
    new Builder(js.Array(this.component, __props.asInstanceOf[InfiniteLoaderProps]))
  }
  
  @JSImport("react-window-infinite-loader", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, ^] {
    
    @scala.inline
    def minimumBatchSize(value: Double): this.type = set("minimumBatchSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def threshold(value: Double): this.type = set("threshold", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: InfiniteLoaderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
