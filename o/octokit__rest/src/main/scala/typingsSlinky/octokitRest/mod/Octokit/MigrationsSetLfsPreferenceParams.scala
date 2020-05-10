package typingsSlinky.octokitRest.mod.Octokit

import typingsSlinky.octokitRest.octokitRestStrings.opt_in
import typingsSlinky.octokitRest.octokitRestStrings.opt_out
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MigrationsSetLfsPreferenceParams extends js.Object {
  var owner: String = js.native
  var repo: String = js.native
  /**
    * Can be one of `opt_in` (large files will be stored using Git LFS) or `opt_out` (large files will be removed during the import).
    */
  var use_lfs: opt_in | opt_out = js.native
}

object MigrationsSetLfsPreferenceParams {
  @scala.inline
  def apply(owner: String, repo: String, use_lfs: opt_in | opt_out): MigrationsSetLfsPreferenceParams = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], use_lfs = use_lfs.asInstanceOf[js.Any])
    __obj.asInstanceOf[MigrationsSetLfsPreferenceParams]
  }
  @scala.inline
  implicit class MigrationsSetLfsPreferenceParamsOps[Self <: MigrationsSetLfsPreferenceParams] (val x: Self) extends AnyVal {
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
    def withUse_lfs(value: opt_in | opt_out): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("use_lfs")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

