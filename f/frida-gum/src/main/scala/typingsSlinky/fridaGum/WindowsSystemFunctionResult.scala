package typingsSlinky.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowsSystemFunctionResult extends SystemFunctionResult {
  var lastError: Double = js.native
  var value: NativeReturnValue = js.native
}

object WindowsSystemFunctionResult {
  @scala.inline
  def apply(lastError: Double, value: NativeReturnValue): WindowsSystemFunctionResult = {
    val __obj = js.Dynamic.literal(lastError = lastError.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowsSystemFunctionResult]
  }
  @scala.inline
  implicit class WindowsSystemFunctionResultOps[Self <: WindowsSystemFunctionResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLastError(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: NativeReturnValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

