package typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WaterfallChartCustomSubtotal extends js.Object {
  var dataIsSubtotal: js.UndefOr[Boolean] = js.native
  var label: js.UndefOr[String] = js.native
  var subtotalIndex: js.UndefOr[Double] = js.native
}

object WaterfallChartCustomSubtotal {
  @scala.inline
  def apply(): WaterfallChartCustomSubtotal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WaterfallChartCustomSubtotal]
  }
  @scala.inline
  implicit class WaterfallChartCustomSubtotalOps[Self <: WaterfallChartCustomSubtotal] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataIsSubtotal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataIsSubtotal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataIsSubtotal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataIsSubtotal")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
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
    @scala.inline
    def withSubtotalIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtotalIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubtotalIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtotalIndex")(js.undefined)
        ret
    }
  }
  
}

