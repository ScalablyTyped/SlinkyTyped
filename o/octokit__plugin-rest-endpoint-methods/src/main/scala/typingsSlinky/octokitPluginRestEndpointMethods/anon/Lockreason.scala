package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Lockreason extends js.Object {
  var issue_number: Required
  var lock_reason: Enum
  var number: Alias
  var owner: Required
  var repo: Required
}

object Lockreason {
  @scala.inline
  def apply(issue_number: Required, lock_reason: Enum, number: Alias, owner: Required, repo: Required): Lockreason = {
    val __obj = js.Dynamic.literal(issue_number = issue_number.asInstanceOf[js.Any], lock_reason = lock_reason.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lockreason]
  }
}

