package typingsSlinky.instagramPrivateApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BroadcastId_ extends js.Object {
  var broadcastId: String = js.native
  var commentsRequested: js.UndefOr[Double] = js.native
  var lastCommentTs: js.UndefOr[String | Double] = js.native
}

object BroadcastId_ {
  @scala.inline
  def apply(broadcastId: String): BroadcastId_ = {
    val __obj = js.Dynamic.literal(broadcastId = broadcastId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BroadcastId_]
  }
  @scala.inline
  implicit class BroadcastId_Ops[Self <: BroadcastId_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBroadcastId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("broadcastId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommentsRequested(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commentsRequested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommentsRequested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commentsRequested")(js.undefined)
        ret
    }
    @scala.inline
    def withLastCommentTs(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastCommentTs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastCommentTs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastCommentTs")(js.undefined)
        ret
    }
  }
  
}

