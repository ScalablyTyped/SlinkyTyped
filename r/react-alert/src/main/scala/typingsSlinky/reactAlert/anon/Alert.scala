package typingsSlinky.reactAlert.anon

import typingsSlinky.reactAlert.mod.AlertManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Alert extends js.Object {
  var alert: AlertManager = js.native
}

object Alert {
  @scala.inline
  def apply(alert: AlertManager): Alert = {
    val __obj = js.Dynamic.literal(alert = alert.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alert]
  }
  @scala.inline
  implicit class AlertOps[Self <: Alert] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlert(value: AlertManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alert")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

