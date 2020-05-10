package typingsSlinky.googleAppsScript.GoogleAppsScript.Drive.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AboutQuotaBytesByService extends js.Object {
  var bytesUsed: js.UndefOr[String] = js.native
  var serviceName: js.UndefOr[String] = js.native
}

object AboutQuotaBytesByService {
  @scala.inline
  def apply(): AboutQuotaBytesByService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AboutQuotaBytesByService]
  }
  @scala.inline
  implicit class AboutQuotaBytesByServiceOps[Self <: AboutQuotaBytesByService] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBytesUsed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytesUsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBytesUsed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytesUsed")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceName")(js.undefined)
        ret
    }
  }
  
}

