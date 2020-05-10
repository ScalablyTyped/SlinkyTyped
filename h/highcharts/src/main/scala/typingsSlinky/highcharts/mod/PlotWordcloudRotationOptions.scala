package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotWordcloudRotationOptions extends js.Object {
  /**
    * (Highcharts) The smallest degree of rotation for a word.
    */
  var from: js.UndefOr[Double] = js.native
  /**
    * (Highcharts) The number of possible orientations for a word, within the
    * range of `rotation.from` and `rotation.to`. Must be a number larger than
    * 0.
    */
  var orientations: js.UndefOr[Double] = js.native
  /**
    * (Highcharts) The largest degree of rotation for a word.
    */
  var to: js.UndefOr[Double] = js.native
}

object PlotWordcloudRotationOptions {
  @scala.inline
  def apply(): PlotWordcloudRotationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotWordcloudRotationOptions]
  }
  @scala.inline
  implicit class PlotWordcloudRotationOptionsOps[Self <: PlotWordcloudRotationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFrom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(js.undefined)
        ret
    }
    @scala.inline
    def withOrientations(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrientations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientations")(js.undefined)
        ret
    }
    @scala.inline
    def withTo(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(js.undefined)
        ret
    }
  }
  
}

