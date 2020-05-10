package typingsSlinky.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventPeriodUpdate extends js.Object {
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#eventPeriodUpdate. */
  var kind: js.UndefOr[String] = js.native
  /** The time period being covered by this update. */
  var timePeriod: js.UndefOr[EventPeriodRange] = js.native
  /** The updates being made for this time period. */
  var updates: js.UndefOr[js.Array[EventUpdateRequest]] = js.native
}

object EventPeriodUpdate {
  @scala.inline
  def apply(): EventPeriodUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventPeriodUpdate]
  }
  @scala.inline
  implicit class EventPeriodUpdateOps[Self <: EventPeriodUpdate] (val x: Self) extends AnyVal {
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
    def withTimePeriod(value: EventPeriodRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timePeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimePeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timePeriod")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdates(value: js.Array[EventUpdateRequest]): Self = {
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

