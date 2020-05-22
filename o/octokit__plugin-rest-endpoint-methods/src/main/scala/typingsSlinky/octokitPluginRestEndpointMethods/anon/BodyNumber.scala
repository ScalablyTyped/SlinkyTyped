package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodyNumber extends js.Object {
  var body: Required
  var number: Alias
  var owner: Required
  var pull_number: Required
  var repo: Required
  var review_id: Required
}

object BodyNumber {
  @scala.inline
  def apply(
    body: Required,
    number: Alias,
    owner: Required,
    pull_number: Required,
    repo: Required,
    review_id: Required
  ): BodyNumber = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], pull_number = pull_number.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], review_id = review_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyNumber]
  }
}

