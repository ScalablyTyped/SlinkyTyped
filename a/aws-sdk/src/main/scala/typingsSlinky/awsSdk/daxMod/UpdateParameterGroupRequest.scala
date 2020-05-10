package typingsSlinky.awsSdk.daxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateParameterGroupRequest extends js.Object {
  /**
    * The name of the parameter group.
    */
  var ParameterGroupName: String = js.native
  /**
    * An array of name-value pairs for the parameters in the group. Each element in the array represents a single parameter.
    */
  var ParameterNameValues: ParameterNameValueList = js.native
}

object UpdateParameterGroupRequest {
  @scala.inline
  def apply(ParameterGroupName: String, ParameterNameValues: ParameterNameValueList): UpdateParameterGroupRequest = {
    val __obj = js.Dynamic.literal(ParameterGroupName = ParameterGroupName.asInstanceOf[js.Any], ParameterNameValues = ParameterNameValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateParameterGroupRequest]
  }
  @scala.inline
  implicit class UpdateParameterGroupRequestOps[Self <: UpdateParameterGroupRequest] (val x: Self) extends AnyVal {
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
    def withParameterNameValues(value: ParameterNameValueList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParameterNameValues")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

