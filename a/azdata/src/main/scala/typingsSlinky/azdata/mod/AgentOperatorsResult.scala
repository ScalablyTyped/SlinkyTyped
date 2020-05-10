package typingsSlinky.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgentOperatorsResult extends ResultStatus {
  var operators: js.Array[AgentOperatorInfo] = js.native
}

object AgentOperatorsResult {
  @scala.inline
  def apply(errorMessage: String, operators: js.Array[AgentOperatorInfo], success: Boolean): AgentOperatorsResult = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any], operators = operators.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentOperatorsResult]
  }
  @scala.inline
  implicit class AgentOperatorsResultOps[Self <: AgentOperatorsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOperators(value: js.Array[AgentOperatorInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operators")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

