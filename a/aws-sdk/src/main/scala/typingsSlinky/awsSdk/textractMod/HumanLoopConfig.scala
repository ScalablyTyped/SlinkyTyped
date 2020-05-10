package typingsSlinky.awsSdk.textractMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HumanLoopConfig extends js.Object {
  /**
    * Sets attributes of the input data.
    */
  var DataAttributes: js.UndefOr[HumanLoopDataAttributes] = js.native
  /**
    * The Amazon Resource Name (ARN) of the flow definition.
    */
  var FlowDefinitionArn: typingsSlinky.awsSdk.textractMod.FlowDefinitionArn = js.native
  /**
    * The name of the human workflow used for this image. This should be kept unique within a region.
    */
  var HumanLoopName: typingsSlinky.awsSdk.textractMod.HumanLoopName = js.native
}

object HumanLoopConfig {
  @scala.inline
  def apply(FlowDefinitionArn: FlowDefinitionArn, HumanLoopName: HumanLoopName): HumanLoopConfig = {
    val __obj = js.Dynamic.literal(FlowDefinitionArn = FlowDefinitionArn.asInstanceOf[js.Any], HumanLoopName = HumanLoopName.asInstanceOf[js.Any])
    __obj.asInstanceOf[HumanLoopConfig]
  }
  @scala.inline
  implicit class HumanLoopConfigOps[Self <: HumanLoopConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFlowDefinitionArn(value: FlowDefinitionArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FlowDefinitionArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHumanLoopName(value: HumanLoopName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HumanLoopName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataAttributes(value: HumanLoopDataAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataAttributes")(js.undefined)
        ret
    }
  }
  
}

