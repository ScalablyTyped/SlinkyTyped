package typingsSlinky.materialTooltip

import org.scalajs.dom.raw.ClientRect
import typingsSlinky.materialBase.typesMod.EventType
import typingsSlinky.materialBase.typesMod.SpecificEventListener
import typingsSlinky.materialTooltip.anon.Height
import typingsSlinky.materialTooltip.constantsMod.CssClasses
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adapterMod {
  
  @js.native
  trait MDCTooltipAdapter extends StObject {
    
    /**
      * Adds a class onto the root element.
      */
    def addClass(className: CssClasses): Unit = js.native
    
    /**
      * Deregisters an event listener to the document body.
      */
    def deregisterDocumentEventHandler[K /* <: EventType */](evtType: K, handler: SpecificEventListener[K]): Unit = js.native
    
    /**
      * @return the attribute string if present on the anchor element, null
      * otherwise.
      */
    def getAnchorAttribute(attr: String): String | Null = js.native
    
    /**
      * @return the ClientRect for the anchor element.
      */
    def getAnchorBoundingRect(): ClientRect | Null = js.native
    
    /**
      * @return the attribute string if present on the root element, null
      * otherwise.
      */
    def getAttribute(attr: String): String | Null = js.native
    
    /**
      * @return the width and height of the tooltip element.
      */
    def getTooltipSize(): Height = js.native
    
    /**
      * @return the height of the viewport.
      */
    def getViewportHeight(): Double = js.native
    
    /**
      * @return the width of the viewport.
      */
    def getViewportWidth(): Double = js.native
    
    /**
      * @return whether or not the root element has the provided className.
      */
    def hasClass(className: CssClasses): Boolean = js.native
    
    /**
      * @return true if the text direction is right-to-left.
      */
    def isRTL(): Boolean = js.native
    
    /**
      * Notification that the tooltip element has been fully hidden. Typically used
      * to wait for the hide animation to complete.
      */
    def notifyHidden(): Unit = js.native
    
    /**
      * Registers an event listener to the document body.
      */
    def registerDocumentEventHandler[K /* <: EventType */](evtType: K, handler: SpecificEventListener[K]): Unit = js.native
    
    /**
      * Removes a class from the root element.
      */
    def removeClass(className: CssClasses): Unit = js.native
    
    /**
      * Sets an attribute on the root element.
      */
    def setAttribute(attr: String, value: String): Unit = js.native
    
    /**
      * Sets the property value of the given style property on the root element.
      */
    def setStyleProperty(propertyName: String, value: String): Unit = js.native
  }
  object MDCTooltipAdapter {
    
    @scala.inline
    def apply(
      addClass: CssClasses => Unit,
      deregisterDocumentEventHandler: (js.Any, SpecificEventListener[js.Any]) => Unit,
      getAnchorAttribute: String => String | Null,
      getAnchorBoundingRect: () => ClientRect | Null,
      getAttribute: String => String | Null,
      getTooltipSize: () => Height,
      getViewportHeight: () => Double,
      getViewportWidth: () => Double,
      hasClass: CssClasses => Boolean,
      isRTL: () => Boolean,
      notifyHidden: () => Unit,
      registerDocumentEventHandler: (js.Any, SpecificEventListener[js.Any]) => Unit,
      removeClass: CssClasses => Unit,
      setAttribute: (String, String) => Unit,
      setStyleProperty: (String, String) => Unit
    ): MDCTooltipAdapter = {
      val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), deregisterDocumentEventHandler = js.Any.fromFunction2(deregisterDocumentEventHandler), getAnchorAttribute = js.Any.fromFunction1(getAnchorAttribute), getAnchorBoundingRect = js.Any.fromFunction0(getAnchorBoundingRect), getAttribute = js.Any.fromFunction1(getAttribute), getTooltipSize = js.Any.fromFunction0(getTooltipSize), getViewportHeight = js.Any.fromFunction0(getViewportHeight), getViewportWidth = js.Any.fromFunction0(getViewportWidth), hasClass = js.Any.fromFunction1(hasClass), isRTL = js.Any.fromFunction0(isRTL), notifyHidden = js.Any.fromFunction0(notifyHidden), registerDocumentEventHandler = js.Any.fromFunction2(registerDocumentEventHandler), removeClass = js.Any.fromFunction1(removeClass), setAttribute = js.Any.fromFunction2(setAttribute), setStyleProperty = js.Any.fromFunction2(setStyleProperty))
      __obj.asInstanceOf[MDCTooltipAdapter]
    }
    
    @scala.inline
    implicit class MDCTooltipAdapterMutableBuilder[Self <: MDCTooltipAdapter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddClass(value: CssClasses => Unit): Self = StObject.set(x, "addClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDeregisterDocumentEventHandler(value: (js.Any, SpecificEventListener[js.Any]) => Unit): Self = StObject.set(x, "deregisterDocumentEventHandler", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetAnchorAttribute(value: String => String | Null): Self = StObject.set(x, "getAnchorAttribute", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetAnchorBoundingRect(value: () => ClientRect | Null): Self = StObject.set(x, "getAnchorBoundingRect", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetAttribute(value: String => String | Null): Self = StObject.set(x, "getAttribute", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetTooltipSize(value: () => Height): Self = StObject.set(x, "getTooltipSize", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetViewportHeight(value: () => Double): Self = StObject.set(x, "getViewportHeight", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetViewportWidth(value: () => Double): Self = StObject.set(x, "getViewportWidth", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHasClass(value: CssClasses => Boolean): Self = StObject.set(x, "hasClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsRTL(value: () => Boolean): Self = StObject.set(x, "isRTL", js.Any.fromFunction0(value))
      
      @scala.inline
      def setNotifyHidden(value: () => Unit): Self = StObject.set(x, "notifyHidden", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRegisterDocumentEventHandler(value: (js.Any, SpecificEventListener[js.Any]) => Unit): Self = StObject.set(x, "registerDocumentEventHandler", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRemoveClass(value: CssClasses => Unit): Self = StObject.set(x, "removeClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetAttribute(value: (String, String) => Unit): Self = StObject.set(x, "setAttribute", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetStyleProperty(value: (String, String) => Unit): Self = StObject.set(x, "setStyleProperty", js.Any.fromFunction2(value))
    }
  }
}
