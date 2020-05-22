package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pullnumber extends js.Object {
  var number: Alias
  var owner: Required
  var pull_number: Required
  var repo: Required
}

object Pullnumber {
  @scala.inline
  def apply(number: Alias, owner: Required, pull_number: Required, repo: Required): Pullnumber = {
    val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], pull_number = pull_number.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pullnumber]
  }
}

