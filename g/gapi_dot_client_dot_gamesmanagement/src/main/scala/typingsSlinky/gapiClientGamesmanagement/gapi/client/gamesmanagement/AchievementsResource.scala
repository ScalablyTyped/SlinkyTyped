package typingsSlinky.gapiClientGamesmanagement.gapi.client.gamesmanagement

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientGamesmanagement.anon.AchievementId
import typingsSlinky.gapiClientGamesmanagement.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AchievementsResource extends js.Object {
  /**
    * Resets the achievement with the given ID for the currently authenticated player. This method is only accessible to whitelisted tester accounts for your
    * application.
    */
  def reset(request: AchievementId): Request[AchievementResetResponse] = js.native
  /**
    * Resets all achievements for the currently authenticated player for your application. This method is only accessible to whitelisted tester accounts for
    * your application.
    */
  def resetAll(request: Alt): Request[AchievementResetAllResponse] = js.native
  /** Resets all draft achievements for all players. This method is only available to user accounts for your developer console. */
  def resetAllForAllPlayers(request: Alt): Request[Unit] = js.native
  /**
    * Resets the achievement with the given ID for all players. This method is only available to user accounts for your developer console. Only draft
    * achievements can be reset.
    */
  def resetForAllPlayers(request: AchievementId): Request[Unit] = js.native
  /**
    * Resets achievements with the given IDs for all players. This method is only available to user accounts for your developer console. Only draft
    * achievements may be reset.
    */
  def resetMultipleForAllPlayers(request: Alt): Request[Unit] = js.native
}

object AchievementsResource {
  @scala.inline
  def apply(
    reset: AchievementId => Request[AchievementResetResponse],
    resetAll: Alt => Request[AchievementResetAllResponse],
    resetAllForAllPlayers: Alt => Request[Unit],
    resetForAllPlayers: AchievementId => Request[Unit],
    resetMultipleForAllPlayers: Alt => Request[Unit]
  ): AchievementsResource = {
    val __obj = js.Dynamic.literal(reset = js.Any.fromFunction1(reset), resetAll = js.Any.fromFunction1(resetAll), resetAllForAllPlayers = js.Any.fromFunction1(resetAllForAllPlayers), resetForAllPlayers = js.Any.fromFunction1(resetForAllPlayers), resetMultipleForAllPlayers = js.Any.fromFunction1(resetMultipleForAllPlayers))
    __obj.asInstanceOf[AchievementsResource]
  }
  @scala.inline
  implicit class AchievementsResourceOps[Self <: AchievementsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReset(value: AchievementId => Request[AchievementResetResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withResetAll(value: Alt => Request[AchievementResetAllResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetAll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withResetAllForAllPlayers(value: Alt => Request[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetAllForAllPlayers")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withResetForAllPlayers(value: AchievementId => Request[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetForAllPlayers")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withResetMultipleForAllPlayers(value: Alt => Request[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetMultipleForAllPlayers")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

