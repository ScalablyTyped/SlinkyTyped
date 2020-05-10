package typingsSlinky.googleVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrowFormatOptions extends js.Object {
  /**
    * A number indicating the base value, used to compare against the cell value. If the cell value is higher, the cell will include a green up arrow; if the cell value is lower, it will include a red down arrow; if the same, no arrow.
    */
  var base: js.UndefOr[Double] = js.native
}

object ArrowFormatOptions {
  @scala.inline
  def apply(): ArrowFormatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArrowFormatOptions]
  }
  @scala.inline
  implicit class ArrowFormatOptionsOps[Self <: ArrowFormatOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBase(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(js.undefined)
        ret
    }
  }
  
}

