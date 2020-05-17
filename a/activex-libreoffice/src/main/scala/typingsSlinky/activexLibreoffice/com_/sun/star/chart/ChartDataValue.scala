package typingsSlinky.activexLibreoffice.com_.sun.star.chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes a single data value, including the error
  *
  * This struct is currently used nowhere.
  * @deprecated Deprecated
  */
@js.native
trait ChartDataValue extends js.Object {
  /** highest possible error value. */
  var HighError: Double = js.native
  /** lowest possible error value. */
  var LowError: Double = js.native
  /** value by itself. */
  var Value: Double = js.native
}

object ChartDataValue {
  @scala.inline
  def apply(HighError: Double, LowError: Double, Value: Double): ChartDataValue = {
    val __obj = js.Dynamic.literal(HighError = HighError.asInstanceOf[js.Any], LowError = LowError.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartDataValue]
  }
  @scala.inline
  implicit class ChartDataValueOps[Self <: ChartDataValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHighError(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HighError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLowError(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LowError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

