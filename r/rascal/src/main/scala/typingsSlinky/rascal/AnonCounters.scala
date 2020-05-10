package typingsSlinky.rascal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCounters extends js.Object {
  var counters: AnonInMemory = js.native
}

object AnonCounters {
  @scala.inline
  def apply(counters: AnonInMemory): AnonCounters = {
    val __obj = js.Dynamic.literal(counters = counters.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCounters]
  }
  @scala.inline
  implicit class AnonCountersOps[Self <: AnonCounters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCounters(value: AnonInMemory): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("counters")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

