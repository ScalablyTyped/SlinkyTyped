package typingsSlinky.reactNativeChartsWrapper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommonDatasetConfig extends js.Object {
  var axisDependency: js.UndefOr[AxisDependency] = js.native
  var color: js.UndefOr[Color] = js.native
  var colors: js.UndefOr[js.Array[Color]] = js.native
  var drawValues: js.UndefOr[Boolean] = js.native
  var highlightEnabled: js.UndefOr[Boolean] = js.native
  var valueFormatter: js.UndefOr[ValueFormatter] = js.native
  var valueTextColor: js.UndefOr[Color] = js.native
  var valueTextSize: js.UndefOr[Double] = js.native
  var visible: js.UndefOr[Boolean] = js.native
}

object CommonDatasetConfig {
  @scala.inline
  def apply(): CommonDatasetConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonDatasetConfig]
  }
  @scala.inline
  implicit class CommonDatasetConfigOps[Self <: CommonDatasetConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAxisDependency(value: AxisDependency): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisDependency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxisDependency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisDependency")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withColors(value: js.Array[Color]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawValues(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrawValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawValues")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withValueFormatter(value: ValueFormatter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueFormatter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueFormatter")(js.undefined)
        ret
    }
    @scala.inline
    def withValueTextColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueTextColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueTextColor")(js.undefined)
        ret
    }
    @scala.inline
    def withValueTextSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueTextSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueTextSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueTextSize")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
  }
  
}

