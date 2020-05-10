package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChecksCreateSuiteResponse extends js.Object {
  var after: String = js.native
  var app: ChecksCreateSuiteResponseApp = js.native
  var before: String = js.native
  var conclusion: String = js.native
  var head_branch: String = js.native
  var head_sha: String = js.native
  var id: Double = js.native
  var node_id: String = js.native
  var pull_requests: js.Array[_] = js.native
  var repository: ChecksCreateSuiteResponseRepository = js.native
  var status: String = js.native
  var url: String = js.native
}

object ChecksCreateSuiteResponse {
  @scala.inline
  def apply(
    after: String,
    app: ChecksCreateSuiteResponseApp,
    before: String,
    conclusion: String,
    head_branch: String,
    head_sha: String,
    id: Double,
    node_id: String,
    pull_requests: js.Array[_],
    repository: ChecksCreateSuiteResponseRepository,
    status: String,
    url: String
  ): ChecksCreateSuiteResponse = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], app = app.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], conclusion = conclusion.asInstanceOf[js.Any], head_branch = head_branch.asInstanceOf[js.Any], head_sha = head_sha.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], pull_requests = pull_requests.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChecksCreateSuiteResponse]
  }
  @scala.inline
  implicit class ChecksCreateSuiteResponseOps[Self <: ChecksCreateSuiteResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApp(value: ChecksCreateSuiteResponseApp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBefore(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConclusion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conclusion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHead_branch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("head_branch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHead_sha(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("head_sha")(value.asInstanceOf[js.Any])
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
    def withPull_requests(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pull_requests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepository(value: ChecksCreateSuiteResponseRepository): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repository")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
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

