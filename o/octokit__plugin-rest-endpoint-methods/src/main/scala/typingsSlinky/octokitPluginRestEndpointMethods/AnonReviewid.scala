package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonReviewid extends js.Object {
  var number: AnonAlias
  var owner: AnonRequired
  var pull_number: AnonRequired
  var repo: AnonRequired
  var review_id: AnonRequired
}

object AnonReviewid {
  @scala.inline
  def apply(
    number: AnonAlias,
    owner: AnonRequired,
    pull_number: AnonRequired,
    repo: AnonRequired,
    review_id: AnonRequired
  ): AnonReviewid = {
    val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], pull_number = pull_number.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], review_id = review_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonReviewid]
  }
}

