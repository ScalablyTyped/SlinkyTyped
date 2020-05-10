package typingsSlinky.googleapis.bigquerydatatransferV1Mod.bigquerydatatransferV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a user facing message for a particular data transfer run.
  */
@js.native
trait SchemaTransferMessage extends js.Object {
  /**
    * Message text.
    */
  var messageText: js.UndefOr[String] = js.native
  /**
    * Time when message was logged.
    */
  var messageTime: js.UndefOr[String] = js.native
  /**
    * Message severity.
    */
  var severity: js.UndefOr[String] = js.native
}

object SchemaTransferMessage {
  @scala.inline
  def apply(): SchemaTransferMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTransferMessage]
  }
  @scala.inline
  implicit class SchemaTransferMessageOps[Self <: SchemaTransferMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessageText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageText")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageTime")(js.undefined)
        ret
    }
    @scala.inline
    def withSeverity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("severity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeverity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("severity")(js.undefined)
        ret
    }
  }
  
}

