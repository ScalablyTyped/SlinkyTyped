package typingsSlinky.gapiClientGames.gapi.client.games

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientGames.AnonAchievementId
import typingsSlinky.gapiClientGames.AnonConsistencyToken
import typingsSlinky.gapiClientGames.AnonFields
import typingsSlinky.gapiClientGames.AnonKey
import typingsSlinky.gapiClientGames.AnonOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AchievementsResource extends js.Object {
  /** Increments the steps of the achievement with the given ID for the currently authenticated player. */
  def increment(request: AnonAchievementId): Request_[AchievementIncrementResponse] = js.native
  /** Lists the progress for all your application's achievements for the currently authenticated player. */
  def list(request: AnonConsistencyToken): Request_[PlayerAchievementListResponse] = js.native
  /** Sets the state of the achievement with the given ID to REVEALED for the currently authenticated player. */
  def reveal(request: AnonFields): Request_[AchievementRevealResponse] = js.native
  /**
    * Sets the steps for the currently authenticated player towards unlocking an achievement. If the steps parameter is less than the current number of steps
    * that the player already gained for the achievement, the achievement is not modified.
    */
  def setStepsAtLeast(request: AnonKey): Request_[AchievementSetStepsAtLeastResponse] = js.native
  /** Unlocks this achievement for the currently authenticated player. */
  def unlock(request: AnonFields): Request_[AchievementUnlockResponse] = js.native
  /** Updates multiple achievements for the currently authenticated player. */
  def updateMultiple(request: AnonOauthtoken): Request_[AchievementUpdateMultipleResponse] = js.native
}

object AchievementsResource {
  @scala.inline
  def apply(
    increment: AnonAchievementId => Request_[AchievementIncrementResponse],
    list: AnonConsistencyToken => Request_[PlayerAchievementListResponse],
    reveal: AnonFields => Request_[AchievementRevealResponse],
    setStepsAtLeast: AnonKey => Request_[AchievementSetStepsAtLeastResponse],
    unlock: AnonFields => Request_[AchievementUnlockResponse],
    updateMultiple: AnonOauthtoken => Request_[AchievementUpdateMultipleResponse]
  ): AchievementsResource = {
    val __obj = js.Dynamic.literal(increment = js.Any.fromFunction1(increment), list = js.Any.fromFunction1(list), reveal = js.Any.fromFunction1(reveal), setStepsAtLeast = js.Any.fromFunction1(setStepsAtLeast), unlock = js.Any.fromFunction1(unlock), updateMultiple = js.Any.fromFunction1(updateMultiple))
    __obj.asInstanceOf[AchievementsResource]
  }
  @scala.inline
  implicit class AchievementsResourceOps[Self <: AchievementsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIncrement(value: AnonAchievementId => Request_[AchievementIncrementResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("increment")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonConsistencyToken => Request_[PlayerAchievementListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReveal(value: AnonFields => Request_[AchievementRevealResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reveal")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetStepsAtLeast(value: AnonKey => Request_[AchievementSetStepsAtLeastResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStepsAtLeast")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUnlock(value: AnonFields => Request_[AchievementUnlockResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unlock")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdateMultiple(value: AnonOauthtoken => Request_[AchievementUpdateMultipleResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateMultiple")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

