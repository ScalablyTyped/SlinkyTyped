package typingsSlinky.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListNodesResponse extends js.Object {
  /**
    * 
    The paginated results marker. When the result of a ListNodes operation is truncated, the call returns NextToken in the response. 
    To get another batch of nodes, provide this token in your next request.
    
    */
  var NextToken: js.UndefOr[string] = js.native
  /**
    * 
    List containing a NodeInfo object.
    
    */
  var NodeInfoList: js.UndefOr[listOfNodeInfo] = js.native
}

object ListNodesResponse {
  @scala.inline
  def apply(): ListNodesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListNodesResponse]
  }
  @scala.inline
  implicit class ListNodesResponseOps[Self <: ListNodesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withNodeInfoList(value: listOfNodeInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodeInfoList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeInfoList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodeInfoList")(js.undefined)
        ret
    }
  }
  
}

