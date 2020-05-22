package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  var body: Type
  var event: EnumRequired
  var number: Alias
  var owner: Required
  var pull_number: Required
  var repo: Required
  var review_id: Required
}

object Event {
  @scala.inline
  def apply(
    body: Type,
    event: EnumRequired,
    number: Alias,
    owner: Required,
    pull_number: Required,
    repo: Required,
    review_id: Required
  ): Event = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], pull_number = pull_number.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], review_id = review_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
}

