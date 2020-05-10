package typingsSlinky.plottable

import typingsSlinky.plottable.plottableStrings.bottomup
import typingsSlinky.plottable.plottableStrings.topdown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBottomup extends js.Object {
  var bottomup: typingsSlinky.plottable.plottableStrings.bottomup = js.native
  var topdown: typingsSlinky.plottable.plottableStrings.topdown = js.native
}

object AnonBottomup {
  @scala.inline
  def apply(bottomup: bottomup, topdown: topdown): AnonBottomup = {
    val __obj = js.Dynamic.literal(bottomup = bottomup.asInstanceOf[js.Any], topdown = topdown.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBottomup]
  }
  @scala.inline
  implicit class AnonBottomupOps[Self <: AnonBottomup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBottomup(value: bottomup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTopdown(value: topdown): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topdown")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

