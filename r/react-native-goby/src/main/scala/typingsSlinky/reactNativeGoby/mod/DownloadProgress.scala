package typingsSlinky.reactNativeGoby.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DownloadProgress extends js.Object {
  /**
    * The number of bytes downloaded thus far.
    */
  var receivedBytes: Double = js.native
  /**
    * The total number of bytes expected to be received for this update.
    */
  var totalBytes: Double = js.native
}

object DownloadProgress {
  @scala.inline
  def apply(receivedBytes: Double, totalBytes: Double): DownloadProgress = {
    val __obj = js.Dynamic.literal(receivedBytes = receivedBytes.asInstanceOf[js.Any], totalBytes = totalBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadProgress]
  }
  @scala.inline
  implicit class DownloadProgressOps[Self <: DownloadProgress] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReceivedBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receivedBytes")(value.asInstanceOf[js.Any])
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

