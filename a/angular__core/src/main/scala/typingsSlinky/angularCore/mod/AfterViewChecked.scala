package typingsSlinky.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AfterViewChecked extends js.Object {
  /**
    * A callback method that is invoked immediately after the
    * default change detector has completed one change-check cycle
    * for a component's view.
    */
  def ngAfterViewChecked(): Unit = js.native
}

object AfterViewChecked {
  @scala.inline
  def apply(ngAfterViewChecked: () => Unit): AfterViewChecked = {
    val __obj = js.Dynamic.literal(ngAfterViewChecked = js.Any.fromFunction0(ngAfterViewChecked))
    __obj.asInstanceOf[AfterViewChecked]
  }
  @scala.inline
  implicit class AfterViewCheckedOps[Self <: AfterViewChecked] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNgAfterViewChecked(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ngAfterViewChecked")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

