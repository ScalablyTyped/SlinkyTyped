package typingsSlinky.instagramPrivateApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<instagram-private-api.instagram-private-api/dist/responses.DirectInboxFeedResponseThreadsItem, 'thread_id' | 'oldest_cursor'> */
@js.native
trait PickDirectInboxFeedRespon extends js.Object {
  var oldest_cursor: String = js.native
  var thread_id: String = js.native
}

object PickDirectInboxFeedRespon {
  @scala.inline
  def apply(oldest_cursor: String, thread_id: String): PickDirectInboxFeedRespon = {
    val __obj = js.Dynamic.literal(oldest_cursor = oldest_cursor.asInstanceOf[js.Any], thread_id = thread_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickDirectInboxFeedRespon]
  }
  @scala.inline
  implicit class PickDirectInboxFeedResponOps[Self <: PickDirectInboxFeedRespon] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOldest_cursor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldest_cursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThread_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thread_id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

