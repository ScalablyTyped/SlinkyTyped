package typingsSlinky.apolloEngineReporting.agentMod

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VariableValueTransformOptions extends js.Object {
  var operationString: js.UndefOr[String] = js.native
  var variables: Record[String, _] = js.native
}

object VariableValueTransformOptions {
  @scala.inline
  def apply(variables: Record[String, _]): VariableValueTransformOptions = {
    val __obj = js.Dynamic.literal(variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariableValueTransformOptions]
  }
  @scala.inline
  implicit class VariableValueTransformOptionsOps[Self <: VariableValueTransformOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVariables(value: Record[String, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperationString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperationString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationString")(js.undefined)
        ret
    }
  }
  
}

