package typingsSlinky.datatablesNetKeytable.anon

import typingsSlinky.datatablesNetKeytable.DataTables.Api
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Disable extends js.Object {
  /*
    * Disable KeyTable's interactions (mouse and keyboard)
    */
  def disable(): Api = js.native
  /*
    * Enable or disable KeyTable's interactions (mouse and keyboard)
    */
  def enable(): Api = js.native
}

object Disable {
  @scala.inline
  def apply(disable: () => Api, enable: () => Api): Disable = {
    val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable))
    __obj.asInstanceOf[Disable]
  }
  @scala.inline
  implicit class DisableOps[Self <: Disable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisable(value: () => Api): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEnable(value: () => Api): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

