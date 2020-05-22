package typingsSlinky.octokitRest.mod.Octokit

import typingsSlinky.octokitRest.octokitRestStrings.Plussign1
import typingsSlinky.octokitRest.octokitRestStrings.`-1`
import typingsSlinky.octokitRest.octokitRestStrings.confused
import typingsSlinky.octokitRest.octokitRestStrings.eyes
import typingsSlinky.octokitRest.octokitRestStrings.heart
import typingsSlinky.octokitRest.octokitRestStrings.hooray
import typingsSlinky.octokitRest.octokitRestStrings.laugh
import typingsSlinky.octokitRest.octokitRestStrings.rocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactionsCreateForIssueParams extends js.Object {
  /**
    * The [reaction type](https://developer.github.com/v3/reactions/#reaction-types) to add to the issue.
    */
  var content: Plussign1 | `-1` | laugh | confused | heart | hooray | rocket | eyes
  var issue_number: Double
  var owner: String
  var repo: String
}

object ReactionsCreateForIssueParams {
  @scala.inline
  def apply(
    content: Plussign1 | `-1` | laugh | confused | heart | hooray | rocket | eyes,
    issue_number: Double,
    owner: String,
    repo: String
  ): ReactionsCreateForIssueParams = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], issue_number = issue_number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactionsCreateForIssueParams]
  }
}

