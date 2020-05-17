package typingsSlinky.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Baseline extends js.Object {
  var baseline: js.UndefOr[Double] = js.native
  var minSpeed: js.UndefOr[Double] = js.native
}

object Baseline {
  @scala.inline
  def apply(): Baseline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Baseline]
  }
  @scala.inline
  implicit class BaselineOps[Self <: Baseline] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseline(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseline")(js.undefined)
        ret
    }
    @scala.inline
    def withMinSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSpeed")(js.undefined)
        ret
    }
  }
  
}

