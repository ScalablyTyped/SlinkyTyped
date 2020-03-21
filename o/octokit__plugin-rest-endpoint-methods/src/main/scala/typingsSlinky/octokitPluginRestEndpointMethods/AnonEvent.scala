package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEvent extends js.Object {
  var body: AnonType
  var event: AnonEnumRequired
  var number: AnonAlias
  var owner: AnonRequired
  var pull_number: AnonRequired
  var repo: AnonRequired
  var review_id: AnonRequired
}

object AnonEvent {
  @scala.inline
  def apply(
    body: AnonType,
    event: AnonEnumRequired,
    number: AnonAlias,
    owner: AnonRequired,
    pull_number: AnonRequired,
    repo: AnonRequired,
    review_id: AnonRequired
  ): AnonEvent = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], pull_number = pull_number.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], review_id = review_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEvent]
  }
}

