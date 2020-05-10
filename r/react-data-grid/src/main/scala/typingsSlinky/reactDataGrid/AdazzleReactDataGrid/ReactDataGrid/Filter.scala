package typingsSlinky.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Some filter to be applied to the grid's contents
  */
@js.native
trait Filter extends js.Object {
  /**
    * The key of the column being filtered.
    */
  var columnKey: String = js.native
  /**
    * The term to filter by.
    */
  var filterTerm: String = js.native
}

object Filter {
  @scala.inline
  def apply(columnKey: String, filterTerm: String): Filter = {
    val __obj = js.Dynamic.literal(columnKey = columnKey.asInstanceOf[js.Any], filterTerm = filterTerm.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filter]
  }
  @scala.inline
  implicit class FilterOps[Self <: Filter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilterTerm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterTerm")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

