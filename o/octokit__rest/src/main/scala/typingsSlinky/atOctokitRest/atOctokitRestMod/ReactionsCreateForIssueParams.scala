package typingsSlinky.atOctokitRest.atOctokitRestMod

import typingsSlinky.atOctokitRest.atOctokitRestStrings.`+1`
import typingsSlinky.atOctokitRest.atOctokitRestStrings.`-1`
import typingsSlinky.atOctokitRest.atOctokitRestStrings.confused
import typingsSlinky.atOctokitRest.atOctokitRestStrings.eyes
import typingsSlinky.atOctokitRest.atOctokitRestStrings.heart
import typingsSlinky.atOctokitRest.atOctokitRestStrings.hooray
import typingsSlinky.atOctokitRest.atOctokitRestStrings.laugh
import typingsSlinky.atOctokitRest.atOctokitRestStrings.rocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactionsCreateForIssueParams extends js.Object {
  /**
    * The [reaction type](https://developer.github.com/v3/reactions/#reaction-types) to add to the issue.
    */
  var content: `+1` | `-1` | laugh | confused | heart | hooray | rocket | eyes
  var issue_number: Double
  var owner: String
  var repo: String
}

object ReactionsCreateForIssueParams {
  @scala.inline
  def apply(
    content: `+1` | `-1` | laugh | confused | heart | hooray | rocket | eyes,
    issue_number: Double,
    owner: String,
    repo: String
  ): ReactionsCreateForIssueParams = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], issue_number = issue_number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReactionsCreateForIssueParams]
  }
}

