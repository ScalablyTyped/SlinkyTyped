package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSource extends js.Object {
  var owner: AnonRequired = js.native
  var repo: AnonRequired = js.native
  var source: AnonType = js.native
  @JSName("source.branch")
  var sourceDotbranch: AnonEnum = js.native
  @JSName("source.path")
  var sourceDotpath: AnonType = js.native
}

object AnonSource {
  @scala.inline
  def apply(
    owner: AnonRequired,
    repo: AnonRequired,
    source: AnonType,
    sourceDotbranch: AnonEnum,
    sourceDotpath: AnonType
  ): AnonSource = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("source.branch")(sourceDotbranch.asInstanceOf[js.Any])
    __obj.updateDynamic("source.path")(sourceDotpath.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSource]
  }
  @scala.inline
  implicit class AnonSourceOps[Self <: AnonSource] (val x: Self) extends AnyVal {
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
    def withSource(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceDotbranch(value: AnonEnum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source.branch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceDotpath(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source.path")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

