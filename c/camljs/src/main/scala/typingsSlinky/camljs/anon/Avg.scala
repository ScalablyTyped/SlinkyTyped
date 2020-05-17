package typingsSlinky.camljs.anon

import typingsSlinky.camljs.mod.Aggregation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Avg extends Aggregation {
  var avg: String = js.native
}

object Avg {
  @scala.inline
  def apply(avg: String): Avg = {
    val __obj = js.Dynamic.literal(avg = avg.asInstanceOf[js.Any])
    __obj.asInstanceOf[Avg]
  }
  @scala.inline
  implicit class AvgOps[Self <: Avg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avg")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

