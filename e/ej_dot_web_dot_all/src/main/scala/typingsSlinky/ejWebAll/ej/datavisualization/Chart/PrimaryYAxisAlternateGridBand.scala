package typingsSlinky.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrimaryYAxisAlternateGridBand extends js.Object {
  /** Options for customizing even grid band.
    */
  var even: js.UndefOr[PrimaryYAxisAlternateGridBandEven] = js.native
  /** Options for customizing odd grid band.
    */
  var odd: js.UndefOr[PrimaryYAxisAlternateGridBandOdd] = js.native
}

object PrimaryYAxisAlternateGridBand {
  @scala.inline
  def apply(): PrimaryYAxisAlternateGridBand = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrimaryYAxisAlternateGridBand]
  }
  @scala.inline
  implicit class PrimaryYAxisAlternateGridBandOps[Self <: PrimaryYAxisAlternateGridBand] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEven(value: PrimaryYAxisAlternateGridBandEven): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("even")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEven: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("even")(js.undefined)
        ret
    }
    @scala.inline
    def withOdd(value: PrimaryYAxisAlternateGridBandOdd): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("odd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOdd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("odd")(js.undefined)
        ret
    }
  }
  
}

