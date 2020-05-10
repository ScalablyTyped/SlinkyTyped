package typingsSlinky.reactNative.parseErrorStackMod

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtendedError extends Error {
  var framesToPop: js.UndefOr[Double] = js.native
}

object ExtendedError {
  @scala.inline
  def apply(message: String, name: String): ExtendedError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedError]
  }
  @scala.inline
  implicit class ExtendedErrorOps[Self <: ExtendedError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFramesToPop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("framesToPop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFramesToPop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("framesToPop")(js.undefined)
        ret
    }
  }
  
}

