package typingsSlinky.cordovaPluginBleCentral.BLECentralPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartScanOptions extends js.Object {
  var reportDuplicates: js.UndefOr[Boolean] = js.native
}

object StartScanOptions {
  @scala.inline
  def apply(): StartScanOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartScanOptions]
  }
  @scala.inline
  implicit class StartScanOptionsOps[Self <: StartScanOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReportDuplicates(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportDuplicates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportDuplicates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportDuplicates")(js.undefined)
        ret
    }
  }
  
}

