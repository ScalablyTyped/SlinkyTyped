package typingsSlinky.naverWhale.whale.gcm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IncomingMessage extends js.Object {
  /**
    * Optional.
    * The collapse key of a message. See Collapsible Messages section of Cloud Messaging documentation for details.
    */
  var collapseKey: js.UndefOr[String] = js.native
  /** The message data. */
  var data: js.Object = js.native
  /**
    * Optional.
    * The sender who issued the message.
    * @since Since Chrome 41.
    */
  var from: js.UndefOr[String] = js.native
}

object IncomingMessage {
  @scala.inline
  def apply(data: js.Object): IncomingMessage = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncomingMessage]
  }
  @scala.inline
  implicit class IncomingMessageOps[Self <: IncomingMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCollapseKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapseKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseKey")(js.undefined)
        ret
    }
    @scala.inline
    def withFrom(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(js.undefined)
        ret
    }
  }
  
}

