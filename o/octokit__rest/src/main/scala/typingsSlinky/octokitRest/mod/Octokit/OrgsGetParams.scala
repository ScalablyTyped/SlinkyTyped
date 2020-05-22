package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsGetParams extends js.Object {
  @JSName("org")
  var org_ : String
}

object OrgsGetParams {
  @scala.inline
  def apply(org_ : String): OrgsGetParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsGetParams]
  }
}

