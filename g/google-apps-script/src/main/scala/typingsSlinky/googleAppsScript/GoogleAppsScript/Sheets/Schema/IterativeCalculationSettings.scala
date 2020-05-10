package typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IterativeCalculationSettings extends js.Object {
  var convergenceThreshold: js.UndefOr[Double] = js.native
  var maxIterations: js.UndefOr[Double] = js.native
}

object IterativeCalculationSettings {
  @scala.inline
  def apply(): IterativeCalculationSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IterativeCalculationSettings]
  }
  @scala.inline
  implicit class IterativeCalculationSettingsOps[Self <: IterativeCalculationSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConvergenceThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convergenceThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConvergenceThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convergenceThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxIterations(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxIterations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxIterations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxIterations")(js.undefined)
        ret
    }
  }
  
}

