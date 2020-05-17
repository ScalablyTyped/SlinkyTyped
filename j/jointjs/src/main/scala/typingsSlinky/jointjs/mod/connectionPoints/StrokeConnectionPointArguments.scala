package typingsSlinky.jointjs.mod.connectionPoints

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrokeConnectionPointArguments extends DefaultConnectionPointArguments {
  var stroke: js.UndefOr[Boolean] = js.native
}

object StrokeConnectionPointArguments {
  @scala.inline
  def apply(): StrokeConnectionPointArguments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrokeConnectionPointArguments]
  }
  @scala.inline
  implicit class StrokeConnectionPointArgumentsOps[Self <: StrokeConnectionPointArguments] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStroke(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStroke: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke")(js.undefined)
        ret
    }
  }
  
}

