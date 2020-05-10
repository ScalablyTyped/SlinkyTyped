package typingsSlinky.jspdf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonReturnPromise extends js.Object {
  var returnPromise: Boolean = js.native
}

object AnonReturnPromise {
  @scala.inline
  def apply(returnPromise: Boolean): AnonReturnPromise = {
    val __obj = js.Dynamic.literal(returnPromise = returnPromise.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonReturnPromise]
  }
  @scala.inline
  implicit class AnonReturnPromiseOps[Self <: AnonReturnPromise] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReturnPromise(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnPromise")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

