package typingsSlinky.plottable.anon

import typingsSlinky.plottable.plottableStrings.between
import typingsSlinky.plottable.plottableStrings.center
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Between extends js.Object {
  var between: typingsSlinky.plottable.plottableStrings.between = js.native
  var center: typingsSlinky.plottable.plottableStrings.center = js.native
}

object Between {
  @scala.inline
  def apply(between: between, center: center): Between = {
    val __obj = js.Dynamic.literal(between = between.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any])
    __obj.asInstanceOf[Between]
  }
  @scala.inline
  implicit class BetweenOps[Self <: Between] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBetween(value: between): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("between")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCenter(value: center): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

