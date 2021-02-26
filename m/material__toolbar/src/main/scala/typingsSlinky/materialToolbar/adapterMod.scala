package typingsSlinky.materialToolbar

import typingsSlinky.materialBase.typesMod.SpecificEventListener
import typingsSlinky.materialToolbar.materialToolbarStrings.resize
import typingsSlinky.materialToolbar.materialToolbarStrings.scroll
import typingsSlinky.materialToolbar.typesMod.MDCToolbarEventDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adapterMod {
  
  @js.native
  trait MDCToolbarAdapter extends StObject {
    
    def addClass(className: String): Unit = js.native
    
    @JSName("deregisterResizeHandler")
    def deregisterResizeHandler_resize(handler: SpecificEventListener[resize]): Unit = js.native
    
    @JSName("deregisterScrollHandler")
    def deregisterScrollHandler_scroll(handler: SpecificEventListener[scroll]): Unit = js.native
    
    def getFirstRowElementOffsetHeight(): Double = js.native
    
    def getOffsetHeight(): Double = js.native
    
    def getViewportScrollY(): Double = js.native
    
    def getViewportWidth(): Double = js.native
    
    def hasClass(className: String): Boolean = js.native
    
    def notifyChange(evtData: MDCToolbarEventDetail): Unit = js.native
    
    @JSName("registerResizeHandler")
    def registerResizeHandler_resize(handler: SpecificEventListener[resize]): Unit = js.native
    
    @JSName("registerScrollHandler")
    def registerScrollHandler_scroll(handler: SpecificEventListener[scroll]): Unit = js.native
    
    def removeClass(className: String): Unit = js.native
    
    def setStyle(property: String, value: String): Unit = js.native
    
    def setStyleForFixedAdjustElement(property: String, value: String): Unit = js.native
    
    def setStyleForFlexibleRowElement(property: String, value: String): Unit = js.native
    
    def setStyleForTitleElement(property: String, value: String): Unit = js.native
  }
  object MDCToolbarAdapter {
    
    @scala.inline
    def apply(
      addClass: String => Unit,
      deregisterResizeHandler: SpecificEventListener[resize] => Unit,
      deregisterScrollHandler: SpecificEventListener[scroll] => Unit,
      getFirstRowElementOffsetHeight: () => Double,
      getOffsetHeight: () => Double,
      getViewportScrollY: () => Double,
      getViewportWidth: () => Double,
      hasClass: String => Boolean,
      notifyChange: MDCToolbarEventDetail => Unit,
      registerResizeHandler: SpecificEventListener[resize] => Unit,
      registerScrollHandler: SpecificEventListener[scroll] => Unit,
      removeClass: String => Unit,
      setStyle: (String, String) => Unit,
      setStyleForFixedAdjustElement: (String, String) => Unit,
      setStyleForFlexibleRowElement: (String, String) => Unit,
      setStyleForTitleElement: (String, String) => Unit
    ): MDCToolbarAdapter = {
      val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), deregisterResizeHandler = js.Any.fromFunction1(deregisterResizeHandler), deregisterScrollHandler = js.Any.fromFunction1(deregisterScrollHandler), getFirstRowElementOffsetHeight = js.Any.fromFunction0(getFirstRowElementOffsetHeight), getOffsetHeight = js.Any.fromFunction0(getOffsetHeight), getViewportScrollY = js.Any.fromFunction0(getViewportScrollY), getViewportWidth = js.Any.fromFunction0(getViewportWidth), hasClass = js.Any.fromFunction1(hasClass), notifyChange = js.Any.fromFunction1(notifyChange), registerResizeHandler = js.Any.fromFunction1(registerResizeHandler), registerScrollHandler = js.Any.fromFunction1(registerScrollHandler), removeClass = js.Any.fromFunction1(removeClass), setStyle = js.Any.fromFunction2(setStyle), setStyleForFixedAdjustElement = js.Any.fromFunction2(setStyleForFixedAdjustElement), setStyleForFlexibleRowElement = js.Any.fromFunction2(setStyleForFlexibleRowElement), setStyleForTitleElement = js.Any.fromFunction2(setStyleForTitleElement))
      __obj.asInstanceOf[MDCToolbarAdapter]
    }
    
    @scala.inline
    implicit class MDCToolbarAdapterMutableBuilder[Self <: MDCToolbarAdapter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddClass(value: String => Unit): Self = StObject.set(x, "addClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDeregisterResizeHandler(value: SpecificEventListener[resize] => Unit): Self = StObject.set(x, "deregisterResizeHandler", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDeregisterScrollHandler(value: SpecificEventListener[scroll] => Unit): Self = StObject.set(x, "deregisterScrollHandler", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetFirstRowElementOffsetHeight(value: () => Double): Self = StObject.set(x, "getFirstRowElementOffsetHeight", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetOffsetHeight(value: () => Double): Self = StObject.set(x, "getOffsetHeight", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetViewportScrollY(value: () => Double): Self = StObject.set(x, "getViewportScrollY", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetViewportWidth(value: () => Double): Self = StObject.set(x, "getViewportWidth", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHasClass(value: String => Boolean): Self = StObject.set(x, "hasClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNotifyChange(value: MDCToolbarEventDetail => Unit): Self = StObject.set(x, "notifyChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRegisterResizeHandler(value: SpecificEventListener[resize] => Unit): Self = StObject.set(x, "registerResizeHandler", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRegisterScrollHandler(value: SpecificEventListener[scroll] => Unit): Self = StObject.set(x, "registerScrollHandler", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveClass(value: String => Unit): Self = StObject.set(x, "removeClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetStyle(value: (String, String) => Unit): Self = StObject.set(x, "setStyle", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetStyleForFixedAdjustElement(value: (String, String) => Unit): Self = StObject.set(x, "setStyleForFixedAdjustElement", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetStyleForFlexibleRowElement(value: (String, String) => Unit): Self = StObject.set(x, "setStyleForFlexibleRowElement", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetStyleForTitleElement(value: (String, String) => Unit): Self = StObject.set(x, "setStyleForTitleElement", js.Any.fromFunction2(value))
    }
  }
}
