package typingsSlinky.activexDiskquota

import typingsSlinky.activexDiskquota.DiskQuotaTypeLibrary.DiskQuotaControl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveXObjectNameMap extends js.Object {
  @JSName("Microsoft.DiskQuota")
  var MicrosoftDotDiskQuota: DiskQuotaControl = js.native
}

object ActiveXObjectNameMap {
  @scala.inline
  def apply(MicrosoftDotDiskQuota: DiskQuotaControl): ActiveXObjectNameMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Microsoft.DiskQuota")(MicrosoftDotDiskQuota.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveXObjectNameMap]
  }
  @scala.inline
  implicit class ActiveXObjectNameMapOps[Self <: ActiveXObjectNameMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMicrosoftDotDiskQuota(value: DiskQuotaControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Microsoft.DiskQuota")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

