package typingsSlinky.activexShdocvw

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPhishingFilterStatus extends js.Object {
  val PhishingFilterStatus: Double = js.native
}

object AnonPhishingFilterStatus {
  @scala.inline
  def apply(PhishingFilterStatus: Double): AnonPhishingFilterStatus = {
    val __obj = js.Dynamic.literal(PhishingFilterStatus = PhishingFilterStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPhishingFilterStatus]
  }
  @scala.inline
  implicit class AnonPhishingFilterStatusOps[Self <: AnonPhishingFilterStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPhishingFilterStatus(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PhishingFilterStatus")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

