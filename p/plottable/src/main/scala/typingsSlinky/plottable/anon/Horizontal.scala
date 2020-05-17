package typingsSlinky.plottable.anon

import typingsSlinky.plottable.plottableStrings.horizontal
import typingsSlinky.plottable.plottableStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Horizontal extends js.Object {
  var horizontal: typingsSlinky.plottable.plottableStrings.horizontal = js.native
  var vertical: typingsSlinky.plottable.plottableStrings.vertical = js.native
}

object Horizontal {
  @scala.inline
  def apply(horizontal: horizontal, vertical: vertical): Horizontal = {
    val __obj = js.Dynamic.literal(horizontal = horizontal.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[Horizontal]
  }
  @scala.inline
  implicit class HorizontalOps[Self <: Horizontal] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHorizontal(value: horizontal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVertical(value: vertical): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertical")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

