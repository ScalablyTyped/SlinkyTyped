package typingsSlinky.keystonejsKeystone

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMaxTotalResults extends js.Object {
  var maxTotalResults: js.UndefOr[Double] = js.native
}

object AnonMaxTotalResults {
  @scala.inline
  def apply(): AnonMaxTotalResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonMaxTotalResults]
  }
  @scala.inline
  implicit class AnonMaxTotalResultsOps[Self <: AnonMaxTotalResults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxTotalResults(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTotalResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxTotalResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTotalResults")(js.undefined)
        ret
    }
  }
  
}

