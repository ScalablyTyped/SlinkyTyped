package typingsSlinky.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFilterConfirm extends js.Object {
  var filterConfirm: String = js.native
  var filterReset: String = js.native
  var filterTitle: String = js.native
  var selectAll: String = js.native
  var selectInvert: String = js.native
}

object AnonFilterConfirm {
  @scala.inline
  def apply(
    filterConfirm: String,
    filterReset: String,
    filterTitle: String,
    selectAll: String,
    selectInvert: String
  ): AnonFilterConfirm = {
    val __obj = js.Dynamic.literal(filterConfirm = filterConfirm.asInstanceOf[js.Any], filterReset = filterReset.asInstanceOf[js.Any], filterTitle = filterTitle.asInstanceOf[js.Any], selectAll = selectAll.asInstanceOf[js.Any], selectInvert = selectInvert.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFilterConfirm]
  }
  @scala.inline
  implicit class AnonFilterConfirmOps[Self <: AnonFilterConfirm] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilterConfirm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterConfirm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilterReset(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterReset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilterTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectAll(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectAll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectInvert(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectInvert")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

