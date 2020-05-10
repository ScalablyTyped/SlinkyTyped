package typingsSlinky.dynatable.JQueryDynatable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Records extends js.Object {
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
  implicit class RecordsOps[Self <: Records] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFromTable(value: () => js.Array[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFromTable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInit(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInitOnLoad(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initOnLoad")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPageBounds(value: () => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageBounds")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPaginate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withResetOriginal(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetOriginal")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSort(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUpdateFromJson(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateFromJson")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

