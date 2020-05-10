package typingsSlinky.reactScrollbarSize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Measurement extends js.Object {
  var scrollbarHeight: Double = js.native
  var scrollbarWidth: Double = js.native
}

object Measurement {
  @scala.inline
  def apply(scrollbarHeight: Double, scrollbarWidth: Double): Measurement = {
    val __obj = js.Dynamic.literal(scrollbarHeight = scrollbarHeight.asInstanceOf[js.Any], scrollbarWidth = scrollbarWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[Measurement]
  }
  @scala.inline
  implicit class MeasurementOps[Self <: Measurement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScrollbarHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollbarHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollbarWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollbarWidth")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

