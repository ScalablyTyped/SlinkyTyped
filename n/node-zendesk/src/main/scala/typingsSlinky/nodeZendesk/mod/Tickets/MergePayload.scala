package typingsSlinky.nodeZendesk.mod.Tickets

import typingsSlinky.nodeZendesk.mod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MergePayload extends js.Object {
  val ids: js.Array[ZendeskID] = js.native
  val source_comment: js.UndefOr[String | Null] = js.native
  val target_comment: js.UndefOr[String | Null] = js.native
}

object MergePayload {
  @scala.inline
  def apply(ids: js.Array[ZendeskID]): MergePayload = {
    val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[MergePayload]
  }
  @scala.inline
  implicit class MergePayloadOps[Self <: MergePayload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIds(value: js.Array[ZendeskID]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource_comment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source_comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource_comment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source_comment")(js.undefined)
        ret
    }
    @scala.inline
    def withSource_commentNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source_comment")(null)
        ret
    }
    @scala.inline
    def withTarget_comment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target_comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget_comment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target_comment")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget_commentNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target_comment")(null)
        ret
    }
  }
  
}

