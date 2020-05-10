package typingsSlinky.ejWebAll.ej.TreeGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SortSettingsSortedColumn extends js.Object {
  /** Specifies the sort direction in TreeGrid
    */
  var direction: js.UndefOr[String] = js.native
  /** Specifies the field to be sorted in TreeGrid
    */
  var field: js.UndefOr[String] = js.native
}

object SortSettingsSortedColumn {
  @scala.inline
  def apply(): SortSettingsSortedColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SortSettingsSortedColumn]
  }
  @scala.inline
  implicit class SortSettingsSortedColumnOps[Self <: SortSettingsSortedColumn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(js.undefined)
        ret
    }
  }
  
}

