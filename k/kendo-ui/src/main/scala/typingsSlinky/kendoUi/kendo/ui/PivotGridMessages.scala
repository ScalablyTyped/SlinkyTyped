package typingsSlinky.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PivotGridMessages extends js.Object {
  var columnFields: js.UndefOr[String] = js.native
  var fieldMenu: js.UndefOr[PivotGridMessagesFieldMenu] = js.native
  var measureFields: js.UndefOr[String] = js.native
  var rowFields: js.UndefOr[String] = js.native
}

object PivotGridMessages {
  @scala.inline
  def apply(): PivotGridMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotGridMessages]
  }
  @scala.inline
  implicit class PivotGridMessagesOps[Self <: PivotGridMessages] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnFields(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnFields")(js.undefined)
        ret
    }
    @scala.inline
    def withFieldMenu(value: PivotGridMessagesFieldMenu): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withMeasureFields(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measureFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeasureFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measureFields")(js.undefined)
        ret
    }
    @scala.inline
    def withRowFields(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowFields")(js.undefined)
        ret
    }
  }
  
}

