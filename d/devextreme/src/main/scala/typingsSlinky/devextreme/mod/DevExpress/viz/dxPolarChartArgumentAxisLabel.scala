package typingsSlinky.devextreme.mod.DevExpress.viz

import typingsSlinky.devextreme.anon.ValueValueText
import typingsSlinky.devextreme.mod.DevExpress.ui.format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxPolarChartArgumentAxisLabel extends dxPolarChartCommonAxisSettingsLabel {
  /** Specifies the text for a hint that appears when a user hovers the mouse pointer over a label on the argument axis. */
  var customizeHint: js.UndefOr[js.Function1[/* argument */ ValueValueText, String]] = js.native
  /** Specifies a callback function that returns the text to be displayed by argument axis labels. */
  var customizeText: js.UndefOr[js.Function1[/* argument */ ValueValueText, String]] = js.native
  /** Formats a value before it is displayed in an axis label. */
  var format: js.UndefOr[typingsSlinky.devextreme.mod.DevExpress.ui.format] = js.native
}

object dxPolarChartArgumentAxisLabel {
  @scala.inline
  def apply(): dxPolarChartArgumentAxisLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPolarChartArgumentAxisLabel]
  }
  @scala.inline
  implicit class dxPolarChartArgumentAxisLabelOps[Self <: dxPolarChartArgumentAxisLabel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomizeHint(value: /* argument */ ValueValueText => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customizeHint")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCustomizeHint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customizeHint")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomizeText(value: /* argument */ ValueValueText => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customizeText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCustomizeText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customizeText")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatFunction1(value: /* value */ Double | js.Date => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFormat(value: format): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
  }
  
}

