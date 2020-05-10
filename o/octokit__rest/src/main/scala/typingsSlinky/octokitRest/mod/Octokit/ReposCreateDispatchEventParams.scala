package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposCreateDispatchEventParams extends js.Object {
  /**
    * JSON payload with extra information about the webhook event that your action or worklow may use.
    */
  var client_payload: js.UndefOr[ReposCreateDispatchEventParamsClientPayload] = js.native
  /**
    * **Required:** A custom webhook event name.
    */
  var event_type: js.UndefOr[String] = js.native
  var owner: String = js.native
  var repo: String = js.native
}

object ReposCreateDispatchEventParams {
  @scala.inline
  def apply(owner: String, repo: String): ReposCreateDispatchEventParams = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposCreateDispatchEventParams]
  }
  @scala.inline
  implicit class ReposCreateDispatchEventParamsOps[Self <: ReposCreateDispatchEventParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOwner(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClient_payload(value: ReposCreateDispatchEventParamsClientPayload): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_payload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient_payload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_payload")(js.undefined)
        ret
    }
    @scala.inline
    def withEvent_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvent_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event_type")(js.undefined)
        ret
    }
  }
  
}

