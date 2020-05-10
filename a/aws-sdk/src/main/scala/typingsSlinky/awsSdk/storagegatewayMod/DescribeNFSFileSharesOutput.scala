package typingsSlinky.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeNFSFileSharesOutput extends js.Object {
  /**
    * An array containing a description for each requested file share. 
    */
  var NFSFileShareInfoList: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.NFSFileShareInfoList] = js.native
}

object DescribeNFSFileSharesOutput {
  @scala.inline
  def apply(): DescribeNFSFileSharesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeNFSFileSharesOutput]
  }
  @scala.inline
  implicit class DescribeNFSFileSharesOutputOps[Self <: DescribeNFSFileSharesOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNFSFileShareInfoList(value: NFSFileShareInfoList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NFSFileShareInfoList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNFSFileShareInfoList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NFSFileShareInfoList")(js.undefined)
        ret
    }
  }
  
}

