package typingsSlinky.materialDrawer

import org.scalajs.dom.raw.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adapterMod {
  
  @js.native
  trait MDCDrawerAdapter extends StObject {
    
    /**
      * Adds a class to the root Element.
      */
    def addClass(className: String): Unit = js.native
    
    /**
      * Returns true if the element contains the given class.
      * @param element target element to verify class name
      * @param className class name
      */
    def elementHasClass(element: Element, className: String): Boolean = js.native
    
    /**
      * Focuses the active / selected navigation item.
      */
    def focusActiveNavigationItem(): Unit = js.native
    
    /**
      * Returns true if the root Element contains the given class.
      */
    def hasClass(className: String): Boolean = js.native
    
    /**
      * Emits a custom event "MDCDrawer:closed" denoting the drawer has closed.
      */
    def notifyClose(): Unit = js.native
    
    /**
      * Emits a custom event "MDCDrawer:opened" denoting the drawer has opened.
      */
    def notifyOpen(): Unit = js.native
    
    /**
      * Releases focus trap from root element which was set by `trapFocus`
      * and restores focus to where it was prior to calling `trapFocus`.
      */
    def releaseFocus(): Unit = js.native
    
    /**
      * Removes a class from the root Element.
      */
    def removeClass(className: String): Unit = js.native
    
    /**
      * Restores focus to element previously saved with 'saveFocus'.
      */
    def restoreFocus(): Unit = js.native
    
    /**
      * Saves the focus of currently active element.
      */
    def saveFocus(): Unit = js.native
    
    /**
      * Traps focus on root element and focuses the active navigation element.
      */
    def trapFocus(): Unit = js.native
  }
  object MDCDrawerAdapter {
    
    @scala.inline
    def apply(
      addClass: String => Unit,
      elementHasClass: (Element, String) => Boolean,
      focusActiveNavigationItem: () => Unit,
      hasClass: String => Boolean,
      notifyClose: () => Unit,
      notifyOpen: () => Unit,
      releaseFocus: () => Unit,
      removeClass: String => Unit,
      restoreFocus: () => Unit,
      saveFocus: () => Unit,
      trapFocus: () => Unit
    ): MDCDrawerAdapter = {
      val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), elementHasClass = js.Any.fromFunction2(elementHasClass), focusActiveNavigationItem = js.Any.fromFunction0(focusActiveNavigationItem), hasClass = js.Any.fromFunction1(hasClass), notifyClose = js.Any.fromFunction0(notifyClose), notifyOpen = js.Any.fromFunction0(notifyOpen), releaseFocus = js.Any.fromFunction0(releaseFocus), removeClass = js.Any.fromFunction1(removeClass), restoreFocus = js.Any.fromFunction0(restoreFocus), saveFocus = js.Any.fromFunction0(saveFocus), trapFocus = js.Any.fromFunction0(trapFocus))
      __obj.asInstanceOf[MDCDrawerAdapter]
    }
    
    @scala.inline
    implicit class MDCDrawerAdapterMutableBuilder[Self <: MDCDrawerAdapter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddClass(value: String => Unit): Self = StObject.set(x, "addClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setElementHasClass(value: (Element, String) => Boolean): Self = StObject.set(x, "elementHasClass", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFocusActiveNavigationItem(value: () => Unit): Self = StObject.set(x, "focusActiveNavigationItem", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHasClass(value: String => Boolean): Self = StObject.set(x, "hasClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNotifyClose(value: () => Unit): Self = StObject.set(x, "notifyClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setNotifyOpen(value: () => Unit): Self = StObject.set(x, "notifyOpen", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReleaseFocus(value: () => Unit): Self = StObject.set(x, "releaseFocus", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRemoveClass(value: String => Unit): Self = StObject.set(x, "removeClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRestoreFocus(value: () => Unit): Self = StObject.set(x, "restoreFocus", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSaveFocus(value: () => Unit): Self = StObject.set(x, "saveFocus", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTrapFocus(value: () => Unit): Self = StObject.set(x, "trapFocus", js.Any.fromFunction0(value))
    }
  }
}
