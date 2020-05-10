package typingsSlinky.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFilterReset extends js.Object {
  var filterConfirm: String = js.native
  var filterReset: String = js.native
  var filterTitle: String = js.native
}

object AnonFilterReset {
  @scala.inline
  def apply(filterConfirm: String, filterReset: String, filterTitle: String): AnonFilterReset = {
    val __obj = js.Dynamic.literal(filterConfirm = filterConfirm.asInstanceOf[js.Any], filterReset = filterReset.asInstanceOf[js.Any], filterTitle = filterTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFilterReset]
  }
  @scala.inline
  implicit class AnonFilterResetOps[Self <: AnonFilterReset] (val x: Self) extends AnyVal {
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
  }
  
}

