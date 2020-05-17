package typingsSlinky.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HistoryUpdate extends js.Object {
  var historyUpdate: String = js.native
}

object HistoryUpdate {
  @scala.inline
  def apply(historyUpdate: String): HistoryUpdate = {
    val __obj = js.Dynamic.literal(historyUpdate = historyUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistoryUpdate]
  }
  @scala.inline
  implicit class HistoryUpdateOps[Self <: HistoryUpdate] (val x: Self) extends AnyVal {
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

