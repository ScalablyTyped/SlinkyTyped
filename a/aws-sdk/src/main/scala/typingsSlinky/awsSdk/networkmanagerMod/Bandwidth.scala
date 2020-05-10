package typingsSlinky.awsSdk.networkmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bandwidth extends js.Object {
  /**
    * Download speed in Mbps.
    */
  var DownloadSpeed: js.UndefOr[Integer] = js.native
  /**
    * Upload speed in Mbps.
    */
  var UploadSpeed: js.UndefOr[Integer] = js.native
}

object Bandwidth {
  @scala.inline
  def apply(): Bandwidth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bandwidth]
  }
  @scala.inline
  implicit class BandwidthOps[Self <: Bandwidth] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDownloadSpeed(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DownloadSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDownloadSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DownloadSpeed")(js.undefined)
        ret
    }
    @scala.inline
    def withUploadSpeed(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UploadSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUploadSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UploadSpeed")(js.undefined)
        ret
    }
  }
  
}

