package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportingButtonsOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Options for the export button.
    *
    * In styled mode, export button styles can be applied with the
    * `.highcharts-contextbutton` class.
    */
  var contextButton: js.UndefOr[ExportingButtonsContextButtonOptions] = js.native
}

object ExportingButtonsOptions {
  @scala.inline
  def apply(): ExportingButtonsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportingButtonsOptions]
  }
  @scala.inline
  implicit class ExportingButtonsOptionsOps[Self <: ExportingButtonsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContextButton(value: ExportingButtonsContextButtonOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContextButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextButton")(js.undefined)
        ret
    }
  }
  
}

