package typingsSlinky.ejWebAll.ej.TreeView

import typingsSlinky.ejWebAll.ej.sortOrder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SortSettings extends js.Object {
  /** Enables or disables the sorting option in TreeView control
    * @Default {false}
    */
  var allowSorting: js.UndefOr[Boolean] = js.native
  /** Sets the sorting order type. There are two sorting types available, such as &quot;ascending&quot;, &quot;descending&quot;.
    * @Default {ej.sortOrder.Ascending}
    */
  var sortOrder: js.UndefOr[typingsSlinky.ejWebAll.ej.sortOrder | String] = js.native
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
    def withAllowSorting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSorting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowSorting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSorting")(js.undefined)
        ret
    }
    @scala.inline
    def withSortOrder(value: sortOrder | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortOrder")(js.undefined)
        ret
    }
  }
  
}

