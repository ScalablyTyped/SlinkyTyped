package typingsSlinky.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A rich message format, including a human readable string, a key for
  * identifying the message, and structured data associated with the message
  * for programmatic consumption.
  */
@js.native
trait SchemaStructuredMessage extends js.Object {
  /**
    * Identifier for this message type.  Used by external systems to
    * internationalize or personalize message.
    */
  var messageKey: js.UndefOr[String] = js.native
  /**
    * Human-readable version of message.
    */
  var messageText: js.UndefOr[String] = js.native
  /**
    * The structured data associated with this message.
    */
  var parameters: js.UndefOr[js.Array[SchemaParameter]] = js.native
}

object SchemaStructuredMessage {
  @scala.inline
  def apply(): SchemaStructuredMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStructuredMessage]
  }
  @scala.inline
  implicit class SchemaStructuredMessageOps[Self <: SchemaStructuredMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessageKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageKey")(js.undefined)
        ret
    }
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
    def withParameters(value: js.Array[SchemaParameter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(js.undefined)
        ret
    }
  }
  
}

