package typingsSlinky.googleVisualization.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Colors extends js.Object {
  var colors: js.Array[String] = js.native
  var maxValue: Double = js.native
  var minValue: Double = js.native
  var values: js.Array[Double] = js.native
}

object Colors {
  @scala.inline
  def apply(colors: js.Array[String], maxValue: Double, minValue: Double, values: js.Array[Double]): Colors = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], maxValue = maxValue.asInstanceOf[js.Any], minValue = minValue.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Colors]
  }
  @scala.inline
  implicit class ColorsOps[Self <: Colors] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColors(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValues(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

