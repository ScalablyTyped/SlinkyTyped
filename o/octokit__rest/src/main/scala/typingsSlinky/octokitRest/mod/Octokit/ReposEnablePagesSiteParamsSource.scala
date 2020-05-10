package typingsSlinky.octokitRest.mod.Octokit

import typingsSlinky.octokitRest.octokitRestStrings.`gh-pages`
import typingsSlinky.octokitRest.octokitRestStrings.master
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposEnablePagesSiteParamsSource extends js.Object {
  var branch: js.UndefOr[master | `gh-pages`] = js.native
  var path: js.UndefOr[String] = js.native
}

object ReposEnablePagesSiteParamsSource {
  @scala.inline
  def apply(): ReposEnablePagesSiteParamsSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReposEnablePagesSiteParamsSource]
  }
  @scala.inline
  implicit class ReposEnablePagesSiteParamsSourceOps[Self <: ReposEnablePagesSiteParamsSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBranch(value: master | `gh-pages`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("branch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBranch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("branch")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
  }
  
}

