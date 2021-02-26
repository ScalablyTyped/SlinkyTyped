package typingsSlinky.agGrid

import typingsSlinky.agGrid.baseFilterMod.FilterConditionType
import typingsSlinky.agGrid.baseFilterMod.ScalarBaseFilter
import typingsSlinky.agGrid.iFilterMod.SerializedFilter
import typingsSlinky.agGrid.textFilterMod.INumberFilterParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object numberFilterMod {
  
  @JSImport("ag-grid/dist/lib/filter/numberFilter", "NumberFilter")
  @js.native
  class NumberFilter () extends ScalarBaseFilter[Double, INumberFilterParams, SerializedNumberFilter] {
    def this(template: String) = this()
    
    /* private */ def addFilterChangedEventListeners(`type`: js.Any, filterElement: js.Any, filterToElement: js.Any): js.Any = js.native
    
    @JSName("afterGuiAttached")
    def afterGuiAttached_MNumberFilter(): Unit = js.native
    
    /* private */ def asNumber(value: js.Any): js.Any = js.native
    
    var eFilterTextConditionField: js.Any = js.native
    
    var eFilterTextField: js.Any = js.native
    
    var eFilterToConditionText: js.Any = js.native
    
    var eFilterToTextField: js.Any = js.native
    
    var eNumberToConditionPanel: js.Any = js.native
    
    var eNumberToPanel: js.Any = js.native
    
    var filterNumber: js.Any = js.native
    
    var filterNumberCondition: js.Any = js.native
    
    var filterNumberConditionTo: js.Any = js.native
    
    var filterNumberTo: js.Any = js.native
    
    def getFilter(`type`: FilterConditionType): js.Any = js.native
    
    /* private */ def onTextFieldsChanged(`type`: js.Any, filterElement: js.Any, filterToElement: js.Any): js.Any = js.native
    
    def setFilter(filter: js.Any, `type`: FilterConditionType): Unit = js.native
    
    def setFilterTo(filter: js.Any, `type`: FilterConditionType): Unit = js.native
    
    def setType(filterType: String, `type`: FilterConditionType): Unit = js.native
    
    /* private */ def stringToFloat(value: js.Any): js.Any = js.native
  }
  /* static members */
  object NumberFilter {
    
    @JSImport("ag-grid/dist/lib/filter/numberFilter", "NumberFilter")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ag-grid/dist/lib/filter/numberFilter", "NumberFilter.LESS_THAN")
    @js.native
    def LESS_THAN: String = js.native
    @scala.inline
    def LESS_THAN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LESS_THAN")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait SerializedNumberFilter extends SerializedFilter {
    
    var filter: Double = js.native
    
    var filterTo: Double = js.native
    
    var `type`: String = js.native
  }
  object SerializedNumberFilter {
    
    @scala.inline
    def apply(filter: Double, filterTo: Double, filterType: String, `type`: String): SerializedNumberFilter = {
      val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], filterTo = filterTo.asInstanceOf[js.Any], filterType = filterType.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SerializedNumberFilter]
    }
    
    @scala.inline
    implicit class SerializedNumberFilterMutableBuilder[Self <: SerializedNumberFilter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilter(value: Double): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterTo(value: Double): Self = StObject.set(x, "filterTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
