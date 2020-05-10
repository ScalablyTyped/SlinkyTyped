package typingsSlinky.gapiClientGames.gapi.client.games

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientGames.AnonCollection
import typingsSlinky.gapiClientGames.AnonOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetagameResource extends js.Object {
  /** Return the metagame configuration data for the calling application. */
  def getMetagameConfig(request: AnonOauthtoken): Request_[MetagameConfig] = js.native
  /** List play data aggregated per category for the player corresponding to playerId. */
  def listCategoriesByPlayer(request: AnonCollection): Request_[CategoryListResponse] = js.native
}

object MetagameResource {
  @scala.inline
  def apply(
    getMetagameConfig: AnonOauthtoken => Request_[MetagameConfig],
    listCategoriesByPlayer: AnonCollection => Request_[CategoryListResponse]
  ): MetagameResource = {
    val __obj = js.Dynamic.literal(getMetagameConfig = js.Any.fromFunction1(getMetagameConfig), listCategoriesByPlayer = js.Any.fromFunction1(listCategoriesByPlayer))
    __obj.asInstanceOf[MetagameResource]
  }
  @scala.inline
  implicit class MetagameResourceOps[Self <: MetagameResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetMetagameConfig(value: AnonOauthtoken => Request_[MetagameConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMetagameConfig")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withListCategoriesByPlayer(value: AnonCollection => Request_[CategoryListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listCategoriesByPlayer")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

