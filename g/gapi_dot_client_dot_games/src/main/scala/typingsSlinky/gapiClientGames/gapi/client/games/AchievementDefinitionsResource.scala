package typingsSlinky.gapiClientGames.gapi.client.games

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientGames.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AchievementDefinitionsResource extends js.Object {
  /** Lists all the achievement definitions for your application. */
  def list(request: AnonAlt): Request_[AchievementDefinitionsListResponse] = js.native
}

object AchievementDefinitionsResource {
  @scala.inline
  def apply(list: AnonAlt => Request_[AchievementDefinitionsListResponse]): AchievementDefinitionsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[AchievementDefinitionsResource]
  }
  @scala.inline
  implicit class AchievementDefinitionsResourceOps[Self <: AchievementDefinitionsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withList(value: AnonAlt => Request_[AchievementDefinitionsListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

