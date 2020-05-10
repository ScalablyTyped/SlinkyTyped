package typingsSlinky.ejWebAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SortSettings extends js.Object {
  /** Gets or sets a value that indicates whether to define the direction and field to sort the column.
    */
  var sortedColumns: js.UndefOr[js.Array[SortSettingsSortedColumn]] = js.native
}

object SortSettings {
  @scala.inline
  def apply(): SortSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SortSettings]
  }
  @scala.inline
  implicit class SortSettingsOps[Self <: SortSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSortedColumns(value: js.Array[SortSettingsSortedColumn]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortedColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortedColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortedColumns")(js.undefined)
        ret
    }
  }
  
}

