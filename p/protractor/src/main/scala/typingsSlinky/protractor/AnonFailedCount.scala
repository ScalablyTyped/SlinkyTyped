package typingsSlinky.protractor

import typingsSlinky.protractor.pluginsMod.SpecResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFailedCount extends js.Object {
  var failedCount: Double = js.native
  var specResults: js.Array[SpecResult] = js.native
}

object AnonFailedCount {
  @scala.inline
  def apply(failedCount: Double, specResults: js.Array[SpecResult]): AnonFailedCount = {
    val __obj = js.Dynamic.literal(failedCount = failedCount.asInstanceOf[js.Any], specResults = specResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFailedCount]
  }
  @scala.inline
  implicit class AnonFailedCountOps[Self <: AnonFailedCount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFailedCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failedCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpecResults(value: js.Array[SpecResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specResults")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

