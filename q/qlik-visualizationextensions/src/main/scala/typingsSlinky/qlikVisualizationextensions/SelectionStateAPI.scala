package typingsSlinky.qlikVisualizationextensions

import typingsSlinky.angular.mod.IPromise
import typingsSlinky.qlikVisualizationextensions.FieldAPI.IQField
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SelectionStateAPI {
  
  @js.native
  trait IQFieldSelections extends StObject {
    
    /**
      * Reference to the field.
      */
    var field: IQField = js.native
    
    /**
      * Selection state for a field.
      */
    var fieldName: String = js.native
    
    /**
      * Defines if the field is numeric.
      */
    var isNumeric: Boolean = js.native
    
    /**
      * Defines if the field is locked.
      */
    var locked: Boolean = js.native
    
    /**
      * Array with maximum of qSelectionThreshold values that are not selected.
      * For each value, the text plus the selection mode (NORMAL/AND/NOT)
      */
    var notSelectedValues: js.Array[Double] = js.native
    
    /**
      * Concatenated string of selected values if number of values are less
      * than the threshold, or if the string is of format "7 of 123".
      */
    var qSelected: String = js.native
    
    /**
      * Number of values that will be listed.
      */
    var qSelectionThreshold: Double = js.native
    
    /**
      * Sort index. Starting from 0.
      */
    var qSortIndex: Double = js.native
    
    /**
      * Object with number of values in different states.
      */
    var qStateCounts: js.Any = js.native
    
    /**
      * Number of selected values.
      */
    var selectedCount: Double = js.native
    
    /**
      * Array with maximum of qSelectionThreshold values that are selected.
      * For each value, the text plus the selection mode (NORMAL/AND/NOT)
      */
    var selectedValues: js.Array[Double] = js.native
    
    /**
      * Total number of values in the field.
      */
    var totalCount: Double = js.native
  }
  object IQFieldSelections {
    
    @scala.inline
    def apply(
      field: IQField,
      fieldName: String,
      isNumeric: Boolean,
      locked: Boolean,
      notSelectedValues: js.Array[Double],
      qSelected: String,
      qSelectionThreshold: Double,
      qSortIndex: Double,
      qStateCounts: js.Any,
      selectedCount: Double,
      selectedValues: js.Array[Double],
      totalCount: Double
    ): IQFieldSelections = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], fieldName = fieldName.asInstanceOf[js.Any], isNumeric = isNumeric.asInstanceOf[js.Any], locked = locked.asInstanceOf[js.Any], notSelectedValues = notSelectedValues.asInstanceOf[js.Any], qSelected = qSelected.asInstanceOf[js.Any], qSelectionThreshold = qSelectionThreshold.asInstanceOf[js.Any], qSortIndex = qSortIndex.asInstanceOf[js.Any], qStateCounts = qStateCounts.asInstanceOf[js.Any], selectedCount = selectedCount.asInstanceOf[js.Any], selectedValues = selectedValues.asInstanceOf[js.Any], totalCount = totalCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[IQFieldSelections]
    }
    
    @scala.inline
    implicit class IQFieldSelectionsMutableBuilder[Self <: IQFieldSelections] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setField(value: IQField): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsNumeric(value: Boolean): Self = StObject.set(x, "isNumeric", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocked(value: Boolean): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotSelectedValues(value: js.Array[Double]): Self = StObject.set(x, "notSelectedValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotSelectedValuesVarargs(value: Double*): Self = StObject.set(x, "notSelectedValues", js.Array(value :_*))
      
      @scala.inline
      def setQSelected(value: String): Self = StObject.set(x, "qSelected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQSelectionThreshold(value: Double): Self = StObject.set(x, "qSelectionThreshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQSortIndex(value: Double): Self = StObject.set(x, "qSortIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQStateCounts(value: js.Any): Self = StObject.set(x, "qStateCounts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedCount(value: Double): Self = StObject.set(x, "selectedCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedValues(value: js.Array[Double]): Self = StObject.set(x, "selectedValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedValuesVarargs(value: Double*): Self = StObject.set(x, "selectedValues", js.Array(value :_*))
      
      @scala.inline
      def setTotalCount(value: Double): Self = StObject.set(x, "totalCount", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IQSelectionState extends StObject {
    
    /**
      * Number of back steps available.
      */
    var backCount: Double = js.native
    
    /**
      * Cleara all selections in this state.
      * @param lockedAlso - Use to also clear locked fields.
      * @return - A promise of a Qlik engine reply.
      */
    def clearAll(lockedAlso: Boolean): IPromise[_] = js.native
    
    /**
      * Number of forward steps available. OnData notification will be triggered after each update.
      */
    var forwardCount: Double = js.native
    
    /**
      * Locks all selections in this state.
      * @return - A promise of a Qlik engine reply.
      */
    def lockAll(): IPromise[_] = js.native
    
    /**
      * Selections
      */
    var selections: IQFieldSelections = js.native
    
    /**
      * State name. $ for default state.
      */
    var stateName: String = js.native
    
    /**
      * Unlocks all selections in this state.
      * @return - A promise of a Qlik engine reply.
      */
    def unlockAll(): IPromise[_] = js.native
  }
  object IQSelectionState {
    
    @scala.inline
    def apply(
      backCount: Double,
      clearAll: Boolean => IPromise[_],
      forwardCount: Double,
      lockAll: () => IPromise[_],
      selections: IQFieldSelections,
      stateName: String,
      unlockAll: () => IPromise[_]
    ): IQSelectionState = {
      val __obj = js.Dynamic.literal(backCount = backCount.asInstanceOf[js.Any], clearAll = js.Any.fromFunction1(clearAll), forwardCount = forwardCount.asInstanceOf[js.Any], lockAll = js.Any.fromFunction0(lockAll), selections = selections.asInstanceOf[js.Any], stateName = stateName.asInstanceOf[js.Any], unlockAll = js.Any.fromFunction0(unlockAll))
      __obj.asInstanceOf[IQSelectionState]
    }
    
    @scala.inline
    implicit class IQSelectionStateMutableBuilder[Self <: IQSelectionState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackCount(value: Double): Self = StObject.set(x, "backCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearAll(value: Boolean => IPromise[_]): Self = StObject.set(x, "clearAll", js.Any.fromFunction1(value))
      
      @scala.inline
      def setForwardCount(value: Double): Self = StObject.set(x, "forwardCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLockAll(value: () => IPromise[_]): Self = StObject.set(x, "lockAll", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSelections(value: IQFieldSelections): Self = StObject.set(x, "selections", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateName(value: String): Self = StObject.set(x, "stateName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnlockAll(value: () => IPromise[_]): Self = StObject.set(x, "unlockAll", js.Any.fromFunction0(value))
    }
  }
}
