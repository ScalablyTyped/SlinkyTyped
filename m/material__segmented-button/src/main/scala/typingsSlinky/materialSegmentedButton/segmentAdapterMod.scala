package typingsSlinky.materialSegmentedButton

import org.scalajs.dom.raw.ClientRect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object segmentAdapterMod {
  
  @js.native
  trait MDCSegmentedButtonSegmentAdapter extends StObject {
    
    /**
      * Adds css class to segment
      *
      * @param className Class to add
      */
    def addClass(className: String): Unit = js.native
    
    /**
      * @param attrName Attribute of interest
      * @return Returns segment's attribute value if it is set, otherwise returns
      * null
      */
    def getAttr(attrName: String): String | Null = js.native
    
    /**
      * @return Returns bounding rectangle for ripple effect
      */
    def getRootBoundingClientRect(): ClientRect = js.native
    
    /**
      * @param className Class of interest
      * @return Returns true if segment has css class, otherwise returns false
      */
    def hasClass(className: String): Boolean = js.native
    
    /**
      * @return Returns true if wrapping segmented button is single select
      */
    def isSingleSelect(): Boolean = js.native
    
    /**
      * Emits event about segment to wrapping segmented button
      *
      * @param selected Represents whether segment is currently selected
      * @event selected With detail - SegmentDetail
      */
    def notifySelectedChange(selected: Boolean): Unit = js.native
    
    /**
      * Removes css class from segment
      *
      * @param className Class to remove
      */
    def removeClass(className: String): Unit = js.native
    
    /**
      * Sets segment's attribute value to new value
      *
      * @param attrName Attribute of interest
      * @param value New value of attribute
      */
    def setAttr(attrName: String, value: String): Unit = js.native
  }
  object MDCSegmentedButtonSegmentAdapter {
    
    @scala.inline
    def apply(
      addClass: String => Unit,
      getAttr: String => String | Null,
      getRootBoundingClientRect: () => ClientRect,
      hasClass: String => Boolean,
      isSingleSelect: () => Boolean,
      notifySelectedChange: Boolean => Unit,
      removeClass: String => Unit,
      setAttr: (String, String) => Unit
    ): MDCSegmentedButtonSegmentAdapter = {
      val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), getAttr = js.Any.fromFunction1(getAttr), getRootBoundingClientRect = js.Any.fromFunction0(getRootBoundingClientRect), hasClass = js.Any.fromFunction1(hasClass), isSingleSelect = js.Any.fromFunction0(isSingleSelect), notifySelectedChange = js.Any.fromFunction1(notifySelectedChange), removeClass = js.Any.fromFunction1(removeClass), setAttr = js.Any.fromFunction2(setAttr))
      __obj.asInstanceOf[MDCSegmentedButtonSegmentAdapter]
    }
    
    @scala.inline
    implicit class MDCSegmentedButtonSegmentAdapterMutableBuilder[Self <: MDCSegmentedButtonSegmentAdapter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddClass(value: String => Unit): Self = StObject.set(x, "addClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetAttr(value: String => String | Null): Self = StObject.set(x, "getAttr", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetRootBoundingClientRect(value: () => ClientRect): Self = StObject.set(x, "getRootBoundingClientRect", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHasClass(value: String => Boolean): Self = StObject.set(x, "hasClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsSingleSelect(value: () => Boolean): Self = StObject.set(x, "isSingleSelect", js.Any.fromFunction0(value))
      
      @scala.inline
      def setNotifySelectedChange(value: Boolean => Unit): Self = StObject.set(x, "notifySelectedChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveClass(value: String => Unit): Self = StObject.set(x, "removeClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetAttr(value: (String, String) => Unit): Self = StObject.set(x, "setAttr", js.Any.fromFunction2(value))
    }
  }
}
