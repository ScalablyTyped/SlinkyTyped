package typingsSlinky.node.inspectorMod.Debugger

import typingsSlinky.node.inspectorMod.Runtime.CallArgument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetVariableValueParameterType extends js.Object {
  /**
    * Id of callframe that holds variable.
    */
  var callFrameId: CallFrameId = js.native
  /**
    * New variable value.
    */
  var newValue: CallArgument = js.native
  /**
    * 0-based number of scope as was listed in scope chain. Only 'local', 'closure' and 'catch' scope types are allowed. Other scopes could be manipulated manually.
    */
  var scopeNumber: Double = js.native
  /**
    * Variable name.
    */
  var variableName: String = js.native
}

object SetVariableValueParameterType {
  @scala.inline
  def apply(callFrameId: CallFrameId, newValue: CallArgument, scopeNumber: Double, variableName: String): SetVariableValueParameterType = {
    val __obj = js.Dynamic.literal(callFrameId = callFrameId.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], scopeNumber = scopeNumber.asInstanceOf[js.Any], variableName = variableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetVariableValueParameterType]
  }
  @scala.inline
  implicit class SetVariableValueParameterTypeOps[Self <: SetVariableValueParameterType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallFrameId(value: CallFrameId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callFrameId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewValue(value: CallArgument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScopeNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopeNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVariableName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variableName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

