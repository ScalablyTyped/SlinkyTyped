package typingsSlinky.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxChartArgumentAxisConstantLineStyle extends dxChartCommonAxisSettingsConstantLineStyle {
  /** Specifies the appearance of the labels of those constant lines that belong to the argument axis. */
  @JSName("label")
  var label_dxChartArgumentAxisConstantLineStyle: js.UndefOr[dxChartArgumentAxisConstantLineStyleLabel] = js.native
}

object dxChartArgumentAxisConstantLineStyle {
  @scala.inline
  def apply(): dxChartArgumentAxisConstantLineStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartArgumentAxisConstantLineStyle]
  }
  @scala.inline
  implicit class dxChartArgumentAxisConstantLineStyleOps[Self <: dxChartArgumentAxisConstantLineStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabel(value: dxChartArgumentAxisConstantLineStyleLabel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
  }
  
}

