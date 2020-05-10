package typingsSlinky.awsSdk.daxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParameterGroupStatus extends js.Object {
  /**
    * The node IDs of one or more nodes to be rebooted.
    */
  var NodeIdsToReboot: js.UndefOr[NodeIdentifierList] = js.native
  /**
    * The status of parameter updates. 
    */
  var ParameterApplyStatus: js.UndefOr[String] = js.native
  /**
    * The name of the parameter group.
    */
  var ParameterGroupName: js.UndefOr[String] = js.native
}

object ParameterGroupStatus {
  @scala.inline
  def apply(): ParameterGroupStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParameterGroupStatus]
  }
  @scala.inline
  implicit class ParameterGroupStatusOps[Self <: ParameterGroupStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNodeIdsToReboot(value: NodeIdentifierList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodeIdsToReboot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeIdsToReboot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodeIdsToReboot")(js.undefined)
        ret
    }
    @scala.inline
    def withParameterApplyStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParameterApplyStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameterApplyStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParameterApplyStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withParameterGroupName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParameterGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameterGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParameterGroupName")(js.undefined)
        ret
    }
  }
  
}

