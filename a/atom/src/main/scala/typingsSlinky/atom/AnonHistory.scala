package typingsSlinky.atom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHistory extends js.Object {
  var history: js.UndefOr[Boolean] = js.native
  var markerLayers: js.UndefOr[Boolean] = js.native
}

object AnonHistory {
  @scala.inline
  def apply(): AnonHistory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonHistory]
  }
  @scala.inline
  implicit class AnonHistoryOps[Self <: AnonHistory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHistory(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("history")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHistory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("history")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerLayers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerLayers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerLayers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerLayers")(js.undefined)
        ret
    }
  }
  
}

