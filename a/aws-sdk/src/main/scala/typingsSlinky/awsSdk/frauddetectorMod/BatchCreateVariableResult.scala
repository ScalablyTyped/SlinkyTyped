package typingsSlinky.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchCreateVariableResult extends js.Object {
  /**
    * Provides the errors for the BatchCreateVariable request.
    */
  var errors: js.UndefOr[BatchCreateVariableErrorList] = js.native
}

object BatchCreateVariableResult {
  @scala.inline
  def apply(): BatchCreateVariableResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchCreateVariableResult]
  }
  @scala.inline
  implicit class BatchCreateVariableResultOps[Self <: BatchCreateVariableResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrors(value: BatchCreateVariableErrorList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(js.undefined)
        ret
    }
  }
  
}

