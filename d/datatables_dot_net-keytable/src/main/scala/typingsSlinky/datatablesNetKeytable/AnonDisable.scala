package typingsSlinky.datatablesNetKeytable

import typingsSlinky.datatablesNetKeytable.DataTables.Api
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDisable extends js.Object {
  /*
    * Disable KeyTable's interactions (mouse and keyboard)
    */
  def disable(): Api = js.native
  /*
    * Enable or disable KeyTable's interactions (mouse and keyboard)
    */
  def enable(): Api = js.native
}

object AnonDisable {
  @scala.inline
  def apply(disable: () => Api, enable: () => Api): AnonDisable = {
    val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable))
    __obj.asInstanceOf[AnonDisable]
  }
  @scala.inline
  implicit class AnonDisableOps[Self <: AnonDisable] (val x: Self) extends AnyVal {
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

