package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectsCreateForOrgParams extends js.Object {
  /**
    * The description of the project.
    */
  var body: js.UndefOr[String] = js.native
  /**
    * The name of the project.
    */
  var name: String = js.native
  var org: String = js.native
}

object ProjectsCreateForOrgParams {
  @scala.inline
  def apply(name: String, org: String): ProjectsCreateForOrgParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], org = org.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsCreateForOrgParams]
  }
  @scala.inline
  implicit class ProjectsCreateForOrgParamsOps[Self <: ProjectsCreateForOrgParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("org")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(js.undefined)
        ret
    }
  }
  
}

