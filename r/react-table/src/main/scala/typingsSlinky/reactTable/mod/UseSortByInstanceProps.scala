package typingsSlinky.reactTable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseSortByInstanceProps[D /* <: js.Object */] extends StObject {
  
  var preSortedRows: js.Array[Row[D]] = js.native
  
  var rows: js.Array[Row[D]] = js.native
  
  def setSortBy(sortBy: js.Array[SortingRule[D]]): Unit = js.native
  
  def toggleSortBy(columnId: IdType[D]): Unit = js.native
  def toggleSortBy(columnId: IdType[D], descending: js.UndefOr[scala.Nothing], isMulti: Boolean): Unit = js.native
  def toggleSortBy(columnId: IdType[D], descending: Boolean): Unit = js.native
  def toggleSortBy(columnId: IdType[D], descending: Boolean, isMulti: Boolean): Unit = js.native
}
