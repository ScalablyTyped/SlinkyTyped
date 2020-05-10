package typingsSlinky.ky.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DownloadProgress extends js.Object {
  var percent: Double = js.native
  /**
  	Note: If it's not possible to retrieve the body size, it will be `0`.
  	*/
  var totalBytes: Double = js.native
  var transferredBytes: Double = js.native
}

object DownloadProgress {
  @scala.inline
  def apply(percent: Double, totalBytes: Double, transferredBytes: Double): DownloadProgress = {
    val __obj = js.Dynamic.literal(percent = percent.asInstanceOf[js.Any], totalBytes = totalBytes.asInstanceOf[js.Any], transferredBytes = transferredBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadProgress]
  }
  @scala.inline
  implicit class DownloadProgressOps[Self <: DownloadProgress] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPercent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransferredBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transferredBytes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

