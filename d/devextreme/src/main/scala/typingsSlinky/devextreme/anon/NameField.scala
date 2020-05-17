package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.mod.DevExpress.viz.PieChartSeries
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NameField extends js.Object {
  var customizeSeries: js.UndefOr[js.Function1[/* seriesName */ js.Any, PieChartSeries]] = js.native
  var nameField: js.UndefOr[String] = js.native
}

object NameField {
  @scala.inline
  def apply(): NameField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NameField]
  }
  @scala.inline
  implicit class NameFieldOps[Self <: NameField] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomizeSeries(value: /* seriesName */ js.Any => PieChartSeries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customizeSeries")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCustomizeSeries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customizeSeries")(js.undefined)
        ret
    }
    @scala.inline
    def withNameField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNameField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameField")(js.undefined)
        ret
    }
  }
  
}

