package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigrationsUpdateImportResponse extends js.Object {
  var authors_count: js.UndefOr[Double] = js.undefined
  var authors_url: String
  var commit_count: js.UndefOr[Double] = js.undefined
  var has_large_files: js.UndefOr[Boolean] = js.undefined
  var html_url: String
  var large_files_count: js.UndefOr[Double] = js.undefined
  var large_files_size: js.UndefOr[Double] = js.undefined
  var percent: js.UndefOr[Double] = js.undefined
  var repository_url: String
  var status: String
  var status_text: js.UndefOr[String] = js.undefined
  var tfvc_project: js.UndefOr[String] = js.undefined
  var url: String
  var use_lfs: String
  var vcs: String
  var vcs_url: String
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
    vcs_url: String,
    authors_count: js.UndefOr[Double] = js.undefined,
    commit_count: js.UndefOr[Double] = js.undefined,
    has_large_files: js.UndefOr[Boolean] = js.undefined,
    large_files_count: js.UndefOr[Double] = js.undefined,
    large_files_size: js.UndefOr[Double] = js.undefined,
    percent: js.UndefOr[Double] = js.undefined,
    status_text: String = null,
    tfvc_project: String = null
  ): MigrationsUpdateImportResponse = {
    val __obj = js.Dynamic.literal(authors_url = authors_url.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], repository_url = repository_url.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], use_lfs = use_lfs.asInstanceOf[js.Any], vcs = vcs.asInstanceOf[js.Any], vcs_url = vcs_url.asInstanceOf[js.Any])
    if (!js.isUndefined(authors_count)) __obj.updateDynamic("authors_count")(authors_count.get.asInstanceOf[js.Any])
    if (!js.isUndefined(commit_count)) __obj.updateDynamic("commit_count")(commit_count.get.asInstanceOf[js.Any])
    if (!js.isUndefined(has_large_files)) __obj.updateDynamic("has_large_files")(has_large_files.get.asInstanceOf[js.Any])
    if (!js.isUndefined(large_files_count)) __obj.updateDynamic("large_files_count")(large_files_count.get.asInstanceOf[js.Any])
    if (!js.isUndefined(large_files_size)) __obj.updateDynamic("large_files_size")(large_files_size.get.asInstanceOf[js.Any])
    if (!js.isUndefined(percent)) __obj.updateDynamic("percent")(percent.get.asInstanceOf[js.Any])
    if (status_text != null) __obj.updateDynamic("status_text")(status_text.asInstanceOf[js.Any])
    if (tfvc_project != null) __obj.updateDynamic("tfvc_project")(tfvc_project.asInstanceOf[js.Any])
    __obj.asInstanceOf[MigrationsUpdateImportResponse]
  }
}

