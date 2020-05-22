package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsCreateForOrgParams extends js.Object {
  /**
    * The description of the project.
    */
  var body: js.UndefOr[String] = js.undefined
  /**
    * The name of the project.
    */
  var name: String
  @JSName("org")
  var org_ : String
}

object ProjectsCreateForOrgParams {
  @scala.inline
  def apply(name: String, org_ : String, body: String = null): ProjectsCreateForOrgParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsCreateForOrgParams]
  }
}

