package typingsSlinky.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMaxColumnCount extends js.Object {
  var maxColumnCount: Double = js.native
  var maxRowCount: Double = js.native
}

object AnonMaxColumnCount {
  @scala.inline
  def apply(maxColumnCount: Double, maxRowCount: Double): AnonMaxColumnCount = {
    val __obj = js.Dynamic.literal(maxColumnCount = maxColumnCount.asInstanceOf[js.Any], maxRowCount = maxRowCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMaxColumnCount]
  }
  @scala.inline
  implicit class AnonMaxColumnCountOps[Self <: AnonMaxColumnCount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxColumnCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxColumnCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxRowCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRowCount")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

