package typingsSlinky.karmaViewport

import org.scalajs.dom.raw.HTMLIFrameElement
import typingsSlinky.karmaViewport.adapterMod.global.Window
import typingsSlinky.karmaViewport.anon.Height
import typingsSlinky.karmaViewport.anon.ReadonlyViewportConfigura
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object viewportMod {
  
  @JSImport("karma-viewport/dist/adapter/viewport", "Viewport")
  @js.native
  class Viewport protected () extends StObject {
    /**
      * Create viewport resizer
      *
      * @constructor
      *
      * @param config - Viewport configuration
      * @param parent - Initialization context
      */
    def this(config: ViewportConfiguration, parent: Window) = this()
    
    /**
      * Execute a callback for all breakpoints between the first and last given
      *
      * If the callback return value is a Promise, callback invocations will be
      * chained to guarantee sequential execution.
      *
      * @example
      *   viewport.between("mobile", "tablet", name => {
      *     ...
      *   })
      *
      * @param first - First breakpoint name
      * @param last - Last breakpoint name
      * @param cb - Callback to execute after resizing
      *
      * @return Promise resolving with no result
      */
    def between[T /* <: js.Promise[_] */](first: String, last: String, cb: ViewportCallback[T]): js.Promise[Unit] = js.native
    @JSName("between")
    def between_T_Unit[T](first: String, last: String, cb: ViewportCallback[T]): Unit = js.native
    
    /**
      * Viewport configuration
      */
    var config: ReadonlyViewportConfigura = js.native
    
    /**
      * Viewport context
      */
    var context: HTMLIFrameElement = js.native
    
    /**
      * Execute a callback for all breakpoints
      *
      * @example
      *   viewport.each(name => {
      *     ...
      *   })
      *
      * @param cb - Callback to execute after resizing
      *
      * @return Promise resolving with no result
      */
    def each[T /* <: js.Promise[_] */](cb: ViewportCallback[T]): js.Promise[Unit] = js.native
    @JSName("each")
    def each_T_Unit[T](cb: ViewportCallback[T]): Unit = js.native
    
    /**
      * Execute a callback starting at the given breakpoint
      *
      * @example
      *   viewport.from("tablet", name => {
      *     ...
      *   })
      *
      * @param first - First breakpoint name
      * @param cb - Callback to execute after resizing
      *
      * @return Promise resolving with no result
      */
    def from[T /* <: js.Promise[_] */](first: String, cb: ViewportCallback[T]): js.Promise[Unit] = js.native
    @JSName("from")
    def from_T_Unit[T](first: String, cb: ViewportCallback[T]): Unit = js.native
    
    /**
      * Load and embed document into viewport
      *
      * @param url - URL of document to load
      *
      * @return Promise resolving with no result
      */
    def load(url: String): js.Promise[Unit] = js.native
    def load(url: String, cb: js.Function0[Unit]): js.Promise[Unit] = js.native
    
    /**
      * Change viewport offset (scroll within iframe)
      *
      * @param x - Horizontal offset
      * @param y - Vertical offset
      */
    def offset(x: Double): Unit = js.native
    def offset(x: Double, y: Double): Unit = js.native
    
    /**
      * Reset viewport
      */
    def reset(): Unit = js.native
    
    def set(breakpoint: String): Unit = js.native
    /**
      * Set viewport to width (and height) or breakpoint name
      *
      * @param widthOrBreakpoint - Width in pixels or breakpoint name
      * @param height - Height in pixels
      */
    def set(width: Double): Unit = js.native
    def set(width: Double, height: Double): Unit = js.native
    
    /**
      * Execute a callback ending at the given breakpoint
      *
      * @example
      *   viewport.to("tablet", name => {
      *     ...
      *   })
      *
      * @param last - Last breakpoint name
      * @param cb - Callback to execute after resizing
      *
      * @return Promise resolving with no result
      */
    def to[T /* <: js.Promise[_] */](last: String, cb: ViewportCallback[T]): js.Promise[Unit] = js.native
    @JSName("to")
    def to_T_Unit[T](last: String, cb: ViewportCallback[T]): Unit = js.native
  }
  
  @JSImport("karma-viewport/dist/adapter/viewport", "range")
  @js.native
  def range(breakpoints: js.Array[ViewportBreakpoint], first: String): js.Array[ViewportBreakpoint] = js.native
  @JSImport("karma-viewport/dist/adapter/viewport", "range")
  @js.native
  def range(breakpoints: js.Array[ViewportBreakpoint], first: String, last: String): js.Array[ViewportBreakpoint] = js.native
  
  @js.native
  trait ViewportBreakpoint extends StObject {
    
    var name: String = js.native
    
    var size: Height = js.native
  }
  object ViewportBreakpoint {
    
    @scala.inline
    def apply(name: String, size: Height): ViewportBreakpoint = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[ViewportBreakpoint]
    }
    
    @scala.inline
    implicit class ViewportBreakpointMutableBuilder[Self <: ViewportBreakpoint] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Height): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  type ViewportCallback[T] = js.Function1[/* breakpoint */ String, T]
  
  @js.native
  trait ViewportConfiguration extends StObject {
    
    var breakpoints: js.Array[ViewportBreakpoint] = js.native
    
    var context: String = js.native
  }
  object ViewportConfiguration {
    
    @scala.inline
    def apply(breakpoints: js.Array[ViewportBreakpoint], context: String): ViewportConfiguration = {
      val __obj = js.Dynamic.literal(breakpoints = breakpoints.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any])
      __obj.asInstanceOf[ViewportConfiguration]
    }
    
    @scala.inline
    implicit class ViewportConfigurationMutableBuilder[Self <: ViewportConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBreakpoints(value: js.Array[ViewportBreakpoint]): Self = StObject.set(x, "breakpoints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBreakpointsVarargs(value: ViewportBreakpoint*): Self = StObject.set(x, "breakpoints", js.Array(value :_*))
      
      @scala.inline
      def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    }
  }
}
