package typingsSlinky.jspdf.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReturnPromise extends js.Object {
  var returnPromise: Boolean = js.native
}

object ReturnPromise {
  @scala.inline
  def apply(returnPromise: Boolean): ReturnPromise = {
    val __obj = js.Dynamic.literal(returnPromise = returnPromise.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnPromise]
  }
  @scala.inline
  implicit class ReturnPromiseOps[Self <: ReturnPromise] (val x: Self) extends AnyVal {
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

