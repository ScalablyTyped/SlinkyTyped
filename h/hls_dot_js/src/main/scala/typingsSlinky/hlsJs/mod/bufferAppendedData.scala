package typingsSlinky.hlsJs.mod

import typingsSlinky.hlsJs.AnonAudio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait bufferAppendedData extends js.Object {
  var pending: Double = js.native
  var timeRanges: AnonAudio = js.native
}

object bufferAppendedData {
  @scala.inline
  def apply(pending: Double, timeRanges: AnonAudio): bufferAppendedData = {
    val __obj = js.Dynamic.literal(pending = pending.asInstanceOf[js.Any], timeRanges = timeRanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[bufferAppendedData]
  }
  @scala.inline
  implicit class bufferAppendedDataOps[Self <: bufferAppendedData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPending(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeRanges(value: AnonAudio): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeRanges")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

