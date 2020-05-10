package typingsSlinky.bootstrapMenu.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BootstrapMenu extends js.Object {
  /**
    * Close the context menu
    */
  def close(): Unit = js.native
  /**
    * Close the menu and remove every event listeners
    */
  def destroy(): Unit = js.native
}

object BootstrapMenu {
  @scala.inline
  def apply(close: () => Unit, destroy: () => Unit): BootstrapMenu = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), destroy = js.Any.fromFunction0(destroy))
    __obj.asInstanceOf[BootstrapMenu]
  }
  @scala.inline
  implicit class BootstrapMenuOps[Self <: BootstrapMenu] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

