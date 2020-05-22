package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageNumber extends js.Object {
  var message: Required
  var number: Alias
  var owner: Required
  var pull_number: Required
  var repo: Required
  var review_id: Required
}

object MessageNumber {
  @scala.inline
  def apply(
    message: Required,
    number: Alias,
    owner: Required,
    pull_number: Required,
    repo: Required,
    review_id: Required
  ): MessageNumber = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], pull_number = pull_number.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], review_id = review_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageNumber]
  }
}

