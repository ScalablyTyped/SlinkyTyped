package typingsSlinky.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoomAutoMatchStatus extends js.Object {
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#roomAutoMatchStatus. */
  var kind: js.UndefOr[String] = js.native
  /** An estimate for the amount of time (in seconds) that auto-matching is expected to take to complete. */
  var waitEstimateSeconds: js.UndefOr[Double] = js.native
}

object RoomAutoMatchStatus {
  @scala.inline
  def apply(): RoomAutoMatchStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoomAutoMatchStatus]
  }
  @scala.inline
  implicit class RoomAutoMatchStatusOps[Self <: RoomAutoMatchStatus] (val x: Self) extends AnyVal {
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
    def withWaitEstimateSeconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitEstimateSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaitEstimateSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitEstimateSeconds")(js.undefined)
        ret
    }
  }
  
}

