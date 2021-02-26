package typingsSlinky.materialTabs

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.materialBase.typesMod.EventType
import typingsSlinky.materialBase.typesMod.SpecificEventListener
import typingsSlinky.materialTabs.materialTabsStrings.click
import typingsSlinky.materialTabs.materialTabsStrings.resize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adapterMod {
  
  @js.native
  trait MDCTabBarScrollerAdapter extends StObject {
    
    def addClass(className: String): Unit = js.native
    
    def addClassToBackIndicator(className: String): Unit = js.native
    
    def addClassToForwardIndicator(className: String): Unit = js.native
    
    @JSName("deregisterBackIndicatorClickHandler")
    def deregisterBackIndicatorClickHandler_click(handler: SpecificEventListener[click]): Unit = js.native
    
    def deregisterCapturedInteractionHandler[K /* <: EventType */](evt: K, handler: SpecificEventListener[K]): Unit = js.native
    
    @JSName("deregisterForwardIndicatorClickHandler")
    def deregisterForwardIndicatorClickHandler_click(handler: SpecificEventListener[click]): Unit = js.native
    
    @JSName("deregisterWindowResizeHandler")
    def deregisterWindowResizeHandler_resize(handler: SpecificEventListener[resize]): Unit = js.native
    
    def eventTargetHasClass(target: Element, className: String): Boolean = js.native
    
    def getComputedLeftForTabAtIndex(index: Double): Double = js.native
    
    def getComputedWidthForTabAtIndex(index: Double): Double = js.native
    
    def getNumberOfTabs(): Double = js.native
    
    def getOffsetLeftForEventTarget(target: HTMLElement): Double = js.native
    
    def getOffsetWidthForEventTarget(target: HTMLElement): Double = js.native
    
    def getOffsetWidthForScrollFrame(): Double = js.native
    
    def getOffsetWidthForTabBar(): Double = js.native
    
    def getScrollLeftForScrollFrame(): Double = js.native
    
    def isRTL(): Boolean = js.native
    
    @JSName("registerBackIndicatorClickHandler")
    def registerBackIndicatorClickHandler_click(handler: SpecificEventListener[click]): Unit = js.native
    
    def registerCapturedInteractionHandler[K /* <: EventType */](evt: K, handler: SpecificEventListener[K]): Unit = js.native
    
    @JSName("registerForwardIndicatorClickHandler")
    def registerForwardIndicatorClickHandler_click(handler: SpecificEventListener[click]): Unit = js.native
    
    @JSName("registerWindowResizeHandler")
    def registerWindowResizeHandler_resize(handler: SpecificEventListener[resize]): Unit = js.native
    
    def removeClass(className: String): Unit = js.native
    
    def removeClassFromBackIndicator(className: String): Unit = js.native
    
    def removeClassFromForwardIndicator(className: String): Unit = js.native
    
    def setScrollLeftForScrollFrame(scrollLeftAmount: Double): Unit = js.native
    
    def setTransformStyleForTabBar(value: String): Unit = js.native
  }
  object MDCTabBarScrollerAdapter {
    
    @scala.inline
    def apply(
      addClass: String => Unit,
      addClassToBackIndicator: String => Unit,
      addClassToForwardIndicator: String => Unit,
      deregisterBackIndicatorClickHandler: SpecificEventListener[click] => Unit,
      deregisterCapturedInteractionHandler: (js.Any, SpecificEventListener[js.Any]) => Unit,
      deregisterForwardIndicatorClickHandler: SpecificEventListener[click] => Unit,
      deregisterWindowResizeHandler: SpecificEventListener[resize] => Unit,
      eventTargetHasClass: (Element, String) => Boolean,
      getComputedLeftForTabAtIndex: Double => Double,
      getComputedWidthForTabAtIndex: Double => Double,
      getNumberOfTabs: () => Double,
      getOffsetLeftForEventTarget: HTMLElement => Double,
      getOffsetWidthForEventTarget: HTMLElement => Double,
      getOffsetWidthForScrollFrame: () => Double,
      getOffsetWidthForTabBar: () => Double,
      getScrollLeftForScrollFrame: () => Double,
      isRTL: () => Boolean,
      registerBackIndicatorClickHandler: SpecificEventListener[click] => Unit,
      registerCapturedInteractionHandler: (js.Any, SpecificEventListener[js.Any]) => Unit,
      registerForwardIndicatorClickHandler: SpecificEventListener[click] => Unit,
      registerWindowResizeHandler: SpecificEventListener[resize] => Unit,
      removeClass: String => Unit,
      removeClassFromBackIndicator: String => Unit,
      removeClassFromForwardIndicator: String => Unit,
      setScrollLeftForScrollFrame: Double => Unit,
      setTransformStyleForTabBar: String => Unit
    ): MDCTabBarScrollerAdapter = {
      val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), addClassToBackIndicator = js.Any.fromFunction1(addClassToBackIndicator), addClassToForwardIndicator = js.Any.fromFunction1(addClassToForwardIndicator), deregisterBackIndicatorClickHandler = js.Any.fromFunction1(deregisterBackIndicatorClickHandler), deregisterCapturedInteractionHandler = js.Any.fromFunction2(deregisterCapturedInteractionHandler), deregisterForwardIndicatorClickHandler = js.Any.fromFunction1(deregisterForwardIndicatorClickHandler), deregisterWindowResizeHandler = js.Any.fromFunction1(deregisterWindowResizeHandler), eventTargetHasClass = js.Any.fromFunction2(eventTargetHasClass), getComputedLeftForTabAtIndex = js.Any.fromFunction1(getComputedLeftForTabAtIndex), getComputedWidthForTabAtIndex = js.Any.fromFunction1(getComputedWidthForTabAtIndex), getNumberOfTabs = js.Any.fromFunction0(getNumberOfTabs), getOffsetLeftForEventTarget = js.Any.fromFunction1(getOffsetLeftForEventTarget), getOffsetWidthForEventTarget = js.Any.fromFunction1(getOffsetWidthForEventTarget), getOffsetWidthForScrollFrame = js.Any.fromFunction0(getOffsetWidthForScrollFrame), getOffsetWidthForTabBar = js.Any.fromFunction0(getOffsetWidthForTabBar), getScrollLeftForScrollFrame = js.Any.fromFunction0(getScrollLeftForScrollFrame), isRTL = js.Any.fromFunction0(isRTL), registerBackIndicatorClickHandler = js.Any.fromFunction1(registerBackIndicatorClickHandler), registerCapturedInteractionHandler = js.Any.fromFunction2(registerCapturedInteractionHandler), registerForwardIndicatorClickHandler = js.Any.fromFunction1(registerForwardIndicatorClickHandler), registerWindowResizeHandler = js.Any.fromFunction1(registerWindowResizeHandler), removeClass = js.Any.fromFunction1(removeClass), removeClassFromBackIndicator = js.Any.fromFunction1(removeClassFromBackIndicator), removeClassFromForwardIndicator = js.Any.fromFunction1(removeClassFromForwardIndicator), setScrollLeftForScrollFrame = js.Any.fromFunction1(setScrollLeftForScrollFrame), setTransformStyleForTabBar = js.Any.fromFunction1(setTransformStyleForTabBar))
      __obj.asInstanceOf[MDCTabBarScrollerAdapter]
    }
    
    @scala.inline
    implicit class MDCTabBarScrollerAdapterMutableBuilder[Self <: MDCTabBarScrollerAdapter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddClass(value: String => Unit): Self = StObject.set(x, "addClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddClassToBackIndicator(value: String => Unit): Self = StObject.set(x, "addClassToBackIndicator", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddClassToForwardIndicator(value: String => Unit): Self = StObject.set(x, "addClassToForwardIndicator", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDeregisterBackIndicatorClickHandler(value: SpecificEventListener[click] => Unit): Self = StObject.set(x, "deregisterBackIndicatorClickHandler", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDeregisterCapturedInteractionHandler(value: (js.Any, SpecificEventListener[js.Any]) => Unit): Self = StObject.set(x, "deregisterCapturedInteractionHandler", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDeregisterForwardIndicatorClickHandler(value: SpecificEventListener[click] => Unit): Self = StObject.set(x, "deregisterForwardIndicatorClickHandler", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDeregisterWindowResizeHandler(value: SpecificEventListener[resize] => Unit): Self = StObject.set(x, "deregisterWindowResizeHandler", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEventTargetHasClass(value: (Element, String) => Boolean): Self = StObject.set(x, "eventTargetHasClass", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetComputedLeftForTabAtIndex(value: Double => Double): Self = StObject.set(x, "getComputedLeftForTabAtIndex", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetComputedWidthForTabAtIndex(value: Double => Double): Self = StObject.set(x, "getComputedWidthForTabAtIndex", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetNumberOfTabs(value: () => Double): Self = StObject.set(x, "getNumberOfTabs", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetOffsetLeftForEventTarget(value: HTMLElement => Double): Self = StObject.set(x, "getOffsetLeftForEventTarget", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetOffsetWidthForEventTarget(value: HTMLElement => Double): Self = StObject.set(x, "getOffsetWidthForEventTarget", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetOffsetWidthForScrollFrame(value: () => Double): Self = StObject.set(x, "getOffsetWidthForScrollFrame", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetOffsetWidthForTabBar(value: () => Double): Self = StObject.set(x, "getOffsetWidthForTabBar", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetScrollLeftForScrollFrame(value: () => Double): Self = StObject.set(x, "getScrollLeftForScrollFrame", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsRTL(value: () => Boolean): Self = StObject.set(x, "isRTL", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRegisterBackIndicatorClickHandler(value: SpecificEventListener[click] => Unit): Self = StObject.set(x, "registerBackIndicatorClickHandler", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRegisterCapturedInteractionHandler(value: (js.Any, SpecificEventListener[js.Any]) => Unit): Self = StObject.set(x, "registerCapturedInteractionHandler", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRegisterForwardIndicatorClickHandler(value: SpecificEventListener[click] => Unit): Self = StObject.set(x, "registerForwardIndicatorClickHandler", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRegisterWindowResizeHandler(value: SpecificEventListener[resize] => Unit): Self = StObject.set(x, "registerWindowResizeHandler", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveClass(value: String => Unit): Self = StObject.set(x, "removeClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveClassFromBackIndicator(value: String => Unit): Self = StObject.set(x, "removeClassFromBackIndicator", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveClassFromForwardIndicator(value: String => Unit): Self = StObject.set(x, "removeClassFromForwardIndicator", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetScrollLeftForScrollFrame(value: Double => Unit): Self = StObject.set(x, "setScrollLeftForScrollFrame", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetTransformStyleForTabBar(value: String => Unit): Self = StObject.set(x, "setTransformStyleForTabBar", js.Any.fromFunction1(value))
    }
  }
}
