package typingsSlinky.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteClusterParameterGroupMessage extends js.Object {
  /**
    * The name of the parameter group to be deleted. Constraints:   Must be the name of an existing cluster parameter group.   Cannot delete a default cluster parameter group.  
    */
  var ParameterGroupName: String = js.native
}

object DeleteClusterParameterGroupMessage {
  @scala.inline
  def apply(ParameterGroupName: String): DeleteClusterParameterGroupMessage = {
    val __obj = js.Dynamic.literal(ParameterGroupName = ParameterGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteClusterParameterGroupMessage]
  }
  @scala.inline
  implicit class DeleteClusterParameterGroupMessageOps[Self <: DeleteClusterParameterGroupMessage] (val x: Self) extends AnyVal {
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
  }
  
}

