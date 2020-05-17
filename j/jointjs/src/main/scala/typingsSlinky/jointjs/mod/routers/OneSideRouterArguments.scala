package typingsSlinky.jointjs.mod.routers

import typingsSlinky.jointjs.mod.dia.OrthogonalDirection
import typingsSlinky.jointjs.mod.dia.Sides
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OneSideRouterArguments extends js.Object {
  var padding: js.UndefOr[Sides] = js.native
  var side: js.UndefOr[OrthogonalDirection] = js.native
}

object OneSideRouterArguments {
  @scala.inline
  def apply(): OneSideRouterArguments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OneSideRouterArguments]
  }
  @scala.inline
  implicit class OneSideRouterArgumentsOps[Self <: OneSideRouterArguments] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPadding(value: Sides): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(js.undefined)
        ret
    }
    @scala.inline
    def withSide(value: OrthogonalDirection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("side")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("side")(js.undefined)
        ret
    }
  }
  
}

