package typingsSlinky.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnDestroy extends js.Object {
  /**
    * A callback method that performs custom clean-up, invoked immediately
    * after a directive, pipe, or service instance is destroyed.
    */
  def ngOnDestroy(): Unit = js.native
}

object OnDestroy {
  @scala.inline
  def apply(ngOnDestroy: () => Unit): OnDestroy = {
    val __obj = js.Dynamic.literal(ngOnDestroy = js.Any.fromFunction0(ngOnDestroy))
    __obj.asInstanceOf[OnDestroy]
  }
  @scala.inline
  implicit class OnDestroyOps[Self <: OnDestroy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNgOnDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ngOnDestroy")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

