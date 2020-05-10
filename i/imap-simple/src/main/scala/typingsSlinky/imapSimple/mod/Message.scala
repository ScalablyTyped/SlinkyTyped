package typingsSlinky.imapSimple.mod

import typingsSlinky.imap.mod.ImapMessageAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Message extends js.Object {
  var attributes: ImapMessageAttributes = js.native
  var parts: js.Array[MessageBodyPart] = js.native
  var seqno: Double = js.native
}

object Message {
  @scala.inline
  def apply(attributes: ImapMessageAttributes, parts: js.Array[MessageBodyPart], seqno: Double): Message = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], parts = parts.asInstanceOf[js.Any], seqno = seqno.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
  @scala.inline
  implicit class MessageOps[Self <: Message] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: ImapMessageAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParts(value: js.Array[MessageBodyPart]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeqno(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seqno")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

