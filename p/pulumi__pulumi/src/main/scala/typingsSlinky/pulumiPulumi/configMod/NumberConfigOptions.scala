package typingsSlinky.pulumiPulumi.configMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumberConfigOptions extends js.Object {
  /**
    * The maximum number value, inclusive. If the number is greater than this, a ConfigRangeError is thrown.
    */
  var max: js.UndefOr[Double] = js.native
  /**
    * The minimum number value, inclusive. If the number is less than this, a ConfigRangeError is thrown.
    */
  var min: js.UndefOr[Double] = js.native
}

object NumberConfigOptions {
  @scala.inline
  def apply(): NumberConfigOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumberConfigOptions]
  }
  @scala.inline
  implicit class NumberConfigOptionsOps[Self <: NumberConfigOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.undefined)
        ret
    }
    @scala.inline
    def withMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.undefined)
        ret
    }
  }
  
}

