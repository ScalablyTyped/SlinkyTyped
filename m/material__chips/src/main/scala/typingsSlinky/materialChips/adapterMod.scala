package typingsSlinky.materialChips

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adapterMod {
  
  @js.native
  trait MDCChipSetAdapter extends StObject {
    
    /**
      * Announces the message via an aria-live region.
      */
    def announceMessage(message: String): Unit = js.native
    
    /**
      * Calls Chip#focusPrimaryAction() on the chip at the given index.
      * @param index the index of the chip
      */
    def focusChipPrimaryActionAtIndex(index: Double): Unit = js.native
    
    /**
      * Calls Chip#focusTrailingAction() on the chip at the given index.
      * @param index the index of the chip
      */
    def focusChipTrailingActionAtIndex(index: Double): Unit = js.native
    
    /**
      * @return the number of chips in the chip set.
      */
    def getChipListCount(): Double = js.native
    
    /**
      * Returns the index of the chip at the given ID.
      * @param chipId the unique ID of the chip
      * @return the numerical index of the chip with the matching id or -1.
      */
    def getIndexOfChipById(chipId: String): Double = js.native
    
    /**
      * @return true if the root element contains the given class name.
      */
    def hasClass(className: String): Boolean = js.native
    
    /**
      * @return true if the text direction is RTL.
      */
    def isRTL(): Boolean = js.native
    
    /**
      * Removes the chip with the given index from the chip set.
      * Make sure to remove it from the chip list, too.
      */
    def removeChipAtIndex(index: Double): Unit = js.native
    
    /**
      * Removes focus from the chip at the given index.
      * @param index the index of the chip
      */
    def removeFocusFromChipAtIndex(index: Double): Unit = js.native
    
    /**
      * Sets the selected state of the chip at the given index.
      */
    def selectChipAtIndex(index: Double, isSelected: Boolean, shouldNotifyClients: Boolean): Unit = js.native
  }
  object MDCChipSetAdapter {
    
    @scala.inline
    def apply(
      announceMessage: String => Unit,
      focusChipPrimaryActionAtIndex: Double => Unit,
      focusChipTrailingActionAtIndex: Double => Unit,
      getChipListCount: () => Double,
      getIndexOfChipById: String => Double,
      hasClass: String => Boolean,
      isRTL: () => Boolean,
      removeChipAtIndex: Double => Unit,
      removeFocusFromChipAtIndex: Double => Unit,
      selectChipAtIndex: (Double, Boolean, Boolean) => Unit
    ): MDCChipSetAdapter = {
      val __obj = js.Dynamic.literal(announceMessage = js.Any.fromFunction1(announceMessage), focusChipPrimaryActionAtIndex = js.Any.fromFunction1(focusChipPrimaryActionAtIndex), focusChipTrailingActionAtIndex = js.Any.fromFunction1(focusChipTrailingActionAtIndex), getChipListCount = js.Any.fromFunction0(getChipListCount), getIndexOfChipById = js.Any.fromFunction1(getIndexOfChipById), hasClass = js.Any.fromFunction1(hasClass), isRTL = js.Any.fromFunction0(isRTL), removeChipAtIndex = js.Any.fromFunction1(removeChipAtIndex), removeFocusFromChipAtIndex = js.Any.fromFunction1(removeFocusFromChipAtIndex), selectChipAtIndex = js.Any.fromFunction3(selectChipAtIndex))
      __obj.asInstanceOf[MDCChipSetAdapter]
    }
    
    @scala.inline
    implicit class MDCChipSetAdapterMutableBuilder[Self <: MDCChipSetAdapter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnnounceMessage(value: String => Unit): Self = StObject.set(x, "announceMessage", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFocusChipPrimaryActionAtIndex(value: Double => Unit): Self = StObject.set(x, "focusChipPrimaryActionAtIndex", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFocusChipTrailingActionAtIndex(value: Double => Unit): Self = StObject.set(x, "focusChipTrailingActionAtIndex", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetChipListCount(value: () => Double): Self = StObject.set(x, "getChipListCount", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetIndexOfChipById(value: String => Double): Self = StObject.set(x, "getIndexOfChipById", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHasClass(value: String => Boolean): Self = StObject.set(x, "hasClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsRTL(value: () => Boolean): Self = StObject.set(x, "isRTL", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRemoveChipAtIndex(value: Double => Unit): Self = StObject.set(x, "removeChipAtIndex", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveFocusFromChipAtIndex(value: Double => Unit): Self = StObject.set(x, "removeFocusFromChipAtIndex", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSelectChipAtIndex(value: (Double, Boolean, Boolean) => Unit): Self = StObject.set(x, "selectChipAtIndex", js.Any.fromFunction3(value))
    }
  }
}
