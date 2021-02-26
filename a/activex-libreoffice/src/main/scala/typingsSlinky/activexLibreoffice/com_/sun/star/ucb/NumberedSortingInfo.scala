package typingsSlinky.activexLibreoffice.com_.sun.star.ucb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * contains information for sorting a {@link ContentResultSet} .
  *
  * In contrast to the struct {@link SortingInfo} this struct is used to be on the safe side, that no one asks for sorting by a property which is not
  * contained in a {@link ContentResultSet} .
  */
@js.native
trait NumberedSortingInfo extends StObject {
  
  /** contains a flag indicating the sort mode (ascending or descending). */
  var Ascending: Boolean = js.native
  
  /** sort the result set by this column. Index starts with `1` . */
  var ColumnIndex: Double = js.native
}
object NumberedSortingInfo {
  
  @scala.inline
  def apply(Ascending: Boolean, ColumnIndex: Double): NumberedSortingInfo = {
    val __obj = js.Dynamic.literal(Ascending = Ascending.asInstanceOf[js.Any], ColumnIndex = ColumnIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberedSortingInfo]
  }
  
  @scala.inline
  implicit class NumberedSortingInfoMutableBuilder[Self <: NumberedSortingInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAscending(value: Boolean): Self = StObject.set(x, "Ascending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnIndex(value: Double): Self = StObject.set(x, "ColumnIndex", value.asInstanceOf[js.Any])
  }
}
