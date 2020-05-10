package typingsSlinky.momentRange

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonExcludeEnd extends js.Object {
  var excludeEnd: js.UndefOr[Boolean] = js.native
  var step: js.UndefOr[Double] = js.native
}

object AnonExcludeEnd {
  @scala.inline
  def apply(): AnonExcludeEnd = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonExcludeEnd]
  }
  @scala.inline
  implicit class AnonExcludeEndOps[Self <: AnonExcludeEnd] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExcludeEnd(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludeEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withStep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(js.undefined)
        ret
    }
  }
  
}

