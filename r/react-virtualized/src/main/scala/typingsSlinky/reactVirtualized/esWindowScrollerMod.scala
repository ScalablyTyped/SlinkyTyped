package typingsSlinky.reactVirtualized

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.Window
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.PureComponent
import typingsSlinky.reactVirtualized.anon.Height
import typingsSlinky.reactVirtualized.anon.OnResize
import typingsSlinky.reactVirtualized.anon.ScrollLeft
import typingsSlinky.reactVirtualized.anon.ScrollTop
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esWindowScrollerMod {
  
  @JSImport("react-virtualized/dist/es/WindowScroller", "IS_SCROLLING_TIMEOUT")
  @js.native
  val IS_SCROLLING_TIMEOUT: /* 150 */ Double = js.native
  
  @JSImport("react-virtualized/dist/es/WindowScroller", "WindowScroller")
  @js.native
  class WindowScroller protected ()
    extends PureComponent[WindowScrollerProps, WindowScrollerState, js.Any] {
    def this(props: WindowScrollerProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: WindowScrollerProps, context: js.Any) = this()
    
    def updatePosition(): Unit = js.native
    def updatePosition(scrollElement: HTMLElement): Unit = js.native
  }
  /* static members */
  object WindowScroller {
    
    @JSImport("react-virtualized/dist/es/WindowScroller", "WindowScroller")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-virtualized/dist/es/WindowScroller", "WindowScroller.defaultProps")
    @js.native
    def defaultProps: OnResize = js.native
    @scala.inline
    def defaultProps_=(x: OnResize): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait WindowScrollerChildProps extends StObject {
    
    var height: Double = js.native
    
    var isScrolling: Boolean = js.native
    
    def onChildScroll(params: ScrollTop): Unit = js.native
    
    def registerChild(): Unit = js.native
    def registerChild(element: ReactElement): Unit = js.native
    
    var scrollLeft: Double = js.native
    
    var scrollTop: Double = js.native
    
    var width: Double = js.native
  }
  
  @js.native
  trait WindowScrollerProps
    extends /**
    * PLEASE NOTE
    * The [key: string]: any; line is here on purpose
    * This is due to the need of force re-render of PureComponent
    * Check the following link if you want to know more
    * https://github.com/bvaughn/react-virtualized#pass-thru-props
    */
  /* key */ StringDictionary[js.Any] {
    
    /**
      * Function responsible for rendering children.
      * This function should implement the following signature:
      * ({ height, isScrolling, scrollLeft, scrollTop, width, onChildScroll }) => PropTypes.element
      */
    def children(params: WindowScrollerChildProps): ReactElement = js.native
    
    /** Callback to be invoked on-resize: ({ height, width }) */
    var onResize: js.UndefOr[js.Function1[/* params */ Height, Unit]] = js.native
    
    /** Callback to be invoked on-scroll: ({ scrollLeft, scrollTop }) */
    var onScroll: js.UndefOr[js.Function1[/* params */ ScrollLeft, Unit]] = js.native
    
    /** Element to attach scroll event listeners. Defaults to window. */
    var scrollElement: js.UndefOr[(Window with (/* globalThis */ js.Any)) | Element] = js.native
    
    /**
      * Wait this amount of time after the last scroll event before resetting child `pointer-events`.
      */
    var scrollingResetTimeInterval: js.UndefOr[Double] = js.native
    
    /** Height used for server-side rendering */
    var serverHeight: js.UndefOr[Double] = js.native
    
    /** Width used for server-side rendering */
    var serverWidth: js.UndefOr[Double] = js.native
  }
  object WindowScrollerProps {
    
    @scala.inline
    def apply(children: WindowScrollerChildProps => ReactElement): WindowScrollerProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __obj.asInstanceOf[WindowScrollerProps]
    }
    
    @scala.inline
    implicit class WindowScrollerPropsMutableBuilder[Self <: WindowScrollerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: WindowScrollerChildProps => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResize(value: /* params */ Height => Unit): Self = StObject.set(x, "onResize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResizeUndefined: Self = StObject.set(x, "onResize", js.undefined)
      
      @scala.inline
      def setOnScroll(value: /* params */ ScrollLeft => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      @scala.inline
      def setScrollElement(value: (Window with (/* globalThis */ js.Any)) | Element): Self = StObject.set(x, "scrollElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollElementElement(value: Element): Self = StObject.set(x, "scrollElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollElementUndefined: Self = StObject.set(x, "scrollElement", js.undefined)
      
      @scala.inline
      def setScrollingResetTimeInterval(value: Double): Self = StObject.set(x, "scrollingResetTimeInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollingResetTimeIntervalUndefined: Self = StObject.set(x, "scrollingResetTimeInterval", js.undefined)
      
      @scala.inline
      def setServerHeight(value: Double): Self = StObject.set(x, "serverHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerHeightUndefined: Self = StObject.set(x, "serverHeight", js.undefined)
      
      @scala.inline
      def setServerWidth(value: Double): Self = StObject.set(x, "serverWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerWidthUndefined: Self = StObject.set(x, "serverWidth", js.undefined)
    }
  }
  
  @js.native
  trait WindowScrollerState extends StObject {
    
    var height: Double = js.native
    
    var isScrolling: Boolean = js.native
    
    var scrollLeft: Double = js.native
    
    var scrollTop: Double = js.native
    
    var width: Double = js.native
  }
  object WindowScrollerState {
    
    @scala.inline
    def apply(height: Double, isScrolling: Boolean, scrollLeft: Double, scrollTop: Double, width: Double): WindowScrollerState = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], isScrolling = isScrolling.asInstanceOf[js.Any], scrollLeft = scrollLeft.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[WindowScrollerState]
    }
    
    @scala.inline
    implicit class WindowScrollerStateMutableBuilder[Self <: WindowScrollerState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsScrolling(value: Boolean): Self = StObject.set(x, "isScrolling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollLeft(value: Double): Self = StObject.set(x, "scrollLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollTop(value: Double): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
