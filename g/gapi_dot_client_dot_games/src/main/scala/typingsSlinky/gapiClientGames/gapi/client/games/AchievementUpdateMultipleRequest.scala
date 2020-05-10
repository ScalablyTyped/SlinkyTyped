package typingsSlinky.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AchievementUpdateMultipleRequest extends js.Object {
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#achievementUpdateMultipleRequest. */
  var kind: js.UndefOr[String] = js.native
  /** The individual achievement update requests. */
  var updates: js.UndefOr[js.Array[AchievementUpdateRequest]] = js.native
}

object AchievementUpdateMultipleRequest {
  @scala.inline
  def apply(): AchievementUpdateMultipleRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AchievementUpdateMultipleRequest]
  }
  @scala.inline
  implicit class AchievementUpdateMultipleRequestOps[Self <: AchievementUpdateMultipleRequest] (val x: Self) extends AnyVal {
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
    def withUpdates(value: js.Array[AchievementUpdateRequest]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updates")(js.undefined)
        ret
    }
  }
  
}

