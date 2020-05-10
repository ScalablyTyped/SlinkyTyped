package typingsSlinky.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxChartValueAxisTitle extends dxChartCommonAxisSettingsTitle {
  /** Specifies the text of the axis title. */
  var text: js.UndefOr[String] = js.native
}

object dxChartValueAxisTitle {
  @scala.inline
  def apply(): dxChartValueAxisTitle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartValueAxisTitle]
  }
  @scala.inline
  implicit class dxChartValueAxisTitleOps[Self <: dxChartValueAxisTitle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
  }
  
}

