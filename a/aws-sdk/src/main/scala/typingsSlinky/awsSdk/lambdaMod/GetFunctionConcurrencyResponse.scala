package typingsSlinky.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFunctionConcurrencyResponse extends js.Object {
  /**
    * The number of simultaneous executions that are reserved for the function.
    */
  var ReservedConcurrentExecutions: js.UndefOr[typingsSlinky.awsSdk.lambdaMod.ReservedConcurrentExecutions] = js.native
}

object GetFunctionConcurrencyResponse {
  @scala.inline
  def apply(): GetFunctionConcurrencyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFunctionConcurrencyResponse]
  }
  @scala.inline
  implicit class GetFunctionConcurrencyResponseOps[Self <: GetFunctionConcurrencyResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReservedConcurrentExecutions(value: ReservedConcurrentExecutions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservedConcurrentExecutions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReservedConcurrentExecutions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservedConcurrentExecutions")(js.undefined)
        ret
    }
  }
  
}

