package typingsSlinky.extjs.Ext.selection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDataViewModel extends IModel {
  /** [Config Option] (Boolean) */
  var enableKeyNav: js.UndefOr[Boolean] = js.native
}

object IDataViewModel {
  @scala.inline
  def apply(): IDataViewModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDataViewModel]
  }
  @scala.inline
  implicit class IDataViewModelOps[Self <: IDataViewModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnableKeyNav(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableKeyNav")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableKeyNav: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableKeyNav")(js.undefined)
        ret
    }
  }
  
}

