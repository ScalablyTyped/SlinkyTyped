package typingsSlinky.ibmMobilefirst.WL.Client

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProcedureInvocationResult extends js.Object {
  var errors: js.UndefOr[js.Array[String]] = js.native
  var isSuccessful: Boolean = js.native
}

object ProcedureInvocationResult {
  @scala.inline
  def apply(isSuccessful: Boolean): ProcedureInvocationResult = {
    val __obj = js.Dynamic.literal(isSuccessful = isSuccessful.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcedureInvocationResult]
  }
  @scala.inline
  implicit class ProcedureInvocationResultOps[Self <: ProcedureInvocationResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsSuccessful(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSuccessful")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrors(value: js.Array[String]): Self = {
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

