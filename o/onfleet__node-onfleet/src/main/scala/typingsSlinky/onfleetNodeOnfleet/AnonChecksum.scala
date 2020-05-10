package typingsSlinky.onfleetNodeOnfleet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonChecksum extends js.Object {
  var checksum: Null = js.native
  var failedScanCount: Double = js.native
}

object AnonChecksum {
  @scala.inline
  def apply(checksum: Null, failedScanCount: Double): AnonChecksum = {
    val __obj = js.Dynamic.literal(checksum = checksum.asInstanceOf[js.Any], failedScanCount = failedScanCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChecksum]
  }
  @scala.inline
  implicit class AnonChecksumOps[Self <: AnonChecksum] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChecksum(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checksum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFailedScanCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failedScanCount")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

