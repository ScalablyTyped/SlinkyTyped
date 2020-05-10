package typingsSlinky.nodeZendesk.mod.Requests

import typingsSlinky.nodeZendesk.mod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://developer.zendesk.com/rest_api/docs/support/requests#update-request|Zendesk Requests Update}
  */
@js.native
trait UpdateModel extends js.Object {
  var additional_collaborators: js.UndefOr[js.Array[Collaborator | String | ZendeskID]] = js.native
  var comment: js.UndefOr[typingsSlinky.nodeZendesk.mod.Requests.Comments.CreateModel] = js.native
  var solved: js.UndefOr[Boolean] = js.native
}

object UpdateModel {
  @scala.inline
  def apply(): UpdateModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateModel]
  }
  @scala.inline
  implicit class UpdateModelOps[Self <: UpdateModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditional_collaborators(value: js.Array[Collaborator | String | ZendeskID]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additional_collaborators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditional_collaborators: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additional_collaborators")(js.undefined)
        ret
    }
    @scala.inline
    def withComment(value: typingsSlinky.nodeZendesk.mod.Requests.Comments.CreateModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(js.undefined)
        ret
    }
    @scala.inline
    def withSolved(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("solved")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSolved: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("solved")(js.undefined)
        ret
    }
  }
  
}

