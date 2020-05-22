package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reviewid extends js.Object {
  var number: Alias
  var owner: Required
  var pull_number: Required
  var repo: Required
  var review_id: Required
}

object Reviewid {
  @scala.inline
  def apply(number: Alias, owner: Required, pull_number: Required, repo: Required, review_id: Required): Reviewid = {
    val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], pull_number = pull_number.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], review_id = review_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reviewid]
  }
}

