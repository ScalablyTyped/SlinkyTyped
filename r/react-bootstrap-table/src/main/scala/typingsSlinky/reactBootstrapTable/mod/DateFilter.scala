package typingsSlinky.reactBootstrapTable.mod

import typingsSlinky.reactBootstrapTable.anon.ComparatorDate
import typingsSlinky.reactBootstrapTable.anon.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateFilter extends _Filter {
  
  /**
    * Date filter comparators
    */
  var dateComparators: js.UndefOr[js.Array[FilterComparator]] = js.native
  
  /**
    * Default value for the filter.
    */
  var defaultValue: js.UndefOr[Date] = js.native
  
  /**
    * Delay time in milliseconds after the last key press prior to applying the filter. Defaults to 500ms.
    */
  var delay: js.UndefOr[Double] = js.native
  
  /**
    * CSS Style to use for the select filter.
    */
  var style: js.UndefOr[ComparatorDate] = js.native
  
  /**
    * Filter type must be 'DateFilter'
    */
  var `type`: typingsSlinky.reactBootstrapTable.reactBootstrapTableStrings.DateFilter = js.native
}
object DateFilter {
  
  @scala.inline
  def apply(`type`: typingsSlinky.reactBootstrapTable.reactBootstrapTableStrings.DateFilter): DateFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateFilter]
  }
  
  @scala.inline
  implicit class DateFilterMutableBuilder[Self <: DateFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDateComparators(value: js.Array[FilterComparator]): Self = StObject.set(x, "dateComparators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateComparatorsUndefined: Self = StObject.set(x, "dateComparators", js.undefined)
    
    @scala.inline
    def setDateComparatorsVarargs(value: FilterComparator*): Self = StObject.set(x, "dateComparators", js.Array(value :_*))
    
    @scala.inline
    def setDefaultValue(value: Date): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    @scala.inline
    def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    @scala.inline
    def setStyle(value: ComparatorDate): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setType(value: typingsSlinky.reactBootstrapTable.reactBootstrapTableStrings.DateFilter): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
