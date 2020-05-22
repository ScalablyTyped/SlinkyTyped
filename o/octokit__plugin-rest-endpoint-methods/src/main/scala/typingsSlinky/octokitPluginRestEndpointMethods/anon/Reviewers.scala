package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reviewers extends js.Object {
  var number: Alias
  var owner: Required
  var pull_number: Required
  var repo: Required
  var reviewers: Type
  var team_reviewers: Type
}

object Reviewers {
  @scala.inline
  def apply(
    number: Alias,
    owner: Required,
    pull_number: Required,
    repo: Required,
    reviewers: Type,
    team_reviewers: Type
  ): Reviewers = {
    val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], pull_number = pull_number.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], reviewers = reviewers.asInstanceOf[js.Any], team_reviewers = team_reviewers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reviewers]
  }
}

