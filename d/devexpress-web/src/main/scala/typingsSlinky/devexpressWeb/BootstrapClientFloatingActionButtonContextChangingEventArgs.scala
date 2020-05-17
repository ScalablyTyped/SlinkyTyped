package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BootstrapClientFloatingActionButtonContextChangingEventArgs extends ASPxClientFloatingActionButtonContextChangingEventArgs {
  @JSName("action")
  var action_BootstrapClientFloatingActionButtonContextChangingEventArgs: BootstrapClientFABAction = js.native
}

object BootstrapClientFloatingActionButtonContextChangingEventArgs {
  @scala.inline
  def apply(action: BootstrapClientFABAction): BootstrapClientFloatingActionButtonContextChangingEventArgs = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapClientFloatingActionButtonContextChangingEventArgs]
  }
  @scala.inline
  implicit class BootstrapClientFloatingActionButtonContextChangingEventArgsOps[Self <: BootstrapClientFloatingActionButtonContextChangingEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: BootstrapClientFABAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

