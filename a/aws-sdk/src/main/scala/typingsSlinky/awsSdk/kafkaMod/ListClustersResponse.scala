package typingsSlinky.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListClustersResponse extends js.Object {
  /**
    * 
    Information on each of the MSK clusters in the response.
    
    */
  var ClusterInfoList: js.UndefOr[listOfClusterInfo] = js.native
  /**
    * 
    The paginated results marker. When the result of a ListClusters operation is truncated, the call returns NextToken in the response. 
    To get another batch of clusters, provide this token in your next request.
    
    */
  var NextToken: js.UndefOr[string] = js.native
}

object ListClustersResponse {
  @scala.inline
  def apply(): ListClustersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListClustersResponse]
  }
  @scala.inline
  implicit class ListClustersResponseOps[Self <: ListClustersResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClusterInfoList(value: listOfClusterInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterInfoList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterInfoList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterInfoList")(js.undefined)
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

