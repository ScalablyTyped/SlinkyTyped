package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MigrationsUpdateImportResponse extends js.Object {
  var authors_count: js.UndefOr[Double] = js.native
  var authors_url: String = js.native
  var commit_count: js.UndefOr[Double] = js.native
  var has_large_files: js.UndefOr[Boolean] = js.native
  var html_url: String = js.native
  var large_files_count: js.UndefOr[Double] = js.native
  var large_files_size: js.UndefOr[Double] = js.native
  var percent: js.UndefOr[Double] = js.native
  var repository_url: String = js.native
  var status: String = js.native
  var status_text: js.UndefOr[String] = js.native
  var tfvc_project: js.UndefOr[String] = js.native
  var url: String = js.native
  var use_lfs: String = js.native
  var vcs: String = js.native
  var vcs_url: String = js.native
}

object MigrationsUpdateImportResponse {
  @scala.inline
  def apply(
    authors_url: String,
    html_url: String,
    repository_url: String,
    status: String,
    url: String,
    use_lfs: String,
    vcs: String,
    vcs_url: String
  ): MigrationsUpdateImportResponse = {
    val __obj = js.Dynamic.literal(authors_url = authors_url.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], repository_url = repository_url.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], use_lfs = use_lfs.asInstanceOf[js.Any], vcs = vcs.asInstanceOf[js.Any], vcs_url = vcs_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[MigrationsUpdateImportResponse]
  }
  @scala.inline
  implicit class MigrationsUpdateImportResponseOps[Self <: MigrationsUpdateImportResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthors_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authors_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHtml_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepository_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repository_url")(value.asInstanceOf[js.Any])
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
    @scala.inline
    def withUse_lfs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("use_lfs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVcs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vcs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVcs_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vcs_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthors_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authors_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthors_count: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authors_count")(js.undefined)
        ret
    }
    @scala.inline
    def withCommit_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commit_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommit_count: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commit_count")(js.undefined)
        ret
    }
    @scala.inline
    def withHas_large_files(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_large_files")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHas_large_files: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_large_files")(js.undefined)
        ret
    }
    @scala.inline
    def withLarge_files_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("large_files_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLarge_files_count: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("large_files_count")(js.undefined)
        ret
    }
    @scala.inline
    def withLarge_files_size(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("large_files_size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLarge_files_size: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("large_files_size")(js.undefined)
        ret
    }
    @scala.inline
    def withPercent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPercent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percent")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus_text(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status_text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus_text: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status_text")(js.undefined)
        ret
    }
    @scala.inline
    def withTfvc_project(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tfvc_project")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTfvc_project: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tfvc_project")(js.undefined)
        ret
    }
  }
  
}

