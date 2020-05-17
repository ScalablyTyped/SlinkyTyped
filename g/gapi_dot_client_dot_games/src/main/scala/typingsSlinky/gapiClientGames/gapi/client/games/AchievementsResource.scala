package typingsSlinky.gapiClientGames.gapi.client.games

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientGames.anon.AchievementId
import typingsSlinky.gapiClientGames.anon.ConsistencyToken
import typingsSlinky.gapiClientGames.anon.Fields
import typingsSlinky.gapiClientGames.anon.Key
import typingsSlinky.gapiClientGames.anon.Oauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AchievementsResource extends js.Object {
  /** Increments the steps of the achievement with the given ID for the currently authenticated player. */
  def increment(request: AchievementId): Request[AchievementIncrementResponse] = js.native
  /** Lists the progress for all your application's achievements for the currently authenticated player. */
  def list(request: ConsistencyToken): Request[PlayerAchievementListResponse] = js.native
  /** Sets the state of the achievement with the given ID to REVEALED for the currently authenticated player. */
  def reveal(request: Fields): Request[AchievementRevealResponse] = js.native
  /**
    * Sets the steps for the currently authenticated player towards unlocking an achievement. If the steps parameter is less than the current number of steps
    * that the player already gained for the achievement, the achievement is not modified.
    */
  def setStepsAtLeast(request: Key): Request[AchievementSetStepsAtLeastResponse] = js.native
  /** Unlocks this achievement for the currently authenticated player. */
  def unlock(request: Fields): Request[AchievementUnlockResponse] = js.native
  /** Updates multiple achievements for the currently authenticated player. */
  def updateMultiple(request: Oauthtoken): Request[AchievementUpdateMultipleResponse] = js.native
}

object AchievementsResource {
  @scala.inline
  def apply(
    increment: AchievementId => Request[AchievementIncrementResponse],
    list: ConsistencyToken => Request[PlayerAchievementListResponse],
    reveal: Fields => Request[AchievementRevealResponse],
    setStepsAtLeast: Key => Request[AchievementSetStepsAtLeastResponse],
    unlock: Fields => Request[AchievementUnlockResponse],
    updateMultiple: Oauthtoken => Request[AchievementUpdateMultipleResponse]
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
    def withIncrement(value: AchievementId => Request[AchievementIncrementResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("increment")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: ConsistencyToken => Request[PlayerAchievementListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReveal(value: Fields => Request[AchievementRevealResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reveal")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetStepsAtLeast(value: Key => Request[AchievementSetStepsAtLeastResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStepsAtLeast")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUnlock(value: Fields => Request[AchievementUnlockResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unlock")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdateMultiple(value: Oauthtoken => Request[AchievementUpdateMultipleResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateMultiple")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

