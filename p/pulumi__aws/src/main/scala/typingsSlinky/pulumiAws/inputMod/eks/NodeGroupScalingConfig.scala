package typingsSlinky.pulumiAws.inputMod.eks

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeGroupScalingConfig extends js.Object {
  /**
    * Desired number of worker nodes.
    */
  var desiredSize: Input[Double] = js.native
  /**
    * Maximum number of worker nodes.
    */
  var maxSize: Input[Double] = js.native
  /**
    * Minimum number of worker nodes.
    */
  var minSize: Input[Double] = js.native
}

object NodeGroupScalingConfig {
  @scala.inline
  def apply(desiredSize: Input[Double], maxSize: Input[Double], minSize: Input[Double]): NodeGroupScalingConfig = {
    val __obj = js.Dynamic.literal(desiredSize = desiredSize.asInstanceOf[js.Any], maxSize = maxSize.asInstanceOf[js.Any], minSize = minSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeGroupScalingConfig]
  }
  @scala.inline
  implicit class NodeGroupScalingConfigOps[Self <: NodeGroupScalingConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDesiredSize(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desiredSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxSize(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinSize(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSize")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

