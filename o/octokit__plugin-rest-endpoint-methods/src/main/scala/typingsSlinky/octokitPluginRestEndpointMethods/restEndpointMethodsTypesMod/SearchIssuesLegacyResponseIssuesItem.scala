package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchIssuesLegacyResponseIssuesItem extends js.Object {
  var body: String = js.native
  var comments: Double = js.native
  var created_at: String = js.native
  var gravatar_id: String = js.native
  var html_url: String = js.native
  var labels: js.Array[String] = js.native
  var number: Double = js.native
  var position: Double = js.native
  var state: String = js.native
  var title: String = js.native
  var updated_at: String = js.native
  var user: String = js.native
  var votes: Double = js.native
}

object SearchIssuesLegacyResponseIssuesItem {
  @scala.inline
  def apply(
    body: String,
    comments: Double,
    created_at: String,
    gravatar_id: String,
    html_url: String,
    labels: js.Array[String],
    number: Double,
    position: Double,
    state: String,
    title: String,
    updated_at: String,
    user: String,
    votes: Double
  ): SearchIssuesLegacyResponseIssuesItem = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], comments = comments.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], gravatar_id = gravatar_id.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], votes = votes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchIssuesLegacyResponseIssuesItem]
  }
  @scala.inline
  implicit class SearchIssuesLegacyResponseIssuesItemOps[Self <: SearchIssuesLegacyResponseIssuesItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComments(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreated_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGravatar_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gravatar_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHtml_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabels(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdated_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVotes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("votes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

