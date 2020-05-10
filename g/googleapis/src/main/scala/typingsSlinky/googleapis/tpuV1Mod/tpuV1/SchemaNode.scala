package typingsSlinky.googleapis.tpuV1Mod.tpuV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A TPU instance.
  */
@js.native
trait SchemaNode extends js.Object {
  /**
    * The type of hardware accelerators associated with this node. Required.
    */
  var acceleratorType: js.UndefOr[String] = js.native
  /**
    * The CIDR block that the TPU node will use when selecting an IP address.
    * This CIDR block must be a /29 block; the Compute Engine networks API
    * forbids a smaller block, and using a larger block would be wasteful (a
    * node can only consume one IP address). Errors will occur if the CIDR
    * block has already been used for a currently existing TPU node, the CIDR
    * block conflicts with any subnetworks in the user&#39;s provided network,
    * or the provided network is peered with another network that is using that
    * CIDR block. Required.
    */
  var cidrBlock: js.UndefOr[String] = js.native
  /**
    * Output only. The time when the node was created.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * The user-supplied description of the TPU. Maximum of 512 characters.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The health status of the TPU node.
    */
  var health: js.UndefOr[String] = js.native
  /**
    * Output only. If this field is populated, it contains a description of why
    * the TPU Node is unhealthy.
    */
  var healthDescription: js.UndefOr[String] = js.native
  /**
    * Output only. DEPRECATED! Use network_endpoints instead. The network
    * address for the TPU Node as visible to Compute Engine instances.
    */
  var ipAddress: js.UndefOr[String] = js.native
  /**
    * Resource labels to represent user-provided metadata.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Output only. The immutable name of the TPU
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The name of a network they wish to peer the TPU node to. It must be a
    * preexisting Compute Engine network inside of the project on which this
    * API has been activated. If none is provided, &quot;default&quot; will be
    * used.
    */
  var network: js.UndefOr[String] = js.native
  /**
    * Output only. The network endpoints where TPU workers can be accessed and
    * sent work. It is recommended that Tensorflow clients of the node reach
    * out to the 0th entry in this map first.
    */
  var networkEndpoints: js.UndefOr[js.Array[SchemaNetworkEndpoint]] = js.native
  /**
    * Output only. DEPRECATED! Use network_endpoints instead. The network port
    * for the TPU Node as visible to Compute Engine instances.
    */
  var port: js.UndefOr[String] = js.native
  var schedulingConfig: js.UndefOr[SchemaSchedulingConfig] = js.native
  /**
    * Output only. The service account used to run the tensor flow services
    * within the node. To share resources, including Google Cloud Storage data,
    * with the Tensorflow job running in the Node, this account must have
    * permissions to that data.
    */
  var serviceAccount: js.UndefOr[String] = js.native
  /**
    * Output only. The current state for the TPU Node.
    */
  var state: js.UndefOr[String] = js.native
  /**
    * The version of Tensorflow running in the Node. Required.
    */
  var tensorflowVersion: js.UndefOr[String] = js.native
}

object SchemaNode {
  @scala.inline
  def apply(): SchemaNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNode]
  }
  @scala.inline
  implicit class SchemaNodeOps[Self <: SchemaNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcceleratorType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceleratorType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcceleratorType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceleratorType")(js.undefined)
        ret
    }
    @scala.inline
    def withCidrBlock(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cidrBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCidrBlock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cidrBlock")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withHealth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("health")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHealth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("health")(js.undefined)
        ret
    }
    @scala.inline
    def withHealthDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("healthDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHealthDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("healthDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withIpAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withLabels(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNetwork(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("network")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetwork: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("network")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkEndpoints(value: js.Array[SchemaNetworkEndpoint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkEndpoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkEndpoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkEndpoints")(js.undefined)
        ret
    }
    @scala.inline
    def withPort(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(js.undefined)
        ret
    }
    @scala.inline
    def withSchedulingConfig(value: SchemaSchedulingConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schedulingConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchedulingConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schedulingConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceAccount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceAccount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceAccount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceAccount")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
    @scala.inline
    def withTensorflowVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tensorflowVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTensorflowVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tensorflowVersion")(js.undefined)
        ret
    }
  }
  
}

