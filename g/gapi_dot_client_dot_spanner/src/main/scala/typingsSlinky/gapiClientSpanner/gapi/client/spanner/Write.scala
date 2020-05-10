package typingsSlinky.gapiClientSpanner.gapi.client.spanner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Write extends js.Object {
  /**
    * The names of the columns in table to be written.
    *
    * The list of columns must contain enough columns to allow
    * Cloud Spanner to derive values for all primary key columns in the
    * row(s) to be modified.
    */
  var columns: js.UndefOr[js.Array[String]] = js.native
  /** Required. The table whose rows will be written. */
  var table: js.UndefOr[String] = js.native
  /**
    * The values to be written. `values` can contain more than one
    * list of values. If it does, then multiple rows are written, one
    * for each entry in `values`. Each list in `values` must have
    * exactly as many entries as there are entries in columns
    * above. Sending multiple lists is equivalent to sending multiple
    * `Mutation`s, each containing one `values` entry and repeating
    * table and columns. Individual values in each list are
    * encoded as described here.
    */
  var values: js.UndefOr[js.Array[js.Array[_]]] = js.native
}

object Write {
  @scala.inline
  def apply(): Write = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Write]
  }
  @scala.inline
  implicit class WriteOps[Self <: Write] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumns(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(js.undefined)
        ret
    }
    @scala.inline
    def withTable(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table")(js.undefined)
        ret
    }
    @scala.inline
    def withValues(value: js.Array[js.Array[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.undefined)
        ret
    }
  }
  
}

