package typingsSlinky.gapiClientGamesmanagement.gapi.client.gamesmanagement

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientGamesmanagement.AnonAchievementId
import typingsSlinky.gapiClientGamesmanagement.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AchievementsResource extends js.Object {
  /**
    * Resets the achievement with the given ID for the currently authenticated player. This method is only accessible to whitelisted tester accounts for your
    * application.
    */
  def reset(request: AnonAchievementId): Request_[AchievementResetResponse] = js.native
  /**
    * Resets all achievements for the currently authenticated player for your application. This method is only accessible to whitelisted tester accounts for
    * your application.
    */
  def resetAll(request: AnonAlt): Request_[AchievementResetAllResponse] = js.native
  /** Resets all draft achievements for all players. This method is only available to user accounts for your developer console. */
  def resetAllForAllPlayers(request: AnonAlt): Request_[Unit] = js.native
  /**
    * Resets the achievement with the given ID for all players. This method is only available to user accounts for your developer console. Only draft
    * achievements can be reset.
    */
  def resetForAllPlayers(request: AnonAchievementId): Request_[Unit] = js.native
  /**
    * Resets achievements with the given IDs for all players. This method is only available to user accounts for your developer console. Only draft
    * achievements may be reset.
    */
  def resetMultipleForAllPlayers(request: AnonAlt): Request_[Unit] = js.native
}

object AchievementsResource {
  @scala.inline
  def apply(
    reset: AnonAchievementId => Request_[AchievementResetResponse],
    resetAll: AnonAlt => Request_[AchievementResetAllResponse],
    resetAllForAllPlayers: AnonAlt => Request_[Unit],
    resetForAllPlayers: AnonAchievementId => Request_[Unit],
    resetMultipleForAllPlayers: AnonAlt => Request_[Unit]
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
    def withReset(value: AnonAchievementId => Request_[AchievementResetResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withResetAll(value: AnonAlt => Request_[AchievementResetAllResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetAll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withResetAllForAllPlayers(value: AnonAlt => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetAllForAllPlayers")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withResetForAllPlayers(value: AnonAchievementId => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetForAllPlayers")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withResetMultipleForAllPlayers(value: AnonAlt => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetMultipleForAllPlayers")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

