package typingsSlinky.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSMBFileSharesOutput extends js.Object {
  /**
    * An array containing a description for each requested file share. 
    */
  var SMBFileShareInfoList: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.SMBFileShareInfoList] = js.native
}

object DescribeSMBFileSharesOutput {
  @scala.inline
  def apply(): DescribeSMBFileSharesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSMBFileSharesOutput]
  }
  @scala.inline
  implicit class DescribeSMBFileSharesOutputOps[Self <: DescribeSMBFileSharesOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSMBFileShareInfoList(value: SMBFileShareInfoList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SMBFileShareInfoList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSMBFileShareInfoList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SMBFileShareInfoList")(js.undefined)
        ret
    }
  }
  
}

