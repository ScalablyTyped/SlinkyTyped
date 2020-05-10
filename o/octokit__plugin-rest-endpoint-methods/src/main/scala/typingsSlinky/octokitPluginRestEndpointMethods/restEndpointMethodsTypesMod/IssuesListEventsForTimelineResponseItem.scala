package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IssuesListEventsForTimelineResponseItem extends js.Object {
  var actor: IssuesListEventsForTimelineResponseItemActor = js.native
  var commit_id: String = js.native
  var commit_url: String = js.native
  var created_at: String = js.native
  var event: String = js.native
  var id: Double = js.native
  var node_id: String = js.native
  var url: String = js.native
}

object IssuesListEventsForTimelineResponseItem {
  @scala.inline
  def apply(
    actor: IssuesListEventsForTimelineResponseItemActor,
    commit_id: String,
    commit_url: String,
    created_at: String,
    event: String,
    id: Double,
    node_id: String,
    url: String
  ): IssuesListEventsForTimelineResponseItem = {
    val __obj = js.Dynamic.literal(actor = actor.asInstanceOf[js.Any], commit_id = commit_id.asInstanceOf[js.Any], commit_url = commit_url.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuesListEventsForTimelineResponseItem]
  }
  @scala.inline
  implicit class IssuesListEventsForTimelineResponseItemOps[Self <: IssuesListEventsForTimelineResponseItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActor(value: IssuesListEventsForTimelineResponseItemActor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommit_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commit_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommit_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commit_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreated_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNode_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

