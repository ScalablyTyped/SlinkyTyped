package typingsSlinky.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGroupByThisColumn extends js.Object {
  var groupByThisColumn: js.UndefOr[String] = js.native
  var groupContinuedMessage: js.UndefOr[String] = js.native
  var groupContinuesMessage: js.UndefOr[String] = js.native
  var ungroup: js.UndefOr[String] = js.native
  var ungroupAll: js.UndefOr[String] = js.native
}

object AnonGroupByThisColumn {
  @scala.inline
  def apply(): AnonGroupByThisColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonGroupByThisColumn]
  }
  @scala.inline
  implicit class AnonGroupByThisColumnOps[Self <: AnonGroupByThisColumn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroupByThisColumn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupByThisColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupByThisColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupByThisColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupContinuedMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupContinuedMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupContinuedMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupContinuedMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupContinuesMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupContinuesMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupContinuesMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupContinuesMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withUngroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ungroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUngroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ungroup")(js.undefined)
        ret
    }
    @scala.inline
    def withUngroupAll(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ungroupAll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUngroupAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ungroupAll")(js.undefined)
        ret
    }
  }
  
}

