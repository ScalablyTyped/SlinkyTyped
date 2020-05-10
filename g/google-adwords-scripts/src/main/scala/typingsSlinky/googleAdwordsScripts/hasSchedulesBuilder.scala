package typingsSlinky.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait hasSchedulesBuilder[B] extends js.Object {
  def withSchedules(schedules: ExtensionScheduleInput): B = js.native
}

object hasSchedulesBuilder {
  @scala.inline
  def apply[B](withSchedules: ExtensionScheduleInput => B): hasSchedulesBuilder[B] = {
    val __obj = js.Dynamic.literal(withSchedules = js.Any.fromFunction1(withSchedules))
    __obj.asInstanceOf[hasSchedulesBuilder[B]]
  }
  @scala.inline
  implicit class hasSchedulesBuilderOps[Self[b] <: hasSchedulesBuilder[b], B] (val x: Self[B]) extends AnyVal {
    @scala.inline
    def duplicate: Self[B] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[B]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[B] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[B] with Other]
    @scala.inline
    def withWithSchedules(value: ExtensionScheduleInput => B): Self[B] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withSchedules")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

