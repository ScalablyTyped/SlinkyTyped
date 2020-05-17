package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Source extends js.Object {
  var owner: Required = js.native
  var repo: Required = js.native
  var source: Type = js.native
  @JSName("source.branch")
  var sourceDotbranch: Enum = js.native
  @JSName("source.path")
  var sourceDotpath: Type = js.native
}

object Source {
  @scala.inline
  def apply(owner: Required, repo: Required, source: Type, sourceDotbranch: Enum, sourceDotpath: Type): Source = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("source.branch")(sourceDotbranch.asInstanceOf[js.Any])
    __obj.updateDynamic("source.path")(sourceDotpath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source]
  }
  @scala.inline
  implicit class SourceOps[Self <: Source] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOwner(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepo(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceDotbranch(value: Enum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source.branch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceDotpath(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source.path")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

