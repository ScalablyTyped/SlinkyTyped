package typingsSlinky.archiver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonProcessedBytes extends js.Object {
  var processedBytes: Double = js.native
  var totalBytes: Double = js.native
}

object AnonProcessedBytes {
  @scala.inline
  def apply(processedBytes: Double, totalBytes: Double): AnonProcessedBytes = {
    val __obj = js.Dynamic.literal(processedBytes = processedBytes.asInstanceOf[js.Any], totalBytes = totalBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonProcessedBytes]
  }
  @scala.inline
  implicit class AnonProcessedBytesOps[Self <: AnonProcessedBytes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProcessedBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processedBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalBytes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

