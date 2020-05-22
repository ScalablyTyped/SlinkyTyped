package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MilestonenumberNumber extends js.Object {
  var milestone_number: Required
  var number: Alias
  var owner: Required
  var page: Type
  var per_page: Type
  var repo: Required
}

object MilestonenumberNumber {
  @scala.inline
  def apply(
    milestone_number: Required,
    number: Alias,
    owner: Required,
    page: Type,
    per_page: Type,
    repo: Required
  ): MilestonenumberNumber = {
    val __obj = js.Dynamic.literal(milestone_number = milestone_number.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[MilestonenumberNumber]
  }
}

