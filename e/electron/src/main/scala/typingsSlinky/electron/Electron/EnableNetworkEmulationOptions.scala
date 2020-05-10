package typingsSlinky.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnableNetworkEmulationOptions extends js.Object {
  /**
    * Download rate in Bps. Defaults to 0 which will disable download throttling.
    */
  var downloadThroughput: js.UndefOr[Double] = js.native
  /**
    * RTT in ms. Defaults to 0 which will disable latency throttling.
    */
  var latency: js.UndefOr[Double] = js.native
  /**
    * Whether to emulate network outage. Defaults to false.
    */
  var offline: js.UndefOr[Boolean] = js.native
  /**
    * Upload rate in Bps. Defaults to 0 which will disable upload throttling.
    */
  var uploadThroughput: js.UndefOr[Double] = js.native
}

object EnableNetworkEmulationOptions {
  @scala.inline
  def apply(): EnableNetworkEmulationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnableNetworkEmulationOptions]
  }
  @scala.inline
  implicit class EnableNetworkEmulationOptionsOps[Self <: EnableNetworkEmulationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDownloadThroughput(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadThroughput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDownloadThroughput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadThroughput")(js.undefined)
        ret
    }
    @scala.inline
    def withLatency(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latency")(js.undefined)
        ret
    }
    @scala.inline
    def withOffline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offline")(js.undefined)
        ret
    }
    @scala.inline
    def withUploadThroughput(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadThroughput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUploadThroughput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadThroughput")(js.undefined)
        ret
    }
  }
  
}

