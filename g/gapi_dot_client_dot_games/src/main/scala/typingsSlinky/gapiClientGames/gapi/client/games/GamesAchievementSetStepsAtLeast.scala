package typingsSlinky.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GamesAchievementSetStepsAtLeast extends js.Object {
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#GamesAchievementSetStepsAtLeast. */
  var kind: js.UndefOr[String] = js.native
  /** The minimum number of steps for the achievement to be set to. */
  var steps: js.UndefOr[Double] = js.native
}

object GamesAchievementSetStepsAtLeast {
  @scala.inline
  def apply(): GamesAchievementSetStepsAtLeast = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GamesAchievementSetStepsAtLeast]
  }
  @scala.inline
  implicit class GamesAchievementSetStepsAtLeastOps[Self <: GamesAchievementSetStepsAtLeast] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withSteps(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("steps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSteps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("steps")(js.undefined)
        ret
    }
  }
  
}

