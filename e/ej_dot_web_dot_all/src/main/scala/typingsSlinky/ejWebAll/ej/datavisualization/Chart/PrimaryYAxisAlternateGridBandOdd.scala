package typingsSlinky.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrimaryYAxisAlternateGridBandOdd extends js.Object {
  /** Fill color of the odd grid bands.
    * @Default {transparent}
    */
  var fill: js.UndefOr[String] = js.native
  /** Opacity of odd grid band.
    * @Default {1}
    */
  var opacity: js.UndefOr[Double] = js.native
}

object PrimaryYAxisAlternateGridBandOdd {
  @scala.inline
  def apply(): PrimaryYAxisAlternateGridBandOdd = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrimaryYAxisAlternateGridBandOdd]
  }
  @scala.inline
  implicit class PrimaryYAxisAlternateGridBandOddOps[Self <: PrimaryYAxisAlternateGridBandOdd] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFill(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(js.undefined)
        ret
    }
    @scala.inline
    def withOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(js.undefined)
        ret
    }
  }
  
}

