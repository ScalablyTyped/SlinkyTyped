package typingsSlinky.log4javascript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAppendResult extends js.Object {
  var appendResult: Boolean = js.native
  var isError: Boolean = js.native
}

object AnonAppendResult {
  @scala.inline
  def apply(appendResult: Boolean, isError: Boolean): AnonAppendResult = {
    val __obj = js.Dynamic.literal(appendResult = appendResult.asInstanceOf[js.Any], isError = isError.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAppendResult]
  }
  @scala.inline
  implicit class AnonAppendResultOps[Self <: AnonAppendResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppendResult(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isError")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

