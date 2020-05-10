package typingsSlinky.awsSdk.neptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResetDBParameterGroupMessage extends js.Object {
  /**
    * The name of the DB parameter group. Constraints:   Must match the name of an existing DBParameterGroup.  
    */
  var DBParameterGroupName: String = js.native
  /**
    * To reset the entire DB parameter group, specify the DBParameterGroup name and ResetAllParameters parameters. To reset specific parameters, provide a list of the following: ParameterName and ApplyMethod. A maximum of 20 parameters can be modified in a single request. Valid Values (for Apply method): pending-reboot 
    */
  var Parameters: js.UndefOr[ParametersList] = js.native
  /**
    * Specifies whether (true) or not (false) to reset all parameters in the DB parameter group to default values. Default: true 
    */
  var ResetAllParameters: js.UndefOr[Boolean] = js.native
}

object ResetDBParameterGroupMessage {
  @scala.inline
  def apply(DBParameterGroupName: String): ResetDBParameterGroupMessage = {
    val __obj = js.Dynamic.literal(DBParameterGroupName = DBParameterGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResetDBParameterGroupMessage]
  }
  @scala.inline
  implicit class ResetDBParameterGroupMessageOps[Self <: ResetDBParameterGroupMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDBParameterGroupName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBParameterGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParameters(value: ParametersList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parameters")(js.undefined)
        ret
    }
    @scala.inline
    def withResetAllParameters(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResetAllParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResetAllParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResetAllParameters")(js.undefined)
        ret
    }
  }
  
}

