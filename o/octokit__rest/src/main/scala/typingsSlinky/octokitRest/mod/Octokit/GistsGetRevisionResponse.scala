package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GistsGetRevisionResponse extends js.Object {
  var comments: Double = js.native
  var comments_url: String = js.native
  var commits_url: String = js.native
  var created_at: String = js.native
  var description: String = js.native
  var files: GistsGetRevisionResponseFiles = js.native
  var forks: js.Array[GistsGetRevisionResponseForksItem] = js.native
  var forks_url: String = js.native
  var git_pull_url: String = js.native
  var git_push_url: String = js.native
  var history: js.Array[GistsGetRevisionResponseHistoryItem] = js.native
  var html_url: String = js.native
  var id: String = js.native
  var node_id: String = js.native
  var owner: GistsGetRevisionResponseOwner = js.native
  var public: Boolean = js.native
  var truncated: Boolean = js.native
  var updated_at: String = js.native
  var url: String = js.native
  var user: Null = js.native
}

object GistsGetRevisionResponse {
  @scala.inline
  def apply(
    comments: Double,
    comments_url: String,
    commits_url: String,
    created_at: String,
    description: String,
    files: GistsGetRevisionResponseFiles,
    forks: js.Array[GistsGetRevisionResponseForksItem],
    forks_url: String,
    git_pull_url: String,
    git_push_url: String,
    history: js.Array[GistsGetRevisionResponseHistoryItem],
    html_url: String,
    id: String,
    node_id: String,
    owner: GistsGetRevisionResponseOwner,
    public: Boolean,
    truncated: Boolean,
    updated_at: String,
    url: String,
    user: Null
  ): GistsGetRevisionResponse = {
    val __obj = js.Dynamic.literal(comments = comments.asInstanceOf[js.Any], comments_url = comments_url.asInstanceOf[js.Any], commits_url = commits_url.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], forks = forks.asInstanceOf[js.Any], forks_url = forks_url.asInstanceOf[js.Any], git_pull_url = git_pull_url.asInstanceOf[js.Any], git_push_url = git_push_url.asInstanceOf[js.Any], history = history.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any], truncated = truncated.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[GistsGetRevisionResponse]
  }
  @scala.inline
  implicit class GistsGetRevisionResponseOps[Self <: GistsGetRevisionResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComments(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComments_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommits_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commits_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreated_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFiles(value: GistsGetRevisionResponseFiles): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForks(value: js.Array[GistsGetRevisionResponseForksItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForks_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forks_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGit_pull_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("git_pull_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGit_push_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("git_push_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHistory(value: js.Array[GistsGetRevisionResponseHistoryItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("history")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHtml_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
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
    def withOwner(value: GistsGetRevisionResponseOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("public")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTruncated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("truncated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdated_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

