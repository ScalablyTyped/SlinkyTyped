package typingsSlinky.axiosCancel.mod.axiosAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AxiosStatic extends js.Object {
  def cancel(requestId: String): Unit = js.native
  def cancelAll(): Unit = js.native
}

object AxiosStatic {
  @scala.inline
  def apply(cancel: String => Unit, cancelAll: () => Unit): AxiosStatic = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1(cancel), cancelAll = js.Any.fromFunction0(cancelAll))
    __obj.asInstanceOf[AxiosStatic]
  }
  @scala.inline
  implicit class AxiosStaticOps[Self <: AxiosStatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCancelAll(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelAll")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

