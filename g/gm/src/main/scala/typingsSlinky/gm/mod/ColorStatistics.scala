package typingsSlinky.gm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorStatistics extends js.Object {
  var Maximum: String = js.native
  var Mean: String = js.native
  var Minimum: String = js.native
  var `Standard Deviation`: String = js.native
}

object ColorStatistics {
  @scala.inline
  def apply(Maximum: String, Mean: String, Minimum: String, `Standard Deviation`: String): ColorStatistics = {
    val __obj = js.Dynamic.literal(Maximum = Maximum.asInstanceOf[js.Any], Mean = Mean.asInstanceOf[js.Any], Minimum = Minimum.asInstanceOf[js.Any])
    __obj.updateDynamic("Standard Deviation")((`Standard Deviation`).asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorStatistics]
  }
  @scala.inline
  implicit class ColorStatisticsOps[Self <: ColorStatistics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaximum(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Maximum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMean(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Mean")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinimum(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Minimum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withStandard Deviation`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Standard Deviation")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

