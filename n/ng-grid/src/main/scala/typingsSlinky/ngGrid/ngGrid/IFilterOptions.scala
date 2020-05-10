package typingsSlinky.ngGrid.ngGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFilterOptions extends js.Object {
  var filterText: js.UndefOr[String] = js.native
  var useExternalFilter: js.UndefOr[Boolean] = js.native
}

object IFilterOptions {
  @scala.inline
  def apply(): IFilterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFilterOptions]
  }
  @scala.inline
  implicit class IFilterOptionsOps[Self <: IFilterOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilterText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterText")(js.undefined)
        ret
    }
    @scala.inline
    def withUseExternalFilter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useExternalFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseExternalFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useExternalFilter")(js.undefined)
        ret
    }
  }
  
}

