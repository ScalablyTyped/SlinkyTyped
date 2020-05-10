package typingsSlinky.gitlab.mergeRequestsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AcceptMergeRequestOptions extends js.Object {
  var merge_commit_message: js.UndefOr[String] = js.native
  var merge_when_pipeline_succeeds: js.UndefOr[Boolean] = js.native
  var sha: js.UndefOr[String] = js.native
  var should_remove_source_branch: js.UndefOr[Boolean] = js.native
  var squash: js.UndefOr[Boolean] = js.native
  var squash_commit_message: js.UndefOr[String] = js.native
}

object AcceptMergeRequestOptions {
  @scala.inline
  def apply(): AcceptMergeRequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcceptMergeRequestOptions]
  }
  @scala.inline
  implicit class AcceptMergeRequestOptionsOps[Self <: AcceptMergeRequestOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMerge_commit_message(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merge_commit_message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMerge_commit_message: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merge_commit_message")(js.undefined)
        ret
    }
    @scala.inline
    def withMerge_when_pipeline_succeeds(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merge_when_pipeline_succeeds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMerge_when_pipeline_succeeds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merge_when_pipeline_succeeds")(js.undefined)
        ret
    }
    @scala.inline
    def withSha(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSha: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sha")(js.undefined)
        ret
    }
    @scala.inline
    def withShould_remove_source_branch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("should_remove_source_branch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShould_remove_source_branch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("should_remove_source_branch")(js.undefined)
        ret
    }
    @scala.inline
    def withSquash(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("squash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSquash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("squash")(js.undefined)
        ret
    }
    @scala.inline
    def withSquash_commit_message(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("squash_commit_message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSquash_commit_message: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("squash_commit_message")(js.undefined)
        ret
    }
  }
  
}

