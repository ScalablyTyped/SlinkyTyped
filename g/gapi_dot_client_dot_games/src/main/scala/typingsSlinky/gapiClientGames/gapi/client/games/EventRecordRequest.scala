package typingsSlinky.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventRecordRequest extends js.Object {
  /** The current time when this update was sent, in milliseconds, since 1970 UTC (Unix Epoch). */
  var currentTimeMillis: js.UndefOr[String] = js.native
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#eventRecordRequest. */
  var kind: js.UndefOr[String] = js.native
  /** The request ID used to identify this attempt to record events. */
  var requestId: js.UndefOr[String] = js.native
  /** A list of the time period updates being made in this request. */
  var timePeriods: js.UndefOr[js.Array[EventPeriodUpdate]] = js.native
}

object EventRecordRequest {
  @scala.inline
  def apply(): EventRecordRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventRecordRequest]
  }
  @scala.inline
  implicit class EventRecordRequestOps[Self <: EventRecordRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentTimeMillis(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentTimeMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentTimeMillis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentTimeMillis")(js.undefined)
        ret
    }
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
    def withRequestId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestId")(js.undefined)
        ret
    }
    @scala.inline
    def withTimePeriods(value: js.Array[EventPeriodUpdate]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timePeriods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimePeriods: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timePeriods")(js.undefined)
        ret
    }
  }
  
}

