package typingsSlinky.gitlab.mergeRequestsMod

import typingsSlinky.gitlab.gitlabBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShowMergeRequestOptions extends js.Object {
  var include_diverged_commits_count: js.UndefOr[`true`] = js.native
  var include_rebase_in_progress: js.UndefOr[Boolean] = js.native
  var render_html: js.UndefOr[Boolean] = js.native
}

object ShowMergeRequestOptions {
  @scala.inline
  def apply(): ShowMergeRequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShowMergeRequestOptions]
  }
  @scala.inline
  implicit class ShowMergeRequestOptionsOps[Self <: ShowMergeRequestOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInclude_diverged_commits_count(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include_diverged_commits_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInclude_diverged_commits_count: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include_diverged_commits_count")(js.undefined)
        ret
    }
    @scala.inline
    def withInclude_rebase_in_progress(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include_rebase_in_progress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInclude_rebase_in_progress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include_rebase_in_progress")(js.undefined)
        ret
    }
    @scala.inline
    def withRender_html(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render_html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRender_html: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render_html")(js.undefined)
        ret
    }
  }
  
}

