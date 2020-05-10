package typingsSlinky.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterParameterGroupNameMessage extends js.Object {
  /**
    * The name of the cluster parameter group.
    */
  var ParameterGroupName: js.UndefOr[String] = js.native
  /**
    * The status of the parameter group. For example, if you made a change to a parameter group name-value pair, then the change could be pending a reboot of an associated cluster.
    */
  var ParameterGroupStatus: js.UndefOr[String] = js.native
}

object ClusterParameterGroupNameMessage {
  @scala.inline
  def apply(): ClusterParameterGroupNameMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterParameterGroupNameMessage]
  }
  @scala.inline
  implicit class ClusterParameterGroupNameMessageOps[Self <: ClusterParameterGroupNameMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withParameterGroupStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParameterGroupStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameterGroupStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParameterGroupStatus")(js.undefined)
        ret
    }
  }
  
}

