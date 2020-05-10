package typingsSlinky.angularAgility.aa

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INotifyOptions extends js.Object {
  var allowHtml: Boolean = js.native
  var cssClasses: js.UndefOr[String] = js.native
  var message: String = js.native
  var messageType: String = js.native
}

object INotifyOptions {
  @scala.inline
  def apply(allowHtml: Boolean, message: String, messageType: String): INotifyOptions = {
    val __obj = js.Dynamic.literal(allowHtml = allowHtml.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], messageType = messageType.asInstanceOf[js.Any])
    __obj.asInstanceOf[INotifyOptions]
  }
  @scala.inline
  implicit class INotifyOptionsOps[Self <: INotifyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowHtml(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowHtml")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessageType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCssClasses(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClasses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssClasses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClasses")(js.undefined)
        ret
    }
  }
  
}

