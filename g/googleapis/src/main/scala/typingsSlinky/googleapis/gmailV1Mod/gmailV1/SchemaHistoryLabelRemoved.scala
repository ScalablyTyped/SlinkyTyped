package typingsSlinky.googleapis.gmailV1Mod.gmailV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaHistoryLabelRemoved extends js.Object {
  /**
    * Label IDs removed from the message.
    */
  var labelIds: js.UndefOr[js.Array[String]] = js.native
  var message: js.UndefOr[SchemaMessage] = js.native
}

object SchemaHistoryLabelRemoved {
  @scala.inline
  def apply(): SchemaHistoryLabelRemoved = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHistoryLabelRemoved]
  }
  @scala.inline
  implicit class SchemaHistoryLabelRemovedOps[Self <: SchemaHistoryLabelRemoved] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabelIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelIds")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: SchemaMessage): Self = {
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

