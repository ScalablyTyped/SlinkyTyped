package typingsSlinky.dynatable.JQueryDynatable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Records extends StObject {
  
  /**
    * Count records from table
    *
    * @return The length of the records Array
    */
  def count(): Double = js.native
  
  /**
    * Get initial recordset to populate table
    * if ajax, call ajaxUrl
    * otherwise, initialize from in-table records
    *
    * @return An Array with the records
    */
  def getFromTable(): js.Array[js.Object] = js.native
  
  /** Create and init the records */
  def init(): Unit = js.native
  
  /**
    * Check if ajax feature is enabled
    *
    * @return A boolean if ajax feature is enabled
    */
  def initOnLoad(): Boolean = js.native
  
  /**
    * Get the first and the last indexes based on current page and number of items per page
    *
    * @return An Array with the first index ([0]) and the last index ([1])
    */
  def pageBounds(): js.Array[Double] = js.native
  
  /** Update the records with the new page */
  def paginate(): Unit = js.native
  
  /** Reset the records */
  def resetOriginal(): Unit = js.native
  
  /**
    * Call the appropriated sort function
    *
    * @return The number (-1, 0 or +1) representing the comparison
    */
  def sort(): Double = js.native
  
  /**
    * Merge ajax response json with cached data including (meta-data and records)
    *
    * @param data The new data
    */
  def updateFromJson(data: js.Any): Unit = js.native
}
object Records {
  
  @scala.inline
  def apply(
    count: () => Double,
    getFromTable: () => js.Array[js.Object],
    init: () => Unit,
    initOnLoad: () => Boolean,
    pageBounds: () => js.Array[Double],
    paginate: () => Unit,
    resetOriginal: () => Unit,
    sort: () => Double,
    updateFromJson: js.Any => Unit
  ): Records = {
    val __obj = js.Dynamic.literal(count = js.Any.fromFunction0(count), getFromTable = js.Any.fromFunction0(getFromTable), init = js.Any.fromFunction0(init), initOnLoad = js.Any.fromFunction0(initOnLoad), pageBounds = js.Any.fromFunction0(pageBounds), paginate = js.Any.fromFunction0(paginate), resetOriginal = js.Any.fromFunction0(resetOriginal), sort = js.Any.fromFunction0(sort), updateFromJson = js.Any.fromFunction1(updateFromJson))
    __obj.asInstanceOf[Records]
  }
  
  @scala.inline
  implicit class RecordsMutableBuilder[Self <: Records] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: () => Double): Self = StObject.set(x, "count", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFromTable(value: () => js.Array[js.Object]): Self = StObject.set(x, "getFromTable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInit(value: () => Unit): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInitOnLoad(value: () => Boolean): Self = StObject.set(x, "initOnLoad", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPageBounds(value: () => js.Array[Double]): Self = StObject.set(x, "pageBounds", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPaginate(value: () => Unit): Self = StObject.set(x, "paginate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setResetOriginal(value: () => Unit): Self = StObject.set(x, "resetOriginal", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSort(value: () => Double): Self = StObject.set(x, "sort", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUpdateFromJson(value: js.Any => Unit): Self = StObject.set(x, "updateFromJson", js.Any.fromFunction1(value))
  }
}
