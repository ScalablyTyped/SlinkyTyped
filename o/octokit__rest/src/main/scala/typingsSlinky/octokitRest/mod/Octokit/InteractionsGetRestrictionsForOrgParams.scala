package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InteractionsGetRestrictionsForOrgParams extends js.Object {
  @JSName("org")
  var org_ : String
}

object InteractionsGetRestrictionsForOrgParams {
  @scala.inline
  def apply(org_ : String): InteractionsGetRestrictionsForOrgParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractionsGetRestrictionsForOrgParams]
  }
}

