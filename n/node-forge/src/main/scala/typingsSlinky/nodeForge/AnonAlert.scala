package typingsSlinky.nodeForge

import typingsSlinky.nodeForge.mod.tls.Alert.Description
import typingsSlinky.nodeForge.mod.tls.Verified
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAlert extends Verified {
  var alert: js.UndefOr[Description] = js.native
  var message: js.UndefOr[String] = js.native
}

object AnonAlert {
  @scala.inline
  def apply(): AnonAlert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAlert]
  }
  @scala.inline
  implicit class AnonAlertOps[Self <: AnonAlert] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlert(value: Description): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alert")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
  }
  
}

