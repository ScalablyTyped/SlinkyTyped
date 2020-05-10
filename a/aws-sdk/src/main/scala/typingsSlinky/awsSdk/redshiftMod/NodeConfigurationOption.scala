package typingsSlinky.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeConfigurationOption extends js.Object {
  /**
    * The estimated disk utilizaton percentage.
    */
  var EstimatedDiskUtilizationPercent: js.UndefOr[DoubleOptional] = js.native
  /**
    * The category of the node configuration recommendation.
    */
  var Mode: js.UndefOr[typingsSlinky.awsSdk.redshiftMod.Mode] = js.native
  /**
    * The node type, such as, "ds2.8xlarge".
    */
  var NodeType: js.UndefOr[String] = js.native
  /**
    * The number of nodes.
    */
  var NumberOfNodes: js.UndefOr[Integer] = js.native
}

object NodeConfigurationOption {
  @scala.inline
  def apply(): NodeConfigurationOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeConfigurationOption]
  }
  @scala.inline
  implicit class NodeConfigurationOptionOps[Self <: NodeConfigurationOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEstimatedDiskUtilizationPercent(value: DoubleOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EstimatedDiskUtilizationPercent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEstimatedDiskUtilizationPercent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EstimatedDiskUtilizationPercent")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: Mode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Mode")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeType(value: String): Self = {
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
    def withNumberOfNodes(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberOfNodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfNodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberOfNodes")(js.undefined)
        ret
    }
  }
  
}

