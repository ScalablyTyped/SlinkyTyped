package typingsSlinky.awsDashSdk.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeNFSFileSharesOutput extends js.Object {
  /**
    * An array containing a description for each requested file share. 
    */
  var NFSFileShareInfoList: js.UndefOr[typingsSlinky.awsDashSdk.clientsStoragegatewayMod.NFSFileShareInfoList] = js.native
}

object DescribeNFSFileSharesOutput {
  @scala.inline
  def apply(NFSFileShareInfoList: NFSFileShareInfoList = null): DescribeNFSFileSharesOutput = {
    val __obj = js.Dynamic.literal()
    if (NFSFileShareInfoList != null) __obj.updateDynamic("NFSFileShareInfoList")(NFSFileShareInfoList.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeNFSFileSharesOutput]
  }
}

