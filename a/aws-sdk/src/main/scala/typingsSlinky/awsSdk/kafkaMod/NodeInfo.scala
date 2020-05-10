package typingsSlinky.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeInfo extends js.Object {
  /**
    * 
    The start time.
    
    */
  var AddedToClusterTime: js.UndefOr[string] = js.native
  /**
    * 
    The broker node info.
    
    */
  var BrokerNodeInfo: js.UndefOr[typingsSlinky.awsSdk.kafkaMod.BrokerNodeInfo] = js.native
  /**
    * 
    The instance type.
    
    */
  var InstanceType: js.UndefOr[string] = js.native
  /**
    * 
    The Amazon Resource Name (ARN) of the node.
    
    */
  var NodeARN: js.UndefOr[string] = js.native
  /**
    * 
    The node type.
    
    */
  var NodeType: js.UndefOr[typingsSlinky.awsSdk.kafkaMod.NodeType] = js.native
  /**
    * 
    The ZookeeperNodeInfo.
    
    */
  var ZookeeperNodeInfo: js.UndefOr[typingsSlinky.awsSdk.kafkaMod.ZookeeperNodeInfo] = js.native
}

object NodeInfo {
  @scala.inline
  def apply(): NodeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeInfo]
  }
  @scala.inline
  implicit class NodeInfoOps[Self <: NodeInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddedToClusterTime(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddedToClusterTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddedToClusterTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddedToClusterTime")(js.undefined)
        ret
    }
    @scala.inline
    def withBrokerNodeInfo(value: BrokerNodeInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BrokerNodeInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrokerNodeInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BrokerNodeInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceType(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceType")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeARN(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodeARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodeARN")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeType(value: NodeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodeType")(js.undefined)
        ret
    }
    @scala.inline
    def withZookeeperNodeInfo(value: ZookeeperNodeInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ZookeeperNodeInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZookeeperNodeInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ZookeeperNodeInfo")(js.undefined)
        ret
    }
  }
  
}

