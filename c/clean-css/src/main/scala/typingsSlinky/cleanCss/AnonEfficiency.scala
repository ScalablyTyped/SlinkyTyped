package typingsSlinky.cleanCss

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEfficiency extends js.Object {
  /**
    * `(originalSize - minifiedSize) / originalSize`, e.g. 0.25 if size is reduced from 100 bytes to 75 bytes
    */
  var efficiency: Double = js.native
  /**
    * Optimized content size
    */
  var minifiedSize: Double = js.native
  /**
    * Original content size after import inlining
    */
  var originalSize: Double = js.native
  /**
    * Time spent on optimizations in milliseconds
    */
  var timeSpent: Double = js.native
}

object AnonEfficiency {
  @scala.inline
  def apply(efficiency: Double, minifiedSize: Double, originalSize: Double, timeSpent: Double): AnonEfficiency = {
    val __obj = js.Dynamic.literal(efficiency = efficiency.asInstanceOf[js.Any], minifiedSize = minifiedSize.asInstanceOf[js.Any], originalSize = originalSize.asInstanceOf[js.Any], timeSpent = timeSpent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEfficiency]
  }
  @scala.inline
  implicit class AnonEfficiencyOps[Self <: AnonEfficiency] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEfficiency(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("efficiency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinifiedSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minifiedSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginalSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeSpent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeSpent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

