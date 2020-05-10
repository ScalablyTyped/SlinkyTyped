package typingsSlinky.pulumiAws.outputMod.eks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeGroupScalingConfig extends js.Object {
  /**
    * Desired number of worker nodes.
    */
  var desiredSize: Double = js.native
  /**
    * Maximum number of worker nodes.
    */
  var maxSize: Double = js.native
  /**
    * Minimum number of worker nodes.
    */
  var minSize: Double = js.native
}

object NodeGroupScalingConfig {
  @scala.inline
  def apply(desiredSize: Double, maxSize: Double, minSize: Double): NodeGroupScalingConfig = {
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
    def withDesiredSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desiredSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSize")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

