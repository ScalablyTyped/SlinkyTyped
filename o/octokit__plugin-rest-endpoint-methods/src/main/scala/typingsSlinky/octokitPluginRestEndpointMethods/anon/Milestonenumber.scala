package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Milestonenumber extends js.Object {
  var milestone_number: Required
  var number: Alias
  var owner: Required
  var repo: Required
}

object Milestonenumber {
  @scala.inline
  def apply(milestone_number: Required, number: Alias, owner: Required, repo: Required): Milestonenumber = {
    val __obj = js.Dynamic.literal(milestone_number = milestone_number.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Milestonenumber]
  }
}

