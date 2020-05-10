package typingsSlinky.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListClusterOperationsResponse extends js.Object {
  /**
    * 
    An array of cluster operation information objects.
    
    */
  var ClusterOperationInfoList: js.UndefOr[listOfClusterOperationInfo] = js.native
  /**
    * 
    If the response of ListClusterOperations is truncated, it returns a NextToken in the response. This Nexttoken should be sent in the subsequent request to ListClusterOperations.
    
    */
  var NextToken: js.UndefOr[string] = js.native
}

object ListClusterOperationsResponse {
  @scala.inline
  def apply(): ListClusterOperationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListClusterOperationsResponse]
  }
  @scala.inline
  implicit class ListClusterOperationsResponseOps[Self <: ListClusterOperationsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClusterOperationInfoList(value: listOfClusterOperationInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterOperationInfoList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterOperationInfoList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterOperationInfoList")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
  }
  
}

