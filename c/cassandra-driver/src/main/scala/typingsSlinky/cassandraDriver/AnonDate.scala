package typingsSlinky.cassandraDriver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDate extends js.Object {
  var date: js.Date = js.native
  var ticks: Double = js.native
}

object AnonDate {
  @scala.inline
  def apply(date: js.Date, ticks: Double): AnonDate = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], ticks = ticks.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDate]
  }
  @scala.inline
  implicit class AnonDateOps[Self <: AnonDate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTicks(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticks")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

