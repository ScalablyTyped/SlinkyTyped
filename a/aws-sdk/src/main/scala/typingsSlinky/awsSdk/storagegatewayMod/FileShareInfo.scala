package typingsSlinky.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileShareInfo extends js.Object {
  var FileShareARN: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.FileShareARN] = js.native
  var FileShareId: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.FileShareId] = js.native
  var FileShareStatus: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.FileShareStatus] = js.native
  var FileShareType: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.FileShareType] = js.native
  var GatewayARN: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.GatewayARN] = js.native
}

object FileShareInfo {
  @scala.inline
  def apply(): FileShareInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileShareInfo]
  }
  @scala.inline
  implicit class FileShareInfoOps[Self <: FileShareInfo] (val x: Self) extends AnyVal {
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
    def withFileShareId(value: FileShareId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileShareId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileShareId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileShareId")(js.undefined)
        ret
    }
    @scala.inline
    def withFileShareStatus(value: FileShareStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileShareStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileShareStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileShareStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withFileShareType(value: FileShareType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileShareType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileShareType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileShareType")(js.undefined)
        ret
    }
    @scala.inline
    def withGatewayARN(value: GatewayARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GatewayARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGatewayARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GatewayARN")(js.undefined)
        ret
    }
  }
  
}

