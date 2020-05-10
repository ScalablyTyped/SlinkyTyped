package typingsSlinky.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHistoryUpdate extends js.Object {
  var historyUpdate: String = js.native
}

object AnonHistoryUpdate {
  @scala.inline
  def apply(historyUpdate: String): AnonHistoryUpdate = {
    val __obj = js.Dynamic.literal(historyUpdate = historyUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHistoryUpdate]
  }
  @scala.inline
  implicit class AnonHistoryUpdateOps[Self <: AnonHistoryUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHistoryUpdate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("historyUpdate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

