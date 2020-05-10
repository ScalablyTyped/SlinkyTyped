package typingsSlinky.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateSMBFileShareOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the updated SMB file share. 
    */
  var FileShareARN: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.FileShareARN] = js.native
}

object UpdateSMBFileShareOutput {
  @scala.inline
  def apply(): UpdateSMBFileShareOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateSMBFileShareOutput]
  }
  @scala.inline
  implicit class UpdateSMBFileShareOutputOps[Self <: UpdateSMBFileShareOutput] (val x: Self) extends AnyVal {
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
  }
  
}

