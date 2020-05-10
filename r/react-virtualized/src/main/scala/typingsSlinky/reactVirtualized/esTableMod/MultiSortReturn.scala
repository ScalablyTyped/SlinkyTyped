package typingsSlinky.reactVirtualized.esTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiSortReturn extends js.Object {
  /**
    * Specifies the fields currently responsible for sorting data,
    * In order of importance.
    */
  var sortBy: js.Array[String] = js.native
  /**
    * Specifies the direction a specific field is being sorted in.
    */
  var sortDirection: SortDirectionMap = js.native
  /**
    * Sort property to be passed to the `Table` component.
    * This function updates `sortBy` and `sortDirection` values.
    */
  def sort(params: SortParams): Unit = js.native
}

object MultiSortReturn {
  @scala.inline
  def apply(sort: SortParams => Unit, sortBy: js.Array[String], sortDirection: SortDirectionMap): MultiSortReturn = {
    val __obj = js.Dynamic.literal(sort = js.Any.fromFunction1(sort), sortBy = sortBy.asInstanceOf[js.Any], sortDirection = sortDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiSortReturn]
  }
  @scala.inline
  implicit class MultiSortReturnOps[Self <: MultiSortReturn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSort(value: SortParams => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSortBy(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSortDirection(value: SortDirectionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortDirection")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

