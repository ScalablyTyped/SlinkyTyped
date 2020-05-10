package typingsSlinky.ngTable.dataSettingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDataSettings extends js.Object {
  var applyFilter: js.UndefOr[Boolean] = js.native
  var applyPaging: js.UndefOr[Boolean] = js.native
  var applySort: js.UndefOr[Boolean] = js.native
}

object IDataSettings {
  @scala.inline
  def apply(): IDataSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDataSettings]
  }
  @scala.inline
  implicit class IDataSettingsOps[Self <: IDataSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplyFilter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplyFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withApplyPaging(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyPaging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplyPaging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyPaging")(js.undefined)
        ret
    }
    @scala.inline
    def withApplySort(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applySort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplySort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applySort")(js.undefined)
        ret
    }
  }
  
}

