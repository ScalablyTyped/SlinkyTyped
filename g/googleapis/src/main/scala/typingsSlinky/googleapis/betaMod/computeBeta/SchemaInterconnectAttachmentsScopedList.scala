package typingsSlinky.googleapis.betaMod.computeBeta

import typingsSlinky.googleapis.AnonCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaInterconnectAttachmentsScopedList extends js.Object {
  /**
    * A list of interconnect attachments contained in this scope.
    */
  var interconnectAttachments: js.UndefOr[js.Array[SchemaInterconnectAttachment]] = js.native
  /**
    * Informational warning which replaces the list of addresses when the list
    * is empty.
    */
  var warning: js.UndefOr[AnonCode] = js.native
}

object SchemaInterconnectAttachmentsScopedList {
  @scala.inline
  def apply(): SchemaInterconnectAttachmentsScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInterconnectAttachmentsScopedList]
  }
  @scala.inline
  implicit class SchemaInterconnectAttachmentsScopedListOps[Self <: SchemaInterconnectAttachmentsScopedList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInterconnectAttachments(value: js.Array[SchemaInterconnectAttachment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interconnectAttachments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterconnectAttachments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interconnectAttachments")(js.undefined)
        ret
    }
    @scala.inline
    def withWarning(value: AnonCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWarning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warning")(js.undefined)
        ret
    }
  }
  
}

