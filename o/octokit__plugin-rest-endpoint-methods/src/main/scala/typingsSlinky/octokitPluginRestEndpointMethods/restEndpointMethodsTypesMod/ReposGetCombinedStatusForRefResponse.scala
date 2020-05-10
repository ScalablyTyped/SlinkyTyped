package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposGetCombinedStatusForRefResponse extends js.Object {
  var commit_url: String = js.native
  var repository: ReposGetCombinedStatusForRefResponseRepository = js.native
  var sha: String = js.native
  var state: String = js.native
  var statuses: js.Array[ReposGetCombinedStatusForRefResponseStatusesItem] = js.native
  var total_count: Double = js.native
  var url: String = js.native
}

object ReposGetCombinedStatusForRefResponse {
  @scala.inline
  def apply(
    commit_url: String,
    repository: ReposGetCombinedStatusForRefResponseRepository,
    sha: String,
    state: String,
    statuses: js.Array[ReposGetCombinedStatusForRefResponseStatusesItem],
    total_count: Double,
    url: String
  ): ReposGetCombinedStatusForRefResponse = {
    val __obj = js.Dynamic.literal(commit_url = commit_url.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], statuses = statuses.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetCombinedStatusForRefResponse]
  }
  @scala.inline
  implicit class ReposGetCombinedStatusForRefResponseOps[Self <: ReposGetCombinedStatusForRefResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommit_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commit_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepository(value: ReposGetCombinedStatusForRefResponseRepository): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repository")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSha(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatuses(value: js.Array[ReposGetCombinedStatusForRefResponseStatusesItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statuses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_count")(value.asInstanceOf[js.Any])
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

