package typingsSlinky.atOctokitRest.atOctokitRestMod

import typingsSlinky.atOctokitRest.atOctokitRestStrings.Plussign1
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

trait ReactionsCreateForTeamDiscussionParams extends js.Object {
  /**
    * The [reaction type](https://developer.github.com/v3/reactions/#reaction-types) to add to the team discussion.
    */
  var content: Plussign1 | `-1` | laugh | confused | heart | hooray | rocket | eyes
  var discussion_number: Double
  var team_id: Double
}

object ReactionsCreateForTeamDiscussionParams {
  @scala.inline
  def apply(
    content: Plussign1 | `-1` | laugh | confused | heart | hooray | rocket | eyes,
    discussion_number: Double,
    team_id: Double
  ): ReactionsCreateForTeamDiscussionParams = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], discussion_number = discussion_number.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReactionsCreateForTeamDiscussionParams]
  }
}

