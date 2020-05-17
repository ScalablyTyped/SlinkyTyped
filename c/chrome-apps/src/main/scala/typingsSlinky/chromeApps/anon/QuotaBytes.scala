package typingsSlinky.chromeApps.anon

import typingsSlinky.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QuotaBytes extends js.Object {
  var quotaBytes: integer = js.native
  var usageBytes: integer = js.native
}

object QuotaBytes {
  @scala.inline
  def apply(quotaBytes: integer, usageBytes: integer): QuotaBytes = {
    val __obj = js.Dynamic.literal(quotaBytes = quotaBytes.asInstanceOf[js.Any], usageBytes = usageBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuotaBytes]
  }
  @scala.inline
  implicit class QuotaBytesOps[Self <: QuotaBytes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQuotaBytes(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotaBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsageBytes(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usageBytes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

