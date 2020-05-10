package typingsSlinky.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RefreshCacheOutput extends js.Object {
  var FileShareARN: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.FileShareARN] = js.native
  var NotificationId: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.NotificationId] = js.native
}

object RefreshCacheOutput {
  @scala.inline
  def apply(): RefreshCacheOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RefreshCacheOutput]
  }
  @scala.inline
  implicit class RefreshCacheOutputOps[Self <: RefreshCacheOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFileShareARN(value: FileShareARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileShareARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileShareARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileShareARN")(js.undefined)
        ret
    }
    @scala.inline
    def withNotificationId(value: NotificationId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotificationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotificationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotificationId")(js.undefined)
        ret
    }
  }
  
}

