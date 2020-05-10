package typingsSlinky.node.inspectorMod.Runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExceptionThrownEventDataType extends js.Object {
  var exceptionDetails: ExceptionDetails = js.native
  /**
    * Timestamp of the exception.
    */
  var timestamp: Timestamp = js.native
}

object ExceptionThrownEventDataType {
  @scala.inline
  def apply(exceptionDetails: ExceptionDetails, timestamp: Timestamp): ExceptionThrownEventDataType = {
    val __obj = js.Dynamic.literal(exceptionDetails = exceptionDetails.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExceptionThrownEventDataType]
  }
  @scala.inline
  implicit class ExceptionThrownEventDataTypeOps[Self <: ExceptionThrownEventDataType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExceptionDetails(value: ExceptionDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exceptionDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimestamp(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

