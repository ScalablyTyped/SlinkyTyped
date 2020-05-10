package typingsSlinky.activexShdocvw

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBstrWorkerLabel extends js.Object {
  val bstrWorkerLabel: String = js.native
  val dwUniqueID: Double = js.native
}

object AnonBstrWorkerLabel {
  @scala.inline
  def apply(bstrWorkerLabel: String, dwUniqueID: Double): AnonBstrWorkerLabel = {
    val __obj = js.Dynamic.literal(bstrWorkerLabel = bstrWorkerLabel.asInstanceOf[js.Any], dwUniqueID = dwUniqueID.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBstrWorkerLabel]
  }
  @scala.inline
  implicit class AnonBstrWorkerLabelOps[Self <: AnonBstrWorkerLabel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBstrWorkerLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bstrWorkerLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDwUniqueID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dwUniqueID")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

