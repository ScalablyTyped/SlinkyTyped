package typingsSlinky.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZookeeperNodeInfo extends js.Object {
  /**
    * 
    The attached elastic network interface of the broker.
    
    */
  var AttachedENIId: js.UndefOr[string] = js.native
  /**
    * 
    The virtual private cloud (VPC) IP address of the client.
    
    */
  var ClientVpcIpAddress: js.UndefOr[string] = js.native
  /**
    * 
    Endpoints for accessing the ZooKeeper.
    
    */
  var Endpoints: js.UndefOr[listOfString] = js.native
  /**
    * 
    The role-specific ID for Zookeeper.
    
    */
  var ZookeeperId: js.UndefOr[double] = js.native
  /**
    * 
    The version of Zookeeper.
    
    */
  var ZookeeperVersion: js.UndefOr[string] = js.native
}

object ZookeeperNodeInfo {
  @scala.inline
  def apply(): ZookeeperNodeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZookeeperNodeInfo]
  }
  @scala.inline
  implicit class ZookeeperNodeInfoOps[Self <: ZookeeperNodeInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttachedENIId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttachedENIId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttachedENIId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttachedENIId")(js.undefined)
        ret
    }
    @scala.inline
    def withClientVpcIpAddress(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientVpcIpAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientVpcIpAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientVpcIpAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withEndpoints(value: listOfString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Endpoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Endpoints")(js.undefined)
        ret
    }
    @scala.inline
    def withZookeeperId(value: double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ZookeeperId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZookeeperId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ZookeeperId")(js.undefined)
        ret
    }
    @scala.inline
    def withZookeeperVersion(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ZookeeperVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZookeeperVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ZookeeperVersion")(js.undefined)
        ret
    }
  }
  
}

