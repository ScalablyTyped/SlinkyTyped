package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActivityMarkNotificationsAsReadForRepoParams extends js.Object {
  /**
    * Describes the last point that notifications were checked. Anything updated since this time will not be updated. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`. Default: The current timestamp.
    */
  var last_read_at: js.UndefOr[String] = js.native
  var owner: String = js.native
  var repo: String = js.native
}

object ActivityMarkNotificationsAsReadForRepoParams {
  @scala.inline
  def apply(owner: String, repo: String): ActivityMarkNotificationsAsReadForRepoParams = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityMarkNotificationsAsReadForRepoParams]
  }
  @scala.inline
  implicit class ActivityMarkNotificationsAsReadForRepoParamsOps[Self <: ActivityMarkNotificationsAsReadForRepoParams] (val x: Self) extends AnyVal {
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
    def withLast_read_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_read_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLast_read_at: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_read_at")(js.undefined)
        ret
    }
  }
  
}

