package typingsSlinky.ejWebAll.ej.PivotTreeMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceRowsFilterItems extends js.Object {
  /** Contains the collection of items to be excluded among the field members.
    * @Default {[]}
    */
  var values: js.UndefOr[js.Array[_]] = js.native
}

object DataSourceRowsFilterItems {
  @scala.inline
  def apply(): DataSourceRowsFilterItems = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceRowsFilterItems]
  }
  @scala.inline
  implicit class DataSourceRowsFilterItemsOps[Self <: DataSourceRowsFilterItems] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValues(value: js.Array[_]): Self = {
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

