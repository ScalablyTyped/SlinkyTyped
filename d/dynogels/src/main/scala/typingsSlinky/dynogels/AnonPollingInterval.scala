package typingsSlinky.dynogels

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPollingInterval extends js.Object {
  var pollingInterval: Double = js.native
}

object AnonPollingInterval {
  @scala.inline
  def apply(pollingInterval: Double): AnonPollingInterval = {
    val __obj = js.Dynamic.literal(pollingInterval = pollingInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPollingInterval]
  }
  @scala.inline
  implicit class AnonPollingIntervalOps[Self <: AnonPollingInterval] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPollingInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pollingInterval")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

