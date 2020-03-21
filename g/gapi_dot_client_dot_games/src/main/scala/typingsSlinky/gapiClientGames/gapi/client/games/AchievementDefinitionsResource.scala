package typingsSlinky.gapiClientGames.gapi.client.games

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientGames.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AchievementDefinitionsResource extends js.Object {
  /** Lists all the achievement definitions for your application. */
  def list(request: AnonAlt): Request_[AchievementDefinitionsListResponse]
}

object AchievementDefinitionsResource {
  @scala.inline
  def apply(list: AnonAlt => Request_[AchievementDefinitionsListResponse]): AchievementDefinitionsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[AchievementDefinitionsResource]
  }
}

