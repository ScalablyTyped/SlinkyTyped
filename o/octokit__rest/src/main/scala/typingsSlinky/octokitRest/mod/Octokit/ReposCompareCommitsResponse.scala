package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposCompareCommitsResponse extends js.Object {
  var ahead_by: Double = js.native
  var base_commit: ReposCompareCommitsResponseBaseCommit = js.native
  var behind_by: Double = js.native
  var commits: js.Array[ReposCompareCommitsResponseCommitsItem] = js.native
  var diff_url: String = js.native
  var files: js.Array[ReposCompareCommitsResponseFilesItem] = js.native
  var html_url: String = js.native
  var merge_base_commit: ReposCompareCommitsResponseMergeBaseCommit = js.native
  var patch_url: String = js.native
  var permalink_url: String = js.native
  var status: String = js.native
  var total_commits: Double = js.native
  var url: String = js.native
}

object ReposCompareCommitsResponse {
  @scala.inline
  def apply(
    ahead_by: Double,
    base_commit: ReposCompareCommitsResponseBaseCommit,
    behind_by: Double,
    commits: js.Array[ReposCompareCommitsResponseCommitsItem],
    diff_url: String,
    files: js.Array[ReposCompareCommitsResponseFilesItem],
    html_url: String,
    merge_base_commit: ReposCompareCommitsResponseMergeBaseCommit,
    patch_url: String,
    permalink_url: String,
    status: String,
    total_commits: Double,
    url: String
  ): ReposCompareCommitsResponse = {
    val __obj = js.Dynamic.literal(ahead_by = ahead_by.asInstanceOf[js.Any], base_commit = base_commit.asInstanceOf[js.Any], behind_by = behind_by.asInstanceOf[js.Any], commits = commits.asInstanceOf[js.Any], diff_url = diff_url.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], merge_base_commit = merge_base_commit.asInstanceOf[js.Any], patch_url = patch_url.asInstanceOf[js.Any], permalink_url = permalink_url.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], total_commits = total_commits.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposCompareCommitsResponse]
  }
  @scala.inline
  implicit class ReposCompareCommitsResponseOps[Self <: ReposCompareCommitsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAhead_by(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ahead_by")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBase_commit(value: ReposCompareCommitsResponseBaseCommit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base_commit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBehind_by(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("behind_by")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommits(value: js.Array[ReposCompareCommitsResponseCommitsItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDiff_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diff_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFiles(value: js.Array[ReposCompareCommitsResponseFilesItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHtml_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMerge_base_commit(value: ReposCompareCommitsResponseMergeBaseCommit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merge_base_commit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPatch_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPermalink_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permalink_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal_commits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_commits")(value.asInstanceOf[js.Any])
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

