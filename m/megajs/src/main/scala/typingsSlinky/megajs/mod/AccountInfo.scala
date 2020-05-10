package typingsSlinky.megajs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountInfo extends js.Object {
  var downloadBandwidthTotal: Double = js.native
  var downloadBandwidthUsed: Double = js.native
  var sharedBandwidthLimit: Double = js.native
  var sharedBandwidthUsed: Double = js.native
  var spaceTotal: Double = js.native
  var spaceUsed: Double = js.native
  var `type`: String = js.native
}

object AccountInfo {
  @scala.inline
  def apply(
    downloadBandwidthTotal: Double,
    downloadBandwidthUsed: Double,
    sharedBandwidthLimit: Double,
    sharedBandwidthUsed: Double,
    spaceTotal: Double,
    spaceUsed: Double,
    `type`: String
  ): AccountInfo = {
    val __obj = js.Dynamic.literal(downloadBandwidthTotal = downloadBandwidthTotal.asInstanceOf[js.Any], downloadBandwidthUsed = downloadBandwidthUsed.asInstanceOf[js.Any], sharedBandwidthLimit = sharedBandwidthLimit.asInstanceOf[js.Any], sharedBandwidthUsed = sharedBandwidthUsed.asInstanceOf[js.Any], spaceTotal = spaceTotal.asInstanceOf[js.Any], spaceUsed = spaceUsed.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountInfo]
  }
  @scala.inline
  implicit class AccountInfoOps[Self <: AccountInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDownloadBandwidthTotal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadBandwidthTotal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDownloadBandwidthUsed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadBandwidthUsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSharedBandwidthLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharedBandwidthLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSharedBandwidthUsed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharedBandwidthUsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpaceTotal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spaceTotal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpaceUsed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spaceUsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

