package typingsSlinky.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnixSystemFunctionResult extends SystemFunctionResult {
  var errno: Double = js.native
  var value: NativeReturnValue = js.native
}

object UnixSystemFunctionResult {
  @scala.inline
  def apply(errno: Double, value: NativeReturnValue): UnixSystemFunctionResult = {
    val __obj = js.Dynamic.literal(errno = errno.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnixSystemFunctionResult]
  }
  @scala.inline
  implicit class UnixSystemFunctionResultOps[Self <: UnixSystemFunctionResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrno(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errno")(value.asInstanceOf[js.Any])
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

