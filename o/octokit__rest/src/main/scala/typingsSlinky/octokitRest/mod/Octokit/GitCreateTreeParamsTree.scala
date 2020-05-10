package typingsSlinky.octokitRest.mod.Octokit

import typingsSlinky.octokitRest.octokitRestStrings.`040000`
import typingsSlinky.octokitRest.octokitRestStrings.`100644`
import typingsSlinky.octokitRest.octokitRestStrings.`100755`
import typingsSlinky.octokitRest.octokitRestStrings.`120000`
import typingsSlinky.octokitRest.octokitRestStrings.`160000`
import typingsSlinky.octokitRest.octokitRestStrings.blob
import typingsSlinky.octokitRest.octokitRestStrings.commit
import typingsSlinky.octokitRest.octokitRestStrings.tree
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GitCreateTreeParamsTree extends js.Object {
  var content: js.UndefOr[String] = js.native
  var mode: js.UndefOr[`100644` | `100755` | `040000` | `160000` | `120000`] = js.native
  var path: js.UndefOr[String] = js.native
  var sha: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[blob | tree | commit] = js.native
}

object GitCreateTreeParamsTree {
  @scala.inline
  def apply(): GitCreateTreeParamsTree = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GitCreateTreeParamsTree]
  }
  @scala.inline
  implicit class GitCreateTreeParamsTreeOps[Self <: GitCreateTreeParamsTree] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: `100644` | `100755` | `040000` | `160000` | `120000`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
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
    def withType(value: blob | tree | commit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

