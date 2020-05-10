package typingsSlinky.nodeLogglyBulk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRetriesInMilliSeconds extends js.Object {
  var retriesInMilliSeconds: Double = js.native
  var size: Double = js.native
}

object AnonRetriesInMilliSeconds {
  @scala.inline
  def apply(retriesInMilliSeconds: Double, size: Double): AnonRetriesInMilliSeconds = {
    val __obj = js.Dynamic.literal(retriesInMilliSeconds = retriesInMilliSeconds.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRetriesInMilliSeconds]
  }
  @scala.inline
  implicit class AnonRetriesInMilliSecondsOps[Self <: AnonRetriesInMilliSeconds] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRetriesInMilliSeconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retriesInMilliSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

