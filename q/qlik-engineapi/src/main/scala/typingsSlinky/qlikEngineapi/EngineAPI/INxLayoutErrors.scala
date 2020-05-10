package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxLayoutErrors...
  */
@js.native
trait INxLayoutErrors extends js.Object {
  /**
    * Error code  <Integer>
    */
  var ErrorCode: Double = js.native
}

object INxLayoutErrors {
  @scala.inline
  def apply(ErrorCode: Double): INxLayoutErrors = {
    val __obj = js.Dynamic.literal(ErrorCode = ErrorCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxLayoutErrors]
  }
  @scala.inline
  implicit class INxLayoutErrorsOps[Self <: INxLayoutErrors] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorCode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

