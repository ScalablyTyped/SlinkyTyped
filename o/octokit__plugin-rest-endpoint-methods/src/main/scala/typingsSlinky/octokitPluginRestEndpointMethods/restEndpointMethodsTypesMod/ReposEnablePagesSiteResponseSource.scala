package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposEnablePagesSiteResponseSource extends js.Object {
  var branch: String = js.native
  var directory: String = js.native
}

object ReposEnablePagesSiteResponseSource {
  @scala.inline
  def apply(branch: String, directory: String): ReposEnablePagesSiteResponseSource = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], directory = directory.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposEnablePagesSiteResponseSource]
  }
  @scala.inline
  implicit class ReposEnablePagesSiteResponseSourceOps[Self <: ReposEnablePagesSiteResponseSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBranch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("branch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirectory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directory")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

