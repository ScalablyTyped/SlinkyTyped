package typingsSlinky.reactWindowInfiniteLoader

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Component
import typingsSlinky.reactWindow.mod.ListOnItemsRenderedProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-window-infinite-loader", JSImport.Namespace)
  @js.native
  class ^ () extends InfiniteLoader
  
  @js.native
  trait InfiniteLoader
    extends Component[InfiniteLoaderProps, js.Object, js.Any] {
    
    def resetloadMoreItemsCache(): Unit = js.native
    def resetloadMoreItemsCache(autoReload: Boolean): Unit = js.native
  }
  
  @js.native
  trait InfiniteLoaderProps extends StObject {
    
    def children(props: typingsSlinky.reactWindowInfiniteLoader.anon.OnItemsRendered): ReactElement = js.native
    
    def isItemLoaded(index: Double): Boolean = js.native
    
    var itemCount: Double = js.native
    
    def loadMoreItems(startIndex: Double, stopIndex: Double): js.Promise[_] | Null = js.native
    
    var minimumBatchSize: js.UndefOr[Double] = js.native
    
    var threshold: js.UndefOr[Double] = js.native
  }
  object InfiniteLoaderProps {
    
    @scala.inline
    def apply(
      children: typingsSlinky.reactWindowInfiniteLoader.anon.OnItemsRendered => ReactElement,
      isItemLoaded: Double => Boolean,
      itemCount: Double,
      loadMoreItems: (Double, Double) => js.Promise[_] | Null
    ): InfiniteLoaderProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), isItemLoaded = js.Any.fromFunction1(isItemLoaded), itemCount = itemCount.asInstanceOf[js.Any], loadMoreItems = js.Any.fromFunction2(loadMoreItems))
      __obj.asInstanceOf[InfiniteLoaderProps]
    }
    
    @scala.inline
    implicit class InfiniteLoaderPropsMutableBuilder[Self <: InfiniteLoaderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: typingsSlinky.reactWindowInfiniteLoader.anon.OnItemsRendered => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsItemLoaded(value: Double => Boolean): Self = StObject.set(x, "isItemLoaded", js.Any.fromFunction1(value))
      
      @scala.inline
      def setItemCount(value: Double): Self = StObject.set(x, "itemCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadMoreItems(value: (Double, Double) => js.Promise[_] | Null): Self = StObject.set(x, "loadMoreItems", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMinimumBatchSize(value: Double): Self = StObject.set(x, "minimumBatchSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimumBatchSizeUndefined: Self = StObject.set(x, "minimumBatchSize", js.undefined)
      
      @scala.inline
      def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
    }
  }
  
  type OnItemsRendered = js.Function1[/* props */ ListOnItemsRenderedProps, js.Any]
}
