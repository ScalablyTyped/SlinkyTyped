package typingsSlinky.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MlPostCalendarEvents[T] extends Generic {
  var body: T = js.native
  var calendar_id: String = js.native
}

object MlPostCalendarEvents {
  @scala.inline
  def apply[T](body: T, calendar_id: String): MlPostCalendarEvents[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], calendar_id = calendar_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlPostCalendarEvents[T]]
  }
  @scala.inline
  implicit class MlPostCalendarEventsOps[Self[t] <: MlPostCalendarEvents[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withBody(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCalendar_id(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendar_id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

