package typingsSlinky.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line:interface-name
@js.native
trait IterativeCalculationSettings extends js.Object {
  /**
    * When iterative calculation is enabled and successive results differ by
    * less than this threshold value, the calculation rounds stop.
    */
  var convergenceThreshold: js.UndefOr[Double] = js.native
  /**
    * When iterative calculation is enabled, the maximum number of calculation
    * rounds to perform.
    */
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

