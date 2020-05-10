package typingsSlinky.asyncSema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTimeUnit extends js.Object {
  var timeUnit: js.UndefOr[Double] = js.native
  var uniformDistribution: js.UndefOr[Boolean] = js.native
}

object AnonTimeUnit {
  @scala.inline
  def apply(): AnonTimeUnit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonTimeUnit]
  }
  @scala.inline
  implicit class AnonTimeUnitOps[Self <: AnonTimeUnit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTimeUnit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeUnit")(js.undefined)
        ret
    }
    @scala.inline
    def withUniformDistribution(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniformDistribution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUniformDistribution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniformDistribution")(js.undefined)
        ret
    }
  }
  
}

