package typingsSlinky.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxPolarChartValueAxisConstantLinesLabel extends dxPolarChartCommonAxisSettingsConstantLineStyleLabel {
  /** Specifies the text to be displayed in a constant line label. */
  var text: js.UndefOr[String] = js.native
}

object dxPolarChartValueAxisConstantLinesLabel {
  @scala.inline
  def apply(): dxPolarChartValueAxisConstantLinesLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPolarChartValueAxisConstantLinesLabel]
  }
  @scala.inline
  implicit class dxPolarChartValueAxisConstantLinesLabelOps[Self <: dxPolarChartValueAxisConstantLinesLabel] (val x: Self) extends AnyVal {
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

