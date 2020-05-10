package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.merge
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.rebase
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.squash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PullsMergeParamsDeprecatedNumber extends js.Object {
  /**
    * Extra detail to append to automatic commit message.
    */
  var commit_message: js.UndefOr[String] = js.native
  /**
    * Title for the automatic commit message.
    */
  var commit_title: js.UndefOr[String] = js.native
  /**
    * Merge method to use. Possible values are `merge`, `squash` or `rebase`. Default is `merge`.
    */
  var merge_method: js.UndefOr[merge | squash | rebase] = js.native
  /**
    * @deprecated "number" parameter renamed to "pull_number"
    */
  var number: Double = js.native
  var owner: String = js.native
  var repo: String = js.native
  /**
    * SHA that pull request head must match to allow merge.
    */
  var sha: js.UndefOr[String] = js.native
}

object PullsMergeParamsDeprecatedNumber {
  @scala.inline
  def apply(number: Double, owner: String, repo: String): PullsMergeParamsDeprecatedNumber = {
    val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsMergeParamsDeprecatedNumber]
  }
  @scala.inline
  implicit class PullsMergeParamsDeprecatedNumberOps[Self <: PullsMergeParamsDeprecatedNumber] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withCommit_message(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commit_message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommit_message: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commit_message")(js.undefined)
        ret
    }
    @scala.inline
    def withCommit_title(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commit_title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommit_title: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commit_title")(js.undefined)
        ret
    }
    @scala.inline
    def withMerge_method(value: merge | squash | rebase): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merge_method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMerge_method: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merge_method")(js.undefined)
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
  }
  
}

