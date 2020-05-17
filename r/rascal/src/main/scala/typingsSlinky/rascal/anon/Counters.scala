package typingsSlinky.rascal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Counters extends js.Object {
  var counters: InMemory = js.native
}

object Counters {
  @scala.inline
  def apply(counters: InMemory): Counters = {
    val __obj = js.Dynamic.literal(counters = counters.asInstanceOf[js.Any])
    __obj.asInstanceOf[Counters]
  }
  @scala.inline
  implicit class CountersOps[Self <: Counters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCounters(value: InMemory): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("counters")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

