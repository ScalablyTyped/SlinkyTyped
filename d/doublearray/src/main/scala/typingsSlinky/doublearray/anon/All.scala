package typingsSlinky.doublearray.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait All extends js.Object {
  var all: Double = js.native
  var efficiency: Double = js.native
  var unused: Double = js.native
}

object All {
  @scala.inline
  def apply(all: Double, efficiency: Double, unused: Double): All = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], efficiency = efficiency.asInstanceOf[js.Any], unused = unused.asInstanceOf[js.Any])
    __obj.asInstanceOf[All]
  }
  @scala.inline
  implicit class AllOps[Self <: All] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAll(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEfficiency(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("efficiency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnused(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unused")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

