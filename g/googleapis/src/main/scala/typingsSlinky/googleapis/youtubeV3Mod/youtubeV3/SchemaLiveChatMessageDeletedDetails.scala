package typingsSlinky.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaLiveChatMessageDeletedDetails extends js.Object {
  var deletedMessageId: js.UndefOr[String] = js.native
}

object SchemaLiveChatMessageDeletedDetails {
  @scala.inline
  def apply(): SchemaLiveChatMessageDeletedDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiveChatMessageDeletedDetails]
  }
  @scala.inline
  implicit class SchemaLiveChatMessageDeletedDetailsOps[Self <: SchemaLiveChatMessageDeletedDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeletedMessageId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletedMessageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeletedMessageId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletedMessageId")(js.undefined)
        ret
    }
  }
  
}

