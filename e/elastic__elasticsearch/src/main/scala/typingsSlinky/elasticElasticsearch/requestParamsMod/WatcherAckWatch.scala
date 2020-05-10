package typingsSlinky.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WatcherAckWatch extends Generic {
  var action_id: js.UndefOr[String | js.Array[String]] = js.native
  var watch_id: String = js.native
}

object WatcherAckWatch {
  @scala.inline
  def apply(watch_id: String): WatcherAckWatch = {
    val __obj = js.Dynamic.literal(watch_id = watch_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherAckWatch]
  }
  @scala.inline
  implicit class WatcherAckWatchOps[Self <: WatcherAckWatch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWatch_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watch_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAction_id(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAction_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action_id")(js.undefined)
        ret
    }
  }
  
}

