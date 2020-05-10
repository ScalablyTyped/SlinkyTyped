package typingsSlinky.jupyterlabExtensionmanager.modelMod

import typingsSlinky.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.error
import typingsSlinky.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.ok
import typingsSlinky.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IActionReply extends js.Object {
  /**
    * An optional message when the status is not 'ok'.
    */
  var message: js.UndefOr[String] = js.native
  /**
    * The status category of the reply.
    */
  var status: ok | warning | error | Null = js.native
}

object IActionReply {
  @scala.inline
  def apply(): IActionReply = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IActionReply]
  }
  @scala.inline
  implicit class IActionReplyOps[Self <: IActionReply] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withStatus(value: ok | warning | error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatusNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(null)
        ret
    }
  }
  
}

