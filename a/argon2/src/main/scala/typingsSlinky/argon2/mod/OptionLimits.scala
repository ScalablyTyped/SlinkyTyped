package typingsSlinky.argon2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionLimits extends js.Object {
  var hashLength: NumericLimit = js.native
  var memoryCost: NumericLimit = js.native
  var parallelism: NumericLimit = js.native
  var timeCost: NumericLimit = js.native
}

object OptionLimits {
  @scala.inline
  def apply(
    hashLength: NumericLimit,
    memoryCost: NumericLimit,
    parallelism: NumericLimit,
    timeCost: NumericLimit
  ): OptionLimits = {
    val __obj = js.Dynamic.literal(hashLength = hashLength.asInstanceOf[js.Any], memoryCost = memoryCost.asInstanceOf[js.Any], parallelism = parallelism.asInstanceOf[js.Any], timeCost = timeCost.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionLimits]
  }
  @scala.inline
  implicit class OptionLimitsOps[Self <: OptionLimits] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHashLength(value: NumericLimit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMemoryCost(value: NumericLimit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memoryCost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParallelism(value: NumericLimit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parallelism")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeCost(value: NumericLimit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeCost")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

