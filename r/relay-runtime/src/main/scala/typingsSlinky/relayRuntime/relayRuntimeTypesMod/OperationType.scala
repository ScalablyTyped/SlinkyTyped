package typingsSlinky.relayRuntime.relayRuntimeTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OperationType extends js.Object {
  val rawResponse: js.UndefOr[js.Any] = js.native
  val response: js.Any = js.native
  val variables: Variables = js.native
}

object OperationType {
  @scala.inline
  def apply(response: js.Any, variables: Variables): OperationType = {
    val __obj = js.Dynamic.literal(response = response.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationType]
  }
  @scala.inline
  implicit class OperationTypeOps[Self <: OperationType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResponse(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVariables(value: Variables): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRawResponse(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRawResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawResponse")(js.undefined)
        ret
    }
  }
  
}

