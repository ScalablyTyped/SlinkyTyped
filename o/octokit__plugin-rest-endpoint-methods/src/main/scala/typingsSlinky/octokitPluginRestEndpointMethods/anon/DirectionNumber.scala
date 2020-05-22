package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectionNumber extends js.Object {
  var direction: Enum
  var number: Alias
  var owner: Required
  var page: Type
  var per_page: Type
  var pull_number: Required
  var repo: Required
  var since: Type
  var sort: Enum
}

object DirectionNumber {
  @scala.inline
  def apply(
    direction: Enum,
    number: Alias,
    owner: Required,
    page: Type,
    per_page: Type,
    pull_number: Required,
    repo: Required,
    since: Type,
    sort: Enum
  ): DirectionNumber = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], pull_number = pull_number.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], since = since.asInstanceOf[js.Any], sort = sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionNumber]
  }
}

