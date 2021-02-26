package typingsSlinky.bootstrap

import org.scalajs.dom.raw.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toastMod {
  
  @JSImport("bootstrap/js/dist/toast", JSImport.Default)
  @js.native
  class default protected () extends Toast {
    def this(element: Element) = this()
  }
  object default {
    
    @JSImport("bootstrap/js/dist/toast", "default.Events")
    @js.native
    object Events extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsSlinky.bootstrap.toastMod.Toast.Events with String] = js.native
      
      /* "hidden.bs.toast" */ val hidden: typingsSlinky.bootstrap.toastMod.Toast.Events.hidden with String = js.native
      
      /* "hide.bs.toast" */ val hide: typingsSlinky.bootstrap.toastMod.Toast.Events.hide with String = js.native
      
      /* "show.bs.toast" */ val show: typingsSlinky.bootstrap.toastMod.Toast.Events.show with String = js.native
      
      /* "shown.bs.toast" */ val shown: typingsSlinky.bootstrap.toastMod.Toast.Events.shown with String = js.native
    }
    
    /**
      * Static method which allows you to get the scrollspy instance associated
      * with a DOM element
      */
    /* static member */
    @JSImport("bootstrap/js/dist/toast", "default.getInstance")
    @js.native
    def getInstance(element: Element): Toast = js.native
  }
  
  @js.native
  trait Toast extends StObject {
    
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
  object Toast {
    
    @scala.inline
    def apply(dispose: () => Unit, refresh: () => Unit): Toast = {
      val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), refresh = js.Any.fromFunction0(refresh))
      __obj.asInstanceOf[Toast]
    }
    
    @js.native
    sealed trait Events extends StObject
    @JSImport("bootstrap/js/dist/toast", "Toast.Events")
    @js.native
    object Events extends StObject {
      
      /**
        * This event is fired when the toast has finished being hidden from the
        * user.
        */
      @js.native
      sealed trait hidden extends Events
      
      /**
        * This event is fired immediately when the hide instance method has
        * been called.
        */
      @js.native
      sealed trait hide extends Events
      
      /**
        * This event fires immediately when the show instance method is called.
        */
      @js.native
      sealed trait show extends Events
      
      /**
        * This event is fired when the toast has been made visible to the user.
        */
      @js.native
      sealed trait shown extends Events
    }
    
    @js.native
    trait Options extends StObject {
      
      /**
        * Apply a CSS fade transition to the toast
        *
        * @default true
        */
      var animation: Boolean = js.native
      
      /**
        * Auto hide the toast
        *
        * @default true
        */
      var autohide: Boolean = js.native
      
      /**
        * Delay hiding the toast (ms)
        *
        * @default 500
        */
      var delay: Double = js.native
    }
    object Options {
      
      @scala.inline
      def apply(animation: Boolean, autohide: Boolean, delay: Double): Options = {
        val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], autohide = autohide.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any])
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAnimation(value: Boolean): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAutohide(value: Boolean): Self = StObject.set(x, "autohide", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      }
    }
    
    @scala.inline
    implicit class ToastMutableBuilder[Self <: Toast] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRefresh(value: () => Unit): Self = StObject.set(x, "refresh", js.Any.fromFunction0(value))
    }
  }
}
