package typingsSlinky.bootstrap

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.bootstrap.anon.PartialOptionsMethod
import typingsSlinky.bootstrap.bootstrapStrings.auto
import typingsSlinky.bootstrap.bootstrapStrings.offset
import typingsSlinky.bootstrap.bootstrapStrings.position
import typingsSlinky.jquery.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scrollspyMod {
  
  @JSImport("bootstrap/js/dist/scrollspy", JSImport.Default)
  @js.native
  class default protected () extends ScrollSpy {
    def this(element: Element) = this()
    def this(element: Element, options: PartialOptionsMethod) = this()
  }
  object default {
    
    @JSImport("bootstrap/js/dist/scrollspy", "default.Events")
    @js.native
    object Events extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsSlinky.bootstrap.scrollspyMod.ScrollSpy.Events with String] = js.native
      
      /* "activate.bs.scrollspy" */ val activate: typingsSlinky.bootstrap.scrollspyMod.ScrollSpy.Events.activate with String = js.native
    }
    
    /**
      * Static method which allows you to get the scrollspy instance associated
      * with a DOM element
      */
    /* static member */
    @JSImport("bootstrap/js/dist/scrollspy", "default.getInstance")
    @js.native
    def getInstance(element: Element): ScrollSpy = js.native
    @JSImport("bootstrap/js/dist/scrollspy", "default.getInstance")
    @js.native
    def getInstance(element: Element, options: PartialOptionsMethod): ScrollSpy = js.native
  }
  
  @js.native
  trait ScrollSpy extends StObject {
    
    /**
      * Destroys an element’s scrollspy.
      */
    def dispose(): Unit = js.native
    
    /**
      * When using scrollspy in conjunction with adding or removing of
      * elements from the DOM, you’ll need to call the refresh method like
      * so:
      */
    def refresh(): Unit = js.native
  }
  object ScrollSpy {
    
    @scala.inline
    def apply(dispose: () => Unit, refresh: () => Unit): ScrollSpy = {
      val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), refresh = js.Any.fromFunction0(refresh))
      __obj.asInstanceOf[ScrollSpy]
    }
    
    @js.native
    sealed trait Events extends StObject
    @JSImport("bootstrap/js/dist/scrollspy", "ScrollSpy.Events")
    @js.native
    object Events extends StObject {
      
      /**
        * This event fires on the scroll element whenever a new item becomes
        * activated by the scrollspy.
        */
      @js.native
      sealed trait activate extends Events
    }
    
    @js.native
    trait Options extends StObject {
      
      /**
        * Finds which section the spied element is in. auto will choose the
        * best method to get scroll coordinates. offset will use the
        * Element.getBoundingClientRect() method to get scroll coordinates.
        * position will use the HTMLElement.offsetTop and
        * HTMLElement.offsetLeft properties to get scroll coordinates.
        *
        * @default 'auto'
        */
      var method: auto | offset | position = js.native
      
      /**
        * Pixels to offset from top when calculating position of scroll.
        *
        * @default 10
        */
      var offset: Double = js.native
      
      /**
        * Specifies element to apply Scrollspy plugin.
        */
      var target: String | Element | JQuery[HTMLElement] = js.native
    }
    object Options {
      
      @scala.inline
      def apply(method: auto | offset | position, offset: Double, target: String | Element | JQuery[HTMLElement]): Options = {
        val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMethod(value: auto | offset | position): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTarget(value: String | Element | JQuery[HTMLElement]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTargetElement(value: Element): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      }
    }
    
    @scala.inline
    implicit class ScrollSpyMutableBuilder[Self <: ScrollSpy] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRefresh(value: () => Unit): Self = StObject.set(x, "refresh", js.Any.fromFunction0(value))
    }
  }
}
