package typingsSlinky.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventPeriodRange extends js.Object {
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#eventPeriodRange. */
  var kind: js.UndefOr[String] = js.native
  /** The time when this update period ends, in millis, since 1970 UTC (Unix Epoch). */
  var periodEndMillis: js.UndefOr[String] = js.native
  /** The time when this update period begins, in millis, since 1970 UTC (Unix Epoch). */
  var periodStartMillis: js.UndefOr[String] = js.native
}

object EventPeriodRange {
  @scala.inline
  def apply(): EventPeriodRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventPeriodRange]
  }
  @scala.inline
  implicit class EventPeriodRangeOps[Self <: EventPeriodRange] (val x: Self) extends AnyVal {
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
    def withPeriodEndMillis(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("periodEndMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeriodEndMillis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("periodEndMillis")(js.undefined)
        ret
    }
    @scala.inline
    def withPeriodStartMillis(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("periodStartMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeriodStartMillis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("periodStartMillis")(js.undefined)
        ret
    }
  }
  
}

