package typingsSlinky.activexLibreoffice.com_.sun.star.table

import typingsSlinky.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies properties which describe sorting of fields (rows or columns) in a table.
  * @since OOo 1.1.2
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ @js.native
trait TableSortDescriptor2 extends StObject {
  
  /**
    * specifies if the columns or rows are to be sorted.
    *
    * **TRUE**: The columns are to be sorted.
    *
    * **FALSE**: The rows are to be sorted.
    */
  var IsSortColumns: Boolean = js.native
  
  /** contains the maximum number of sort fields the descriptor can hold. */
  var MaxSortFieldsCount: Double = js.native
  
  /**
    * specifies a list of individual sort fields.
    *
    * Each entry specifies properties that state the row/column to be sorted and how that should be done.
    */
  var SortFields: SafeArray[TableSortField] = js.native
}
object TableSortDescriptor2 {
  
  @scala.inline
  def apply(IsSortColumns: Boolean, MaxSortFieldsCount: Double, SortFields: SafeArray[TableSortField]): TableSortDescriptor2 = {
    val __obj = js.Dynamic.literal(IsSortColumns = IsSortColumns.asInstanceOf[js.Any], MaxSortFieldsCount = MaxSortFieldsCount.asInstanceOf[js.Any], SortFields = SortFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableSortDescriptor2]
  }
  
  @scala.inline
  implicit class TableSortDescriptor2MutableBuilder[Self <: TableSortDescriptor2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsSortColumns(value: Boolean): Self = StObject.set(x, "IsSortColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSortFieldsCount(value: Double): Self = StObject.set(x, "MaxSortFieldsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortFields(value: SafeArray[TableSortField]): Self = StObject.set(x, "SortFields", value.asInstanceOf[js.Any])
  }
}
