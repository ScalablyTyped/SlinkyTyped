package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonUselfs extends js.Object {
  var owner: AnonRequired = js.native
  var repo: AnonRequired = js.native
  var use_lfs: AnonEnumRequired = js.native
}

object AnonUselfs {
  @scala.inline
  def apply(owner: AnonRequired, repo: AnonRequired, use_lfs: AnonEnumRequired): AnonUselfs = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], use_lfs = use_lfs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonUselfs]
  }
  @scala.inline
  implicit class AnonUselfsOps[Self <: AnonUselfs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOwner(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepo(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUse_lfs(value: AnonEnumRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("use_lfs")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

