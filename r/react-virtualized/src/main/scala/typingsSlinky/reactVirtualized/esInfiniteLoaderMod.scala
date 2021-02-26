package typingsSlinky.reactVirtualized

import org.scalablytyped.runtime.StringDictionary
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.PureComponent
import typingsSlinky.reactVirtualized.anon.IsRowLoaded
import typingsSlinky.reactVirtualized.anon.MinimumBatchSize
import typingsSlinky.reactVirtualized.mod.Index
import typingsSlinky.reactVirtualized.mod.IndexRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esInfiniteLoaderMod {
  
  @JSImport("react-virtualized/dist/es/InfiniteLoader", "InfiniteLoader")
  @js.native
  class InfiniteLoader protected ()
    extends PureComponent[InfiniteLoaderProps, js.Object, js.Any] {
    def this(props: InfiniteLoaderProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: InfiniteLoaderProps, context: js.Any) = this()
    
    def resetLoadMoreRowsCache(): Unit = js.native
    def resetLoadMoreRowsCache(autoReload: Boolean): Unit = js.native
  }
  /* static members */
  object InfiniteLoader {
    
    @JSImport("react-virtualized/dist/es/InfiniteLoader", "InfiniteLoader")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-virtualized/dist/es/InfiniteLoader", "InfiniteLoader.defaultProps")
    @js.native
    def defaultProps: MinimumBatchSize = js.native
    @scala.inline
    def defaultProps_=(x: MinimumBatchSize): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-virtualized/dist/es/InfiniteLoader", "InfiniteLoader.propTypes")
    @js.native
    def propTypes: IsRowLoaded = js.native
    @scala.inline
    def propTypes_=(x: IsRowLoaded): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait InfiniteLoaderChildProps extends StObject {
    
    def onRowsRendered(params: IndexRange): Unit = js.native
    
    def registerChild(registeredChild: js.Any): Unit = js.native
  }
  object InfiniteLoaderChildProps {
    
    @scala.inline
    def apply(onRowsRendered: IndexRange => Unit, registerChild: js.Any => Unit): InfiniteLoaderChildProps = {
      val __obj = js.Dynamic.literal(onRowsRendered = js.Any.fromFunction1(onRowsRendered), registerChild = js.Any.fromFunction1(registerChild))
      __obj.asInstanceOf[InfiniteLoaderChildProps]
    }
    
    @scala.inline
    implicit class InfiniteLoaderChildPropsMutableBuilder[Self <: InfiniteLoaderChildProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnRowsRendered(value: IndexRange => Unit): Self = StObject.set(x, "onRowsRendered", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRegisterChild(value: js.Any => Unit): Self = StObject.set(x, "registerChild", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait InfiniteLoaderProps
    extends /**
    * PLEASE NOTE
    * The [key: string]: any; line is here on purpose
    * This is due to the need of force re-render of PureComponent
    * Check the following link if you want to know more
    * https://github.com/bvaughn/react-virtualized#pass-thru-props
    */
  /* key */ StringDictionary[js.Any] {
    
    /**
      * Function responsible for rendering a virtualized component.
      * This function should implement the following signature:
      * ({ onRowsRendered, registerChild }) => PropTypes.element
      *
      * The specified :onRowsRendered function should be passed through to the child's :onRowsRendered property.
      * The :registerChild callback should be set as the virtualized component's :ref.
      */
    def children(props: InfiniteLoaderChildProps): ReactElement = js.native
    
    /**
      * Function responsible for tracking the loaded state of each row.
      * It should implement the following signature: ({ index: number }): boolean
      */
    def isRowLoaded(params: Index): Boolean = js.native
    
    /**
      * Callback to be invoked when more rows must be loaded.
      * It should implement the following signature: ({ startIndex, stopIndex }): Promise
      * The returned Promise should be resolved once row data has finished loading.
      * It will be used to determine when to refresh the list with the newly-loaded data.
      * This callback may be called multiple times in reaction to a single scroll event.
      */
    def loadMoreRows(params: IndexRange): js.Promise[_] = js.native
    
    /**
      * Minimum number of rows to be loaded at a time.
      * This property can be used to batch requests to reduce HTTP requests.
      */
    var minimumBatchSize: js.UndefOr[Double] = js.native
    
    /**
      * Number of rows in list; can be arbitrary high number if actual number is unknown.
      */
    var rowCount: js.UndefOr[Double] = js.native
    
    /**
      * Threshold at which to pre-fetch data.
      * A threshold X means that data will start loading when a user scrolls within X rows.
      * This value defaults to 15.
      */
    var threshold: js.UndefOr[Double] = js.native
  }
  object InfiniteLoaderProps {
    
    @scala.inline
    def apply(
      children: InfiniteLoaderChildProps => ReactElement,
      isRowLoaded: Index => Boolean,
      loadMoreRows: IndexRange => js.Promise[_]
    ): InfiniteLoaderProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), isRowLoaded = js.Any.fromFunction1(isRowLoaded), loadMoreRows = js.Any.fromFunction1(loadMoreRows))
      __obj.asInstanceOf[InfiniteLoaderProps]
    }
    
    @scala.inline
    implicit class InfiniteLoaderPropsMutableBuilder[Self <: InfiniteLoaderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: InfiniteLoaderChildProps => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsRowLoaded(value: Index => Boolean): Self = StObject.set(x, "isRowLoaded", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLoadMoreRows(value: IndexRange => js.Promise[_]): Self = StObject.set(x, "loadMoreRows", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMinimumBatchSize(value: Double): Self = StObject.set(x, "minimumBatchSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimumBatchSizeUndefined: Self = StObject.set(x, "minimumBatchSize", js.undefined)
      
      @scala.inline
      def setRowCount(value: Double): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowCountUndefined: Self = StObject.set(x, "rowCount", js.undefined)
      
      @scala.inline
      def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
    }
  }
}
