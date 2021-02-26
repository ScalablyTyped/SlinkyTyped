package typingsSlinky.materialLinearProgress

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adapterMod {
  
  @js.native
  trait MDCLinearProgressAdapter extends StObject {
    
    def addClass(className: String): Unit = js.native
    
    /**
      * If available, creates a `ResizeObserver` object, invokes the `#observe`
      * method on the root element. This is used for an optional performance gains
      * for the indeterminate animation on modern browsers.
      *
      * @param callback The callback to apply to the constructor of the
      *    `ResizeObserver`
      * @return Returns a `ResizeObserver` that has had `observe` called on the
      *    root element with the given callback. `null` if `ResizeObserver` is not
      *    implemented or polyfilled.
      */
    def attachResizeObserver(
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResizeObserverCallback */ js.Any
    ): (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResizeObserver */ js.Any) | Null = js.native
    
    def forceLayout(): Unit = js.native
    
    /**
      * @return The width of the root element.
      */
    def getWidth(): Double = js.native
    
    def hasClass(className: String): Boolean = js.native
    
    def removeAttribute(name: String): Unit = js.native
    
    def removeClass(className: String): Unit = js.native
    
    def setAttribute(name: String, value: String): Unit = js.native
    
    def setBufferBarStyle(styleProperty: String, value: String): Unit = js.native
    
    def setPrimaryBarStyle(styleProperty: String, value: String): Unit = js.native
    
    /**
      * Sets the inline style on the root element.
      * @param styleProperty The style property to set.
      * @param value The value the style property should be set to.
      */
    def setStyle(styleProperty: String, value: String): Unit = js.native
  }
  object MDCLinearProgressAdapter {
    
    @scala.inline
    def apply(
      addClass: String => Unit,
      attachResizeObserver: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResizeObserverCallback */ js.Any => (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResizeObserver */ js.Any) | Null,
      forceLayout: () => Unit,
      getWidth: () => Double,
      hasClass: String => Boolean,
      removeAttribute: String => Unit,
      removeClass: String => Unit,
      setAttribute: (String, String) => Unit,
      setBufferBarStyle: (String, String) => Unit,
      setPrimaryBarStyle: (String, String) => Unit,
      setStyle: (String, String) => Unit
    ): MDCLinearProgressAdapter = {
      val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), attachResizeObserver = js.Any.fromFunction1(attachResizeObserver), forceLayout = js.Any.fromFunction0(forceLayout), getWidth = js.Any.fromFunction0(getWidth), hasClass = js.Any.fromFunction1(hasClass), removeAttribute = js.Any.fromFunction1(removeAttribute), removeClass = js.Any.fromFunction1(removeClass), setAttribute = js.Any.fromFunction2(setAttribute), setBufferBarStyle = js.Any.fromFunction2(setBufferBarStyle), setPrimaryBarStyle = js.Any.fromFunction2(setPrimaryBarStyle), setStyle = js.Any.fromFunction2(setStyle))
      __obj.asInstanceOf[MDCLinearProgressAdapter]
    }
    
    @scala.inline
    implicit class MDCLinearProgressAdapterMutableBuilder[Self <: MDCLinearProgressAdapter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddClass(value: String => Unit): Self = StObject.set(x, "addClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAttachResizeObserver(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResizeObserverCallback */ js.Any => (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResizeObserver */ js.Any) | Null
      ): Self = StObject.set(x, "attachResizeObserver", js.Any.fromFunction1(value))
      
      @scala.inline
      def setForceLayout(value: () => Unit): Self = StObject.set(x, "forceLayout", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetWidth(value: () => Double): Self = StObject.set(x, "getWidth", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHasClass(value: String => Boolean): Self = StObject.set(x, "hasClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveAttribute(value: String => Unit): Self = StObject.set(x, "removeAttribute", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveClass(value: String => Unit): Self = StObject.set(x, "removeClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetAttribute(value: (String, String) => Unit): Self = StObject.set(x, "setAttribute", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetBufferBarStyle(value: (String, String) => Unit): Self = StObject.set(x, "setBufferBarStyle", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetPrimaryBarStyle(value: (String, String) => Unit): Self = StObject.set(x, "setPrimaryBarStyle", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetStyle(value: (String, String) => Unit): Self = StObject.set(x, "setStyle", js.Any.fromFunction2(value))
    }
  }
}
